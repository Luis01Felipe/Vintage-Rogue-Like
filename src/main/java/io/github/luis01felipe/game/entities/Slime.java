package io.github.luis01felipe.game.entities;

public class Slime extends Entity {
    public Slime(String name, int life, int attack, int defense){
        super(name, life, attack, defense);
    }
    @Override
    public int damage(){
        //return this.life -= player.attack - this.defense;
        return 0;
    }
}
