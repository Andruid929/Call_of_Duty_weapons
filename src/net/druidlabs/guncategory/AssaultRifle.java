package net.druidlabs.guncategory;

import net.druidlabs.API.Gun;
import net.druidlabs.API.Weapon;
import net.druidlabs.annotation.AR;

public class AssaultRifle extends Gun {
    public AssaultRifle(@AR Weapon weaponName) {
        super(weaponName);

        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(AR.class)) {
                throw new IllegalArgumentException("Incorrect weapon type");
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
