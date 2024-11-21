package pe.edu.I02220553.cl1_jpa_data_Machacuay_Jhon.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    private String Name;
    private String District;
    private Integer Population;

    // Relación con Country
    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country country;
}
