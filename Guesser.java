
   
    import java.util.*;
        class Guesser{
        int guessNum;
        int guessNum()
        {
            
            Scanner sc =new Scanner(System.in);
            System.out.println("Guesser guess the number in the range of 0-20");
            int num=sc.nextInt();
            if(num <=20)
                 guessNum=num;
            else {
                System.out.println("Guess the number in the range of 0-20 ");
                guessNum();
            }
            return guessNum;	
        }
        }
        class Player{
            int guessNum;
            int guessNum()
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("Player guess the number in the range of 0-20");
                int num=sc.nextInt();
                if(num <=20)
                     guessNum=num;
                else
                    System.out.println("Guess the number in the range of 0-20 ");
                return guessNum;
            }
        }
        class Umpire
        {
            int numFromGuesser;
            int numFromPlayer1;
            int numFromPlayer2;
            int numFromPlayer3;
            void collectNumFromGuesser()
            {
                Guesser g=new Guesser();
                numFromGuesser=g.guessNum();
            }
            void collectFromPlayers()
            {
                Player p1=new Player();
                Player p2=new Player();
                Player p3=new Player();
                 numFromPlayer1 =p1.guessNum();
                 numFromPlayer2 =p2.guessNum();
                 numFromPlayer3 =p3.guessNum();
            }
            void compare()
            {
                if( numFromGuesser ==numFromPlayer1)
                {
                    if(numFromGuesser ==numFromPlayer2 && numFromGuesser == numFromPlayer3)
                    {
                        System.out.println("All players had won !!");
                    }
                    else if(numFromGuesser ==numFromPlayer2)
                    {
                        System.out.println("player 1 and player 2 had won!!");
                    }
                    else if(numFromGuesser == numFromPlayer3)
                    {
                        System.out.println("player 1 and player 3 had won !!");
                    }
                    else
                    {
                        System.out.println("Player 1 had won !!");
                    }
                }
                else if(numFromGuesser == numFromPlayer2)
                {
                    if( numFromGuesser == numFromPlayer3)
                    {
                        System.out.println("player 2 and player 3 had won !!");
                    }
                    else
                    {
                        System.out.println("Player 2 had won !!");
                    }
                }
                else if(numFromGuesser == numFromPlayer3)
                        System.out.println("Player 3 had won !!");
                else
                    System.out.println("All players lose the match !!");
            }
            }
        class GuesserGame{
        public static void main(String []args) {
            Umpire u= new Umpire();
            u.collectNumFromGuesser();
            u.collectFromPlayers();
            u.compare();
        }
        }
    
        

