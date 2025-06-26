package stepdefs.Login_Logout

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{browserLaunch, buttonLogin, errorMessageOutput, getUrl, passwordClick, passwordInput, productPage, userNameInput, usernameClick}
import sun.security.util.Password
import testdata.ProjectData.{emptyFields, loginUrl, passwordText, productTitleText, validUsername}

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
And ("""the user has left username and password fields empty"""){()=>
  usernameClick()
  passwordClick()

}

  Then("""^an error message should be displayed$""") {()=>

   errorMessageOutput("Epic sadface: Username is required") //incorrect Error message test
//errorMessageOutput(emptyFields)
  }

  And("""^the user should not be logged in$"""){() =>
getUrl(loginUrl)

  }
}