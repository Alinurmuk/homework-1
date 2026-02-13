package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Mage implements Character {
    private String name;
    private int health = 80;
    private int mana = 150;
    private int strength = 20;
    private int intelligence = 90;
    private Weapon weapon;
    private Armor armor;

    public Mage(String name) { this.name = name; }

    @Override
    public String getName() { return name; }

    @Override
    public void equipWeapon(Weapon weapon) { this.weapon = weapon; }

    @Override
    public void equipArmor(Armor armor) { this.armor = armor; }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Mage) ===");
        System.out.println("Health: " + health + " | Mana: " + mana + " | Intelligence: " + intelligence);
        if (weapon != null) System.out.println("Қару: " + weapon.getWeaponInfo());
        if (armor != null) System.out.println("Сауыт: " + armor.getArmorInfo());
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " қолданады: FIREBALL! Сиқырлы соққы берілді.");
    }
}