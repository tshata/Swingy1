package za.co.wethinkcode.swingy.view.GUI;

import za.co.wethinkcode.swingy.App;
import za.co.wethinkcode.swingy.controller.SelectHeroController;
import za.co.wethinkcode.swingy.view.SelectHeroView;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectHeroViewGUI extends JPanel implements SelectHeroView {

    private JEditorPane infoPane = new JEditorPane();
    private JButton selectButton = new JButton("Select");
    private JButton createButton = new JButton("Create");

    private SelectHeroController controller;
    private int lastSelectedIdx;

    @Override
    public void start() {
        controller = new SelectHeroController(this);

        buildUI();
    }

    private void buildUI() {

    }

    @Override
    public void updateInfo(String info) {
        infoPane.setText(info);
    }

    @Override
    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(App.getFrame(), message);
    }

    @Override
    public void openGame() {
        this.setVisible(false);
        new GameViewGUI().start();
    }

    @Override
    public void openCreateHero() {
        this.setVisible(false);
        new CreateHeroViewGUI().start();
    }
}
