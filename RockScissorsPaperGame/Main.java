package RockScissorsPaperGame;

public class Main {
    public static void main(String[] args) {
        Gamer gamer1 = new Gamer("Kadir");
        Gamer gamer2 = new Gamer("Sevda");

        GameArena gameArena = new GameArena();
        gameArena.addGamers(gamer1, gamer2);
        gameArena.startGame();
        
    }
}
