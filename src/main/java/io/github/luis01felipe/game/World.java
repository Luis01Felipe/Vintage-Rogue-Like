package io.github.luis01felipe.game;

public class World {
    private int[][] matriz;
    public World(int linhas, int colunas){
        matriz = new int[linhas][colunas];
    }
    public int[][] getMatriz() {
        return matriz;
    }

    public void printMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
