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

  def assertList(element: Seq[String], expected: Seq[String]): Unit = {
    for(i <- 0 until element.size){
      val actual = element(i).trim
      val expectedItem = expected(i)
      require(
        actual == expected,
        s"Assertion failed: expected '$expected', but found '$actual'"
      )
    }
  }
}
