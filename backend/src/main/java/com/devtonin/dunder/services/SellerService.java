package com.devtonin.dunder.services;

import com.devtonin.dunder.entities.Seller;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devtonin.dunder.dto.SellerDto;
import com.devtonin.dunder.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDto> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDto(x)).collect(Collectors.toList());
	}
}