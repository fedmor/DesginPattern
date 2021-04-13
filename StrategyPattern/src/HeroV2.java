public class HeroV2 {
    private String name;
    private int HP = 500;
    private int MP = 200;
    private int Strength = 150;
    private int Wisdom = 80;
    private int Defense = 50;

    private Skillv2 skill;


    public HeroV2(String name, Skillv2 skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack(HeroV2 TargetHero) {
        int injure = skill.attack(this, TargetHero);
        System.out.printf("%s attack %s use %s \n", this.getName(), TargetHero.getName(), this.skill.toString());
        TargetHero.loseHP(injure);
        System.out.printf("%s HP is %d , %s HP is %d \n", this.getName(), this.getHP(), TargetHero.getName(), TargetHero.getHP());

    }

    public void loseHP(int i) {
        int delta = this.getHP() - i;
        if (delta > 0) {
            this.setHP(this.getHP() - i);
        } else {
            this.setHP(0);
        }
    }

    public boolean isAlive() {
        return this.getHP() > 0;
    }

    private void loseMP(int i) {
        this.setMP(this.getMP() - i);
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
