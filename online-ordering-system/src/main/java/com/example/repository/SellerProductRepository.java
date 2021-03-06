package com.example.repository;

import com.example.model.SellerProduct;
import com.example.model.SellerProductId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerProductRepository extends JpaRepository<SellerProduct, SellerProductId> {
    public List<SellerProduct> findAllByProductId(int id);
}
