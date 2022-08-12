package br.com.centralbank.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.management.Descriptor;

@AllArgsConstructor
@Getter
public enum ErrorResonEnum {

    INSUFFICIENT_BALANCE("Saldo insuficiente."),
    CUSTOMER_NOT_EXISTS("Cliente inexistente."),
    SOCIAL_SECURITY_NUMBER_INVALID("O cpf/cnpj digitado não é válido.");

    private String description;

}
