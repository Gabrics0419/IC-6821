package org.example;
public class Main {
    public static void main(String[] args) {

        ServicioA a = new ServicioA();
        ServicioB b = new ServicioB();

        a.mostrarConfiguracion();
        b.mostrarConfiguracion();

        ConfiguracionSistema instancia1 = ConfiguracionSistema.getInstancia();
        ConfiguracionSistema instancia2 = ConfiguracionSistema.getInstancia();

        System.out.println("¿Misma instancia? " + (instancia1 == instancia2));
    }
}
