package stepdefs.Cart

import io.cucumber.scala.{EN, ScalaDsl}

class UserStory7Steps extends ScalaDsl with EN {

  //GIVEN the user is on the login page - (Found in Login Steps)

  //AND the user enters correct username and password - (Found in Login Steps)

  //AND the user click login - (Found in Login Steps)

  //AND the user is take to the product listing page - (Found in Login Steps)

  And ("""the user has added items to the cart"""){() =>

  }

  When ("""the user selects remove on the products listing page"""){() =>

  }

  Then ("""the item should be removed from the cart"""){() =>

  }

  And ("""the cart icon should update to reflect the change"""){() =>

  }

}