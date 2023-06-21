package com.example.payment.servcie.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/payment")
public class PaymentServiceController {

    private final Logger log= LoggerFactory.getLogger(PaymentServiceController.class);

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/discount")
    public String getDiscount(){
        return  "You Have Got 30% Discount on this payment !!";
    }

    @GetMapping("/pay")
    public String payment(){
        return restTemplate.getForObject("http://localhost:8082/payment/discount",String.class);
    }
}
