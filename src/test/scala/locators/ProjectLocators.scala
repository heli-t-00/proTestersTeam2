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
  val AddBackpack: By = By.id("add-to-cart-sauce-labs-backpack")
  val AddBike: By = By.id("add-to-cart-sauce-labs-bike-light")
  val RemoveBackpack: By = By.id("remove-sauce-labs-backpack")
  val CartList: By = By.className("inventory_item_name")

  val ProductPageTitle: By =By.className("title")

  val errorMessage: By =By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3\n")

  val menuButton: By = By.id("react-burger-menu-btn")

  val logoutLink:By = By.id("logout_sidebar_link")


  val productSort: By = By.className("product_sort_container")

  val sessionErrorMessage: By = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")


}
