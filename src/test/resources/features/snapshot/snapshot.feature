#language: nl
@Pagecompare
Functionaliteit: Exameple project om page compare uit te voeren

Achtergrond: Feature: Page compare
  Gegeven Resultatenlocatie is "data/" en runtype is "baseline" en marge is "0"

@issue=<AOW-668>
@severity=blocker
Scenario: Maak een snapshot van de homepage
  Als ik een snapshot "snapshotnaam" maak en vergelijk

  @severity=trivial
  @flaky
  Abstract Scenario: Maak een snapshot van elementen op de hompage
    Als ik een snapshot "<snapshotNaam>" maak van een element "<element>" en vergelijk
Voorbeelden:
      | snapshotNaam   | element |
     # | promoElement | .edc-container--has-discount-shield.edc-container--color-bonus.column |
    #  | bannerElement | #index_5 .edc-figure.edc-figure--full-bleed |

