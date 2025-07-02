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
  val AddTShirt: By = By.id("add-to-cart-sauce-labs-bolt-t-shirt")
  val AddJacket: By = By.id("add-to-cart-sauce-labs-fleece-jacket")
  val AddOnesie: By = By.id("add-to-cart-sauce-labs-onesie")
  val AddRedTShirt: By = By.id("add-to-cart-test.allthethings()-t-shirt-(red)")
  val RemoveBackpack: By = By.id("remove-sauce-labs-backpack")
  val CartList: By = By.className("inventory_item_name")

  val ProductPageTitle: By =By.className("title")

  val errorMessage: By =By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3\n")

  val menuButton: By = By.id("react-burger-menu-btn")

  val logoutLink:By = By.id("logout_sidebar_link")

  val productSort: By = By.className("product_sort_container")

  val sessionErrorMessage: By = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")

  val productList: By = By.cssSelector("div[data-test='inventory-item-name']")

  val twitterIcon: By = By.cssSelector("a[data-test='social-twitter']")
  val facebookIcon: By = By.cssSelector("a[data-test='social-facebook']")
  val linkedInIcon: By = By.cssSelector("a[data-test='social-linkedin']")
  val footerCopyright: By = By.className("footer_copy")
  val socialList: By = By.tagName("li")
}
