package com.CoralineApi.api.controller;

import com.CoralineApi.api.domain.ConsultaAPI;
import com.CoralineApi.api.domain.Texto;
import com.CoralineApi.api.domain.TextoUsuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmotionController {
    @PostMapping("/identificar-emocion")
    public ResponseEntity identificarEmocion(@RequestBody TextoUsuario texto) {
        var consultaAPI = new ConsultaAPI();

        Texto texto1 = new Texto(texto);
        var respuesta = consultaAPI.Consultar(texto1.getTexto());
        System.out.println(respuesta);
        return ResponseEntity.ok(respuesta);
    }
}
