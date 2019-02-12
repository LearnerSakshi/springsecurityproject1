package com.hcl;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CountryDao extends CrudRepository<Country,Integer>  {

	Country findById(int id);

}
