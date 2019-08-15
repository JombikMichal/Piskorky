import Game.IPlayBoard;
import Game.PlayBoard;
import Game.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IPlayBoard iPlayBoard = new PlayBoard(5,5);
        String name,flag;
        int x,y;
        ArrayList<Player> players = new ArrayList<>();

        System.out.println("************************************************");
        System.out.println("\nWelcome to my game!");
        System.out.println("************************************************");
        System.out.print("\nFirst player name: ");
        name = sc.next().trim();
        System.out.print("\nFirst player flag: ");
        flag = sc.next().trim();
        players.add(new Player(name,flag));

        System.out.print("\nSecond player name: ");
        name = sc.next().trim();
        System.out.print("\nSecond player flag: ");
        flag = sc.next().trim();
        players.add(new Player(name,flag));


        System.out.println("Welcome " + players.get(0).getName() + " ("+players.get(0).getFlag().trim()+")!");
        System.out.println("Welcome " + players.get(1).getName() + " ("+players.get(1).getFlag().trim()+")!");
        iPlayBoard.displayMatrix();
        System.out.println("************************************************");

//        players.add(new Player("michal","@"));
//        players.add(new Player("jakub","%"));


        do{
            System.out.println("\nYour turn (x,y), "+ players.get(0).getName() + ": ");
            try {
                System.out.print("\nSet your x position: ");
                x = sc.nextInt()-1;
                System.out.print("\nSet your y position: ");
                y = sc.nextInt()-1;
                iPlayBoard.updatePoint(x,y,players.get(0));
            }catch (InputMismatchException e){
                throw new InputMismatchException("You didn't enter a number!");
            }
            iPlayBoard.displayMatrix();
            Collections.swap(players, 0, 1);

        }while (!iPlayBoard.win());
        System.out.println("************************************************");
        System.out.println("This game is finished!");
        System.out.println(players.get(1).getName() + " - You are WINNER!!!");
        System.out.println("************************************************");

    }
}
