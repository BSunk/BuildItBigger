package com.udacity.gradle.backend;

import com.udacity.gradle.jokesource.JokeSource;

/**
 * Created by Bharat on 7/9/2016.
 */
public class JokerBean {
    /** The object model for the data we are sending through endpoints */
        //Retrieves joke from JokeSource library.
        public String getData() {
            JokeSource joke = new JokeSource();
            return joke.getJoke();
        }


}
