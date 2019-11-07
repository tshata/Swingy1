package za.co.wethinkcode.swingy.view.GUI;

import za.co.wethinkcode.swingy.App;
import za.co.wethinkcode.swingy.controller.CreateHeroController;
import za.co.wethinkcode.swingy.view.CreateHeroView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CreateHeroViewGUI extends JPanel implements CreateHeroView {

    private JLabel heroNameLabel = new JLabel("Hero name:");
    private JTextField heroNameField = new JTextField(10);
    private JButton createHeroButton = new JButton("Create Hero");
    private String[] heroClasses = {"beginner", "novice", "inter", "expert"};
    private JLabel heroClass = new JLabel("Class:");
    private JComboBox<String> classesComboBox = new JComboBox<>(heroClasses);
    private JEditorPane infoPane = new JEditorPane();

    private CreateHeroController controller;

    @Override
    public void start() {
        controller = new CreateHeroController(this);

        buildUI();
    }

    private void buildUI() {


        infoPane.setEditable(false);
        infoPane.setFont(new Font("monospaced", Font.PLAIN, 12));
        infoPane.setText("         attack  defense   hp\n" +
                "Beginner    10      20      100\n" +
                "Novice      20      30      100\n" +
                "Inter       30      40      100\n" +
                "Expert      40      50      120\n"
        );

    }

    @Override
    public void getUserInput() {
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
}
