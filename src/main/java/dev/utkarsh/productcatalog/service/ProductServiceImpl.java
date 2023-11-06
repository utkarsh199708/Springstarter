package dev.utkarsh.productcatalog.service;

import dev.utkarsh.productcatalog.DTO.GenericProductDto;
import dev.utkarsh.productcatalog.DTO.productDto;
import dev.utkarsh.productcatalog.models.product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("FakeProductService")
public class ProductServiceImpl implements ProductService{
    private String getProductRequestUrl="https://fakestoreapi.com/products/{id}";

    private RestTemplateBuilder restTemplateBuilder;
    public ProductServiceImpl(RestTemplateBuilder restTemplateBuilder)
    {
        this.restTemplateBuilder=restTemplateBuilder;
    }

    @Override
    public GenericProductDto getProductById(Long id) {
        RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<productDto> response=restTemplate.getForEntity(getProductRequestUrl, productDto.class,id);
        productDto pd=response.getBody();
        GenericProductDto p=new GenericProductDto();
        p.setImage(pd.getImage());
        p.setCategory(pd.getCategory());
        p.setPrice(pd.getPrice());
        p.setTitle(pd.getTitle());
        p.setDescription(pd.getDescription());
        System.out.println("aa");


        return p;
    }
}
