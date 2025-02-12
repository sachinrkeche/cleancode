package com.cleanArch.code.service;

import com.cleanArch.code.enums.CustomerType;


public interface PricingService {
   double CalculatePrice(CustomerType customerType, double basePrice);
}
