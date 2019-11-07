package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.model.Game;
import za.co.wethinkcode.swingy.model.character.Hero;
import za.co.wethinkcode.swingy.model.character.HeroValidationException;
import za.co.wethinkcode.swingy.view.SelectHeroView;

import java.util.ArrayList;


public class SelectHeroController {

    private SelectHeroView view;
    private Game game;

    public SelectHeroController(SelectHeroView view) {
        this.view = view;
        game = Game.getInstance();
    }

    public void onListElementSelected(int idx) {
        Hero hero = DataBaseController.selectHeroById(idx + 1);
        view.updateInfo(hero.toString());
    }

    public String[] getListData() {
        ArrayList<String> list = DataBaseController.selectAll();
        String[] listArr = new String[list.size()];
        listArr = list.toArray(listArr);
        return listArr;
    }

    public void onSelectButtonPressed(int idx) {
        Hero hero;
        try {
            hero = DataBaseController.selectHeroById(idx + 1);
            hero.validateHero();
        } catch (HeroValidationException e) {
            view.showErrorMessage(e.getMessage());
            return;
        }

        game.initGame(hero);
        view.openGame();
    }

    public void onCreateButtonPressed() {
        view.openCreateHero();
    }
}
