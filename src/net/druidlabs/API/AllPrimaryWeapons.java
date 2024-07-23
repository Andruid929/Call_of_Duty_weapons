package net.druidlabs.API;

import net.druidlabs.collections.GunsList;
import net.druidlabs.guncategory.*;

import java.util.ArrayList;

import static net.druidlabs.API.Weapon.*;

public abstract class AllPrimaryWeapons {

    private static final GunsList primaryWeapons = new GunsList();

    private static void addWeapons() {
        Gun AR1 = new AssaultRifle(TYPE_25);
        Gun AR2 = new AssaultRifle(M16);
        Gun AR3 = new AssaultRifle(AK117);
        Gun AR4 = new AssaultRifle(AK47);
        Gun AR5 = new AssaultRifle(ASM10);
        Gun AR6 = new AssaultRifle(M4);
        Gun AR7 = new AssaultRifle(BK57);
        Gun AR8 = new AssaultRifle(LK24);
        Gun AR9 = new AssaultRifle(ICR_1);
        Gun AR10 = new AssaultRifle(MAN_O_WAR);
        Gun AR11 = new AssaultRifle(KN_44);
        Gun AR12 = new AssaultRifle(HBRA3);
        Gun AR13 = new AssaultRifle(HVK_30);
        Gun AR14 = new AssaultRifle(DR_H);
        Gun AR15 = new AssaultRifle(PEACEKEEPER);
        Gun AR16 = new AssaultRifle(FR_556);
        Gun AR17 = new AssaultRifle(AS_VAL);
        Gun AR18 = new AssaultRifle(CR56_AMAX);
        Gun AR19 = new AssaultRifle(M13);
        Gun AR20 = new AssaultRifle(SWORDFISH);
        Gun AR21 = new AssaultRifle(KILO_141);
        Gun AR22 = new AssaultRifle(ODEN);
        Gun AR23 = new AssaultRifle(KRIG_6);
        Gun AR24 = new AssaultRifle(EM2);
        Gun AR25 = new AssaultRifle(MADDOX);
        Gun AR26 = new AssaultRifle(FFAR_1);
        Gun AR27 = new AssaultRifle(GRAU_556);
        Gun AR28 = new AssaultRifle(GROZA);
        Gun AR29 = new AssaultRifle(TYPE_19);
        Gun AR30 = new AssaultRifle(BP50);

        Gun Sniper1 = new Sniper(XPR_50);
        Gun Sniper2 = new Sniper(ARCTIC_50);
        Gun Sniper3 = new Sniper(M21_EBR);
        Gun Sniper4 = new Sniper(DL_Q33);
        Gun Sniper5 = new Sniper(LOCUS);
        Gun Sniper6 = new Sniper(NA_45);
        Gun Sniper7 = new Sniper(OUTLAW);
        Gun Sniper8 = new Sniper(RYTEC_AMR);
        Gun Sniper9 = new Sniper(SVD);
        Gun Sniper10 = new Sniper(KOSHKA);
        Gun Sniper11 = new Sniper(ZRG_20MM);
        Gun Sniper12 = new Sniper(HDR);
        Gun Sniper13 = new Sniper(LW3_TUNDRA);

        Gun LMG1 = new LightMachineGun(S36);
        Gun LMG2 = new LightMachineGun(UL736);
        Gun LMG3 = new LightMachineGun(RPD);
        Gun LMG4 = new LightMachineGun(M4LMG);
        Gun LMG5 = new LightMachineGun(CHOPPER);
        Gun LMG6 = new LightMachineGun(HADES);
        Gun LMG7 = new LightMachineGun(PKM);
        Gun LMG8 = new LightMachineGun(DINGO);
        Gun LMG9 = new LightMachineGun(BRUEN_MK9);

        Gun SMG1 = new SubMachineGun(RUS_79U);
        Gun SMG2 = new SubMachineGun(CHICOM);
        Gun SMG3 = new SubMachineGun(PDW_57);
        Gun SMG4 = new SubMachineGun(RAZORBACK);
        Gun SMG5 = new SubMachineGun(MSMC);
        Gun SMG6 = new SubMachineGun(HG_40);
        Gun SMG7 = new SubMachineGun(PHARO);
        Gun SMG8 = new SubMachineGun(GKS);
        Gun SMG9 = new SubMachineGun(CORDITE);
        Gun SMG10 = new SubMachineGun(QQ9);
        Gun SMG11 = new SubMachineGun(FENNEC);
        Gun SMG12 = new SubMachineGun(AGR_556);
        Gun SMG13 = new SubMachineGun(QXR);
        Gun SMG14 = new SubMachineGun(PP19_BIZON);
        Gun SMG15 = new SubMachineGun(MX9);
        Gun SMG16 = new SubMachineGun(CBR4);
        Gun SMG17 = new SubMachineGun(PPSH_41);
        Gun SMG18 = new SubMachineGun(KSP_45);
        Gun SMG19 = new SubMachineGun(SWITCHBLADE_X9);
        Gun SMG20 = new SubMachineGun(LAPA);
        Gun SMG21 = new SubMachineGun(OTS_9);
        Gun SMG22 = new SubMachineGun(STRIKER_45);
        Gun SMG23 = new SubMachineGun(CX9);
        Gun SMG24 = new SubMachineGun(TEC_9);

        Gun Shotgun1 = new Shotgun(HS2126);
        Gun Shotgun2 = new Shotgun(BY15);
        Gun Shotgun3 = new Shotgun(HS0405);
        Gun Shotgun4 = new Shotgun(STRIKER);
        Gun Shotgun5 = new Shotgun(KRM_262);
        Gun Shotgun6 = new Shotgun(ECHO);
        Gun Shotgun7 = new Shotgun(R9_0);
        Gun Shotgun8 = new Shotgun(JAK_12);
        Gun Shotgun9 = new Shotgun(ARGUS);

        Gun Marksman1 = new Marksman(KILO_BOLT_ACTION);
        Gun Marksman2 = new Marksman(SKS);
        Gun Marksman3 = new Marksman(SP_R_208);
        Gun Marksman4 = new Marksman(MK2);

        primaryWeapons
                .addGun(AR1).addGun(AR2)
                .addGun(AR3).addGun(AR4)
                .addGun(AR5).addGun(AR6)
                .addGun(AR7).addGun(AR8)
                .addGun(AR9).addGun(AR10)
                .addGun(AR11).addGun(AR12)
                .addGun(AR13).addGun(AR14)
                .addGun(AR15).addGun(AR16)
                .addGun(AR17).addGun(AR18)
                .addGun(AR19).addGun(AR20)
                .addGun(AR21).addGun(AR22)
                .addGun(AR23).addGun(AR24)
                .addGun(AR25).addGun(AR26)
                .addGun(AR27).addGun(AR28)
                .addGun(AR29).addGun(AR30)

                .addGun(Sniper1).addGun(Sniper2)
                .addGun(Sniper3).addGun(Sniper4)
                .addGun(Sniper5).addGun(Sniper6)
                .addGun(Sniper7).addGun(Sniper8)
                .addGun(Sniper9).addGun(Sniper10)
                .addGun(Sniper11).addGun(Sniper12)
                .addGun(Sniper13)

                .addGun(LMG1).addGun(LMG2)
                .addGun(LMG3).addGun(LMG4)
                .addGun(LMG5).addGun(LMG6)
                .addGun(LMG7).addGun(LMG8)
                .addGun(LMG9)

                .addGun(SMG1).addGun(SMG2)
                .addGun(SMG3).addGun(SMG4)
                .addGun(SMG5).addGun(SMG6)
                .addGun(SMG7).addGun(SMG8)
                .addGun(SMG9).addGun(SMG10)
                .addGun(SMG11).addGun(SMG12)
                .addGun(SMG13).addGun(SMG14)
                .addGun(SMG15).addGun(SMG16)
                .addGun(SMG17).addGun(SMG18)
                .addGun(SMG19).addGun(SMG20)
                .addGun(SMG21).addGun(SMG22)
                .addGun(SMG23).addGun(SMG24)

                .addGun(Shotgun1).addGun(Shotgun2)
                .addGun(Shotgun3).addGun(Shotgun4)
                .addGun(Shotgun5).addGun(Shotgun6)
                .addGun(Shotgun7).addGun(Shotgun8)
                .addGun(Shotgun9)

                .addGun(Marksman1).addGun(Marksman2)
                .addGun(Marksman3).addGun(Marksman4);
    }

    public static ArrayList<Gun> getAllPrimaryWeapons(){
        addWeapons();
        return primaryWeapons.masteredGuns();
    }
}
