package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.ui.Link;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CatalogActions extends UIInteractions {

    @Step("Show product details for '{0}'")
    public void showProductDetails(String productName) {
        $(By.linkText(productName)).click();
    }
}
