package com.narxoz.rpg;

import com.narxoz.rpg.character.*;
import com.narxoz.rpg.character.CharacterFactory;
import com.narxoz.rpg.equipment.*;
import com.narxoz.rpg.factory.ArcherFactory;
import com.narxoz.rpg.factory.MageFactory;
import com.narxoz.rpg.factory.WarriorFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        com.narxoz.rpg.character.Character hero1 = warriorFactory.createCharacter("Абылай");
        com.narxoz.rpg.character.Character hero2 = mageFactory.createCharacter("Гендальф");
        com.narxoz.rpg.character.Character hero3 = archerFactory.createCharacter("Леголас");

        EquipmentFactory medievalSet = new MedievalEquipmentFactory();

        hero1.equipWeapon(medievalSet.createWeapon());
        hero1.equipArmor(medievalSet.createArmor());
        hero1.displayStats();
        hero1.useSpecialAbility();
        System.out.println();

        hero2.displayStats();
        hero2.useSpecialAbility();
        System.out.println();

        hero3.displayStats();
        hero3.useSpecialAbility();

        System.out.println("\n=== Demo Complete ===");
    }
}