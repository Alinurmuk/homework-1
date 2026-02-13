package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Warrior implements Character {
    private String name;
    private int health = 150;
    private int mana = 30;
    private int strength = 80;
    private int intelligence = 20;
    private Weapon weapon;
    private Armor armor;

    public Warrior(String name) { this.name = name; }

    public String getName() { return name; }
    public void equipWeapon(Weapon weapon) { this.weapon = weapon; }
    public void equipArmor(Armor armor) { this.armor = armor; }

    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Stats: HP " + health + ", STR " + strength + ", MP " + mana);
        if (weapon != null) weapon.displayInfo();
        if (armor != null) armor.displayInfo();
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE!");
    }
}