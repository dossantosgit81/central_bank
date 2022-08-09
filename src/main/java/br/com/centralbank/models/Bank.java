package br.com.centralbank.models;

import br.com.centralbank.models.enums.StatusDataBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bank")
    private Long idBank;

    @Column(name = "name_bank")
    private String nameBank;

    @Column(name = "acronym_bank")
    private String acronymBank;

    @Column(name = "status_data_base")
    private StatusDataBase statusDtaBase;

    @OneToOne
    @JoinColumn(name = "thirst_bank")
    private Agency thirst;

    @OneToMany(mappedBy = "thirstBank")
    private List<Agency> agencies;

}
