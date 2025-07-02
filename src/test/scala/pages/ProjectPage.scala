package pages

import locators.ProjectLocators.{AddBackpack, AddBike, AddJacket, AddOnesie, AddRedTShirt, AddTShirt, Cart, CartIcon, CartList, ContinueShop, Login, Password, ProductPageTitle, RemoveBackpack, Username, errorMessage, facebookIcon, footerCopyright, linkedInIcon, logoutLink, menuButton, productList, productPrice, productSort, sessionErrorMessage, socialList, twitterIcon}
import org.openqa.selenium.WebElement
import support.DriverManager.driver
import utils.WaitUtils.waitForElementVisible
import utils.{Assertion, WaitUtils}

object ProjectPage extends BasePage {

  //Send Keys Methods
  def userNameInput(text: String): Unit = {
    inputText(Username, text)
  }

  def passwordInput(text: String): Unit = {
    inputText(Password, text)
  }

  //Click Methods
  def buttonLogin(): Unit = {
    clickOn(Login)
  }

  def buttonCart(): Unit = {
    clickOn(Cart)
  }

  def buttonContinue(): Unit = {
    clickOn(ContinueShop)
  }

  def backpackAdd(): Unit = {
    clickOn(AddBackpack)
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

  def backpackRemove(): Unit = {
    waitForElementVisible(driver, driver.findElement(RemoveBackpack), 5)
    clickOn(RemoveBackpack)
  }

  def menuClick(): Unit = {
    clickOn(menuButton)
  }

  def logoutClick(): Unit = {
    clickOn(logoutLink)
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

  //Dropdown Select Method
  def filterSelect(text: String): Unit = {
    selectDropdown(productSort, text)
  }

  //Assertion Methods
  def iconCart(text: String): Unit = {
    Assertion.assert(getText(CartIcon), text)
  }

  def productPage(text: String): Unit = {
    Assertion.assert(getText(ProductPageTitle), text)
  }

  def errorMessageOutput(text: String): Unit = {
    Assertion.assert(getText(errorMessage), text)
  }

  def getUrl(text: String): Unit = {
    Assertion.assert(driver.getCurrentUrl, text)
  }

  def checkLogoutVisible(): Unit = {
    Assertion.assertVisible(isVisible(logoutLink), "Logout Link")
  }

  def sessionEnded(text: String): Unit = {
    Assertion.assert(getText(sessionErrorMessage), text)
  }

  def listCartItems(elist: Seq[String]): Unit = {
    for (i <- 0 until elist.size) {
      Assertion.assert(ListGetText(CartList, i), elist(i))
    }
  }

  def listAllProductItems(elist: Seq[String]): Unit = {
    for (i <- 0 until elist.size) {
      Assertion.assert(ListGetText(productList, i), elist(i))
    }
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

  def listAllProductPrices(elist: Seq[String]): Unit = {
    for (i <- 0 until elist.size) {
      Assertion.assert(ListGetText(productPrice, i), elist(i))
    }
  }

  //Visible ELement Methods
  def isLoginPageVisible: Boolean = {
    isVisible(Login)
  }

  def waitForLogoutVisible(): WebElement = {
    val logoutElement = driver.findElement(logoutLink)
    WaitUtils.waitForElementVisible(driver, logoutElement, 5)
  }

  //Javascript Method
  def passwordAlert(): Unit = {
    closeAlert()
  }

}

