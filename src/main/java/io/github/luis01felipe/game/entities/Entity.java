package io.github.luis01felipe.game.entities;

public abstract class Entity {
    String name;
    int life;
    static int attack;
    int defense;

    // abstract void nomeDoMetodo();
    public Entity(String name, int life, int attack, int defense){
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.defense = defense;
    }
    public String getName(){
        return name;
    }
    abstract int damage();

}
