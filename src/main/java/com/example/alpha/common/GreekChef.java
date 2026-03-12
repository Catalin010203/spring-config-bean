package com.example.alpha.common;

import util.Chef;

public class GreekChef  implements Chef {

    public GreekChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Greek salad";
    }
}
