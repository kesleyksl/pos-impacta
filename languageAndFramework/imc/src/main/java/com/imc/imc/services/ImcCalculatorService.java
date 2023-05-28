package com.imc.imc.services;

import org.springframework.stereotype.Service;

import com.imc.imc.models.Person;

@Service
public class ImcCalculatorService {
    public ImcCalculatorService() {
        super();
    }

    public void calculate(Person person) {
        person.setImc(person.getWeight() / Math.pow(person.getHeight(), 2));
        person.setImcDescription("Obesidade");
        if (person.getImc() < 18.5) {
            person.setImcDescription("Magreza");
            return;
        }
        if (person.getImc() < 24.9) {
            person.setImcDescription("Normal");
            return;
        }
        if (person.getImc() < 30) {
            person.setImcDescription("Sobrepeso");
        }
    }
}