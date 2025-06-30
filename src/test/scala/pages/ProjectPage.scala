package pages

import com.sun.tools.attach.VirtualMachine.list
import locators.ProjectLocators.{AddBackpack, AddBike, Cart, CartIcon, CartList, ContinueShop, Login, Password, ProductPageTitle, RemoveBackpack, Username, errorMessage, logoutLink, menuButton}
import support.DriverManager.driver
import utils.Assertion

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

  def logoutClick(): Unit = {
    clickOn(logoutLink)
  }

//  def logoutVisible(): Unit = {
//    Assertion.assert(logoutLink, "Logout")
//  }

  def listCartItems(elist: Seq[String]): Unit = {
    for(i <- 0 until elist.size){
      Assertion.assert(ListGetText(CartList, i), elist(i))
    }
  }


}

