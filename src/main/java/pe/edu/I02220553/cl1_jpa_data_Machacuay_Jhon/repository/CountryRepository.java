package pe.edu.I02220553.cl1_jpa_data_Machacuay_Jhon.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.I02220553.cl1_jpa_data_Machacuay_Jhon.entity.Country;
import pe.edu.I02220553.cl1_jpa_data_Machacuay_Jhon.entity.CountryLanguage;

import java.util.List;
import java.util.Optional;


public interface CountryRepository extends CrudRepository<Country,String> {


}



