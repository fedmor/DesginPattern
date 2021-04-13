public class WaterBall implements Skillv2 {
    @Override
    public int attack(HeroV2 attackingHero, HeroV2 attackedHero) {
        int injure = attackingHero.getWisdom()*2;
        return injure;
    }

    @Override
    public String toString() {
        return "water ball";
    }
}
