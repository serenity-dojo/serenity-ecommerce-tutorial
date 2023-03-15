package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class MenuBarActions extends UIInteractions {

    @Step("Read the top level menus")
    public List<String> topLevelMenuItems() {
        return findAll(".navigation a.level-top").texts();
    }
}
