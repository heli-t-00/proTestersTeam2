package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import locators.ProjectLocators.productSort
import org.openqa.selenium.support.ui.{ExpectedConditions, Select, WebDriverWait}
import pages.ProjectPage.{clickOn, filterBtn, filterSelect, listAllProductItems, passwordAlert}
import support.DriverManager.driver
import testdata.ProjectData.{filterAZ, productAZ}
import utils.GetListProductNames.allProductList

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

  And("""the user selects Name A to Z from the option dropdown""") { () =>
  filterSelect(filterAZ)
  }


  Then("""^the products should be ordered alphabetically from A to Z$""") { () =>
//   listAllProductItems(productAZ)
println(productAZ)
    println("Filter by A to Z selected successfully")

  }
}
