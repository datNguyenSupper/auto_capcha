package com.donick;

import com.donick.helper.Helper4ActionOnWindow;
import com.donick.helper.Helper4CaptureScreen;
import com.donick.helper.HtmlUnitForm;
import org.eclipse.jetty.io.ClientConnectionFactory;

/**
 * Created by tuynu on 12/23/2016.
 */
public class CapchaMain {
    public static void main(String[] args){

        System.out.println("setup done");

//        Helper4CaptureScreen helper4CaptureScreen = new Helper4CaptureScreen();
//        helper4CaptureScreen.captureScreenShot();
//        HtmlUnitForm.clickOnExamplePage();
        Helper4ActionOnWindow.clickOnScreenWindow(36,13);

//        try {
//            while (true) {
//                Helper4ActionOnWindow.printMouseOnScreenPosition();
//                Thread.sleep(5 * 1000);
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
