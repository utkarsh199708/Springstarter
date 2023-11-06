package dev.utkarsh.productcatalog.service;

import dev.utkarsh.productcatalog.DTO.GenericProductDto;
import dev.utkarsh.productcatalog.models.product;
import org.springframework.stereotype.Service;

@Service("SelfProductService")
public class SelfProductService implements ProductService{
    @Override
    public GenericProductDto getProductById(Long id) {
        return null;
    }
}
