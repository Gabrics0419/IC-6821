package org.example;

public class UserService {
    private static final long DELAY_MS = 3000;
    public User cargarUsuario(String id) {
        System.out.println("Cargando usuario '" + id + "' desde la fuente de datos (simulando 3s de latencia)...");
        try {
            Thread.sleep(DELAY_MS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Error en la simulación de latencia.");
        }
        User user = new User(id, "Usuario " + id, "Usuario", "Tema oscuro");
        System.out.println("Usuario '" + id + "' cargado exitosamente.");
        return user;
    }
}