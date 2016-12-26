package com.donick.helper;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;

import java.io.IOException;

/**
 * Created by tuynu on 12/23/2016.
 */
public class HtmlUnitForm {
    public static void clickOnExamplePage(){

        WebClient webClient = new WebClient();
        HtmlPage page = null;
        try {
            page = webClient.getPage("http://www.google.com");
            HtmlInput searchBox = page.getElementByName("q");
            searchBox.setValueAttribute("htmlunit");

            HtmlSubmitInput googleSearchSubmitButton =
                    page.getElementByName("btnG"); // sometimes it's "btnK"
            page=googleSearchSubmitButton.click();

            HtmlDivision resultStatsDiv =
                    page.getFirstByXPath("//div[@id='resultStats']");

            System.out.println(resultStatsDiv.asText()); // About 309,000 results
//            webClient.closeAllWindows();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
