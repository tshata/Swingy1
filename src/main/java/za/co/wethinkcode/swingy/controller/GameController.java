package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.model.Game;
import za.co.wethinkcode.swingy.model.artifact.Armor;
import za.co.wethinkcode.swingy.model.artifact.Artifact;
import za.co.wethinkcode.swingy.model.artifact.Helm;
import za.co.wethinkcode.swingy.model.artifact.Weapon;
import za.co.wethinkcode.swingy.model.character.Enemy;
import za.co.wethinkcode.swingy.model.character.Hero;
import za.co.wethinkcode.swingy.model.character.Position;
import za.co.wethinkcode.swingy.view.GameView;

import java.util.Random;


public class GameController {

    private GameView view;
    private Game game;
    private Position previousPosition;

    public GameController(GameView view) {
        this.view = view;
        game = Game.getInstance();
        previousPosition = new Position(0, 0);
    }

    public void onStart() {
        view.update(game);
    }

    public void onPrintMap() {
        view.printMap(game.getMap(), game.getHeroCoord());
        view.update(game);
    }

    public void onMove(String direction) {
        int x = game.getHeroCoord().getX();
        int y = game.getHeroCoord().getY();
        previousPosition.setX(x);
        previousPosition.setY(y);

        switch (direction.toUpperCase()) {
            case "NORTH":
                y--;
                break;
            case "EAST":
                x++;
                break;
            case "SOUTH":
                y++;
                break;
            case "WEST":
                x--;
                break;
        }

        if (x < 0 || y < 0 || x >= game.getMapSize() || y >= game.getMapSize()) {
            winGame();
            return;
        }

        game.getHeroCoord().setX(x);
        game.getHeroCoord().setY(y);

        if (game.getMap()[y][x]) {
            villainCollision();
        }

        if (game.getHero().getHitPoints() > 0)
            view.update(game);
    }

    private void winGame() {

    }

    private void updateDataBase() {
        Hero hero = game.getHero();
        DataBaseController.updateHero(hero);
    }

    private void villainCollision() {
        view.getVillainCollisionInput();
    }

    public void onRun() {

    }

    private void setArtifact(Artifact artifact) {

    }

    public void onFight() {

    }

    private void addExperience(int addXP) {

    }

    public void onSwitchButtonPressed() {
        view.switchView();
    }
}
