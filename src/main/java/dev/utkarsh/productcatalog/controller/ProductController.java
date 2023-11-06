package dev.utkarsh.productcatalog.controller;

import dev.utkarsh.productcatalog.DTO.GenericProductDto;
import dev.utkarsh.productcatalog.models.product;
import dev.utkarsh.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService productService;
    public ProductController(@Qualifier("FakeProductService") ProductService productService)
    {
        this.productService=productService;
    }
    @GetMapping
    public String getAllProduct()
    {
        return "Hi";

    }
    @GetMapping("/{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id)
    {
        return productService.getProductById(id);

    }
    @DeleteMapping("{id}")
    public void DeleteProductById()
    {

    }
    @PostMapping
    public String createProduct()
    {
        return "Create a product with "+ UUID.randomUUID();

    }
    @PutMapping("{id}")
    public void updateProductById()
    {

    }



}
