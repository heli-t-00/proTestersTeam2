package stepdefs.Cart

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{backpackAdd, backpackRemove, bikeAdd, buttonCart, buttonContinue, iconCart}

class UserStory7Steps extends ScalaDsl with EN {

  //GIVEN the user is on the login page - (Found in Login Steps)

  //AND the user enters correct username and password - (Found in Login Steps)

  //AND the user click login - (Found in Login Steps)

  //AND the user is take to the product listing page - (Found in Login Steps)

  And ("""the user has added items to the cart"""){() =>
    backpackAdd()
    bikeAdd()
    iconCart("2")
    buttonCart()
    buttonContinue()
  }

  When ("""the user selects remove on the products listing page"""){() =>
    backpackRemove()
  }

  Then ("""the item should be removed from the cart"""){() =>
    buttonCart()
  }

  And ("""the cart icon should update to reflect the change"""){() =>
    iconCart("1")
  }

}