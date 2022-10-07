package br.com.centralbank.models;

import br.com.centralbank.models.enums.ErrorResonEnum;
import br.com.centralbank.models.enums.StatusTransactionEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@SuperBuilder(toBuilder = true)
public abstract class Transaction implements Serializable {

    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_central_transaction")
    private Long idCentralTransaction;

    @Column(name = "date_transaction")
    private LocalDateTime dateTransaction;

    @Column(name = "type_transaction")
    private String type_transaction;

    @Column(name = "status_transaction")
    @Enumerated(EnumType.STRING)
    private StatusTransactionEnum statusTransaction;

    @Column(name = "error_reson")
    @Enumerated(EnumType.STRING)
    private ErrorResonEnum errorResonEnum;


}
