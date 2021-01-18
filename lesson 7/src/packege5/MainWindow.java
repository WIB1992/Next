package packege5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private static final int WIN_WIDTH = 500;
    private static final int WIN_HEIGTH = 555;
    private static final int WIN_POSX = 650;
    private static final int WIN_POSY = 250;

    private Settings settingsWindow;
    private GameMap gameMap;
    MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH,WIN_HEIGTH);
        setLocation(WIN_POSX,WIN_POSY);
        setTitle("Крестики - нолики");
        setResizable(false);

        settingsWindow = new Settings(this);
        gameMap = new GameMap();
        JButton btnStartGame = new JButton("Новая игра");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });

        JButton btnExit = new JButton("Выход из игры");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel panelBottom = new JPanel();
        panelBottom.setLayout(new GridLayout(1,2));
        panelBottom.add(btnStartGame);
        panelBottom.add(btnExit);
        add(panelBottom, BorderLayout.SOUTH);

        add(gameMap);
        setVisible(true);
    }
    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        gameMap.startNewGame(mode,fieldSizeX, fieldSizeY, winLength );


    }

}
