package com.imc.imc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imc.imc.models.Person;
import com.imc.imc.services.ImcCalculatorService;

@RestController
@RequestMapping("/imc")
public class ImcController {
    @Autowired
    private ImcCalculatorService imcService;

    @PostMapping("/calculate")
    public Person calculateImc(@RequestBody Person person) {
        imcService.calculate(person);

        return person;
    }
}