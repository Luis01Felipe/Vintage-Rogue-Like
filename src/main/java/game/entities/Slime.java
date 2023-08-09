package game.entities;

public class Slime extends Entity{
    public Slime(String name, int life, int attack, int defense){
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.defense = defense;
    }
    public String getName(){
        return name;
    }
}
