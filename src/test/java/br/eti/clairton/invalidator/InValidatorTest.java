package br.eti.clairton.invalidator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.annotation.Annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import javax.validation.groups.Default;

import org.junit.Before;
import org.junit.Test;

public class InValidatorTest {
	private final ConstraintValidator<In, Object> validator = new InValidator();
	private String[] valids = new String[]{"a", "b"};
	private final ConstraintValidatorContext context = null;
	private final In annotation = new In() {
		
		
		@Override
		public Class<? extends Annotation> annotationType() {
			return In.class;
		}
		
		@Override
		public String[] valids() {
			return valids;
		}
		
		@Override
		public Class<? extends Payload>[] payload() {
//			return new Class<? extends Payload>[] {};
			return null;
		}
		
		@Override
		public String message() {
			return "";
		}
		
		@Override
		public Class<?>[] groups() {
			return new Class<?>[]{Default.class};
		}
	};
	
	@Before
	public void init(){
		validator.initialize(annotation);		
	}
	

	@Test
	public void testIsValid() {
		assertTrue(validator.isValid("a", context));
	}
	

	@Test
	public void testIsInvalid() {
		assertFalse(validator.isValid("c", context));
	}
}
