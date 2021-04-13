


public class Battle {
    private Hero heroA;
    private Hero heroB;

    public Battle(Hero heroA, Hero heroB) {
        this.heroA = heroA;
        this.heroB = heroB;
    }

    public void run() {
        while (true) {
            if (this.heroA.getHP() > 0 && this.heroB.getHP() > 0) {
                System.out.println(this.heroA.getName() + " attack " + this.heroB.getName());
                this.heroA.attack(this.heroB);
                System.out.println(this.heroA.getName() + " HP:" + this.heroA.getHP()+" " + this.heroB.getName() + " HP:" + this.heroB.getHP());
                System.out.println(this.heroB.getName() + " attack " + this.heroA.getName());
                this.heroB.attack(this.heroA);
                System.out.println(this.heroA.getName() + " HP:" + this.heroA.getHP()+" " + this.heroB.getName() + " HP:" + this.heroB.getHP());
            } else {
                break;
            }
        }
        if (this.heroA.getHP() > 0) {
            System.out.println(this.heroA.getName() + " is winner");
        } else if (this.heroB.getHP() > 0) {
            System.out.println(this.heroB.getName() + " is winner");
        } else {
            System.out.println("DRAW");
        }
    }

}
