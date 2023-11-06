package dev.utkarsh.productcatalog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ScalerController {
    @GetMapping("Hi")
    public String HiEveryone(){
        return "Hey Scaler students" ;
    }



}
