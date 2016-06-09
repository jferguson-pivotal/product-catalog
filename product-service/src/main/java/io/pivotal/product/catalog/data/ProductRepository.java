package io.pivotal.product.catalog.data;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.pivotal.product.catalog.domain.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
	

}
