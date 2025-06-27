package locators

import org.openqa.selenium.By

object ProjectLocators {

  // Login Page

  val Username: By = By.id("user-name")
  val Password: By = By.id("password")
  val Login:   By = By.id("login-button")
  val Cart: By = By.className("shopping_cart_link")
  val ContinueShop: By = By.id("continue-shopping")
  val CartIcon: By = By.className("shopping_cart_badge")
  val AddBackpack: By = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
  val AddBike: By = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
  val RemoveBackpack: By = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")

  val ProductPageTitle: By =By.className("title")

  val errorMessage: By =By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3\n")

}
