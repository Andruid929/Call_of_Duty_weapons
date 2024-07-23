package net.druidlabs.call;

import net.druidlabs.API.AllPrimaryWeapons;
import net.druidlabs.API.Gun;
import net.druidlabs.collections.GunsList;
import net.druidlabs.guncategory.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static net.druidlabs.API.Weapon.*;

public class CallGuns {

    public static final String FILE_PATH = "C:\\Users\\" + System.getenv("USERNAME") + "\\Desktop\\";
    static GunsList andruidGuns;

    public static void main(String[] args) {
        manDowner();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH + "CODM primary guns.txt"));
            for (Gun guns : AllPrimaryWeapons.getAllPrimaryWeapons()) {
                writer.write("----- " + guns.getName() + " -----"); 
                writer.write("\nDamage:" + guns.getDamage());
                writer.write("\nFire rate:" + guns.getFireRate());
                writer.write("\nAccuracy:" + guns.getAccuracy());
                writer.write("\nMobility:" + guns.getMobility());
                writer.write("\nRange:" + guns.getRange());
                writer.write("\nMode of fire: " + guns.getFireMechanism());
                writer.write("\n______________________\n\n");

                System.out.println(guns.getName());
                System.out.println("Damage:" + guns.getDamage());
                System.out.println("Fire rate:" + guns.getFireRate());
                System.out.println("Accuracy:" + guns.getAccuracy());
                System.out.println("Mobility:" + guns.getMobility());
                System.out.println("Range:" + guns.getRange());
                System.out.println("Mode of fire: " + guns.getFireMechanism());
                System.out.println("_________________" + "\n");
                System.out.println(System.getenv("USERNAME"));

            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Write error");
            e.printStackTrace();
        }
    }

    public static void manDowner() {

        Gun gun = new AssaultRifle(AK117);
        gun.setMasteryName("Stay down");
        Gun gun1 = new AssaultRifle(AK47);
        gun1.setMasteryName("Minotaur");
        Gun gun2 = new AssaultRifle(M4);
        gun2.setMasteryName("Astro");
        Gun gun3 = new AssaultRifle(LK24);
        gun3.setMasteryName("Sit down mate");
        Gun gun4 = new AssaultRifle(ICR_1);
        gun4.setMasteryName("Yusraa");
        Gun gun5 = new AssaultRifle(DR_H);
        gun5.setMasteryName("SCAR-H");
        Gun gun6 = new AssaultRifle(PEACEKEEPER);
        gun6.setMasteryName("WarBringer");
        Gun gun7 = new AssaultRifle(AS_VAL);
        gun7.setMasteryName("Moekie");
        Gun gun8 = new AssaultRifle(M13);
        gun8.setMasteryName("Tsukasa");
        Gun gun9 = new AssaultRifle(KILO_141);
        gun9.setMasteryName("Ares");
        Gun gun10 = new AssaultRifle(ODEN);
        gun10.setMasteryName("Odin");
        Gun gun11 = new AssaultRifle(KRIG_6);
        gun11.setMasteryName("Flex tape");
        Gun gun12 = new AssaultRifle(EM2);
        gun12.setMasteryName("Sagiri");
        Gun gun13 = new AssaultRifle(MADDOX);
        gun13.setMasteryName("Doom & Gloom");
        Gun gun14 = new AssaultRifle(GRAU_556);
        gun14.setMasteryName("Graulin Stacy");

        Gun gun15 = new Sniper(DL_Q33);
        gun15.setMasteryName("Death kiss");
        Gun gun16 = new Sniper(LOCUS);
        gun16.setMasteryName("Miku");
        Gun gun17 = new Sniper(HDR);
        gun17.setMasteryName("Hadir");
        Gun gun18 = new Sniper(LW3_TUNDRA);
        gun18.setMasteryName("Tried to miss");

        Gun gun19 = new LightMachineGun(UL736);
        gun19.setMasteryName("Proxima Auni");
        Gun gun20 = new LightMachineGun(RPD);
        gun20.setMasteryName("Hermoine");
        Gun gun21 = new LightMachineGun(HOLGER_26);
        gun21.setMasteryName("Maya");

        Gun gun22 = new SubMachineGun(RUS_79U);
        gun22.setMasteryName("Trashhh");
        Gun gun23 = new SubMachineGun(QQ9);
        gun23.setMasteryName("MP5");
        Gun gun24 = new SubMachineGun(FENNEC);
        gun24.setMasteryName("Eucalyptus");
        Gun gun25 = new SubMachineGun(AGR_556);
        gun25.setMasteryName("AUG 5.56");
        Gun gun26 = new SubMachineGun(QXR);
        gun26.setMasteryName("MP7");
        Gun gun27 = new SubMachineGun(PP19_BIZON);
        gun27.setMasteryName("Skyler");
        Gun gun28 = new SubMachineGun(CBR4);
        gun28.setMasteryName("P90");
        Gun gun29 = new SubMachineGun(MAC_10);
        gun29.setMasteryName("Noa");
        Gun gun30 = new SubMachineGun(SWITCHBLADE_X9);
        gun30.setMasteryName("Tara");
        Gun gun31 = new SubMachineGun(CX9);
        gun31.setMasteryName("Yvonne");

        Gun gun32 = new Shotgun(BY15);
        gun32.setMasteryName("Bi-15");
        Gun gun33 = new Shotgun(HS0405);
        gun33.setMasteryName("Lonely spirit");
        Gun gun34 = new Shotgun(KRM_262);
        gun34.setMasteryName("Kreamer");
        Gun gun35 = new Shotgun(R9_0);
        gun35.setMasteryName("R9-1");

        Gun gun36 = new Marksman(KILO_BOLT_ACTION);
        gun36.setMasteryName("Kar98");
        Gun gun37 = new Marksman(SKS);
        gun37.setMasteryName("Lumii");

        Gun gun38 = new AssaultRifle(FFAR_1);
        gun38.setMasteryName("Chinese boo");

        andruidGuns = new GunsList();
        andruidGuns
                .addGun(gun)
                .addGun(gun1)
                .addGun(gun2)
                .addGun(gun3)
                .addGun(gun4)
                .addGun(gun5)
                .addGun(gun6)
                .addGun(gun7)
                .addGun(gun8)
                .addGun(gun9)
                .addGun(gun10)
                .addGun(gun11)
                .addGun(gun12)
                .addGun(gun13)
                .addGun(gun14)
                .addGun(gun15)
                .addGun(gun16)
                .addGun(gun17)
                .addGun(gun18)
                .addGun(gun19)
                .addGun(gun20)
                .addGun(gun21)
                .addGun(gun22)
                .addGun(gun23)
                .addGun(gun24)
                .addGun(gun25)
                .addGun(gun26)
                .addGun(gun27)
                .addGun(gun28)
                .addGun(gun29)
                .addGun(gun30)
                .addGun(gun31)
                .addGun(gun32)
                .addGun(gun33)
                .addGun(gun34)
                .addGun(gun35)
                .addGun(gun36)
                .addGun(gun37);
    }

}
