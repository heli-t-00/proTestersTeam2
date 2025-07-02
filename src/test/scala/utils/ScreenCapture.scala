package utils

import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.{OutputType, TakesScreenshot, WebDriver}

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

import io.qameta.allure.Allure
import java.io.ByteArrayInputStream

object ScreenCapture extends App {

  def takeScreenshot(driver: WebDriver, folderPath: String, fileName: String): File = {
    val timeStamp = new SimpleDateFormat("YYYY-MM-DD_HH-MM-SS").format(new Date())
    val srcFile: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
    val screenshot = new File(s"$folderPath/${fileName}_$timeStamp.png")
    FileHandler.copy(srcFile, screenshot)
    screenshot
  }

  def attachScreenshot(driver: WebDriver, name: String): Unit = {
    val screenshotBytes = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.BYTES)
    Allure.addAttachment(name, new ByteArrayInputStream(screenshotBytes))
  }

}