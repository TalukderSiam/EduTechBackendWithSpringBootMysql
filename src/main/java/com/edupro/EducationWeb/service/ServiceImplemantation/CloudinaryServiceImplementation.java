package com.edupro.EducationWeb.service.ServiceImplemantation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.edupro.EducationWeb.exception.CustomRuntimeException;
import com.edupro.EducationWeb.service.CloudinaryService;

@Service
public class CloudinaryServiceImplementation implements CloudinaryService {

     @Autowired
    private Cloudinary cloudinary;

    @Override
    public String uploadFile(MultipartFile file) {
        try {
            String contentType = file.getContentType();
    
            // Decide resource_type (images, raw files, videos, etc.)
            String resourceType = (contentType != null && contentType.equals("application/pdf")) ? "raw" : "auto";
    
            Map<String, Object> options = ObjectUtils.asMap(
                "resource_type", resourceType,
                "use_filename", true,                        // keep original name
                "unique_filename", false,                    // prevent renaming
                "filename", file.getOriginalFilename(),      // original name
                "chunk_size", 6000000                        // ~6MB chunk size for large files
            );
    
            Map uploadResult = cloudinary.uploader().upload(file.getBytes(), options);
            return uploadResult.get("url").toString();
    
        } catch (Exception e) {
            throw new CustomRuntimeException(false, e.getMessage(), "CTSubject_Post",
                    "CTSubject", List.of());
        }
    }
    

}
