package pages

import locators.ProjectLocators.{Login, Password, ProductPageTitle, Username, errorMessage}
import utils.Assertion
object ProjectPage extends BasePage {


  def userNameInput(text: String): Unit ={
    inputText(Username, text)
  }

  def passwordInput(text: String): Unit ={
    inputText(Password, text)
  }
  // — Submit Button —
  def buttonLogin(): Unit = {
    clickOn(Login)
  }


def productPage(text: String): Unit ={
Assertion.assert(getText(ProductPageTitle),text)
}

  def usernameClick(): Unit ={
    clickOn(Username)
  }

  def passwordClick(): Unit ={
    clickOn(Password)
  }

  def errorMessageOutput(text: String): Unit ={
    Assertion.assert(getText(errorMessage), text)
  }

  def getUrl(text: String): Unit={
    Assertion.assert(driver.getCurrentUrl, text)
  }



}

