package za.co.wethinkcode.swingy.view.GUI;

import za.co.wethinkcode.swingy.App;
import za.co.wethinkcode.swingy.controller.GameController;
import za.co.wethinkcode.swingy.model.Game;
import za.co.wethinkcode.swingy.model.character.Position;
import za.co.wethinkcode.swingy.view.GameView;
import za.co.wethinkcode.swingy.view.console.GameViewConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameViewGUI extends JPanel implements GameView {

    private String[] directions = {"North", "East", "South", "West"};
    private JComboBox<String> directionsComboBox = new JComboBox<>(directions);
    private JButton moveButton = new JButton("Move");
    private JButton switchButton = new JButton("Switch to console");

    private JEditorPane infoPane = new JEditorPane();
    private JEditorPane mapPane = new JEditorPane();

    private GameController controller;

    @Override
    public void start() {
        controller = new GameController(this);

        buildUI();
        controller.onStart();
    }

    private void buildUI() {

    }

    @Override
    public void printMap(boolean[][] map, Position heroCoord) {

    }

    @Override
    public void update(Game game) {

    }

    @Override
    public void gameFinished() {
        App.hideFrame();
        App.getFrame().dispose();
        App.closeConnections();
    }

    @Override
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(App.getFrame(), message);
    }

    @Override
    public void getVillainCollisionInput() {

    }

    @Override
    public boolean replaceArtifact(String replaceMessage) {
       return true;
    }

    @Override
    public void switchView() {
        App.hideFrame();
        new GameViewConsole().start();
    }
}
