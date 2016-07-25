package com.udacity.gradle.jokesource;

import java.util.ArrayList;
import java.util.Random;

public class JokeSource {

    ArrayList<String> jokes = new ArrayList<String>();
    Random rand;

    //Some jokes I found from the internet. A joke is chosen randomly when getJoke is called.
    //Jokes taken from www.short-funny.com
    public JokeSource() {
        rand = new Random();
        jokes.add(0,"Why Does Ariel wear seashells? Because she can't fit into D-shells");
        jokes.add(1, "Yo mama so poor your family ate cereal with a fork to save milk.");
        jokes.add(2, "Drink apple juice... 'cause OJ will kill you.");
        jokes.add(3, "Tiger Woods crashed into a fire hydrant and a tree. I guess he could not decide between a wood and an iron.");
        jokes.add(4, "I found out that Tiger Woods is changing his name...............to Cheetah!");
        jokes.add(5, "Can a kangaroo jump higher than a house? Of course, a house does not jump at all.");
        jokes.add(6, "It is so cold outside I saw a politician with his hands in his own pockets.");
        jokes.add(7, "Do you know what you can hold without ever touching it?\n" + "\n" + "A conversation.");
        jokes.add(8, "Two grains of sand go through the desert. One to the other: \"I have the feeling somebody is watching me.\"");
        jokes.add(9, "What would you call a very funny mountain? \n" + "-\n" + "Hill Arious\"");
        jokes.add(10,"What goes up and down but never moves? \n" + "-\n" + "The stairs!" );
    }


    public String getJoke() {
        return jokes.get(rand.nextInt(jokes.size()));
    }

}
