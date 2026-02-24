package com.mx.sura_afore.af00X.microservicio.application.usecase;

import com.mx.sura_afore.af00X.microservicio.domain.model.SaludoResponse;
import org.springframework.stereotype.Service;

@Service
public class GreetingUseCase {
    public SaludoResponse generateGreeting(String name) {
        SaludoResponse response = new SaludoResponse();
        response.setSaludo("Hola, " + name);
        return response;
    }
}
