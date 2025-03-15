package fr.ynov.java.game;

import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Player {
    private String name;
    private int victories;
    private int defeats;
    private Dictionary<String, Integer> scores;
    private JSONObject jsonObject = new JSONObject();

    public Player(String name) {
        this.name = name;
        this.victories = 0;
        this.defeats = 0;
        this.scores = new Hashtable<>();
    }

    public String getName() {
        return name;
    }

    public void askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        this.setName(name);
        System.out.println("Hello " + this.getName() + "!");
    }

    public Dictionary<String, Integer> getScore() {

        return this.scores;
    }

    public void addScore(int score) {
        if (score < 0) {
            this.defeats++;
        } else {
            this.victories++;
        }
    }

    public void resetScore() {
        this.victories = 0;
        this.defeats = 0;
    }

    public void saveScore() {
        this.scores.put("victories", this.victories);
        this.scores.put("defeats", this.defeats);

        jsonObject.put(this.name, this.scores);

        try{
            File directory = new File("saves");
            if (!directory.exists()) {
                directory.mkdirs();
            }
            FileWriter file = new FileWriter("./src/fr/ynov/java/game/saves/player-saves.json");
            file.write(jsonObject.toString());
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Score saved!");
    }

    public void displayScore(){
        System.out.println("The player " + this.name + " has : \n" +
                this.victories + " Victories\n" +
                this.defeats + " Defeats");
    }

    public void setName(String name) {
        this.name = name;
    }
}
