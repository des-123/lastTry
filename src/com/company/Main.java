package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        String fillepath0 = "Player 1 Space Invaders ORIGINAL version 1979.wav"; //Background

        String fillepath1 = "burning.wav"; //squid-Alian
        String fillepath2 = "cuttree.wav"; //crab
        String fillepath3 = "hitmonster.wav"; //Octopus
        String fillepath4 = "powerup.wav"; //Meteor
        String fillepath5 = "recievedamage.wav"; //shooter




       musicthings musicPlayer1 = new musicthings();
       musicPlayer1.playMusic(fillepath2);

        musicthings musicPlayer2 = new musicthings();
        musicPlayer2.playMusic(fillepath2);

    }
}
