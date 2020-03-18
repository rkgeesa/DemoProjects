package com.cache.demo.service.impl;

import com.cache.demo.service.SystemAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cache.demo.service.FileStorageService;

@Component
public class FileStorageServiceImpl implements FileStorageService {

	@Autowired
	SystemAPIService systemAPIService;

	@Override
	@Scheduled(fixedRate = 1000*60*30)
	public String storeFile(MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}

}
