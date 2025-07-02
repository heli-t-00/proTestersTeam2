package stepdefs.Login_Logout

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage._
import testdata.ProjectData.{loginUrl, passwordText, productTitleText, validUsername}

class LoginSteps extends ScalaDsl with EN {

  //Generic Login Steps
  //Covers User Story 1 Scenario 1

  Given("""^the user is on the login page$""") { () =>
    isLoginPageVisible
  }

  And("""^the user enters correct username and password$""") { () =>
    userNameInput(validUsername)
    passwordInput(passwordText)
  }


  When("""^the user click login$""") { () =>
    buttonLogin()
  }


  Then("""^the user is take to the product listing page$""") { () =>
    productPage(productTitleText)
//    closeAlert()
  }

}