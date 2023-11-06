package dev.utkarsh.productcatalog.models;

import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class product extends basemodel{
    private String title;
    private String description;
    private String image;
    private String category;
    private double price;
}
