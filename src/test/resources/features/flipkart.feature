Feature: Print all the submenus of all the menus. For Example Print Electronics menu

  @test @ui
  Scenario: Print all the submenus of all the menus.

    Given You will get a login pop-up to login and click on the close icon and cancel the login pop-up
    And   you will see some banners and it will change randomly. Click on any banner.
    When  Click on any banner and you will see a horizontal menu with Menu name and Hover on it and you will see a list of mobile brands.
    Then  Need to print all the menus and sub-menus as in order
