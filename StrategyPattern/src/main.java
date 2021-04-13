

public class main {

    public static void main(String[] args) {

//        Hero heroA = new Hero("dongdong",Hero.Skill.COLLIDING);
//        Hero heroB = new Hero("junjun",Hero.Skill.WATERBALL);
//
//        Battle battle = new Battle(heroA,heroB);
//        battle.run();

        HeroV2 heroA = new HeroV2("dongdong", new Colliding());
        HeroV2 heroB = new HeroV2("junjun", new WaterBall());

        BattleV2 battle = new BattleV2(heroA, heroB);
        battle.run();

    }
}
