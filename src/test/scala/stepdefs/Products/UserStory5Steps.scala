package stepdefs.Products

import io.cucumber.scala.{EN, ScalaDsl}
import locators.ProjectLocators.productSort
import org.openqa.selenium.support.ui.WebDriverWait
import pages.ProjectPage.{clickOn, filterSelect, listAllProductItems, listAllProductPrices}
import support.DriverManager.driver
import testdata.ProjectData._

import java.time.Duration

class UserStory5Steps extends ScalaDsl with EN {
  //GIVEN the user is on the login page - (Found in Login Steps)

  //AND the user enters correct username and password - (Found in Login Steps)

  //AND the user click login - (Found in Login Steps)

  //AND the user is take to the product listing page - (Found in Login Steps)

  val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10))
  When("""^the user clicks on the sort dropdown$""") { () =>
    clickOn(productSort)
  }

  // Scenario: Name A to Z

  And("""the user selects Name A to Z from the option dropdown""") { () =>
    filterSelect(filterAZ)
  }

  Then("""^the products should be ordered alphabetically from A to Z$""") { () =>
    listAllProductItems(productAZ)
    println("Filter by A to Z selected successfully")
  }

  // Scenario: Name Z to A
  And("""the user selects Name Z to A from the option dropdown""") { () =>
  filterSelect(filterZA)
}


  Then("""^the products should be ordered alphabetically from Z to A$""") { () =>
    listAllProductItems(productZA)
    println("Filter by Z to A selected successfully")
  }

//Scenario: Sort by Price low to high

  And("""the user selects Price low to high from the option dropdown""") { () =>
    filterSelect(filterPriceLoHi)
  }
  Then("""^the products should be ordered by price low to high$""") { () =>
    listAllProductPrices(productPriceLoHi)
    println("Filter by price low to high selected successfully")
  }



  // Scenario: Sort by Price high to low
  And("""the user selects Price high to low from the option dropdown""") { () =>
    filterSelect(filterPriceHiLo)
  }

  Then("""^the products should be ordered by price high to low$""") { () =>
    listAllProductPrices(productPriceHiLo)
    println("Filter by price low to high selected successfully")
  }

}
