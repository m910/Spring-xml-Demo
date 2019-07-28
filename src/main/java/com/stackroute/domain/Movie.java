package com.stackroute.domain;

public class Movie {
    Actor actorRef;

    public Movie() {
    }

    public void Movie(Actor actorRef) {

        this.actorRef = actorRef;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actorRef=" + actorRef +
                '}';
    }
}

