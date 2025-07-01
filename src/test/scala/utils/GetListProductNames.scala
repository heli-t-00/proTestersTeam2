package utils

import org.openqa.selenium.By
import support.DriverManager.driver

import scala.collection.mutable.ListBuffer

object GetListProductNames {
  def allProductList(locators: By ): ListBuffer[String] = {
    // get list of web elements in order they appear
    val listAllProducts = driver.findElements(locators)
    // create empty mutable list
    val productsString = ListBuffer.empty[String]
// Iterate through the web element
    for (i <- 0 until listAllProducts.size()) {
      // extract each name and get text
      val productName = listAllProducts.get(i).getText
// add string to the list
      productsString += productName

    }
    println(productsString)
    productsString

  }


}
