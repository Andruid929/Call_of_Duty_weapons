package net.druidlabs.guncategory;

import net.druidlabs.API.Weapon;
import net.druidlabs.API.Gun;
import net.druidlabs.annotation.Marksmen;

public class Marksman extends Gun {
    public Marksman(@Marksmen Weapon weaponName) {
        super(weaponName);

        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(Marksmen.class)) {
                throw new IllegalArgumentException("Incorrect weapon type");
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
