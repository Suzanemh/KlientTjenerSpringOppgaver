package com.example.klienttjenerspringoppgaver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

    @Autowired
    TempService service;

   @GetMapping("/tmp")
    public int getTemp(String mnd) {
       return service.getTemp(mnd);

   }
}
