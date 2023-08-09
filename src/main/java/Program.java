import game.entities.Player;
import game.entities.Slime;

public class Program {
    public static void main(String[] args) {
        Player player = new Player("Luis", 50, 20, 20);
        Slime slime = new Slime("hugo", 50, 20, 20);
        System.out.println(player.getName());
        System.out.println(slime.getName());
    }
}
