package devsuperior.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import devsuperior.demo.dto.SaleSuccessDto;
import devsuperior.demo.dto.SaleSumDto;
import devsuperior.demo.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new devsuperior.demo.dto.SaleSumDto(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDto> amountGroupedBySeller();
	
	@Query("SELECT new devsuperior.demo.dto.SaleSuccessDto(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDto> successGroupedBySeller();
}
