package stepdefs.Products

import io.cucumber.scala.{EN, ScalaDsl}

class UserStory5Steps extends ScalaDsl with EN {
  //GIVEN the user is on the login page - (Found in Login Steps)

  //AND the user enters correct username and password - (Found in Login Steps)

  //AND the user click login - (Found in Login Steps)

  //AND the user is take to the product listing page - (Found in Login Steps)

  When("""^the user clicks filter option to sort by Name (A to Z)$"""){()=>


  }

 Then("""^the product list should update$"""){()=>
   println("test then")

  }

  And("""^the products should be ordered alphabetically from A to Z by name$"""){()=>
    println("test And")

  }
}
