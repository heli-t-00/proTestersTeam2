package stepdefs.Login_Logout

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{errorMessageOutput, passwordClick, usernameClick}


class UserStory1Steps extends ScalaDsl with EN {

  //GIVEN the user is on the login page - (Found in Login Steps)

  //Scenario 1
  //AND the user enters correct username and password - (Found in Login Steps)

  //WHEN the user click login - (Found in Login Steps)

  //THEN the user is take to the product listing page - (Found in Login Steps)

  //Scenario 2
  And("""the user has left username and password fields empty""") { () =>
    usernameClick()
    passwordClick()

  }

  Then("""^an error message should be displayed$""") { () =>

    errorMessageOutput("Epic sadface: Username is required") //incorrect Error message test
    //errorMessageOutput(emptyFields)
  }

  //AND the user should not be logged in - (Found in Login Steps)


}