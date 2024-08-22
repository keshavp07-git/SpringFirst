package com.keshav.SpringFirst.app.service;

import com.keshav.SpringFirst.app.models.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Laptop Saved");
    }
}
