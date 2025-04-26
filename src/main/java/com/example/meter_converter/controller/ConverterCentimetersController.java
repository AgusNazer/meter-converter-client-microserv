package com.example.meter_converter.controller;

import com.example.meter_converter.service.IConverterCentimeters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
public class ConverterCentimetersController {

    @Autowired
    private IConverterCentimeters converterService;

    @GetMapping("/meters/{meters}")
    public Double convertCentimeters (@PathVariable Double meters){
        return converterService.convertCentimeters(meters);
    }


}
