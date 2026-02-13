package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Archer;
import com.narxoz.rpg.character.CharacterFactory;

public class ArcherFactory extends CharacterFactory {
    @Override
    public com.narxoz.rpg.character.Character createCharacter(String name) {
        return new com.narxoz.rpg.character.Archer(name);
    }
}