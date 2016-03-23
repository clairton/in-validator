package br.eti.clairton.invalidator;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

import java.util.Collection;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
/**
 * Validador que verifica se o valor atual está contido no conjunto.
 * 
 * @author Clairton Rodrigo Heinzen<clairton.rodrigo@gmail.com>
 */
public class InValidator implements ConstraintValidator<In, Object>{
	private Collection<String> valids = emptyList();
	
	@Override
	public void initialize(final In annotation) {
		valids = asList(annotation.valids());
	}

	@Override
	public boolean isValid(final Object value, final ConstraintValidatorContext context) {
		return value != null && valids.contains(value.toString());
	}
}
