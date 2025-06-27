package stepdefs.Login_Logout

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{buttonLogin, errorMessageOutput, getUrl, passwordInput, userNameInput}
import testdata.ProjectData.{lockedUserErrorText, lockedUsername, loginUrl, passwordText}

class UserStory3Steps extends ScalaDsl with EN {

  //GIVEN the user is on the login page - (Found in Login Steps)

  And("""the user enters the username and password of a Locked-Out User"""){()=>
    userNameInput(lockedUsername)
    passwordInput(passwordText)
  }

  //WHEN the user click login - (Found in Login Steps)

  Then("""an error message should be displayed for locked out user"""){()=>
    errorMessageOutput(lockedUserErrorText)
  }

  //AND the user should not be logged in - (Found in Login Steps)
}