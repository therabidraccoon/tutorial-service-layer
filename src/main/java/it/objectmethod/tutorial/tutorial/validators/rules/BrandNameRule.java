package it.objectmethod.tutorial.tutorial.validators.rules;

import java.util.List;
import java.util.Map;

import it.objectmethod.tutorial.tutorial.domain.BrandEntity;

@SuppressWarnings("unchecked")
public class BrandNameRule implements IValidatorRule {

	@Override
	public void validate(Map<String, Object> paramsToValidate) {

		List<String> errors = (List<String>) paramsToValidate.get("errList");
		BrandEntity brand = (BrandEntity) paramsToValidate.get("brand");
		if (brand.getBrandName() != null && brand.getBrandName().length() < 5) {
			errors.add("Brand name deve contenere almeno 5 caratteri");
		}

	}
}
