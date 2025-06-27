package locators

import org.openqa.selenium.By

object ProjectLocators {

  // Login Page

  val Username: By = By.id("user-name")
  val Password: By = By.id("password")
  val Login:   By = By.id("login-button")

  val ProductPageTitle: By =By.className("title")

  val errorMessage: By =By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3\n")

  val menuButton: By = By.id("react-burger-menu-btn")

  val logoutLink:By = By.id("logout_sidebar_link")

}
