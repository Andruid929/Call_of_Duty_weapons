package net.druidlabs.API;

public enum FireMechanism {

    FULL_AUTO("Full auto"),
    SEMI_AUTO("Semi auto"),
    BURST("Burst"),
    BOLT_ACTION("Bolt action"),
    LEVER_ACTION("Lever action"),
    DOUBLE_BARREL("Double barrel"),
    PUMP_ACTION("Pump action");

    private String mechanism;

    FireMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    public String getMechanism(){
        return mechanism;
    }
}
