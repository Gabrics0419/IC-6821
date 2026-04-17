package org.example;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        UserCache userCache = new UserCache();
        String[] userIds = {"juan.perez", "maria.gomez", "juan.perez", "carlos.ruiz", "maria.gomez"};
        System.out.println("=== DEMOSTRACIÓN DEL PATRÓN OBJECT CACHE ===\n");
        for (String id : userIds) {
            System.out.println("Solicitando perfil del usuario: " + id);
            long startTime = System.currentTimeMillis();
            User user;
            if (userCache.contains(id)) {
                user = userCache.get(id);
                System.out.println("Usuario '" + id + "' obtenido desde CACHÉ.");
            } else {
                user = userService.cargarUsuario(id);
                userCache.put(id, user);
            }
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            System.out.println("Perfil: " + user);
            System.out.println("Tiempo de respuesta: " + duration + " ms\n");
        }
        System.out.println("=== FIN DE LA DEMOSTRACIÓN ===");
    }
}
