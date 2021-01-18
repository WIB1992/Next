package packege5;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.RecursiveAction;

public class Settings extends JFrame {
    private static final int WIN_WIDTH = 350;
    private static final int WIN_HEIGTH = 270;
    private MainWindow mainWindow;

    Settings(MainWindow mainWindow) {
        this.mainWindow = mainWindow;

        setSize(WIN_WIDTH,WIN_HEIGTH);
        Rectangle gameWindowBounds = mainWindow.getBounds();
        int posX = (int)gameWindowBounds.getCenterX() - WIN_WIDTH/2;
        int posY = (int)gameWindowBounds.getCenterX() - WIN_HEIGTH/2;
        setLocation(posX,posY);
        setResizable(false);
        setTitle("Настройки");

    }


}
