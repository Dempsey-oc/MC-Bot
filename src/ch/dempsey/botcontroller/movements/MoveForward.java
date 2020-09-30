package ch.dempsey.botcontroller.movements;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import ch.dempsey.botcontroller.BotController;

public class MoveForward {

	public static void a() {
		Robot r = BotController.robot;
		r.keyPress(KeyEvent.VK_Z);
		r.delay(500);
		r.keyRelease(KeyEvent.VK_Z);
		System.out.println("Moved forward");
	}
	
}
