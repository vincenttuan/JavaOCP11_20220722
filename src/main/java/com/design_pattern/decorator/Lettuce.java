package com.design_pattern.decorator;

public class Lettuce extends SideDish {
    public Lettuce(Food food) {
        super(food);
        name = "生菜";
        price = 15;
    }
}
