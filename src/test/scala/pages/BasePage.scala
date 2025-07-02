package pages

import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, WebDriver}
import support.DriverManager
import support.DriverManager.driver
import utils.ConfigReader
import utils.WaitUtils.waitForPageLoad
import scala.jdk.CollectionConverters.IterableHasAsScala

trait BasePage {


  def browserLaunch(): Unit = {
    val driver: WebDriver = DriverManager.driver
    val testUrl = ConfigReader.get("base.url")
    driver.get(testUrl)
  }

  // Common Actions
  def inputText(selector: By, text: String): Unit = {
    driver.findElement(selector).sendKeys(text)
  }

  def clickOn(selector: By): Unit = {
    driver.findElement(selector).click()
  }

  def getText(selector: By): String = {
    driver.findElement(selector).getText
  }

  def ListGetText(selector: By, i: Int): String = {
    driver.findElements(selector).get(i).getText
  }

  def isVisible(selector: By): Boolean = {
    driver.findElement(selector).isDisplayed
  }

  def selectDropdown(selector: By, text: String): Unit = {
    val select: Select = new Select(driver.findElement(selector))
    select.selectByVisibleText(text)
  }

  def changeTab(): String = {
    val parentWindow = driver.getWindowHandle
    val allWindows: Seq[String] = driver.getWindowHandles.asScala.toList
    val it = allWindows.iterator
        while (it.hasNext){
          val handle = it.next()
          if(handle != parentWindow){
            driver.switchTo().window(handle)
            waitForPageLoad(driver, driver.findElement(By.tagName("body")), 10)
//            println(driver.getTitle)
          }
        }
    driver.getTitle
    }

}
