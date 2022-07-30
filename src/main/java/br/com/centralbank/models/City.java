package br.com.centralbank.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_city")
    private Long idCity;

    @Column(name = "name_city")
    private String nameCity;

    @ManyToOne
    @JoinColumn(name = "rf_state")
    private State state;

}
