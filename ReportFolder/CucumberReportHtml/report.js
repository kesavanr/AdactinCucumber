$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 2,
  "name": "Booking functionality of the adaction hotel application",
  "description": "",
  "id": "booking-functionality-of-the-adaction-hotel-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AdactinHotel"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Adactin hotel login scenario",
  "description": "",
  "id": "booking-functionality-of-the-adaction-hotel-application;adactin-hotel-login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@LoginHotel"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": ":Launch the application url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether navigated to search hotel page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "booking-functionality-of-the-adaction-hotel-application;adactin-hotel-login-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "booking-functionality-of-the-adaction-hotel-application;adactin-hotel-login-scenario;;1"
    },
    {
      "cells": [
        "demolink1984",
        "dummy"
      ],
      "line": 12,
      "id": "booking-functionality-of-the-adaction-hotel-application;adactin-hotel-login-scenario;;2"
    },
    {
      "cells": [
        "dummy",
        "123456"
      ],
      "line": 13,
      "id": "booking-functionality-of-the-adaction-hotel-application;adactin-hotel-login-scenario;;3"
    },
    {
      "cells": [
        "dummy",
        "dummy"
      ],
      "line": 14,
      "id": "booking-functionality-of-the-adaction-hotel-application;adactin-hotel-login-scenario;;4"
    },
    {
      "cells": [
        "demolink1984",
        "123456"
      ],
      "line": 15,
      "id": "booking-functionality-of-the-adaction-hotel-application;adactin-hotel-login-scenario;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 705963,
  "status": "passed"
});
formatter.before({
  "duration": 270386,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Adactin hotel login scenario",
  "description": "",
  "id": "booking-functionality-of-the-adaction-hotel-application;adactin-hotel-login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AdactinHotel"
    },
    {
      "line": 3,
      "name": "@LoginHotel"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": ":Launch the application url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter valid \"demolink1984\" and \"dummy\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether navigated to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.launch_the_application_url()"
});
formatter.result({
  "duration": 3223380290,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demolink1984",
      "offset": 18
    },
    {
      "val": "dummy",
      "offset": 37
    }
  ],
  "location": "StepDefinition.user_enter_valid_and(String,String)"
});
formatter.result({
  "duration": 551947070,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_login_button()"
});
formatter.result({
  "duration": 550501448,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_navigated_to_search_hotel_page()"
});
formatter.result({
  "duration": 20546,
  "status": "passed"
});
formatter.after({
  "duration": 117524,
  "status": "passed"
});
formatter.after({
  "duration": 59173,
  "status": "passed"
});
formatter.before({
  "duration": 53831,
  "status": "passed"
});
formatter.before({
  "duration": 51366,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Adactin hotel login scenario",
  "description": "",
  "id": "booking-functionality-of-the-adaction-hotel-application;adactin-hotel-login-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AdactinHotel"
    },
    {
      "line": 3,
      "name": "@LoginHotel"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": ":Launch the application url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter valid \"dummy\" and \"123456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether navigated to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.launch_the_application_url()"
});
formatter.result({
  "duration": 332346847,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummy",
      "offset": 18
    },
    {
      "val": "123456",
      "offset": 30
    }
  ],
  "location": "StepDefinition.user_enter_valid_and(String,String)"
});
formatter.result({
  "duration": 299690083,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_login_button()"
});
formatter.result({
  "duration": 421209063,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_navigated_to_search_hotel_page()"
});
formatter.result({
  "duration": 27532,
  "status": "passed"
});
formatter.after({
  "duration": 102730,
  "status": "passed"
});
formatter.after({
  "duration": 110538,
  "status": "passed"
});
formatter.before({
  "duration": 99443,
  "status": "passed"
});
formatter.before({
  "duration": 110538,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Adactin hotel login scenario",
  "description": "",
  "id": "booking-functionality-of-the-adaction-hotel-application;adactin-hotel-login-scenario;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AdactinHotel"
    },
    {
      "line": 3,
      "name": "@LoginHotel"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": ":Launch the application url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter valid \"dummy\" and \"dummy\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether navigated to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.launch_the_application_url()"
});
formatter.result({
  "duration": 401245257,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummy",
      "offset": 18
    },
    {
      "val": "dummy",
      "offset": 30
    }
  ],
  "location": "StepDefinition.user_enter_valid_and(String,String)"
});
formatter.result({
  "duration": 268461271,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_login_button()"
});
formatter.result({
  "duration": 396407476,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_navigated_to_search_hotel_page()"
});
formatter.result({
  "duration": 15204,
  "status": "passed"
});
formatter.after({
  "duration": 55474,
  "status": "passed"
});
formatter.after({
  "duration": 40681,
  "status": "passed"
});
formatter.before({
  "duration": 60406,
  "status": "passed"
});
formatter.before({
  "duration": 42736,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Adactin hotel login scenario",
  "description": "",
  "id": "booking-functionality-of-the-adaction-hotel-application;adactin-hotel-login-scenario;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AdactinHotel"
    },
    {
      "line": 3,
      "name": "@LoginHotel"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": ":Launch the application url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter valid \"demolink1984\" and \"123456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether navigated to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.launch_the_application_url()"
});
formatter.result({
  "duration": 345034875,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demolink1984",
      "offset": 18
    },
    {
      "val": "123456",
      "offset": 37
    }
  ],
  "location": "StepDefinition.user_enter_valid_and(String,String)"
});
formatter.result({
  "duration": 300332764,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_login_button()"
});
formatter.result({
  "duration": 2721600178,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_navigated_to_search_hotel_page()"
});
formatter.result({
  "duration": 25888,
  "status": "passed"
});
formatter.after({
  "duration": 140535,
  "status": "passed"
});
formatter.after({
  "duration": 74787,
  "status": "passed"
});
formatter.before({
  "duration": 83828,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Adactin search hotel scenario",
  "description": "",
  "id": "booking-functionality-of-the-adaction-hotel-application;adactin-search-hotel-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@SearchHotel"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User select the location \"Sydney\" as \"value\"  from the dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User select the hotel 2 as \"index\" from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User select the room type 2 as \"index\" from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User select the number of rooms 2 as \"index\" from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User enter checkin date \"04/12/2020\" from the textbox",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User enter checkout date \"05/12/2020\" from the textbox",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User select the adults per room 2 as \"index\" from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User select the children per room 2 as \"index\" from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User verifies whether navigated to select hotel page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 26
    },
    {
      "val": "value",
      "offset": 38
    }
  ],
  "location": "StepDefinition.user_select_the_location_as_from_the_dropdown(String,String)"
});
formatter.result({
  "duration": 225607897,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 22
    },
    {
      "val": "index",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_select_the_hotel_as_from_the_dropdown(int,String)"
});
formatter.result({
  "duration": 188671795,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 26
    },
    {
      "val": "index",
      "offset": 32
    }
  ],
  "location": "StepDefinition.user_select_the_room_type_as_from_the_dropdown(int,String)"
});
formatter.result({
  "duration": 112891270,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 32
    },
    {
      "val": "index",
      "offset": 38
    }
  ],
  "location": "StepDefinition.user_select_the_number_of_rooms_as_from_the_dropdown(int,String)"
});
formatter.result({
  "duration": 107025363,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "04/12/2020",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enter_checkin_date_from_the_textbox(String)"
});
formatter.result({
  "duration": 181583396,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "05/12/2020",
      "offset": 26
    }
  ],
  "location": "StepDefinition.user_enter_checkout_date_from_the_textbox(String)"
});
formatter.result({
  "duration": 153545802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 32
    },
    {
      "val": "index",
      "offset": 38
    }
  ],
  "location": "StepDefinition.user_select_the_adults_per_room_as_from_the_dropdown(int,String)"
});
formatter.result({
  "duration": 112429393,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 34
    },
    {
      "val": "index",
      "offset": 40
    }
  ],
  "location": "StepDefinition.user_select_the_children_per_room_as_from_the_dropdown(int,String)"
});
formatter.result({
  "duration": 143547667,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_search_button()"
});
formatter.result({
  "duration": 652889149,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_navigated_to_select_hotel_page()"
});
formatter.result({
  "duration": 77970738,
  "status": "passed"
});
formatter.after({
  "duration": 96567,
  "status": "passed"
});
formatter.after({
  "duration": 92458,
  "status": "passed"
});
formatter.before({
  "duration": 79719,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Adactin select hotel scenario",
  "description": "",
  "id": "booking-functionality-of-the-adaction-hotel-application;adactin-select-hotel-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@SelectHotel"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User select the hotel from the options",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User click the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User verifies whether navigated to book a hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_select_the_hotel_from_the_options()"
});
formatter.result({
  "duration": 185854104,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_continue_button()"
});
formatter.result({
  "duration": 678818304,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_navigated_to_book_a_hotel_page()"
});
formatter.result({
  "duration": 61312796,
  "status": "passed"
});
formatter.after({
  "duration": 72322,
  "status": "passed"
});
formatter.before({
  "duration": 73555,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Adaction book a hotel page scenario",
  "description": "",
  "id": "booking-functionality-of-the-adaction-hotel-application;adaction-book-a-hotel-page-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@BookHotel"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "User enter the firstname \"test fname\" from the textbox",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "User enter the lastname \"test lname\" from the textbox",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User enter the billing address \"test billing address details\" from the big textbox",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User enter the credit card no \"4111111111111111\" from the textbox",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User select the credit card type \"VISA\" as \"value\" from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User select the month of expiry date \"12\" as \"value\" from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User select the year of expiry date \"2022\" as \"value\" from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User enter the cvv number \"111\" from the textbox",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User click the book now button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User verifies whether navigated to booking confirmation page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "test fname",
      "offset": 26
    }
  ],
  "location": "StepDefinition.user_enter_the_firstname_from_the_textbox(String)"
});
formatter.result({
  "duration": 174416512,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test lname",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enter_the_lastname_from_the_textbox(String)"
});
formatter.result({
  "duration": 148190670,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test billing address details",
      "offset": 32
    }
  ],
  "location": "StepDefinition.user_enter_the_billing_address_from_the_big_textbox(String)"
});
formatter.result({
  "duration": 160693372,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4111111111111111",
      "offset": 31
    }
  ],
  "location": "StepDefinition.user_enter_the_credit_card_no_from_the_textbox(String)"
});
formatter.result({
  "duration": 149206058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 34
    },
    {
      "val": "value",
      "offset": 44
    }
  ],
  "location": "StepDefinition.user_select_the_credit_card_type_as_from_the_dropdown(String,String)"
});
formatter.result({
  "duration": 85836600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 38
    },
    {
      "val": "value",
      "offset": 46
    }
  ],
  "location": "StepDefinition.user_select_the_month_of_expiry_date_as_from_the_dropdown(String,String)"
});
formatter.result({
  "duration": 98558323,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022",
      "offset": 37
    },
    {
      "val": "value",
      "offset": 47
    }
  ],
  "location": "StepDefinition.user_select_the_year_of_expiry_date_as_from_the_dropdown(String,String)"
});
formatter.result({
  "duration": 80252175,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "111",
      "offset": 27
    }
  ],
  "location": "StepDefinition.user_enter_the_cvv_number_from_the_textbox(String)"
});
formatter.result({
  "duration": 129193763,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_book_now_button()"
});
formatter.result({
  "duration": 107521345,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_navigated_to_booking_confirmation_page()"
});
formatter.result({
  "duration": 5675456555,
  "status": "passed"
});
formatter.after({
  "duration": 71912,
  "status": "passed"
});
formatter.before({
  "duration": 83417,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Adactin booked itinerary page scenario",
  "description": "",
  "id": "booking-functionality-of-the-adaction-hotel-application;adactin-booked-itinerary-page-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 49,
      "name": "@BookedHistory"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "User click the my itinerary button",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "User verifies whether navigated to booked itinerary page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_the_my_itinerary_button()"
});
formatter.result({
  "duration": 1365694371,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_navigated_to_booked_itinerary_page()"
});
formatter.result({
  "duration": 64767003,
  "status": "passed"
});
formatter.after({
  "duration": 49721,
  "status": "passed"
});
});