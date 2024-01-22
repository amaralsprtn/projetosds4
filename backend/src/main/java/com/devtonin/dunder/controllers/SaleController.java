package com.devtonin.dunder.controllers;

import com.devtonin.dunder.services.SaleService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtonin.dunder.dto.SaleDto;
import com.devtonin.dunder.dto.SaleSuccessDto;
import com.devtonin.dunder.dto.SaleSumDto;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable) {
		Page<SaleDto> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDto>> amountGroupedBySeller() {
		List<SaleSumDto> list = service.amountGroupedBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDto>> successGroupedBySeller() {
		List<SaleSuccessDto> list = service.successGroupedBySeller();
		return ResponseEntity.ok(list);
	}

}
