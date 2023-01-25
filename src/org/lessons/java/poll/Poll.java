package org.lessons.java.poll;

public class Poll {

	public static void main(String[] args) {

		int students = 256;
		int windows = 183;
		int mac = 64;
		int linux = 9;

		float windowsPercentage;
		windowsPercentage = (float) windows / students * 100;

		float macPercentage;
		macPercentage = (float) mac / students * 100;

		float linuxPercentage;
		linuxPercentage = (float) linux / students * 100;

		System.out.println("Students preferring Windows OS: " + windowsPercentage + "%");
		System.out.println("Students preferring Mac OS: " + macPercentage + "%");
		System.out.println("Students preferring Linux OS: " + linuxPercentage + "%");
	}
}
