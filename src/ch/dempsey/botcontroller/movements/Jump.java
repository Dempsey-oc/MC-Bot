package ch.dempsey.botcontroller.movements;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import ch.dempsey.botcontroller.BotController;

public class Jump {

	public static void a() {
		Robot r = BotController.robot;
		r.keyPress(KeyEvent.VK_SPACE);
		r.delay(200);
		r.keyRelease(KeyEvent.VK_SPACE);
		System.out.println("Jumped");
	}
	
}
