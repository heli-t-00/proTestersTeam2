package stepdefs.Login_Logout

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{checkLogoutVisible, isLoginPageVisible, logoutClick, menuClick, sessionEnded, waitForLogoutVisible}
import support.DriverManager.driver
import testdata.ProjectData.loggedOutUser

class UserStory12Steps extends ScalaDsl with EN {

  //GIVEN the user is on the login page - (Found in Login Steps)
  //AND the user enters correct username and password - (Found in Login Steps)
  //AND the user click login - (Found in Login Steps)
  //AND the user is taken to the product listing page - (Found in Login Steps)

  When("""the user clicks the menu button""") { () =>
    menuClick()
    waitForLogoutVisible()
  }

  Then("""the logout option should be visible""") { () =>
    checkLogoutVisible()
  }

   And("""the user clicks the Logout option from the menu""") { () =>
     logoutClick()
  }

  Then("""the user is redirected to the login page""") { () =>
    isLoginPageVisible

  }

  And("""the session is ended""") { () =>
    // Try to access website page after logging out
    driver.navigate().back()
    sessionEnded(loggedOutUser)

  }
}