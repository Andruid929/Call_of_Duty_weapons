package net.druidlabs.guncategory;

import net.druidlabs.API.Weapon;
import net.druidlabs.API.Gun;
import net.druidlabs.annotation.LMG;

public class LightMachineGun extends Gun {
    public LightMachineGun(@LMG Weapon weaponName) {
        super(weaponName);

        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(LMG.class)) {
                throw new IllegalArgumentException("Incorrect weapon type");
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
