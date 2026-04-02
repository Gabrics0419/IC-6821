package org.example;

public class ServicioA {

    public void mostrarConfiguracion() {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        System.out.println("ServicioA instancia: " + config);
    }
}
