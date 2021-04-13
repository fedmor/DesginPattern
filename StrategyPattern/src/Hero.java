


public class Hero {
    private String name;
    private int HP = 500;
    private int MP = 200;
    private int Strength = 150;
    private int Wisdom = 80;
    private int Defense = 50;

    private Skill skill;

    public enum Skill {
        COLLIDING, WATERBALL
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack(Hero TargetHero) {
        switch (this.skill) {
            case COLLIDING:
                System.out.println(this.name + " use colliding");
                TargetHero.loseHP(TargetHero.getHP(), (this.getStrength() - TargetHero.getDefense()));

                break;
            case WATERBALL:
                System.out.println(this.name + " use waterball");
                loseMP(10);

                TargetHero.loseHP(TargetHero.getHP(),this.getWisdom()*2);
                break;
        }

    }

    public void loseHP(int hp, int i) {
        int delta = hp - i;
        if (delta > 0) {
            this.setHP(hp - i);
        } else {
            this.setHP(0);
        }


    }

    private void loseMP(int i) {
        this.setMP(this.getMP()-i);

    }


    public void setDefense(int defense) {
        this.Defense = defense;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public void setWisdom(int wisdom) {
        Wisdom = wisdom;
    }

    public int getDefense() {
        return this.Defense;
    }

    public int getWisdom() {
        return this.Wisdom;
    }

    public int getStrength() {
        return this.Strength;
    }

    public int getHP() {
        return this.HP;
    }

    public int getMP() {
        return this.MP;
    }

    public String getName() {
        return this.name;
    }
}
