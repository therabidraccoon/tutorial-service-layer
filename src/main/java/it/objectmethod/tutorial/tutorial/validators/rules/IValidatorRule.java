package it.objectmethod.tutorial.tutorial.validators.rules;

import java.util.Map;

public interface IValidatorRule {
	
	public void validate(Map<String, Object> paramsToValidate);

}
