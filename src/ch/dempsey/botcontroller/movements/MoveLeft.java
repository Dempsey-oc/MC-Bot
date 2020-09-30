package ch.dempsey.botcontroller.movements;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import ch.dempsey.botcontroller.BotController;

public class MoveLeft {

	public static void a() {
		Robot r = BotController.robot;
		r.keyPress(KeyEvent.VK_Q);
		r.delay(500);
		r.keyRelease(KeyEvent.VK_Q);
		System.out.println("Moved left");
	}
	
}
