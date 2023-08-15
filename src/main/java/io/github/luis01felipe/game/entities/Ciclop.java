package io.github.luis01felipe.game.entities;

public class Ciclop extends Entity {
    public Ciclop(String name, int life, int attack, int defense){
        super(name, life, attack, defense);
    }

    @Override
    int damage() {
        return 0;
    }
}