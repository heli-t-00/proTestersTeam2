package stepdefs.Login_Logout

import io.cucumber.scala.{EN, ScalaDsl}
import locators.ProjectLocators.logoutLink
import pages.ProjectPage.menuClick
//import pages.ProjectPage.{logoutVisible, menuClick}

class UserStory12Steps extends ScalaDsl with EN{

  //  - Found in LoginSteps
  //
  //
  //
  //

  When("""^the user clicks the menu button$""") { () =>
    menuClick()
  }


//  Then("""^the logout option should be visible$""") { () =>
//    logoutVisible()
//  }

//  And("""^the user clicks the Logout option from the menu$""") { () =>
//    clickOn(id("logout_sidebar_link"))
//  }
//
//  Then("""^the user is redirected to the login page$""") { () =>
//    currentUrl should include("/")
//
//    // Verify login page elements
//    find(id("login-button")).isDefined shouldBe true
//  }
//
//  And("""^the session is ended$""") { () =>
//    // Try accessing protected page
//    goTo("https://www.saucedemo.com/inventory.html")
//    currentUrl should include("/") // redirect back to login if session ended
 // }


}
