package ch.dempsey.botcontroller;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.JButton;
import javax.swing.JFrame;

import ch.dempsey.botcontroller.controllers.MiningController;
import ch.dempsey.botcontroller.movements.KeyController;

public class BotController {

	public static Robot robot;
	public static boolean isRunning = false;
	static boolean start = true;
	
	
	public static void main(String[] args) {
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		JButton jb = new JButton();
		jb.addKeyListener(new KeyController());
		
		JFrame frame = new JFrame();
		frame.add(jb);
		frame.setSize(400, 350);
		frame.setVisible(true);
		
		while(start) {
			if(!isRunning) {
				try {
					Thread.sleep(500);
					System.out.println("Bot sleeping, awaiting command!");
				}catch(Exception e) {
					e.printStackTrace();
				}
			} else {
				try {
					Thread.sleep(500);
					MiningController.b();
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
