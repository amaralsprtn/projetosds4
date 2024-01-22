package com.devtonin.dunder.repositories;

import com.devtonin.dunder.entities.Sale;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devtonin.dunder.dto.SaleSuccessDto;
import com.devtonin.dunder.dto.SaleSumDto;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new devsuperior.demo.dto.SaleSumDto(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDto> amountGroupedBySeller();
	
	@Query("SELECT new devsuperior.demo.dto.SaleSuccessDto(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDto> successGroupedBySeller();
}
