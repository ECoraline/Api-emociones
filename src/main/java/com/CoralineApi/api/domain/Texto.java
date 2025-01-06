package com.CoralineApi.api.domain;


public class Texto {
    String texto;
    public Texto(TextoUsuario textoUsuario) {
        this.texto = textoUsuario.texto();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
