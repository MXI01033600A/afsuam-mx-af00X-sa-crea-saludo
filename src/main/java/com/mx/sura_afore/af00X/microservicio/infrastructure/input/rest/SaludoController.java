package com.mx.sura_afore.af00X.microservicio.infrastructure.input.rest;

import com.mx.sura_afore.af00X.microservicio.application.usecase.GreetingUseCase;
import com.mx.sura_afore.af00X.microservicio.domain.model.SaludoResponse;
import com.mx.sura_afore.af00X.microservicio.interfaces.controller.SaludoApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SaludoController implements SaludoApi {

    private final GreetingUseCase greetingUseCase;

    @Override
    public ResponseEntity<SaludoResponse> getSaludo(String name) {
        return ResponseEntity.ok(greetingUseCase.generateGreeting(name));
    }
}
