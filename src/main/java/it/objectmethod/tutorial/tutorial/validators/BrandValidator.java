package it.objectmethod.tutorial.tutorial.validators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import it.objectmethod.tutorial.tutorial.domain.BrandEntity;
import it.objectmethod.tutorial.tutorial.validators.rules.BrandIdRule;
import it.objectmethod.tutorial.tutorial.validators.rules.BrandNameRule;

@Component
public class BrandValidator {

	/*
	 * Brand id dev'essere minore di 10 Brand name deve avere almeno 5 caratteri
	 * 
	 */

	public List<String> validateBrand(BrandEntity brand) {
		List<String> errors = new ArrayList<String>();

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("brand", brand);
		params.put("errList", errors);
		
		new BrandIdRule().validate(params);
		new BrandNameRule().validate(params);

		return errors;
	}

}
