package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.model.Game;
import za.co.wethinkcode.swingy.model.character.Hero;
import za.co.wethinkcode.swingy.model.character.HeroFactory;
import za.co.wethinkcode.swingy.model.character.HeroValidationException;
import za.co.wethinkcode.swingy.view.CreateHeroView;


public class CreateHeroController {

    private CreateHeroView view;
    private Game game;

    public CreateHeroController(CreateHeroView view) {
        this.view = view;
        game = Game.getInstance();
    }

    public void onCreateButtonPressed(String name, String heroClass) {
        Hero hero;
        try {
            hero = HeroFactory.newHero(name, heroClass);
            hero.validateHero();
        } catch (IllegalArgumentException | HeroValidationException e) {
            view.showErrorMessage(e.getMessage());
            view.getUserInput();
            return;
        }

        int id = DataBaseController.insert(hero.getName(), hero.getHeroClass(), hero.getLevel(), hero.getExperience(), hero.getAttack(), hero.getDefense(), hero.getHitPoints());
        hero.setId(id);
        game.initGame(hero);
        view.openGame();
    }
}
