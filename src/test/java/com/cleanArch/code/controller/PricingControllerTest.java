package com.cleanArch.code.controller;

import com.cleanArch.code.enums.CustomerType;
import com.cleanArch.code.impl.PricingServiceImpl;
import com.cleanArch.code.service.PricingService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(PricingController.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PricingControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    PricingService pricingService;
    @Test
    @Order(1)
    public void getMyDiscountedPriceTest() throws Exception {
        double price = 10;
        double discountPrice = 5;
        //Mockito.when(service.CalculatePrice(CustomerType.valueOf("MEMBER"), price)).thenReturn(discountPrice);
        this.mockMvc.perform(MockMvcRequestBuilders.post("/myPrice/discount"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
    }

}
