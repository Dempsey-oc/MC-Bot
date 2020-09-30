package ch.dempsey.botcontroller.movements;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import ch.dempsey.botcontroller.BotController;

public class KeyController extends KeyAdapter{

	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()) {
			case KeyEvent.VK_ENTER:
				if(BotController.isRunning) {
					BotController.isRunning = false;
				} else {
					BotController.isRunning = true;
				}
		}
	}
	
}
