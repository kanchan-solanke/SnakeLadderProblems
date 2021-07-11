public class SnakeLadder {

    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public void dice() {
        // player initial position
        int playerPosition = 0;
        int winningPosition = 100;

        System.out.println("player start position = " +playerPosition);

        while(playerPosition <= winningPosition) {

            // generate random dice value 1 to 6
            int diceRoll=(int) (Math.random()*(6)+1);
            System.out.println("Dice roll : " +diceRoll);


            int option = (int)((Math.random()*3));
            System.out.println("option : " +option);

            switch(option) {
                case NO_PLAY:
                    // player stay in the same position
                    playerPosition +=0;
                    break;

                case LADDER:
                    // player moves ahead
                    playerPosition +=diceRoll;
                    break;

                case SNAKE:
                    // if player position greater then subtract player position
                    if(playerPosition > 0 )
                        playerPosition -= diceRoll;
                    break;
            }
            System.out.println("player position : " +playerPosition);
        }
        System.out.println("player position : " +playerPosition);
    }

    public static  void main(String[] args) {

        System.out.println("welcome to snake ladder game :");
        SnakeLadder start = new SnakeLadder();
        start.dice();


    }
}

