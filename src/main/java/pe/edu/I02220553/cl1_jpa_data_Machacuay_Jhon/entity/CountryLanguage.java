package pe.edu.I02220553.cl1_jpa_data_Machacuay_Jhon.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Locale;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryLanguage {

    @Id
    @Column(name = "CountryCode", nullable = false)
    private String CountryCode;
    @Id
    @Column(name = "Language", nullable = false)
    private String Language;
    @Column(name = "IsOfficial")
    private String isOfficial;
    private Double Percentage;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CountryCode", nullable = false, insertable = false, updatable = false)
    private Country country;


}
