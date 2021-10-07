/* Name: josemaria Ezejelue
 * Purpose: Entering Data and communicating with the JOption Panes
 * Professor C. Anderson
 * Class: CSCI 281
 * Date: September 30 2021
 */


import javax.swing.*; 
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        int counter = 0;
        int  playerwins = 0;
        int  ties = 0;
        int playerlosses = 0;
        
        
        String title = "Play \"Rock, Paper, Scissors\"      " + "josemaria Ezejelue";
        

        String name  = JOptionPane.showInputDialog(null, "<html><h1 style = 'font-family: Algerian; " +
                "font-size= 16pt; '>Welcome to \"Rock paper Scissors Game\" \nThis is a game of 3 rounds " +
                "\nTry to beat the computer! \nPlease enter your first name:", "WELCOME!", 1
        );


        ImageIcon icon = new ImageIcon(("RPS.png"));
        ImageIcon Rcs = new ImageIcon(("rockCrushScissor.png"));
        ImageIcon Pwr = new ImageIcon(("paperWrapsRock.png"));
        ImageIcon Scp = new ImageIcon(("scissorCutPaper.png"));
        ImageIcon draw = new ImageIcon(("RPS2.png"));
        ImageIcon resultIcon = new ImageIcon(("RPS2.png"));

        //Step 1 and 2 - Introduction & While Loop Begin

        do {
            Random randGen = new Random();


        //Step 3- Enter players choice of rock, paper or scissors
            String prompt = "<html><h2 style = 'font-family: Algerian; font-size = 12pt; '>Please, Click one of the following buttons to correspond your play";

            String[] choices = {"Scissors", "Paper", "Rock"};

            //update while loop
            counter++;

            int choice = JOptionPane.showOptionDialog(null, prompt, title, 0, 0, icon, choices, choices[0]);


            String player_choice = "";
            String computer_choice = "";


        //Step 4 - Translating the Players choice

            switch (choice) {
                case 0: {
                    player_choice = "Scissors";
                    break;
                }
                case 1: {
                    player_choice = "Paper";
                    break;
                }
                case 2: {
                    player_choice = "Rock";
                    break;

                }

            }


        //Step 5-  Generating the computers play
            int computerPick = (randGen.nextInt(3)+4);



        //Step 6-  Translating the computers choice

            switch (computerPick) {
                    case 4: {
                        computer_choice = "Scissors";
                        break;
                    }
                    case 5: {
                        computer_choice = "Paper";
                        break;
                    }
                    case 6: {
                        computer_choice = "Rock";
                        break;
                    }

               }


        //Step 7- determine winner for rounds
            String resultsAccumulator = "You Played " + player_choice + " and the Computer Played " + computer_choice + ".";


            if (computer_choice.equals(player_choice)) {
                JOptionPane.showMessageDialog(null, resultsAccumulator + "\n" + "<html><h1 style " +
                        "= 'font-family: Arial Black; font-seize: 40pt; '>DRAW!", title, 0, draw);
                ties++;
            }

            else if (computer_choice.equalsIgnoreCase("rock") && player_choice.equalsIgnoreCase("paper")) {
                JOptionPane.showMessageDialog(null,resultsAccumulator+ "\n"+ "<html><h1 style " +
                        "= 'font-family:Serif; font-size: 40pt; '> Paper Wraps Rock!" + "\nYou Win", title, 0, Pwr);
                playerwins++;
            }

            else if (computer_choice.equalsIgnoreCase("rock") && player_choice.equalsIgnoreCase("scissors")) {
                JOptionPane.showMessageDialog(null,  resultsAccumulator+ "\n" +"<html><h1 style " +
                        "= 'font-family: Castellar; font-size: 40pt; '>Rock Crushes Scissors!"+ "\nBetter Luck Next time", title, 0, Rcs);
                playerlosses++;
            }

            else if (computer_choice.equalsIgnoreCase("paper") && player_choice.equalsIgnoreCase("rock")) {
                JOptionPane.showMessageDialog(null, resultsAccumulator + "\n" + "<html><h1 style " +
                        "= 'font-family: Serif; font-size: 40pt; '>Paper Wraps Rock!"+ "\nBetter luck next time",title , 0, Pwr);
                playerlosses++;
            }
            else if (computer_choice.equalsIgnoreCase("paper") && player_choice.equalsIgnoreCase("scissors")) {
                JOptionPane.showMessageDialog(null, resultsAccumulator+ "\n" + "<html><h1 style " +
                        "= 'font-family: Serif; font-size: 40pt; '>Scissors Cuts Paper!" + "\nYou win", title, 0, Scp);
                playerwins++;
            }

            else if (computer_choice.equalsIgnoreCase("scissors") && player_choice.equalsIgnoreCase("rock")) {
                JOptionPane.showMessageDialog(null, resultsAccumulator+ "\n" + "<html><h1 style " +
                        "= 'font-family: Serif; font-size: 40pt; '>Rock Crushes Scissors!"+ "\nYou win", title, 0, Rcs);
                playerwins++;
            }

            else {
                JOptionPane.showMessageDialog(null, resultsAccumulator + "\n" + "<html><h1 style " +
                        "= 'font-family: Serif; font-size: 40pt; '>Scissors Cuts Paper!"+ "\nBetter luck next time", title, 0, Scp
                );
                playerlosses++;
            }


        //Step 8 and 10 - Displaying Results
            String roundResult = "------- Scores -------" + "\nTies: "+ties+"\nPlayer's Wins: " + playerwins + "\nPlayers Losses: " + playerlosses;
            JOptionPane.showMessageDialog(null, roundResult, "End of Round Results          josemaria Ezejelue", 0, resultIcon);

       }


        //Step 9- end repeat
        while (counter < 3) ;



        //Step 11 - Termination
            String end = "<html><h2 style = 'font-family: Sans-Serif; font-seize: 18pt;'> Thank you " +name+ " for playing Rock Paper Scissors\n\n";
                    end += "<html><h2 style = 'font-family: Sans-Serif; font-seize: 12pt;'> Goodbye \n";
        JOptionPane.showMessageDialog(null, end, "END OF THE GAME", 0, resultIcon);
    }
}
