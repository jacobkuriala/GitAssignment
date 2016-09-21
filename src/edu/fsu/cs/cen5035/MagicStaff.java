package edu.fsu.cs.cen5035;

/**
 *
 * @author Jacob Kattampilly
 */
public class MagicStaff extends BasicWeapon implements Weapon {

    public MagicStaff() {
        super(80);
    }



    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {

        int effectiveArmor =  (80 * armor)/100 ; // Assumed floor division


        int damage = DAMAGE - effectiveArmor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
