package za.co.wethinkcode.swingy.view.console;

import za.co.wethinkcode.swingy.App;
import za.co.wethinkcode.swingy.controller.CreateHeroController;
import za.co.wethinkcode.swingy.view.CreateHeroView;

import java.util.Scanner;

public class CreateHeroViewConsole implements CreateHeroView {

    private CreateHeroController controller;

    @Override
    public void start() {
        controller = new CreateHeroController(this);

        getUserInput();
    }

    @Override
    public void getUserInput() {
        Scanner scanner = App.getScanner();
        System.out.println("===Welcome to Swingy===");
        System.out.println("List of Available commands : CREATE, SELECT, SWITCH");
        System.out.println("Classes: attack  defense   hp\n" +
                "Beginner    10      20      100\n" +
                "Novice      20      30      100\n" +
                "Inter       30      40      100\n" +
                "Expert      40      50      120\n" +
                "Enter class name: ");

    }

    @Override
    public void showErrorMessage(String message) {
        System.out.println("Error: " + message);
    }

    @Override
    public void openGame() {
        new GameViewConsole().start();
    }
}
