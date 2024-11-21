package pe.edu.I02220553.cl1_jpa_data_Machacuay_Jhon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.I02220553.cl1_jpa_data_Machacuay_Jhon.entity.Country;
import pe.edu.I02220553.cl1_jpa_data_Machacuay_Jhon.entity.CountryLanguage;
import pe.edu.I02220553.cl1_jpa_data_Machacuay_Jhon.repository.CountryRepository;

import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataMachacuayJhonApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;



	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataMachacuayJhonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//CONSULTA 1 CON IS PRESENT OR ELSE
		Optional<Country> optional = countryRepository.findById("ARG"); // ARGENTINA
		optional.ifPresentOrElse(
				(item) -> {
					System.out.println("Languages in ARG found:");
					for (CountryLanguage countryLanguage : item.getLanguages()) {
						System.out.println(countryLanguage.getLanguage());
					}
				},
				() -> {
					Optional<Country> optionalPer = countryRepository.findById("PER"); // PERU
					optionalPer.ifPresentOrElse(
							(perItem) -> {
								System.out.println("Languages in PER found:");
								for (CountryLanguage countryLanguage : perItem.getLanguages()) {
									System.out.println(countryLanguage.getLanguage());
								}
							},
							() -> System.out.println("Country PER not found.")
					);
				}
		);
	}

}