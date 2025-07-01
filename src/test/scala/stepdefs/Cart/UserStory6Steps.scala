package stepdefs.Cart

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{backpackAdd, bikeAdd, buttonCart, iconCart, jacketAdd, listCartItems, onesieAdd, redtshirtAdd, tshirtAdd}
import testdata.ProjectData.add6List

class UserStory6Steps extends ScalaDsl with EN {

  //GIVEN the user is on the login page - (Found in Login Steps)
  //AND the user enters correct username and password - (Found in Login Steps)
  //AND the user click login - (Found in Login Steps)
  //AND the user is taken to the product listing page - (Found in Login Steps)

  When ("""the user has added 6 items to the cart""") { () =>
    backpackAdd()
    bikeAdd()
    tshirtAdd()
    jacketAdd()
    onesieAdd()
    redtshirtAdd()
  }

  Then ("""the items get added to the cart""") { () =>
    buttonCart()
    listCartItems(add6List)

  }

  And ("""the cart icon updates to show corresponding number of items""") { () =>
    iconCart("6")
  }



























}
