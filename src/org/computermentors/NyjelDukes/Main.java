package org.computermentors.NyjelDukes;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Game game = new Game("Flash");
        Prompter prompter = new Prompter(game);

        System.out.println(game.getAnswer());
    }
}
