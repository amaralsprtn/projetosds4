package com.devtonin.dunder.services;

import com.devtonin.dunder.entities.Sale;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devtonin.dunder.dto.SaleDto;
import com.devtonin.dunder.dto.SaleSuccessDto;
import com.devtonin.dunder.dto.SaleSumDto;
import com.devtonin.dunder.repositories.SaleRepository;
import com.devtonin.dunder.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDto> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDto(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDto> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDto> successGroupedBySeller() {
		return repository.successGroupedBySeller();
	}
}