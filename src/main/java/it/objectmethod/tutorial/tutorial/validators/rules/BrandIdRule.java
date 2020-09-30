package it.objectmethod.tutorial.tutorial.validators.rules;

import java.util.List;
import java.util.Map;

import it.objectmethod.tutorial.tutorial.domain.BrandEntity;

@SuppressWarnings("unchecked")
public class BrandIdRule implements IValidatorRule {

	@Override
	public void validate(Map<String, Object> paramsToValidate) {
		
		List<String> errors = (List<String>) paramsToValidate.get("errList");
		BrandEntity brand = (BrandEntity) paramsToValidate.get("brand");
		if (brand.getId() != null && brand.getId() > 10) {
			errors.add("Id non può essere maggiore di 10");
		}
	}

}
