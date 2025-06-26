package stepdefs.Login_Logout

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{browserLaunch, buttonLogin, passwordInput, productPage, userNameInput}
import sun.security.util.Password
import testdata.ProjectData.{passwordText, productTitleText, validUsername}

class UserStory1Steps extends ScalaDsl with EN  {

Given("""^the user is on the login page$"""){()=>
  browserLaunch()
}

  And("""^the user enters correct username and password$"""){()=>
    userNameInput(validUsername)
    passwordInput(passwordText)

  }

  When("""^the user click login$"""){()=>
buttonLogin()
  }


  Then("""^the user is take to the product listing page$"""){()=>
productPage(productTitleText)

  }

}