package stepdefs.Cart

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{buttonCart, buttonContinue, clickOn, getUrl}
import testdata.ProjectData.{cartUrl, productUrl}

class UserStory8Steps extends ScalaDsl with EN {

  //GIVEN the user is on the login page - (Found in Login Steps)

  //AND the user enters correct username and password - (Found in Login Steps)

  //AND the user click login - (Found in Login Steps)

  //AND the user is take to the product listing page - (Found in Login Steps)



  When("""the user click the cart icon""") { () =>
    buttonCart()
  }

  Then("""the user navigates to cart page""") { () =>
    getUrl(cartUrl)

  }

  Then("""^the user should see the items details listed$""")
  println("list item details")


  Then("""the user click on 'Continue shopping' button""") { () =>
    buttonContinue()
  }

  And("""the user navigates back to the product listing page""") { () =>
    getUrl(productUrl)
    println("TEST")
  }



}
