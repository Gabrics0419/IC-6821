package org.example;

public class ServicioB {

    public void mostrarConfiguracion() {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        System.out.println("ServicioB instancia: " + config);
    }
}
