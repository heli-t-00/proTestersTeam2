package stepdefs.Login_Logout

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{errorMessageOutput, passwordClick, passwordInput, userNameInput, usernameClick}
import testdata.ProjectData.{emptyFields, emptyPassword, emptyUsername, passwordText}

class UserStory1Steps extends ScalaDsl with EN {

  //GIVEN the user is on the login page - (Found in Login Steps)

  //Scenario 1
  //AND the user enters correct username and password - (Found in Login Steps)

  //WHEN the user click login - (Found in Login Steps)

  //THEN the user is take to the product listing page - (Found in Login Steps)

  // Scenario Outline
  And("""the user has left {string} or {string} fields empty""") { (username: String, password: String) =>
    userNameInput(username)
    passwordInput(password)
  }

  //WHEN the user click login - (Found in Login Steps)

  Then("""a specific error message for {string} or {string} should be displayed""") { (username: String, password: String) =>
    if(username == "" && password == ""){
      errorMessageOutput(emptyFields)
    }else if(username == ""){
      errorMessageOutput(emptyUsername)
    }else if (password == ""){
      errorMessageOutput(emptyPassword)
    }

  }

  //AND the user should not be logged in - (Found in Login Steps)

}