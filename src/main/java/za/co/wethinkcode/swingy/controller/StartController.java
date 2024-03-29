package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.view.StartView;


public class StartController {

    private StartView view;

    public StartController(StartView view) {
        this.view = view;
    }

    public void onCreateHeroButtonPressed() {
        view.openCreateHero();
    }

    public void onSwitchButtonPressed() {
        view.switchView();
    }

    public void onSelectHeroButtonPressed() {
        view.openSelectHero();
    }
}
