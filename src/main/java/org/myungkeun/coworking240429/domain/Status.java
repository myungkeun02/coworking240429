package org.myungkeun.coworking240429.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public enum Status {
    ACTIVE("active"),
    INACTIVE("inactive");

    private String value;

    private static Status from(String value) {
        return Arrays.stream(values())
                .filter(it -> Objects.equals(it.value, value))
                .findFirst()
                .orElseThrow();
    }
}
