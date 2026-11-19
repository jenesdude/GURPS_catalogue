package com.gurps.repository;

import com.gurps.model.Character;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class CharacterRepository {
    private final Map<Long, Character> storage = new ConcurrentHashMap<>();

    private final AtomicLong idCounter = new AtomicLong(0);

    public Character save(Character character) {
        if (character.getId() == null) {
            character.setId(idCounter.incrementAndGet());
        }
        storage.put(character.getId(), character);
        return character;
    }

    public Optional<Character> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    public List<Character> findAll() {
        return new ArrayList<>(storage.values());
    }

    public void deleteById(Long id) {
        storage.remove(id);
    }
}