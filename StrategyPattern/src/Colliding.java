public class Colliding implements Skillv2 {

    @Override
    public int attack(HeroV2 attackingHero, HeroV2 attackedHero) {
        int injure = attackingHero.getStrength() - attackedHero.getDefense();
        return injure;
    }



    @Override
    public String toString() {
        return "Colliding";
    }
}
