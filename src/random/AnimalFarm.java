package random;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */String Animal=JOptionPane.showInputDialog("which animal do you want?");
		 if(Animal.equals("cow")) {
			 playMoo();
		 
		 }
		 if(Animal.equals("duck")) {
			 playQuack();
		 
		 }
		 if(Animal.equals("dog")) {
			 playWoof();
		 
		 }
		 if(Animal.equals("cat")) {
			 playmeow();
		 
		 }
		 if(Animal.equals("llama")) {
			 playllama();
		 
		 }
		/* 2. Make it so that the user can keep entering new animals. */
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playmeow() {
		playNoise(meowFile);
	}
	void playllama() {
		playNoise(llamaFile);
	}
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
