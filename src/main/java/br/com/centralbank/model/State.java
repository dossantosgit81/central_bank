package br.com.centralbank.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class State {

    private Long idState;

    private String name_state;

    private String acronymState;

    @ManyToOne
    @JoinColumn(name = "rf_region")
    private Region region;
}
