package za.co.wethinkcode.swingy;

import za.co.wethinkcode.swingy.controller.DataBaseController;
import za.co.wethinkcode.swingy.view.GUI.StartViewGUI;
import za.co.wethinkcode.swingy.view.console.StartViewConsole;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class App {

    private static JFrame frame;
    private static Scanner scanner;

    public static void main(String[] args) {
        DataBaseController.connect();
        try {
                if (args.length == 0) {
                    try {
                        new StartViewConsole().start();
                    }catch (IndexOutOfBoundsException e)
                    {
                        System.out.println(e);
                    }

                } else if (!args[0].equals("console") && !args[0].equals("gui")) {
                    System.out.println("Usage: program console | gui");
                    System.exit(1);
                }
                else if (args[0].equals("console"))
                    new StartViewConsole().start();
                else if (args[0].equals("gui"))
                    new StartViewGUI().start();
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public static JFrame getFrame() {
        if (frame == null) {
            frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setSize(600, 500);
            frameListener();
        }
        return frame;
    }

    public static void showFrame() {
        if (frame != null)
            frame.setVisible(true);
    }

    public static void hideFrame() {
        if (frame != null)
            frame.setVisible(false);
    }

    public static Scanner getScanner() {
        if (scanner == null)
            scanner = new Scanner(System.in);
        return scanner;
    }

    public static void closeConnections() {
        DataBaseController.close();
        if (scanner != null)
            scanner.close();
    }

    private static void frameListener() {
        getFrame().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeConnections();
                super.windowClosing(e);
            }
        });
    }
}
