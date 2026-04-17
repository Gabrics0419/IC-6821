package org.example;

public class User {
    private final String id;
    private final String nombre;
    private final String rol;
    private final String preferencias;
    public User(String id, String nombre, String rol, String preferencias) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.preferencias = preferencias;
    }
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getRol() { return rol; }
    public String getPreferencias() { return preferencias; }
    @Override
    public String toString() {
        return String.format("User{id='%s', nombre='%s', rol='%s', preferencias='%s'}",
                id, nombre, rol, preferencias);
    }
}
