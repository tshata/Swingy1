package za.co.wethinkcode.swingy.model.character;

public class Manager {

    private static HeroBuilder buildNew(String name) {
        HeroBuilder builder = new HeroBuilder();
        builder.setName(name);
        builder.setLevel(0);
        builder.setExperience(0);
        return builder;
    }

    public static Hero createBeginner(String name) {
        HeroBuilder builder = buildNew(name);
        builder.setAttack(10);
        builder.setDefense(20);
        builder.setHitPoints(100);
        builder.setHeroClass("Beginner");
        return builder.getHero();
    }

    public static Hero createNovice(String name) {
        HeroBuilder builder = buildNew(name);
        builder.setAttack(20);
        builder.setDefense(30);
        builder.setHitPoints(100);
        builder.setHeroClass("Novice");
        return builder.getHero();
    }

    public static Hero createIntermediate(String name) {
        HeroBuilder builder = buildNew(name);
        builder.setAttack(30);
        builder.setDefense(40);
        builder.setHitPoints(100);
        builder.setHeroClass("Inter");
        return builder.getHero();
    }

    public static Hero createExpert(String name) {
        HeroBuilder builder = buildNew(name);
        builder.setAttack(40);
        builder.setDefense(50);
        builder.setHitPoints(120);
        builder.setHeroClass("Expert");
        return builder.getHero();
    }

}
