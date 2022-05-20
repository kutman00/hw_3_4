package com.geektech.hw_3_4;

public class Music {
    private String name, name_second;
    private int number;
    private String number_second;

    public Music(String name, String name_second, int number, String number_second) {
        this.name = name;
        this.name_second = name_second;
        this.number = number;
        this.number_second = number_second;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getNumber_second() {
        return number_second;
    }

    public String getName_second() {
        return name_second;
    }
}
