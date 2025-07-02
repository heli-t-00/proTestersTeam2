package stepdefs.Products

import io.cucumber.scala.{EN, ScalaDsl}
import pages.ProjectPage.{containsCopyright, containsSocials, listAllProductItems, navigateFacebook, navigateLinkedIn, navigateTwitter, socialsTab}
import testdata.ProjectData.{facebookTitleText, footerSocials, footerText, linkedInTitleText, productAZ, twitterTitleText}

class UserStory14Steps extends ScalaDsl with EN {

  //GIVEN the user is on the login page - (Found in Login Steps)
  //AND the user enters correct username and password - (Found in Login Steps)
  //AND the user click login - (Found in Login Steps)
  //AND the user is taken to the product listing page - (Found in Login Steps)

  And ("""all products are displayed with the footer containing links to social media and copyright text""") { () =>
    listAllProductItems(productAZ)
    containsSocials(footerSocials)
    containsCopyright(footerText)
  }

  When ("""the user clicks the Twitter icon""") { () =>
    navigateTwitter()
  }

  Then ("""the user should be redirected to the Twitter webpage""") { () =>
    socialsTab(twitterTitleText)
  }

  When ("""the user clicks the Facebook icon""") { () =>
    navigateFacebook()
  }

  Then ("""the user should be redirected to the Facebook webpage""") { () =>
    socialsTab(facebookTitleText)
  }

  When ("""the user clicks the LinkedIn icon""") { () =>
    navigateLinkedIn()
  }

  Then ("""the user should be redirected to the LinkedIn webpage""") { () =>
    socialsTab(linkedInTitleText)
  }

}