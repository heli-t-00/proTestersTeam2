package stepdefs.Login_Logout

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{errorMessageOutput, passwordInput, userNameInput}
import testdata.ProjectData.{invalidLoginErrorMess}

class UserStory2Steps extends ScalaDsl with EN {
  // Given user is on login page - Found in LoginSteps

  Given("""the user enters invalid {string} and {string}""") { (username: String, password: String) =>
    userNameInput(username)
    passwordInput(password)
  }
  // When user click login - Found in LoginSteps

  Then("""an error message should be displayed for invalid credentials""") { () =>
    errorMessageOutput(invalidLoginErrorMess)

  }

}