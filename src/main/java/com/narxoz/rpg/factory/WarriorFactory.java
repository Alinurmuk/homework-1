package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.CharacterFactory;
import com.narxoz.rpg.character.Warrior;

public class WarriorFactory extends CharacterFactory {
    @Override
    public Warrior createCharacter(String name) {
        return new com.narxoz.rpg.character.Warrior(name);
    }
}