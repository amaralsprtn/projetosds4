package devsuperior.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import devsuperior.demo.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
