package pages

import locators.ProjectLocators.logoutLink
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
import support.DriverManager
import support.DriverManager.driver
import utils.ConfigReader

import java.nio.channels.Selector

trait BasePage {


  def browserLaunch(): Unit = {
    val driver: WebDriver = DriverManager.driver
    val testUrl = ConfigReader.get("base.url")
    driver.get(testUrl)
  }

  // Locator Identification
  def findById(id: String): WebElement = driver.findElement(By.id(id))

  def findByName(name: String): WebElement = driver.findElement(By.name(name))

  def findByLinkText(link: String): WebElement = driver.findElement(By.linkText(link))

  def findByPartialLinkText(partialLink: String): WebElement = driver.findElement(By.partialLinkText(partialLink))

  def findByTagName(tag: String): WebElement = driver.findElement(By.tagName(tag))

  def findByCssSelector(css: String): WebElement = driver.findElement(By.cssSelector(css))

  def findByXpath(xpath: String): WebElement = driver.findElement(By.xpath(xpath))

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

  def closeAlert(): Unit = {
    val alert = driver.switchTo().alert()
    alert.accept()
  }

  def selectDropdown(selector: By, text: String): Unit = {
    val select: Select = new Select(driver.findElement(selector))
    select.selectByVisibleText(text)

  }
}
