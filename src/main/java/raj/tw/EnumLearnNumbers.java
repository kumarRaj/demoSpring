package raj.tw;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Copyright 2018 Jubilant FoodWorks Limited . All Rights Reserved.
 * Jubilant FoodWorks PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

public enum EnumLearnNumbers {
    A(2032830);
    int value;

    EnumLearnNumbers(int i) {
        this.value = i;
    }

    @JsonValue
    public int get(){
        return value;
    }

}