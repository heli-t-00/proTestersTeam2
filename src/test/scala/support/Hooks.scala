package support

import io.cucumber.scala.{EN, ScalaDsl}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import pages.ProjectPage.browserLaunch
import utils.ScreenCapture
import io.cucumber.scala.Scenario
import io.qameta.allure.Allure
import org.openqa.selenium.{OutputType, TakesScreenshot}

import java.io.ByteArrayInputStream

class Hooks extends ScalaDsl with EN {

  val options = new ChromeOptions()

  options.addArguments("--headless=new")

  Before {
    println("Launching browser before scenario...")
    DriverManager.driver = new ChromeDriver(options)
    DriverManager.driver.manage().window().maximize()
    browserLaunch()
  }

  After { scenario: Scenario =>
    if (scenario.isFailed) {
      println("Scenario failed - attaching screenshot...")
      val screenshot = DriverManager.driver
        .asInstanceOf[TakesScreenshot]
        .getScreenshotAs(OutputType.BYTES)

      Allure.addAttachment(scenario.getName, new ByteArrayInputStream(screenshot))
    }

    println("Closing browser after scenario...")
    DriverManager.driver.quit()
  }

}
