package com.t2207a.t2207aspringboot.Repository;

import com.t2207a.t2207aspringboot.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
