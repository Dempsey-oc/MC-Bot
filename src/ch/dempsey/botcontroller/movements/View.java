package ch.dempsey.botcontroller.movements;

import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;

import ch.dempsey.botcontroller.BotController;
import ch.dempsey.botcontroller.controllers.MiningController;

public class View {
	
	private static Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	private static int cx = d.width/2;
	private static int cy = d.height/2;
	
	
	
	private static Robot r = BotController.robot;
	
	
	public static void a(int x, int y) {
		r.mouseMove(x, y);
		System.out.println("Moved mouse to " + x + ":" + y);
		try {
			Thread.sleep(100);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void up(int y) {
		r.mouseMove(cx, cy+y);
		System.out.println("Moved mouse " + y + " up");
		try {
			Thread.sleep(100);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void down(int y) {
		r.mouseMove(cx, cy-y);
		System.out.println("Moved mouse " + y + " down");
		try {
			Thread.sleep(100);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void left(int x) {
		r.mouseMove(cx-x, cy);
		System.out.println("Moved mouse " + x + " left");
		try {
			Thread.sleep(100);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void right(int x) {
		r.mouseMove(cx+x, cy);
		System.out.println("Moved mouse " + x + " right");
		try {
			Thread.sleep(100);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
