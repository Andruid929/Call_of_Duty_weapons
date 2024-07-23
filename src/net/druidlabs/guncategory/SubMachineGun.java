package net.druidlabs.guncategory;

import net.druidlabs.API.Weapon;
import net.druidlabs.API.Gun;
import net.druidlabs.annotation.SMG;

public class SubMachineGun extends Gun {
    public SubMachineGun(@SMG Weapon weaponName) {
        super(weaponName);

        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(SMG.class)) {
                throw new IllegalArgumentException("Incorrect weapon type");
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
