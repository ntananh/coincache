package com.unhomie.coincache.domain;

public enum Currency {

    USD, EUR, VND;

    public static Currency getDefault() {
        return USD;
    }

}
