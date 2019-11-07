package za.co.wethinkcode.swingy.model;

import za.co.wethinkcode.swingy.model.artifact.Armor;
import za.co.wethinkcode.swingy.model.artifact.Artifact;
import za.co.wethinkcode.swingy.model.artifact.Helm;
import za.co.wethinkcode.swingy.model.artifact.Weapon;
import za.co.wethinkcode.swingy.model.character.Enemy;
import za.co.wethinkcode.swingy.model.character.Entity;
import za.co.wethinkcode.swingy.model.character.Hero;
import za.co.wethinkcode.swingy.model.character.Position;

import java.util.concurrent.ThreadLocalRandom;


public class Game {

    private static Game instance = null;

    private Hero hero;
    private Position heroCoord;
    private int mapSize;
    private boolean[][] map;

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void initGame(Hero hero) {
        this.hero = hero;
        generateMap();
        generateVillains();
        putHero();
    }

    private void generateMap() {
        int level = hero.getLevel();
        mapSize = (level - 1) * 5 + 10 - (level % 2);
        map = new boolean[mapSize][mapSize];
    }

    private void generateVillains() {
        int rand;
        int level = hero.getLevel();

        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {

                    map[i][j] = true;
            }
        }
    }

    public Enemy generateVillain() {
       return null;git
    }

    private Artifact generateArtifact() {
        return null;
    }

    public int fightResult(Entity villain) {
        return 1;
    }

    private void putHero() {
        heroCoord = new Position(mapSize / 2, mapSize / 2);
        map[heroCoord.getY()][heroCoord.getX()] = false;
    }

    public int getMapSize() {
        return mapSize;
    }

    public void setMapSize(int mapSize) {
        this.mapSize = mapSize;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Position getHeroCoord() {
        return heroCoord;
    }

    public void setHeroCoord(Position heroCoord) {
        this.heroCoord = heroCoord;
    }

    public boolean[][] getMap() {
        return map;
    }

    public void setMap(boolean[][] map) {
        this.map = map;
    }
}
