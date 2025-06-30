package utils

object Assertion {

  /** Assert that an element’s visible text equals the expected string (exact match). */
  def assert(element: String, expected: String): Unit = {
    val actual = element.trim
    require(
      actual == expected,
      s"Assertion failed: expected '$expected', but found '$actual'"
    )
  }

  /** Assert that an element is visible */
  def assertVisible(isVisible: Boolean, elementName: String): Unit = {
    require(
      isVisible,
      s"Assertion failed: '$elementName' is not visible"
    )
  }

}