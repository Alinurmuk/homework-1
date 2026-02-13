package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Archer implements Character {
    private String name;
    private int health = 110;
    private int mana = 50;
    private int strength = 50;
    private int intelligence = 40;
    private Weapon weapon;
    private Armor armor;

    public Archer(String name) { this.name = name; }

    @Override
    public String getName() { return name; }

    @Override
    public void equipWeapon(Weapon weapon) { this.weapon = weapon; }

    @Override
    public void equipArmor(Armor armor) { this.armor = armor; }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health + " | Strength: " + strength + " | Agility: High");
        if (weapon != null) System.out.println("Қару: " + weapon.getWeaponInfo());
        if (armor != null) System.out.println("Сауыт: " + armor.getArmorInfo());
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " қолданады: PIERCING SHOT! Жойқын оқ атылды.");
    }
}