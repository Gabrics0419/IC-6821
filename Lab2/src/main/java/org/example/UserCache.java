package org.example;

import java.util.HashMap;
import java.util.Map;

public class UserCache implements Cache<String, User> {
    private final Map<String, User> cache;
    public UserCache() {
        this.cache = new HashMap<>();
    }
    @Override
    public User get(String key) {
        return cache.get(key);
    }
    @Override
    public void put(String key, User value) {
        cache.put(key, value);
        System.out.println("Usuario '" + key + "' almacenado en caché.");
    }
    @Override
    public boolean contains(String key) {
        return cache.containsKey(key);
    }
    @Override
    public void clear() {
        cache.clear();
        System.out.println("Caché limpiado.");
    }
}
