package net.druidlabs.API;

import net.druidlabs.annotation.PrimaryWeapon;

public abstract class Gun {

    String name, masteryName;

    int damage, accuracy, fireRate, range, control, mobility;

    FireMechanism fireMechanism;

    public Gun(@PrimaryWeapon Weapon weapon) {
        this.name = weapon.getName();
        this.damage = weapon.getBaseDamage();
        this.accuracy = weapon.getBaseAccuracy();
        this.fireRate = weapon.getBaseFireRate();
        this.range = weapon.getBaseRange();
        this.control = weapon.getBaseControl();
        this.mobility = weapon.getBaseMobility();
        this.fireMechanism = weapon.getFireMechanism();
    }

    public String getName() {
        return name;
    }

    public void setMasteryName(String masteryName) {
        this.masteryName = masteryName;
    }

    public String getMasteryName() {
        if (masteryName != null){
            return masteryName;
        }
        return "Not mastered";
    }

    public String getFireMechanism() {
        return fireMechanism.getMechanism();
    }

    public String getDamage() {
        return String.valueOf(damage);
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getFireRate() {
        return fireRate;
    }

    public int getRange() {
        return range;
    }

    public int getControl() {
        return control;
    }

    public int getMobility() {
        return mobility;
    }

}
