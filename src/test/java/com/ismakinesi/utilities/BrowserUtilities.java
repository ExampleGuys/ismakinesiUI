package com.ismakinesi.utilities;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.Nullable;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

public class BrowserUtilities {
    @Nullable
    public static void writeDataToIdsFile(String tip, String id) { // room=123123
        try (OutputStream output = new FileOutputStream("ids.properties")) {

            Properties prop = new Properties();
            prop.setProperty(tip, id);
            prop.store(output, null);

        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    @Nullable
    public static String readDataFromIdsFile(String tip) { // room
        try (InputStream input = new FileInputStream("ids.properties")) {

            Properties prop = new Properties();
            prop.load(input);

            return prop.getProperty(tip);

        } catch (IOException ex) {
            return null;
        }
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(timeToWaitInSec));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickability(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(timeOutInSeconds));
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }

    public static void verifyElementDisplayed(By by) {
        try {
            Assert.assertTrue("Element not visible: " + by, Driver.get().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + by);

        }
    }

    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);

        }
    }

    public static void verifyElementNotDisplayed(By by) {
        try {
            Assert.assertFalse("Element should not be visible: " + by, Driver.get().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();

        }
    }

    public static void verifyElementNotDisplayed(WebElement element) {
        try {
            Assert.assertFalse("Element should not be visible: ", element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();

        }
    }

    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", element);
    }

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void doubleClick(WebElement element) {
        new Actions(Driver.get()).doubleClick(element).build().perform();
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void switchToWindow(String targetTitle) {
        String origin = Driver.get().getWindowHandle();
        for (String handle : Driver.get().getWindowHandles()) {
            Driver.get().switchTo().window(handle);
            if (Driver.get().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.get().switchTo().window(origin);
    }

    public static List<String> getElementsText(By locator) {

        List<WebElement> elems = Driver.get().findElements(locator);
        List<String> elemTexts = new ArrayList<>();

        for (WebElement el : elems) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    public static void verifyElementClickable(WebElement element) {
        try {
            Assert.assertTrue("Element not visible: " + element, element.isEnabled());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);

        }
    }

    public static void verifyElementNotClickable(WebElement element) {
        try {
            Assert.assertFalse("Element not visible: " + element, element.isEnabled());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }


    public static void waitAndClick(WebElement webElement) {
        BrowserUtilities.waitForClickability(webElement, 10);
        BrowserUtilities.clickWithJS(webElement);
    }



    public static boolean isExist(WebElement webElement) {
        boolean flag;

        try {
            flag = webElement.isDisplayed() || !webElement.isDisplayed();
        } catch (NotFoundException e) {
            flag = false;
        }
        return flag;

    }



    public static void handlingNotification(WebElement element) throws AWTException, InterruptedException {
        BrowserUtilities.clickWithJS(element);
        Robot robot = new Robot();

        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);

        BrowserUtilities.waitFor(3000);
        BrowserUtilities.clickWithJS(element);
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);


        BrowserUtilities.waitFor(3000);
        BrowserUtilities.clickWithJS(element);

//        BrowserUtilities.waitFor(3000);
//        BrowserUtilities.clickWithJS(element);

    }

    public static void selectAnItemFromDropdown(WebElement item, String selectableItem) {

        waitFor(5);
        Select select = new Select(item);
        for (int i = 0; i < select.getOptions().size(); i++) {
            if (select.getOptions().get(i).getText().equalsIgnoreCase(selectableItem)) {
                select.getOptions().get(i).click();
                break;
            }
        }
    }

    public static String getDay_day_month_year_time(int hourToSkip) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.HOUR, hourToSkip);
        SimpleDateFormat format1 = new SimpleDateFormat("EEE, dd MMM yyyy HH:MM:ss");
        return format1.format(cal.getTime());
    }
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element).perform();
    }

    public static void refreshPage() {
        Driver.get().navigate().refresh();
        waitForPageToLoad(10);
    }
    public static void clearLocalSessionCookies() {
        LocalStorage local = ((WebStorage) Driver.get()).getLocalStorage();
        SessionStorage session = ((WebStorage)Driver.get()).getSessionStorage();
        local.clear();
        session.clear();
        Driver.get().manage().deleteAllCookies();
    }
    public static void cleanTextInBox(WebElement element) {
        String inputText = element.getAttribute("value");
        if (inputText != null) {
            for (int i = 0; i < inputText.length(); i++) {
                element.sendKeys(Keys.BACK_SPACE);
            }
        }
        waitFor(1);
    }



    public static String createTime(int hour, int minute) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.HOUR, hour);
        cal.add(Calendar.MINUTE, minute);
        SimpleDateFormat simpleformat = new SimpleDateFormat("HH:mm");
        return simpleformat.format(cal.getTime());
    }
    public static void staleElementClick(WebElement element, int timeout) {
        new WebDriverWait(Driver.get(), Duration.ofSeconds(timeout))
                .ignoring(StaleElementReferenceException.class)
                .until((WebDriver d) -> {
                    clickWithJS(element);
                    return true;
                });

    }


    public static void switchToWindowWithIndex(int i) {
    }


}



