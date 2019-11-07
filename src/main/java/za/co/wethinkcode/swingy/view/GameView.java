package za.co.wethinkcode.swingy.view;

import za.co.wethinkcode.swingy.model.Game;
import za.co.wethinkcode.swingy.model.character.Position;


public interface GameView {

    void start();

    void printMap(boolean[][] map, Position heroCoord);

    void update(Game game);

    void gameFinished();

    void showMessage(String message);

    void getVillainCollisionInput();

    boolean replaceArtifact(String replaceMessage);

    void switchView();
}
