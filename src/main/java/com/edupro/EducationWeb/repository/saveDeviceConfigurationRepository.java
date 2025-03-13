package com.edupro.EducationWeb.repository;

import org.springframework.stereotype.Repository;

import com.edupro.EducationWeb.entity.model.DeviceConfiguration;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface saveDeviceConfigurationRepository extends JpaRepository<DeviceConfiguration, Integer>  {
    
}
