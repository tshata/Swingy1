package za.co.wethinkcode.swingy.view.console;

import za.co.wethinkcode.swingy.App;
import za.co.wethinkcode.swingy.controller.SelectHeroController;
import za.co.wethinkcode.swingy.view.SelectHeroView;

import java.util.Scanner;

public class SelectHeroViewConsole implements SelectHeroView {

    private SelectHeroController controller;
    private int lastIdx = -1;

    @Override
    public void start() {
        controller = new SelectHeroController(this);

        getInput();
    }

    private void getInput() {
        Scanner scanner = App.getScanner();


    }

    private boolean isValidNumericString(String str, int max) {
        try {
            int n = Integer.parseInt(str);
            if (n <= 0 || n > max)
                return false;
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private void printHeroes(String[] heroes) {
        if (heroes.length == 0)
            System.out.println("No saved heroes");
        else{
            System.out.println("SELECT - to select previously saved hero");
            System.out.println("Command (CREATE):");
        }
        for (String hero : heroes) {
           System.out.println(hero);
        }
    }

    @Override
    public void updateInfo(String info) {
        System.out.println(info);
    }

    @Override
    public void showErrorMessage(String message) {
        System.out.println("Error: " + message);
        getInput();
    }

    @Override
    public void openGame() {
        new GameViewConsole().start();
    }

    @Override
    public void openCreateHero() {
        new CreateHeroViewConsole().start();
    }
}
