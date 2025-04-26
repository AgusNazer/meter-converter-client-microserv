package com.example.meter_converter.service;

import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class ConverterService implements IConverterCentimeters {

    @Override
     public Double convertCentimeters(Double meters){
        return meters*100;
    }
}
