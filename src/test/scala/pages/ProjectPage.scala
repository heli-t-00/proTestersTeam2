package pages

import locators.ProjectLocators.{Login, Password, ProductPageTitle, Username}
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



}

