package edu.nwmissouri.theelectrifyingelectionapp;

import java.lang.Override;import java.lang.String; /**
 * Created by s525074 on 2/23/2016.
 */
public class Candidate {

    private String name;
    private int numOfVotes;
    private int rating;

    public Candidate(String name, int numOfVotes, int rating){
        this.name=name;
        this.numOfVotes=numOfVotes;
        this.rating= rating;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", numOfVotes=" + numOfVotes +
                ", rating=" + rating +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfVotes() {
        return numOfVotes;
    }

    public void setNumOfVotes(int numOfVotes) {
        this.numOfVotes = numOfVotes;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
