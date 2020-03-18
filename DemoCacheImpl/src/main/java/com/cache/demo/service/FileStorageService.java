package com.cache.demo.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {
	
	public String storeFile(MultipartFile file);

}
