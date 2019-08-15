import Game.PlayBoard;
import Game.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayBoard playBoard = new PlayBoard(5,5);
        String name;
        String flag;

        System.out.println("************************************************");
        System.out.println("\n\nWelcome to my game!");
        System.out.println("\nSet your name and flag: ");

        Player player1 = new Player(sc.nextLine().trim(),sc.nextLine().trim());
        System.out.println("Welcome " + player1.getName() + " ("+player1.getFlag().trim()+")!");
        playBoard.displayMatrix();
        System.out.println("\n\n************************************************");


        do{
            System.out.println("\nYour turn (x,y): ");
            try {
                playBoard.updatePoint(sc.nextInt(),sc.nextInt(),player1);
            }catch (InputMismatchException e){
                throw new InputMismatchException("You didn't enter a number!");
            }
            playBoard.displayMatrix();


        }while (true);


    }
}
