package net.druidlabs.collections;

import net.druidlabs.API.Gun;
import net.druidlabs.API.Weapon;

import java.util.ArrayList;
import java.util.List;

public class GunsList {

    private final ArrayList<Gun> guns;

    private static final ArrayList<Gun> allWeapons = new ArrayList<>();

    private static final ArrayList<Weapon> allGuns = new ArrayList<>(List.of(Weapon.values()));

    public GunsList() {
        guns = new ArrayList<>();
    }

    public GunsList addGun(Gun gun) {
        guns.add(gun);
        return this;
    }

    public String getMasteries() {
        String masteries = "";
        for (Gun guns : guns) {
            masteries = guns.getName() + " : \"" + guns.getMasteryName() + "\"";
            System.out.println(guns.getName() + " : \"" + guns.getMasteryName() + "\"");
        }
        return masteries;
    }

    public static ArrayList<Weapon> getAllGuns() {
        return allGuns;
    }

    public ArrayList<Gun> masteredGuns(){
        return guns;
    }

}
