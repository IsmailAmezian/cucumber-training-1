package com.politienl.regressie.definitions.politie.nl.meldmisbruik;

import com.codeborne.selenide.Configuration;
import com.politienl.regressie.definitions._generics.BasePage;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.politienl.regressie.data._JsonData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class MeldmisbruikPage extends BasePage {

    public MeldmisbruikPage(WebDriver webDriver) {
        super(webDriver);
        WebDriverRunner.setWebDriver(webDriver);
    }

    private _JsonData testdata = new _JsonData();

    @Step("Meldmisbruik via contactformulier")
    protected void meldMisbruikContactForm() {

        Configuration.timeout = 15000;

        $(By.id("aangifte-melding")).click();
        $(By.xpath("//*[@id=\"linkspagina\"]/dl/dd[7]/a")).click();
        $(By.xpath("//*[@id=\"link-anders\"]/ul/li[5]/a")).click();
        $(By.id("field-1-2")).setValue(testdata.JsonData("webelements_contact", "Plaatsnaam Voorval")).submit();
        $(By.id("field-1-14")).setValue(testdata.JsonData("webelements_contact", "Emailadres")).submit();
        $(By.id("submit_button")).click();
        $(By.id("submit_button")).click();
        $("#formulier-container > div > div > h3").shouldHave(text("Het formulier is verzonden"));
    }
}