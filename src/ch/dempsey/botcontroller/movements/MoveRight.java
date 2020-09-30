package ch.dempsey.botcontroller.movements;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import ch.dempsey.botcontroller.BotController;

public class MoveRight {
	
	public static void a() {
		Robot r = BotController.robot;
		r.keyPress(KeyEvent.VK_D);
		r.delay(500);
		r.keyRelease(KeyEvent.VK_D);
		System.out.println("Moved right");
	}
}
