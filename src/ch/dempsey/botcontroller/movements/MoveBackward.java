package ch.dempsey.botcontroller.movements;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import ch.dempsey.botcontroller.BotController;

public class MoveBackward {

	public static void a() {
		Robot r = BotController.robot;
		r.keyPress(KeyEvent.VK_S);
		r.delay(500);
		r.keyRelease(KeyEvent.VK_S);
		System.out.println("Moved backwards");
	}
	
}
