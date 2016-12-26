package com.donick.helper;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * Created by tuynu on 12/23/2016.
 */
public class Helper4ActionOnWindow {
    public static void clickOnScreenWindow(int x, int y){

        Robot bot = null;
        try {
            bot = new Robot();
            bot.mouseMove(x, y);
            bot.mousePress(InputEvent.BUTTON1_MASK);
            bot.mouseRelease(InputEvent.BUTTON1_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void printMouseOnScreenPosition(){
        Point mousePosition  = MouseInfo.getPointerInfo().getLocation();
        System.out.println(mousePosition);
    }
}
