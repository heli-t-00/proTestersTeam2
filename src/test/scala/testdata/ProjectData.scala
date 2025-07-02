package testdata

object ProjectData {

  val passwordText: String = "secret_sauce"
  val validUsername: String = "standard_user"
  val lockedUsername: String = "locked_out_user"
  val productTitleText: String = "Products"
  val twitterTitleText: String = "Profile / X"
  val facebookTitleText: String = "Sauce Labs | Facebook"
  val linkedInTitleText: String = "Sauce Labs | LinkedIn"
  val emptyFields: String = "Epic sadface: Username and Password are required" //Empty username and password field error message
  val emptyUsername: String = "Epic sadface: Username is required" //Empty username field error message
  val emptyPassword: String = "Epic sadface: Password is required" //Empty password field error message
  val lockedUserErrorText: String = "Epic sadface: Sorry, this user has been locked out."
  val loginUrl: String ="https://www.saucedemo.com/"
  val productUrl: String ="https://www.saucedemo.com/inventory.html"
  val cartUrl: String ="https://www.saucedemo.com/cart.html"
  val twitterURL: String = "https://x.com/saucelabs"
  val facebookUrl: String = "https://www.facebook.com/saucelabs"
  val linkedInUrl: String = "https://www.linkedin.com/company/sauce-labs/"
  val add2List: Seq[String] = Seq("Sauce Labs Backpack", "Sauce Labs Bike Light")
  val add2Remove1List: Seq[String] = Seq("Sauce Labs Bike Light")
  val invalidLoginErrorMess: String = "Epic sadface: Username and password do not match any user in this service"
  val loggedOutUser: String ="Epic sadface: You can only access '/inventory.html' when you are logged in."
  val footerText: String = "© 2025 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy"
  val footerSocials: Seq[String] = Seq("Twitter", "Facebook", "LinkedIn")


  val add6List: Seq[String] = Seq(
    "Sauce Labs Backpack",
    "Sauce Labs Bike Light",
    "Sauce Labs Bolt T-Shirt",
    "Sauce Labs Fleece Jacket",
    "Sauce Labs Onesie",
    "Test.allTheThings() T-Shirt (Red)"
  )

  val productAZ: Seq[String] = Seq("Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt", "Sauce Labs Fleece Jacket", "Sauce Labs Onesie", "Test.allTheThings() T-Shirt (Red)")
  val filterAZ: String ="Name (A to Z)"


}
