package dev.utkarsh.productcatalog.service;

import dev.utkarsh.productcatalog.DTO.GenericProductDto;
import dev.utkarsh.productcatalog.models.product;

public interface ProductService {
    GenericProductDto getProductById(Long id);
    GenericProductDto createProduct(GenericProductDto product);
}
