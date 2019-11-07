package za.co.wethinkcode.swingy.view.console;

import za.co.wethinkcode.swingy.App;
import za.co.wethinkcode.swingy.controller.StartController;
import za.co.wethinkcode.swingy.view.GUI.StartViewGUI;
import za.co.wethinkcode.swingy.view.StartView;

import java.util.Scanner;


public class StartViewConsole implements StartView {

    private StartController controller;

    @Override
    public void start() {
        controller = new StartController(this);

    }

    @Override
    public void openCreateHero() {
        new CreateHeroViewConsole().start();
    }

    @Override
    public void switchView() {
        new StartViewGUI().start();
    }

    @Override
    public void openSelectHero() {
        new SelectHeroViewConsole().start();
    }
}
