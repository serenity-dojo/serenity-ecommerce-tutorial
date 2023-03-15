package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class NavigationActions extends UIInteractions {

    @Step
    public void openTheLumaApplication() {
        openUrl("https://magento.softwaretestingboard.com/");
    }
}
