package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import locators.ProjectLocators.productSort
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.support.ui.{ExpectedConditions, Select, WebDriverWait}
import pages.ProjectPage.{clickOn, filterBtn}
import support.DriverManager.driver

import java.time.Duration

class UserStory5Steps extends ScalaDsl with EN {
  //GIVEN the user is on the login page - (Found in Login Steps)

  //AND the user enters correct username and password - (Found in Login Steps)

  //AND the user click login - (Found in Login Steps)

  //AND the user is take to the product listing page - (Found in Login Steps)

  val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10))
  When("""^the user clicks on the sort dropdown$""") { () =>

    driver.manage().window().maximize()

    clickOn(productSort)

  }


  And("""the user selects "Name (A to Z)" from the option dropdown""") { (string: String) =>
   val option = wait.until (
     ExpectedConditions.elementToBeClickable(
       By.xpath("val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10))")
     )
    )

  }

  Then("""^the product list should update$""") { () =>
    val chosenAZ = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"))
assert(chosenAZ == "Name (A to Z)", s"Option Value <$chosenAZ")
  }

  And("""^the products should be ordered alphabetically from A to Z$""") { () =>
    println("Filter by A to Z selected successfully")

  }
}
