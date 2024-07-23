package net.druidlabs.guncategory;

import net.druidlabs.API.Weapon;
import net.druidlabs.API.Gun;
import net.druidlabs.annotation.Shotty;

public class Shotgun extends Gun {

    private Weapon weapon;

    public Shotgun(@Shotty Weapon weaponName) {
        super(weaponName);

        this.weapon = weaponName;
        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(Shotty.class)) {
                throw new IllegalArgumentException("Incorrect weapon type");
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


    }

    @Override
    public String getDamage() {
        return weapon.getShotgunDamage();
    }
}
