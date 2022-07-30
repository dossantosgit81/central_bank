package br.com.centralbank.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
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

    private Long idState;

    private String name_state;

    private String acronymState;

    @ManyToOne
    @JoinColumn(name = "rf_region")
    private Region region;

    @OneToMany(mappedBy = "state")
    private List<City> cities;
}
