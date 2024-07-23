package net.druidlabs.guncategory;

import net.druidlabs.API.Gun;
import net.druidlabs.API.Weapon;
import net.druidlabs.annotation.Snipes;

public class Sniper extends Gun {
    public Sniper(@Snipes Weapon weaponName) {
        super(weaponName);

        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(Snipes.class)) {
                throw new IllegalArgumentException("Incorrect weapon type");
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
