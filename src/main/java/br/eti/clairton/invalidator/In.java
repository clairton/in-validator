package br.eti.clairton.invalidator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Anotação para verificar se o valor é unico no banco de dados.
 * 
 * @author Clairton Rodrigo Heinzen<clairton.rodrigo@gmail.com>
 */
@Target({ TYPE, METHOD, FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { InValidator.class })
public @interface In {

	String message() default "{br.eti.clairton.invalidator.In.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String[] valids() default {};
}
