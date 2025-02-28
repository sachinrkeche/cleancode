package com.cleanArch.code.controller;

import com.cleanArch.code.enums.CustomerType;
import com.cleanArch.code.service.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(value = "/myPrice")
public class PricingController {
    @Autowired
    PricingService pricingService;

    @PostMapping(value = "/discount")
    public ResponseEntity<Double> getMyDiscountedPrice(
            @RequestParam
            CustomerType customerType,
            @RequestParam
            Double basePrice) {
        Double discountedPrice = pricingService.CalculatePrice(customerType, basePrice);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(discountedPrice);

    }

}
