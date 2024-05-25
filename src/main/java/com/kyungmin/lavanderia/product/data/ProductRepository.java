package com.kyungmin.lavanderia.product.data;

import com.kyungmin.lavanderia.product.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
