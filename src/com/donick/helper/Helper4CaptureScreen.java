package com.donick.helper;



import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by tuynu on 12/23/2016.
 */
public class Helper4CaptureScreen {
    public Helper4CaptureScreen(){

    }

    public void captureScreenShot(){

        Robot robot = null;
        try {
            int x = 0,y = 0,width = 200,height = 200;
            int textX = 50;
            int textY = 50;

            robot = new Robot();
// The hard part is knowing WHERE to capture the screen shot from
            BufferedImage screenShot = robot.createScreenCapture(new Rectangle(x, y, width, height));
            Graphics2D graphics = screenShot.createGraphics();

// Add a label to the screen shot
            Color textColor = Color.RED;
            graphics.setColor(textColor);
            graphics.drawString("Some text", textX, textY);

// Save your screen shot with its label
            ImageIO.write(screenShot, "png", new File("myScreenShot.png"));


        } catch (AWTException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
