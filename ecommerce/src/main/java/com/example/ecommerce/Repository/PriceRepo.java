package com.example.ecommerce.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.Entity.Price;

@Repository
public interface PriceRepo  extends JpaRepository<Price, Integer>{
	
	@Query(value="SELECT p FROM Price p")
	public List<Price> fetchAll() ;
	
	@Query(value="SELECT p FROM Price p where  pid=:val")
	public Price fetchOne(@Param("val") Integer id) ;
	
	@Query(value="SELECT p FROM Price p where  pid=:val and cost_price=:cp")
	public Price fetchOneByName(@Param("val") Integer id,@Param("cp") Integer cpp) ;
	
	@Query(value="SELECT p FROM Price p where  cost_price=:cp")
	public Price fetchCP(@Param("cp") Integer cpp) ;
	
	@Modifying
    @Transactional
    @Query("UPDATE Price p SET p.Selling_Price = p.Cost_Price + p.Discount - p.Tax WHERE p.Cost_Price <= 100")
    Integer updateSellingPrice();
}
