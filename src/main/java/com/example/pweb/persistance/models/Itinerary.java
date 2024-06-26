package com.example.pweb.persistance.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "itineraries")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Itinerary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "no_days")
    private Integer noDays;

    @Column(name = "location_name")
    private String locationName;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id")
    private OurUsers owner;

}
