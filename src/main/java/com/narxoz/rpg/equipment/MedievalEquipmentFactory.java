package com.narxoz.rpg.equipment;

public class MedievalEquipmentFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new IronSword(); }
    public Armor createArmor() { return new PlateArmor(); }
}