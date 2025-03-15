package fr.ynov.java.game;

import java.util.*;

public class Game  {

    private final Dictionary<Integer, String> choices;
    private Player player;

    public Game() {
        this.choices = new Hashtable<>();
        this.choices.put(1, "Rock");
        this.choices.put(2, "Scissors");
        this.choices.put(3, "Paper");
        this.player = new Player("Player");
    }

    public void run() {
        System.out.println("Welcome to the game!");
        this.player.askName();
        boolean playing = true;
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (playing){
            System.out.println("Please choose an action : \n" +
                    "[1] Rock \n" +
                    "[2] Scissors \n" +
                    "[3] Paper \n" +
                    "[4] My score \n" +
                    "[5] Reset score \n" +
                    "[6] Save and Exit");
            choice = scanner.nextInt();
            Random rand = new Random();
            int computerChoice = rand.nextInt(3)+1;
            if (choice <= 3){
                if (choice == computerChoice){
                    System.out.println("The Computer chose " + this.choices.get(computerChoice) + "\n" +
                            "It's a tie!");
                } else if (computerChoice > choice && computerChoice - choice == 1 || computerChoice < choice && choice - computerChoice == 2) {
                    this.player.addScore(1);
                    System.out.println("The Computer chose " + this.choices.get(computerChoice) + "\n" +
                            "You win!");
                } else if (computerChoice < choice && choice - computerChoice == 1 || choice < computerChoice && computerChoice - choice == 2) {
                    this.player.addScore(-1);
                    System.out.println("The Computer chose " + this.choices.get(computerChoice) + "\n" +
                            "You lose!");
                }
            }else {
                switch (choice){
                    case 4:
                        this.player.displayScore();
                        break;
                    case 5:
                        this.player.resetScore();
                        this.player.displayScore();
                        break;
                    case 6:
                        this.player.saveScore();
                        break;
                }
            }





        }
    }

    public void saveGame() {
        System.out.println("Score saved!");
    }


}


/*
debut du jeu
    demande de nom
        stocke le nom dans Player
    boucle de jeu
        demande de choix
            stocke le choix dans Player
        choix aleatoire de l'ordinateur
        comparaison des choix
            si egalite
                affiche egalite
            si victoire
                affiche victoire
                ajoute 1 au score
            si defaite
                affiche defaite
                reset le score
        demande de rejouer
            si oui
                recommence la boucle
            si non
                fin de la boucle
fin du jeu



 */
