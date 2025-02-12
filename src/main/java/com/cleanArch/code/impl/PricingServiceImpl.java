package com.cleanArch.code.impl;

import com.cleanArch.code.enums.CustomerType;
import com.cleanArch.code.service.PricingService;
import org.springframework.stereotype.Service;

@Service
public class PricingServiceImpl implements PricingService {
    @Override
    public double CalculatePrice(CustomerType customerType, double basePrice) {
        return customerType.CalculateDiscount(basePrice);
    }

}
