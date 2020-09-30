package ch.dempsey.botcontroller.movements;

import java.awt.Robot;
import java.awt.event.InputEvent;

import ch.dempsey.botcontroller.BotController;

public class BreakBlock {
	
	public static void a() {
		Robot r = BotController.robot;
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.delay(200);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		System.out.println("Block broken");
	}
	
	
}
