package com.cleanArch.code.service;

import com.cleanArch.code.enums.CustomerType;
import org.springframework.stereotype.Service;


public interface PricingService {
    double CalculatePrice(CustomerType customerType, double basePrice);
}
