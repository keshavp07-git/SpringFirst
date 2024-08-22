package com.keshav.SpringFirst.app.service;

import com.keshav.SpringFirst.app.models.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addlaptop(Laptop lap) {
        System.out.println("Laptop Added");
    }
    public boolean isGoodForPro(){
        return true;
    }
}
