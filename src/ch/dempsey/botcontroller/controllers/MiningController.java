package ch.dempsey.botcontroller.controllers;

import ch.dempsey.botcontroller.movements.BreakBlock;
import ch.dempsey.botcontroller.movements.MoveForward;
import ch.dempsey.botcontroller.movements.View;

public class MiningController {

	private static boolean cr = true;
	
	public static boolean canRun() {
		return cr;
	}
	
	private static synchronized void run() {
		cr = false;
		
		MoveForward.a();
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			e.printStackTrace();
		}
		View.up(100);
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			e.printStackTrace();
		}
		BreakBlock.a();
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			e.printStackTrace();
		}
		View.down(100);
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			e.printStackTrace();
		}
		BreakBlock.a();
		
		cr = true;
		
	}
	
	
	public static void b() {
		if(canRun()) run();
	}
	
	
}
