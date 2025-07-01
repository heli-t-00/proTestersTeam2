package testdata

object ProjectData {

  val passwordText: String = "secret_sauce"
  val validUsername: String = "standard_user"
  val lockedUsername: String = "locked_out_user"
  val productTitleText: String = "Products"
  val emptyFields: String = "Epic sadface: Username and Password are required" //Empty username and password field error message
  val emptyUsername: String = "Epic sadface: Username is required" //Empty username field error message
  val emptyPassword: String = "Epic sadface: Password is required" //Empty password field error message
  val lockedUserErrorText: String = "Epic sadface: Sorry, this user has been locked out."
  val loginUrl: String ="https://www.saucedemo.com/"
  val productUrl: String ="https://www.saucedemo.com/inventory.html"
  val cartUrl: String ="https://www.saucedemo.com/cart.html"
  val add2List: Seq[String] = Seq("Sauce Labs Backpack", "Sauce Labs Bike Light")
  val add2Remove1List: Seq[String] = Seq("Sauce Labs Bike Light")
  val invalidLoginErrorMess: String = "Epic sadface: Username and password do not match any user in this service"
  val loggedOutUser: String ="Epic sadface: You can only access '/inventory.html' when you are logged in."

}
