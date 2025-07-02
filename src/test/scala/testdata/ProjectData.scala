package testdata

object ProjectData {

  //Input
  val passwordText: String = "secret_sauce"
  val validUsername: String = "standard_user"
  val lockedUsername: String = "locked_out_user"

  //Titles
  val productTitleText: String = "Products"
  val twitterTitleText: String = "Profile / X"
  val facebookTitleText: String = "Sauce Labs | Facebook"
  val linkedInTitleText: String = "Sauce Labs | LinkedIn"

  //URLS
  val loginUrl: String ="https://www.saucedemo.com/"
  val productUrl: String ="https://www.saucedemo.com/inventory.html"
  val cartUrl: String ="https://www.saucedemo.com/cart.html"
  val twitterURL: String = "https://x.com/saucelabs"
  val facebookUrl: String = "https://www.facebook.com/saucelabs"
  val linkedInUrl: String = "https://www.linkedin.com/company/sauce-labs/"

  //Error Messages
  val emptyFields: String = "Epic sadface: Username and Password are required" //Empty username and password field error message
  val emptyUsername: String = "Epic sadface: Username is required" //Empty username field error message
  val emptyPassword: String = "Epic sadface: Password is required" //Empty password field error message
  val lockedUserErrorText: String = "Epic sadface: Sorry, this user has been locked out."
  val invalidLoginErrorMess: String = "Epic sadface: Username and password do not match any user in this service"
  val loggedOutUser: String ="Epic sadface: You can only access '/inventory.html' when you are logged in."

  //Footer Copyright
  val footerText: String = "© 2025 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy"

  //Product Sort Filters
  val filterAZ: String ="Name (A to Z)"
  val filterZA: String ="Name (Z to A)"
  val filterPriceLoHi: String ="Price (low to high)"
  val filterPriceHiLo: String ="Price (high to low)"

  // Lists
  //Product Sort Lists
  val productAZ: Seq[String] = Seq("Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt", "Sauce Labs Fleece Jacket", "Sauce Labs Onesie", "Test.allTheThings() T-Shirt (Red)")
  val productZA: Seq[String] = Seq("Test.allTheThings() T-Shirt (Red)", "Sauce Labs Onesie","Sauce Labs Fleece Jacket", "Sauce Labs Bolt T-Shirt","Sauce Labs Bike Light","Sauce Labs Backpack")
  val productPriceLoHi: Seq[String] = Seq("$7.99", "$9.99", "$15.99","$15.99", "$29.99", "$49.99")
  val productPriceHiLo: Seq[String] = Seq("$49.99", "$29.99", "$15.99", "$15.99", "$9.99", "$7.99")

  //Add To Cart Lists
  val add6List: Seq[String] = Seq("Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt", "Sauce Labs Fleece Jacket", "Sauce Labs Onesie", "Test.allTheThings() T-Shirt (Red)")
  val add2List: Seq[String] = Seq("Sauce Labs Backpack", "Sauce Labs Bike Light")

  //Remove List
  val add2Remove1List: Seq[String] = Seq("Sauce Labs Bike Light")

  //Social Media List
  val footerSocials: Seq[String] = Seq("Twitter", "Facebook", "LinkedIn")


}
