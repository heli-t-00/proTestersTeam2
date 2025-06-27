package stepdefs.Login_Logout

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{buttonLogin, errorMessageOutput, getUrl, passwordInput, userNameInput}
import testdata.ProjectData.{invalidLoginErrorMess, loginUrl}

class UserStory2Steps extends ScalaDsl with EN {
  // Given user is on login page - Found in LoginSteps

  Given("""the user enters invalid {string} and {string}""") { (username: String, password: String) =>
    userNameInput(username)
    passwordInput(password)
  }
  // When user click login - Found in LoginSteps

  // Then the user should not be logged in - Found in LoginSteps

  And("""an error message should be displayed for invalid credentials""") { () =>
    errorMessageOutput(invalidLoginErrorMess)

  }

}