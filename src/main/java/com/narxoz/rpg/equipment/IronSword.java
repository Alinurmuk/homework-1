package com.narxoz.rpg.equipment;

public class IronSword implements Weapon {
    private int damage = 25;
    private String weaponType = "Sword";

    public int getDamage() { return damage; }
    public String getWeaponInfo() { return "Iron Sword (Medieval)"; }
    public void displayInfo() {
        System.out.println("Қару: " + getWeaponInfo() + " [Dmg: " + damage + "]");
    }
}