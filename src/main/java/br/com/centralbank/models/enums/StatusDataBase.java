package br.com.centralbank.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum StatusDataBase {
    ACTIVE("ACTIVE"),
    EXCLUDE("EXCLUDE");

    private String description;
}
