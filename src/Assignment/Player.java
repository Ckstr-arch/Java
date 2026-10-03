package Assignment;

public class Player {
    String playerName;
    double score;
    int lives;

    public void setPlayer(String name, int StartingLives) {
        playerName = name;
        lives = StartingLives;
        score = 0;
    }

    public void addScore(double points) {
        if (lives > 0) {
            score += points;
        } else {
            System.out.println("Cannot add score. " + playerName + " is out of the game.");
        }
    }

    public void loseLife() {
        lives--;
        if (lives < 0) {
            System.out.println("Game Over for " + playerName + "!");
        }
    }

    public boolean isAlive(){
        if (lives > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public String getStatus(){
        return playerName + " | Score: " + score + " | Lives: " + lives;
    }

    public static void main(String[] args) {

        //Player 1
        Player player1 = new Player();
        player1.setPlayer("Alec", 3);

        System.out.println("\n" + player1.getStatus());
        player1.addScore(10);
        System.out.println(player1.getStatus());
        player1.loseLife();
        System.out.println(player1.getStatus());
        player1.loseLife();
        System.out.println(player1.getStatus());
        player1.loseLife();
        System.out.println(player1.getStatus());
        player1.addScore(5);
        System.out.println(player1.getStatus());

        //Player 2
        Player player2 = new Player();
        player2.setPlayer("Bobby", 2);

        System.out.println("\n" + player2.getStatus());
        player2.addScore(15);
        System.out.println(player2.getStatus()); 
    }       
}
