
package ca.uhn.fhir.model.dstu.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum PractitionerSpecialtyEnum {

	/**
	 * Display: <b>Cardiologist</b><br/>
	 * Code Value: <b>cardio</b>
	 */
	CARDIOLOGIST("cardio"),
	
	/**
	 * Display: <b>Dentist</b><br/>
	 * Code Value: <b>dent</b>
	 */
	DENTIST("dent"),
	
	/**
	 * Display: <b>Dietary consultant</b><br/>
	 * Code Value: <b>dietary</b>
	 */
	DIETARY_CONSULTANT("dietary"),
	
	/**
	 * Display: <b>Midwife</b><br/>
	 * Code Value: <b>midw</b>
	 */
	MIDWIFE("midw"),
	
	/**
	 * Display: <b>Systems architect</b><br/>
	 * Code Value: <b>sysarch</b>
	 */
	SYSTEMS_ARCHITECT("sysarch"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * http://hl7.org/fhir/vs/practitioner-specialty
	 */
	public static final String VALUESET_IDENTIFIER = "http://hl7.org/fhir/vs/practitioner-specialty";

	/**
	 * Name for this Value Set:
	 * PractitionerSpecialty
	 */
	public static final String VALUESET_NAME = "PractitionerSpecialty";

	private static Map<String, PractitionerSpecialtyEnum> CODE_TO_ENUM = new HashMap<String, PractitionerSpecialtyEnum>();
	private String myCode;
	
	static {
		for (PractitionerSpecialtyEnum next : PractitionerSpecialtyEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
		}
	}
	
	/**
	 * Returns the code associated with this enumerated value
	 */
	public String getCode() {
		return myCode;
	}
	
	/**
	 * Returns the enumerated value associated with this code
	 */
	public PractitionerSpecialtyEnum forCode(String theCode) {
		PractitionerSpecialtyEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<PractitionerSpecialtyEnum> VALUESET_BINDER = new IValueSetEnumBinder<PractitionerSpecialtyEnum>() {
		@Override
		public String toCodeString(PractitionerSpecialtyEnum theEnum) {
			return theEnum.getCode();
		}
		
		@Override
		public PractitionerSpecialtyEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
	};
	
	/** 
	 * Constructor
	 */
	PractitionerSpecialtyEnum(String theCode) {
		myCode = theCode;
	}

	
}
