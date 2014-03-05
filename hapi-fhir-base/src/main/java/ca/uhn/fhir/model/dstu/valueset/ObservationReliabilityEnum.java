
package ca.uhn.fhir.model.dstu.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum ObservationReliabilityEnum {

	/**
	 * Code Value: <b>ok</b>
	 *
	 * The result has no reliability concerns.
	 */
	OK("ok"),
	
	/**
	 * Code Value: <b>ongoing</b>
	 *
	 * An early estimate of value; measurement is still occurring.
	 */
	ONGOING("ongoing"),
	
	/**
	 * Code Value: <b>early</b>
	 *
	 * An early estimate of value; processing is still occurring.
	 */
	EARLY("early"),
	
	/**
	 * Code Value: <b>questionable</b>
	 *
	 * The observation value should be treated with care.
	 */
	QUESTIONABLE("questionable"),
	
	/**
	 * Code Value: <b>calibrating</b>
	 *
	 * The result has been generated while calibration is occurring.
	 */
	CALIBRATING("calibrating"),
	
	/**
	 * Code Value: <b>error</b>
	 *
	 * The observation could not be completed because of an error.
	 */
	ERROR("error"),
	
	/**
	 * Code Value: <b>unknown</b>
	 *
	 * No observation value was available.
	 */
	UNKNOWN("unknown"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * http://hl7.org/fhir/vs/observation-reliability
	 */
	public static final String VALUESET_IDENTIFIER = "http://hl7.org/fhir/vs/observation-reliability";

	/**
	 * Name for this Value Set:
	 * ObservationReliability
	 */
	public static final String VALUESET_NAME = "ObservationReliability";

	private static Map<String, ObservationReliabilityEnum> CODE_TO_ENUM = new HashMap<String, ObservationReliabilityEnum>();
	private String myCode;
	
	static {
		for (ObservationReliabilityEnum next : ObservationReliabilityEnum.values()) {
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
	public ObservationReliabilityEnum forCode(String theCode) {
		ObservationReliabilityEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ObservationReliabilityEnum> VALUESET_BINDER = new IValueSetEnumBinder<ObservationReliabilityEnum>() {
		@Override
		public String toCodeString(ObservationReliabilityEnum theEnum) {
			return theEnum.getCode();
		}
		
		@Override
		public ObservationReliabilityEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
	};
	
	/** 
	 * Constructor
	 */
	ObservationReliabilityEnum(String theCode) {
		myCode = theCode;
	}

	
}
