package br.com.centralbank.models;


import br.com.centralbank.models.enums.StatusDataBaseEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Agency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agency")
    private Long idAgency;

    @Column(name = "name_agency")
    private String nameAgency;

    @Column(name = "neighborhood_agency")
    private String neighborhood;

    @Column(name = "road_agency")
    private String roadAgency;

    @Column(name = "status_data_base")
    private StatusDataBaseEnum statusDatabase;

    @Column(name = "house_number_agency")
    private String houseNumberAgency;

    @OneToOne(mappedBy = "thirst")
    private Bank thirstBank;

    @ManyToOne
    @JoinColumn(name = "rf_bank")
    private Bank bankOwner;

    @ManyToOne
    @JoinColumn(name = "rf_city")
    private City city;

    @OneToMany(mappedBy = "agency")
    private List<Transaction> transactions;

}
