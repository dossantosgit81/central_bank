package br.com.centralbank.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TypeAccount {
    CONTA_CORRENTE("CONTA CORRENTE"),
    CONTA_POUPANCA("CONTA POUPANÇA");

    private String description;
}
