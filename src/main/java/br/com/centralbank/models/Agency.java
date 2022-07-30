package br.com.centralbank.models;


import lombok.*;

import javax.persistence.*;

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
    private Long id_agency;

    @Column(name = "name_agency")
    private String nameAgency;

    @Column(name = "neighborhood_agency")
    private String neighborhood;

    @Column(name = "road_agency")
    private String roadAgency;

    @Column(name = "status_data_base")
    private String statusDatabase;

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

}
