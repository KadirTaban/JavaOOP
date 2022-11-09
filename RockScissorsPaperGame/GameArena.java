package RockScissorsPaperGame;

public class GameArena {
    Gamer gamer1,gamer2;
    static boolean isGameOver;

    void addGamers(Gamer g1, Gamer g2 ){
        this.gamer1 = g1;
        this.gamer2 = g2;
    }

    void startGame() {
        while(!isGameOver){
            System.out.println(gamer1.name+"'s turn. play!");
            gamer1.move();
            System.out.println(gamer2.name+"'s turn. play!");
            gamer2.move();
            ProcessMoves();
        }
        ShowResults();
    }

    private void ProcessMoves() {
        if(isGameOver)return;

        if(gamer1.sign == HandSign.Paper && gamer2.sign == HandSign.Rock){
            gamer1.wins++;
        }
        else if(gamer1.sign == HandSign.Scissors && gamer2.sign == HandSign.Paper){
            gamer1.wins++;
        }else if(gamer1.sign == HandSign.Rock && gamer2.sign == HandSign.Scissors){
            gamer1.wins++;
        }
        else if(gamer1.sign == gamer2.sign){
            Gamer.draws++;
            System.out.println("draw!");
        }
        else{
            gamer2.wins++;
        }

    }

    private void ShowResults() {
        System.out.printf("Gamer name: %s WINS: %d",gamer1.name,gamer1.wins);
        System.out.printf("Gamer name: %s WINS: %d",gamer2.name,gamer2.wins);
        System.out.printf("Num of Trials: %d Number of Draws: %d",Gamer.numofTrials,Gamer.draws);
    }
}
