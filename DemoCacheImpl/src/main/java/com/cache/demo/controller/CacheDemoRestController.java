package com.cache.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cache.demo.service.SystemAPIService;

@RestController
public class CacheDemoRestController {

	@Autowired
	SystemAPIService systemAPIService;
	
	@GetMapping(value = "/fetch", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Object> getDataFromCache(@RequestBody String body) {
		String resBody="";
		ResponseEntity<Object> responseEntity = null;
		if(checkDataAvailableInCache()){
			//resBody
			responseEntity = new ResponseEntity<>("This data from Cache....", HttpStatus.OK);
		}else{
			//resBody
			responseEntity = new ResponseEntity<>("This date from System API.....", HttpStatus.OK);
		}
		return responseEntity;
	}

	private boolean checkDataAvailableInCache() {
		//TODO
		return true;
	}
}
