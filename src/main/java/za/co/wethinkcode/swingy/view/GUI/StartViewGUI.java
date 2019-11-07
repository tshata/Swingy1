package za.co.wethinkcode.swingy.view.GUI;

import za.co.wethinkcode.swingy.App;
import za.co.wethinkcode.swingy.controller.StartController;
import za.co.wethinkcode.swingy.view.StartView;
import za.co.wethinkcode.swingy.view.console.StartViewConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartViewGUI extends JPanel implements StartView {

    private JButton createHeroButton = new JButton("Create Hero");
    private JButton selectHeroButton = new JButton("Select Hero");
    private JButton switchViewButton = new JButton("Switch to console");

    private StartController controller;

    @Override
    public void start() {
        controller = new StartController(this);

        buildUI();
    }

    private void buildUI() {

    }

    @Override
    public void openCreateHero() {
        this.setVisible(false);
        new CreateHeroViewGUI().start();
    }

    @Override
    public void switchView() {
        App.hideFrame();
        new StartViewConsole().start();
    }

    @Override
    public void openSelectHero() {
        this.setVisible(false);
        new SelectHeroViewGUI().start();
    }
}
