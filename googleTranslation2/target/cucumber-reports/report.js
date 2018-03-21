$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleTranslate.feature");
formatter.feature({
  "line": 2,
  "name": "As a User , I want to use google translate",
  "description": "so that I can translate a text to a different language",
  "id": "as-a-user-,-i-want-to-use-google-translate",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@onlyFeature"
    }
  ]
});
formatter.before({
  "duration": 4980567708,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Translate a single word",
  "description": "",
  "id": "as-a-user-,-i-want-to-use-google-translate;translate-a-single-word",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "On Google translate page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I choose source language",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I choose target language",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I type a word into source field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on translate",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Translation is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleTranslateSteps.on_Google_translate_page()"
});
formatter.result({
  "duration": 1931257360,
  "status": "passed"
});
formatter.match({
  "location": "GoogleTranslateSteps.i_choose_source_language()"
});
formatter.result({
  "duration": 810490743,
  "status": "passed"
});
formatter.match({
  "location": "GoogleTranslateSteps.i_choose_target_language()"
});
formatter.result({
  "duration": 346557580,
  "status": "passed"
});
formatter.match({
  "location": "GoogleTranslateSteps.i_type_a_word_into_source_field()"
});
formatter.result({
  "duration": 80093837,
  "status": "passed"
});
formatter.match({
  "location": "GoogleTranslateSteps.i_click_on_translate()"
});
formatter.result({
  "duration": 108438,
  "status": "passed"
});
formatter.match({
  "location": "GoogleTranslateSteps.translation_is_displayed()"
});
formatter.result({
  "duration": 1347889182,
  "status": "passed"
});
formatter.after({
  "duration": 119594,
  "status": "passed"
});
});