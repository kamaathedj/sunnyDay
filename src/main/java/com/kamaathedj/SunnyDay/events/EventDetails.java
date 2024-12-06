package com.kamaathedj.SunnyDay.events;

import java.util.Objects;

public record EventDetails(String name, String description) {

    @Override
    public String toString() {
        return "EventDetails[" +
                "name=" + name + ", " +
                "description=" + description + ']';
    }


}
