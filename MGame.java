package ku.cs.swc;

public class MGame {
    private String roundCat;
    private String playGame;
    private String playRound;

    public MGame(String pg,String pr){
        String playGame = pg;
        String playRound = pr;
    }

    public String getPlayGame(){
        return playGame;
    }
    
    private String getPlayRound(){
        return playRound;
    }
}
