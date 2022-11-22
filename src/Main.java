import java.util.*;
public class Main {
    static Random rand = new Random();
    /*
                RANDOM IN JAVA
To check for random values we can use different methods like:
    import java.util.Random;
    Random rand = new Random();
    //will get the randomGame between 0 and parameter-1
    int -> rand.nextInt(parameter);
    float/double -> rand.nextFloat();
    boolean -> rand.nextBoolean();
*/
    private static void playerGame(){
        boolean check = true;
        while(check){
            /*
    To get the user input, we use a java class :
        import java.util.Scanner;
        Scanner input = new Scanner(System.in);
        int -> userInput = input.nextInt();
        string -> userInput = input.nextLine();
        float/double -> userInput = input.nextLine();
                */
            Scanner input = new Scanner(System.in);
            System.out.println("choose a number between 1 and 6");
            int player = input.nextInt();

            /*
            will get the values between 1 and 5
            */
            int computer = rand.nextInt(6) + 1;
            System.out.println("the player rolled a " + player + " and the computer rolled a " + computer);
            if(player > 6){
                System.out.println("the value entered makes no sense");
            }
            else {
                if (player == computer) {
                    System.out.println("you lucky son of a gun");
                } else {
                    System.out.println("i guess you ain't as lucky as you thought.");
                }

                Scanner trial = new Scanner(System.in);
                System.out.println("do you wish to try again? ");
                /*
to lower can be used to convert a string to its lower case version.
    string.toLowerCase();
to upper can be used to convert a string to its higher case version.
    string.toUpperCase();
                */
                String user = trial.nextLine().toLowerCase();

                /*
the objects.equals() is similar to comparing two things with an equal sign:
        name = "Mark"
        object.equals(name, "Mark")
        name.equals("Mark")
        name == "Mark"
it is mostly used with strings.
                */
                if (Objects.equals(user, "no") || user.equals("n")) {
                    check = false;
                }
            }
        }

    }
    public static void randomGame(){
        boolean check = true;
        while(check) {
            int player = rand.nextInt(6) + 1;
            int computer = rand.nextInt(6) + 1;
            System.out.println("the player rolled a " + player + " and the computer rolled a " + computer);
            if(player == computer){
                System.out.println("you lucky son of a gun");
            }else{
                System.out.println("i guess you ain't as lucky as you thought.");
            }

            Scanner input = new Scanner(System.in);
            System.out.println("do you wish to try again? ");
            String user = input.nextLine().toLowerCase();


            if (Objects.equals(user, "no") || user.equals("n")) {
                check = false;
            }

        }
    }
    public void choice(){
        Scanner choice = new Scanner(System.in);
        System.out.println("Welcome to the dice game \n");
        System.out.println("what do you wish to do:");
        System.out.println("1) Play a random game\n 2) play a guessing game\n");
        int choose = choice.nextInt();
        if(choose == 1) {
            randomGame();
        }
        else if (choose == 2) {
            playerGame();
        }
        else{
            System.out.println("the value entered is not usable");
        }
    }

    public static void main(String[] args) {
        Main game = new Main();
        game.choice();
    }
}
