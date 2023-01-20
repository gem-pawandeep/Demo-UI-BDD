Feature: Jewel-Dashboard

  Scenario Outline:Launch Jewel, perform login and logout.
    Given user clicks on logIn button
    Then enter <Username> and <Password>
    Then user navigates back after loggin in
    Examples:
      | Username     | Password  |
      | arpit.mishra | arpit1234 |

  Scenario Outline:Launch Jewel and verify url of Jewel and Pricing tabs.
    Given validating url of jewel <expectedUrl>
    Then click on pricing
    Then validate pricing url <expectedPurl>
    Examples:
      | expectedUrl                       | expectedPurl                             |
      | https://jewel.gemecosystem.com/#/ | https://jewel.gemecosystem.com/#/pricing |

  Scenario Outline:Launch Pricing and validate the text-content.
    Given clicking on pricing and checking for main heading <pricingHead>
    Then checking for subheading <pricingSubHead>
    Then checking for text <Text>
    Examples:
      | pricingHead | pricingSubHead           | Text                                                       |
      | Hold Tight! | This Page is Coming Soon | Our scouts are currently working hard building this page ! |

  Scenario Outline:Launch Jewel, Validate the texts of headings.
    Given clicking on jewel again validating main heading <mainHeading>
    Then validating subheading of jewel <subHeading>
    Examples:
      | mainHeading   | subHeading                                                  |
      | Explore Jewel | Effortless Report analysis and Test monitoring at a glance. |

  Scenario Outline:Launch Jewel, validate the text-content on page.
    Given validating whatisjewel <whatisjewel>
    Then validating about us <aboutus>
    Then validating content <content>
    Examples:
      | whatisjewel     | aboutus  | content                                                                                                                                                                                                                                                        |
      | What Is Jewel ? | ABOUT US | Jewel is a test management web solution that offers test suite creation using Gempyp and Gemjar, test execution with maximum parallelisation and load balancing along with live and analytical reporting for any framework that is integrated using Rest APIs. |

  Scenario Outline:Launch Jewel, validate text-content in view report box.
    Given validating view report <viewreport>
    Then validating view reportC <viewcontent>
    Examples:
      | viewreport                        | viewcontent                                                                                                                               |
      | JEWEL- End to End Test Management | Quickly Scalable and Easily Maintainable.Form-based codeless approach for API Automation & Data Validation.Testcase-Shareable but secure. |

  Scenario Outline:Launch Jewel, Validate the text in run test suite box.
    Given validating run test <runtest>
    Then validating run testC  <runcontent>
    Examples:
      | runtest                  | runcontent                                                                                                                                                               |
      | Create & Run Test Suites | One click runMutliple modes and use-casesCI CD CT ReadyAWS Lambda/Azure Functions- Unlimited Parallel ExecutionOpenness to support plugin with other apps scheduler. |

  Scenario Outline:Launch Jewel, click on Facebook logo and validate the URL.
    Given click on facebook logo validate url <facebook>
    Examples:
      | facebook                              |
      | https://www.facebook.com/gemecosystem |

  Scenario Outline:Launch Jewel, click on Twitter logo and validate the URL.
    Given click on twitter logo and validate url <twitter>
    Examples:
      | twitter                          |
      | https://twitter.com/gemecosystem |

  Scenario Outline:Launch Jewel, click on Instagram logo and validate the URL.
    Given click on instagram logo and validate url <insta>
    Examples:
      | insta                                   |
      | https://www.instagram.com/gemecosystem/ |