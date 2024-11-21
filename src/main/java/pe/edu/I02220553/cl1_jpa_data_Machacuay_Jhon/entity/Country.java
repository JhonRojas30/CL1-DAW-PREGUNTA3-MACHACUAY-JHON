package pe.edu.I02220553.cl1_jpa_data_Machacuay_Jhon.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Country {

    @Id
    private String code;
    private String Name;
    private String Continent;
    private String Region;
    @Column(name = "SurfaceArea")
    private Double surfaceArea;
    @Column(name = "IndepYear")
    private Integer indepYear;
    private Integer Population;
    @Column(name = "LifeExpectancy")
    private Double lifeExpectancy;
    private Double GNP;
    private Double GNPOld;
    @Column(name = "LocalName")
    private String localName;
    @Column(name = "GovernmentForm")
    private String governmentForm;
    @Column(name = "HeadOfState")
    private String headOfState;
    private Integer Capital;
    private String Code2;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<City> cities;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST,CascadeType.REMOVE}, orphanRemoval = true,fetch = FetchType.EAGER)
    private List<CountryLanguage> languages;
}
