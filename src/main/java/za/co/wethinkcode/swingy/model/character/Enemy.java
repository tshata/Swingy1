package za.co.wethinkcode.swingy.model.character;

import za.co.wethinkcode.swingy.model.artifact.Artifact;

public class Enemy extends Entity {

    private Artifact artifact;

    public Enemy(String name, int attack, int defense, int hitPoints, Artifact artifact) {
        super(name, attack, defense, hitPoints);
        this.artifact = artifact;
    }

    public Artifact getArtifact() {
        return artifact;
    }
}
