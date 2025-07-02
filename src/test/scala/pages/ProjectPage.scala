package pages

import com.sun.tools.attach.VirtualMachine.list
import locators.ProjectLocators.{AddBackpack, AddBike, AddJacket, AddOnesie, AddRedTShirt, AddTShirt, Cart, CartIcon, CartList, ContinueShop, Login, Password, ProductPageTitle, RemoveBackpack, Username, errorMessage, facebookIcon, footerCopyright, linkedInIcon, logoutLink, menuButton, productList, productSort, sessionErrorMessage, socialList, twitterIcon}
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
import org.openqa.selenium.support.ui.{ExpectedConditions, Select}
import support.DriverManager.driver
import utils.WaitUtils.waitForElementVisible
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
    waitForElementVisible(driver, driver.findElement(RemoveBackpack), 5)
    clickOn(RemoveBackpack)
  }

  def bikeAdd(): Unit = {
    clickOn(AddBike)
  }

  def tshirtAdd(): Unit = {
    clickOn(AddTShirt)
  }

  def redtshirtAdd(): Unit = {
     clickOn(AddRedTShirt)
  }

  def onesieAdd(): Unit = {
    clickOn(AddOnesie)
  }

  def jacketAdd(): Unit = {
    clickOn(AddJacket)
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
    for (i <- 0 until elist.size) {
      Assertion.assert(ListGetText(CartList, i), elist(i))
    }
  }

  def sortFilterOption(): Unit = {
    clickOn(productSort)
  }

  def filterBtn(): Unit = {
    clickOn(productSort)
  }

  def selectSortOption(optionText: String): Unit = {
    val dropdown = driver.findElement(productSort)
    val select = new Select(dropdown)
    select.selectByVisibleText(optionText)
  }

  def passwordAlert(): Unit = {
    closeAlert()
  }

  def listAllProductItems(elist: Seq[String]): Unit = {
    for (i <- 0 until elist.size) {
      Assertion.assert(ListGetText(productList, i), elist(i))
    }
  }

  def filterSelect(text: String): Unit = {
    selectDropdown(productSort, text)
  }

  def navigateTwitter(): Unit = {
    clickOn(twitterIcon)
  }

  def navigateFacebook(): Unit = {
    clickOn(facebookIcon)
  }

  def navigateLinkedIn(): Unit = {
    clickOn(linkedInIcon)
  }

  def containsCopyright(text: String): Unit = {
    Assertion.assert(getText(footerCopyright), text)
  }

  def containsSocials(elist: Seq[String]): Unit = {
    for (i <- 0 until elist.size) {
      Assertion.assert(ListGetText(socialList, i), elist(i))
    }
  }

  def socialsTab(text: String): Unit = {
    Assertion.assert(changeTab(), text)
  }

  def getTitle(text: String): Unit = {
    Assertion.assert(driver.getTitle, text)
  }

}

