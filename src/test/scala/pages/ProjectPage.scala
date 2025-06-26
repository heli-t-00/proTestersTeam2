package pages

import locators.ProjectLocators.{Login}

object ProjectPage extends BasePage {


  // — Submit Button —
  def buttonSubmit(): Unit = {
    clickOn(Login)
  }

}

