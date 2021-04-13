public class BattleV2 {

    private HeroV2 heroA;
    private HeroV2 heroB;

    public BattleV2(HeroV2 heroA, HeroV2 heroB) {
        this.heroA = heroA;
        this.heroB = heroB;
    }

    public void run() {
        while (this.heroA.isAlive() && this.heroB.isAlive()) {
            this.heroA.attack(this.heroB);
            this.heroB.attack(this.heroA);
        }

        if (this.heroA.isAlive()) {
            System.out.printf("%s is winner", this.heroA.getName());
        } else if (this.heroB.isAlive()) {
            System.out.printf("%s is winner", this.heroB.getName());
        } else {
            System.out.println("DRAW");
        }
    }

}
