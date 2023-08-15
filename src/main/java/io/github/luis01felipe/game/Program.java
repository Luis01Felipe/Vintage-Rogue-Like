package io.github.luis01felipe.game;

import io.github.luis01felipe.game.entities.*;

public class Program {
    public static void main(String[] args) {
        Entity player = new Player("Hero", 50, 20, 20);
        Entity slime = new Slime("Slime", 25, 10, 10);
        Entity ciclop = new Ciclop("Ciclop", 100, 40, 40);
        World matriz = new World(5, 5);

        System.out.println(player.getName());
        System.out.println(ciclop.getName());
    }
}
