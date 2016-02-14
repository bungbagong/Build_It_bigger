package com.bungbagong.javalib;

import java.util.Random;

public class RandomJokes {

    private String[] listJokes =
            {"I used to think the brain was the most important organ. Then I thought, look what is telling me that.",
                    "The midget fortune teller who kills his customers is a small medium at large.",
                    "A farmer in the field with his cows counted 196 of them, but when he rounded them up he had 200.",
                    "I wasn't originally going to get a brain transplant, but then I changed my mind.",
                    "I'm reading a book about anti-gravity. It's impossible to put down.",
                    "My friend's bakery burned down last night. Now his business is toast.",
                    "Did you hear about the guy who got hit in the head with a can of soda? He was lucky it was a soft drink.",
                    "I used to be a banker but I lost interest",
                    "He drove his expensive car into a tree and found out how the Mercedes bends.",
                    "When William joined the army he disliked the phrase 'fire at will'.",
                    "Police were called to a daycare where a three-year-old was resisting a rest.",
                    "Have you ever tried to eat a clock? It's very time consuming."};


    public String getJoke() {
        Random rand = new Random();
        return listJokes[rand.nextInt(listJokes.length)];
    }


}
