package io.github.luis01felipe.game.entities;

public class Player extends Entity {
    public Player(String name, int life, int attack, int defense) {
        super(name, life, attack, defense);
    }

    @Override
    int damage() {
        return 0;
    }
}
