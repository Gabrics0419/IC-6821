package org.example;

public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;

    private String urlBase;
    private int puerto;

    private ConfiguracionSistema() {
        this.urlBase = "http://localhost";
        this.puerto = 8080;
    }

    public static ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    public String getUrlBase() {
        return urlBase;
    }

    public int getPuerto() {
        return puerto;
    }
}
