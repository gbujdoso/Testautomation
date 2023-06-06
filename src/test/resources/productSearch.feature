# Gherkin formátum
Feature: Én, mint egy vásárló szeretnék termékeket keresni a Tesco online webáruházában.

  Rule: Létező termék keresése esetén feljön a találati lista

    Scenario: Létező termék keresése
      Given nyito oldalon vagyok
      And minden cookiet elfogadtam
      And a nyelv magyarra van beallitva
      When keresek egy letezo termeket
      Then megjelenik a talalati lista

