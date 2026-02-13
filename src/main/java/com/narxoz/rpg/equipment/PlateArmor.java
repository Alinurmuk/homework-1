package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {
    private int defense = 40;

    public int getDefense() { return defense; }
    public String getArmorInfo() { return "Plate Armor (Medieval)"; }
    public void displayInfo() {
        System.out.println("Сауыт: " + getArmorInfo() + " [Def: " + defense + "]");
    }
}