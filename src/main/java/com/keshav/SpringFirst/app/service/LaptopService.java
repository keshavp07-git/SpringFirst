package com.keshav.SpringFirst.app.service;

import com.keshav.SpringFirst.app.models.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap){
        repo.save(lap);
    }
    public boolean isGoodForPro(){
        return true;
    }
}
