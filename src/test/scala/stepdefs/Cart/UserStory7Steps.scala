package stepdefs.Cart

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{backpackAdd, backpackRemove, bikeAdd, buttonCart, buttonContinue, iconCart, listCartItems}
import testdata.ProjectData.{add2List, add2Remove1List}


class UserStory7Steps extends ScalaDsl with EN {

  //GIVEN the user is on the login page - (Found in Login Steps)

  //AND the user enters correct username and password - (Found in Login Steps)

  //AND the user click login - (Found in Login Steps)

  //AND the user is take to the product listing page - (Found in Login Steps)

  //Scenario 1:
  And ("""the user has added items to the cart"""){() =>
    backpackAdd()
    bikeAdd()
    iconCart("2")
  }

  When ("""the user selects remove on the products listing page"""){() =>
    buttonCart()
    listCartItems(add2List)
    buttonContinue()
    backpackRemove()
    buttonCart()
  }

  Then ("""the item should be removed from the cart"""){() =>
    listCartItems(add2Remove1List)
  }

  And ("""the cart icon should update to reflect the change"""){() =>
    iconCart("1")
  }

  //Scenario 2:
  When ("""the user navigates to the cart"""){() =>
    buttonCart()
  }

  And ("""the user selects remove on the cart page"""){() =>
    backpackRemove()
  }



}