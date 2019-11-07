package za.co.wethinkcode.swingy.model.character;


public abstract class HeroFactory {

    public static Hero newHero(String name, String heroClass) {
        switch (heroClass.toLowerCase()) {
            case "beginner":
                return Manager.createBeginner(name);
            case "novice":
                return Manager.createNovice(name);
            case "inter":
                return Manager.createIntermediate(name);
            case "expert":
                return Manager.createExpert(name);
            default:
                throw new IllegalArgumentException("Invalid hero class: " + heroClass);
        }
    }
}
