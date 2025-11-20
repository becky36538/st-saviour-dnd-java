import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {

    public static void main(String[] args) {

        // Create Scanner for collecting user input.
        Scanner scanner = new Scanner(System.in);

        // Collect character name from user.
        System.out.print("Name: ");
        String name = scanner.nextLine();

        // Collect character role from user.
        System.out.print("Role: ");
        String role = scanner.nextLine();

        System.out.println("Your name is " + name + " and your role is " + role + ".");
        
        // use dramatic text to give instructions to user on how to play the game

        printDramaticText("Our adventure begins in an empty, green, dark maze");
        printDramaticText("A hungry Labubu has awoken, and is searching for you as a meal");
        printDramaticText("Use right, left, up, or down to escape");
        // the directions to move in the maze are listed in a string called "solution" =, stored in the data
        String[] solution = new String[]{"up", "right", "up", "right", 
            "right", "down", "right", "down"};
        // int i begins at 0 to correspond with the user's answers and the solution
        int i = 0;
        // boolean is a type for true or false
        // if the result of the game is a win, then the boolean value "win" is true
        boolean win = true;
        // while loop will keep the loop going whereas for loop would need to be repeated for the code to run properly
        while(i < solution.length) {
            // instructions printed to tell the player to enter the move
            System.out.println("Enter your move: ");
            // scanner nextline prints the space for the player to input their answer/decision
            String move = scanner.nextLine();
            // if the move given by the player is equal to the position corresponding to the move, then it will print "Smart choice!"
            if(move.equals(solution[i])) {
                printDramaticText("Smart choice!");
            } else {
                // if the move given by the player is not the position corresponding to the move, then it will print "The Labubu devours your soul!"
                printDramaticText("The Labubu devours your soul!");
                // the boolean value "win" would be false, resulting in losing the game
                win = false;
                // a break is needed to prevent an infinite loop
                break;
            }
            // the position increments by 1
            i += 1;
        }
        if (win) {
            // if the player wins, then the text will print at the end
            printDramaticText("You've escaped the Labubu! +100 matcha!");
        } 

    //    System.out.println("up, left, down, right");
       
    //    System.out.print("Your attempt:");

    //    List moves = Arrays.stream(input.split(",")); {
    //    if (moves.uqeals(solution))
    //         System.out.println("You've successfully escaped the hungry Labubu!");
    //         System.out.println("+100 matcha bonus");
    //    } else {
    //         System.out.println("You've been eaten by the hungry Labubu");
    //         System.out.println("-10,000 matcha");
    //    }

        // Roll a d20
        // System.out.print("Press Enter to roll a d6.");
        // scanner.nextLine();

        // int roll = (int)(Math.random() * 6) + 1;
        // Ascii.drawD20(roll);

        // if(roll == 1 || roll == 2) {
        //     printDramaticText("This is scenario 1");
        // }
        

        // TODO Continue ...
    }
        
    public static void printDramaticText(String text) {
        // Delay in milliseconds
        int delay = 100;

        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    // Draws a monster and returns an int which represents the difficulty of roll required.
    // public static int generateMonster() {
    //     int r = (int)(Math.random() * 6) + 1;
    //     if(r == 1 || r == 2 || r == 3) {
    //         String zombie = Character.toString(0x1F9DF);
    //         System.out.println("++++++++ " + zombie + " A HORDE OF ZOMBIES " + zombie + " ++++++++");
    //         System.out.println("+                                        +");
    //         System.out.println("+           roll required:  8            +");
    //         System.out.println("+                                        +");
    //         System.out.println("++++++++++++++++++++++++++++++++++++++++++");

    //         return 8;
    //     }
    //     if(r == 4 || r == 5) {
    //         String mask = Character.toString(0x1F3AD);
    //         System.out.println("++++++++++ " + mask + " DISGUISED MIMIC " + mask + " +++++++++");
    //         System.out.println("+                                        +");
    //         System.out.println("+           roll required:  12           +");
    //         System.out.println("+                                        +");
    //         System.out.println("++++++++++++++++++++++++++++++++++++++++++");

    //         return 12;
    //     }
    //     if(r == 6) {
    //         String eye = Character.toString(0x1F441);
    //         System.out.println("+++++++++++ " + eye +  " EVIL BEHOLDER " + eye + " ++++++++++++");
    //         System.out.println("+                                        +");
    //         System.out.println("+           roll required:  18           +");
    //         System.out.println("+                                        +");
    //         System.out.println("++++++++++++++++++++++++++++++++++++++++++");

    //         return 18;
    //     }
    //     return -1;
    // } 
}
