package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {
    @GetMapping("/bus")
    public String getData() {return  "Please book your bus from Neeta Volvo kindly book ticket for Pune to anywhere at 10% discount" ;

    }
}
