package com.devtonin.dunder.controllers;

import com.devtonin.dunder.services.SellerService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtonin.dunder.dto.SellerDto;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDto>> findAll() {
		List<SellerDto> list = service.findAll();
		return ResponseEntity.ok(list);
	}

}
