package edu.fsu.cs.cen5035;

/**
 *
 * @author Jacob Kattampilly
 */
public class Arrow extends BasicWeapon implements Weapon {

    public Arrow() {
        super(70);
    }



    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        final int ARMORIGNOREPOINTS = 5;

        int effectiveArmor = armor - ARMORIGNOREPOINTS;

        int damage = DAMAGE - effectiveArmor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
