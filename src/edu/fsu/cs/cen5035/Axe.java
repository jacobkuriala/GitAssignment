package edu.fsu.cs.cen5035;

/**
 *
 * @author Jacob Kattampilly
 */
public class Axe extends BasicWeapon implements Weapon {

    public Axe() {
        super(60);
    }



    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {

        int effectiveArmor = armor;

        if(armor>0 && armor<20)
            effectiveArmor=0;

        int damage = DAMAGE - effectiveArmor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
