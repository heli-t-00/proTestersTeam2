package stepdefs.Login_Logout

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{buttonLogin, errorMessageOutput, getUrl, passwordInput, userNameInput}
import testdata.ProjectData.{lockedUserErrorText, lockedUsername, loginUrl, passwordText}

class UserStory3Steps extends ScalaDsl with EN {

  Given("""the user is on the login page"""){()=>
    getUrl(loginUrl)
  }

  And("""the user enters the username and password of a Locked-Out User"""){()=>
    userNameInput(lockedUsername)
    passwordInput(passwordText)
  }

  When("""the user clicks the login button"""){()=>
    buttonLogin()
  }

  Then("""an error message should be displayed"""){()=>
    errorMessageOutput(lockedUserErrorText)
  }

  And("""the user will not be logged in"""){()=>
    getUrl(loginUrl)
  }
}