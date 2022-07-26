package br.com.centralbank.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CustomerTypeEnum {
    LEGAL_CUSTOMER("PESSOA JURÍDICA"),
    PHYSICAL_CUSTOMER("PESSOA FÍSICA");

    private String description;
}
