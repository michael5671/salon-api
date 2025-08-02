package com.example.salon_api.controller;

import com.example.salon_api.entity.SalonServiceDetail;
import com.example.salon_api.repository.SalonServiceDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/services")
public class SalonServiceController {

    private SalonServiceDetailRepository salonServiceDetailRepository;

    public SalonServiceController(SalonServiceDetailRepository salonServiceDetailRepository){
        this.salonServiceDetailRepository = salonServiceDetailRepository;
    }

    @GetMapping("/retrieveAvailableSalonServices")
    public Iterable<SalonServiceDetail> retrieveAvailableSalonServices(){
        return salonServiceDetailRepository.findAll();
    }
}
