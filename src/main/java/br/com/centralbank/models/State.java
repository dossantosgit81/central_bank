package br.com.centralbank.models;

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
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_state")
    private Long idState;

    @Column(name = "name_state")
    private String nameState;

    @Column(name = "acronym_state")
    private String acronymState;

    @ManyToOne
    @JoinColumn(name = "rf_region")
    private Region region;

    @OneToMany(mappedBy = "state")
    private List<City> cities;
}
