package za.co.wethinkcode.swingy.view.console;

import za.co.wethinkcode.swingy.App;
import za.co.wethinkcode.swingy.controller.GameController;
import za.co.wethinkcode.swingy.model.Game;
import za.co.wethinkcode.swingy.model.character.Position;
import za.co.wethinkcode.swingy.view.GUI.GameViewGUI;
import za.co.wethinkcode.swingy.view.GameView;

import java.util.Scanner;

public class GameViewConsole implements GameView {

    private GameController controller;

    @Override
    public void start() {
        controller = new GameController(this);

        controller.onStart();
    }

    @Override
    public void update(Game game) {


        getUserInput();
    }

    private void getUserInput() {
        Scanner scanner = App.getScanner();

    }

    @Override
    public void printMap(boolean[][] map, Position heroCoord) {

    }

    @Override
    public void gameFinished() {
        App.getFrame().dispose();
        App.closeConnections();
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void getVillainCollisionInput() {
        Scanner scanner = App.getScanner();

    }

    @Override
    public boolean replaceArtifact(String replaceMessage) {
        Scanner scanner = App.getScanner();


        return false;
    }

    @Override
    public void switchView() {
        new GameViewGUI().start();
    }
}
