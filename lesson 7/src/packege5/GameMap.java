package packege5;

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {
    GameMap() {
        setBackground(Color.BLUE);
    }
    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.println("mode = " + mode +
                " fieldSizeX = " + fieldSizeX +
                " fieldSizeY = " + fieldSizeY +
                " winLength = " + winLength);

    }


}
