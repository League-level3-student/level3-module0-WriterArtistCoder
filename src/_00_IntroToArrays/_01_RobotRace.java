package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String args[]) {
		// 2. create an array of 5 robots.
		straightRace(5);
		// 8. try different races with different amounts of robots.
		straightRace(20);
		straightRace(44);
		// 9. make the robots race around a circular track.
		circularRace(20);
	}

	public static void straightRace(int robots) {
		Robot[] bonsai = new Robot[robots];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < bonsai.length; i++) {
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			bonsai[i] = new Robot();
			bonsai[i].miniaturize();
			bonsai[i].moveTo(((i + 1) * 20), 520);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		int winner = -1;
		while (winner == -1) {
			for (int i = 0; i < bonsai.length; i++) {
				bonsai[i].setSpeed(100);
				bonsai[i].move(new Random().nextInt(50));

				if (bonsai[i].getY() <= 49) {
					bonsai[i].sparkle();
					winner = i;
					break;
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "Kudos to RACERBOT #AX" + winner
				+ "DJZ! They won and let's give\n them a big round of applause! *long silence*");
		for (Robot r : bonsai) {
			r.hide();
			r.unSparkle();
		}
	}

	public static void circularRace(int robots) {
		Robot[] bonsai = new Robot[robots];
		int[] turned = new int[robots];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < bonsai.length; i++) {
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			bonsai[i] = new Robot();
			bonsai[i].miniaturize();
			bonsai[i].moveTo(((i + 1) * 20), 520);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		int winner = -1;
		while (winner == -1) {
			for (int i = 0; i < bonsai.length; i++) {
				bonsai[i].setSpeed(100);
				bonsai[i].move(new Random().nextInt(50));

				if (bonsai[i].getY() <= 100 && bonsai[i].getX() < 500 && turned[i] == 0
						|| bonsai[i].getY() <= 100 && bonsai[i].getX() >= 500 && turned[i] == 1
						|| bonsai[i].getY() >= 500 && bonsai[i].getX() >= 500 && turned[i] == 2
						|| bonsai[i].getY() >= 500 && bonsai[i].getX() <= 100 && turned[i] == 3) {
					bonsai[i].turn(90);
					turned[i]++;
				}

				if (turned[i] == 4) {
					bonsai[i].sparkle();
					winner = i;
					break;
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "Kudos to RACERBOT #AX" + winner
				+ "DJZ! They won and let's give\n them a big round of applause! *long silence*");
		for (Robot r : bonsai) {
			r.hide();
			r.unSparkle();
		}
	}
}
