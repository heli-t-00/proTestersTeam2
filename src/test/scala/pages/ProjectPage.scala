package pages

import com.sun.tools.attach.VirtualMachine.list
import locators.ProjectLocators.{AddBackpack, AddBike, Cart, CartIcon, CartList, ContinueShop, Login, Password, ProductPageTitle, RemoveBackpack, Username, errorMessage, logoutLink, menuButton, productSort, sessionErrorMessage}
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
import org.openqa.selenium.support.ui.{ExpectedConditions, Select}
import support.DriverManager.driver
import utils.{Assertion, WaitUtils}

import scala.xml.NodeSeq.Empty.text

object ProjectPage extends BasePage {


  def userNameInput(text: String): Unit = {
    inputText(Username, text)
  }

  def passwordInput(text: String): Unit = {
    inputText(Password, text)
  }

  def buttonLogin(): Unit = {
    clickOn(Login)
  }

  def buttonCart(): Unit = {
    clickOn(Cart)
  }

  def buttonContinue(): Unit = {
    clickOn(ContinueShop)
  }

  def iconCart(text: String): Unit = {
    Assertion.assert(getText(CartIcon), text)
  }

  def productPage(text: String): Unit = {
    Assertion.assert(getText(ProductPageTitle), text)
  }

  def backpackAdd(): Unit = {
    clickOn(AddBackpack)
  }

  def backpackRemove(): Unit = {
    clickOn(RemoveBackpack)
  }

  def bikeAdd(): Unit = {
    clickOn(AddBike)
  }

  def usernameClick(): Unit = {
    clickOn(Username)
  }

  def passwordClick(): Unit = {
    clickOn(Password)
  }

  def errorMessageOutput(text: String): Unit = {
    Assertion.assert(getText(errorMessage), text)
  }

  def getUrl(text: String): Unit = {
    Assertion.assert(driver.getCurrentUrl, text)
  }

  def menuClick(): Unit = {
    clickOn(menuButton)
  }

  def waitForLogoutVisible(): WebElement = {
    val logoutElement = driver.findElement(logoutLink)
    WaitUtils.waitForElementVisible(driver, logoutElement, 5)
  }

  def logoutClick(): Unit = {
    clickOn(logoutLink)
  }

  def checkLogoutVisible(): Unit = {
    Assertion.assertVisible(isVisible(logoutLink), "Logout Link")
  }

  def sessionEnded(text: String): Unit = {
    Assertion.assert(getText(sessionErrorMessage), text)
  }

  def isLoginPageVisible: Boolean = {
    isVisible(Login)
  }

  def listCartItems(elist: Seq[String]): Unit = {
    for(i <- 0 until elist.size){
      Assertion.assert(ListGetText(CartList, i), elist(i))
    }
  }

  def sortFilterOption(): Unit ={
    clickOn(productSort)
  }

  def filterBtn(): Unit ={
    clickOn(productSort)
  }

  def selectSortOption(optionText: String): Unit = {
    val dropdown = driver.findElement(productSort)
    val select = new Select(dropdown)
    select.selectByVisibleText(optionText)
  }

  val js = driver.asInstanceOf[JavascriptExecutor]
  js.executeScript("arguments[0].scrollIntoView(true);", Login)


}

