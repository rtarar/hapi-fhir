package ca.uhn.fhir.tinder.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.validator.ISBNValidator;
import org.codehaus.plexus.util.StringUtils;

public class ValueSetTm {

	private String myClassName;
	private List<Code> myCodes = new ArrayList<Code>();
	private String myDescription;
	private String myId;
	private String myName;

	public void addConcept(String theCode, String theText, String theDefinition) {
		myCodes.add(new Code(theCode, theText, theDefinition));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ValueSetTm other = (ValueSetTm) obj;
		if (myId == null) {
			if (other.myId != null)
				return false;
		} else if (!myId.equals(other.myId))
			return false;
		return true;
	}

	public String getClassName() {
		return myClassName;
	}

	public List<Code> getCodes() {
		return myCodes;
	}

	public String getDescription() {
		return StringUtils.defaultString(myDescription);
	}

	public String getId() {
		return myId;
	}

	public String getName() {
		return StringUtils.defaultString(myName);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myId == null) ? 0 : myId.hashCode());
		return result;
	}

	public void setClassName(String theClassName) {
		myClassName = theClassName;
	}

	public void setCodes(List<Code> theCodes) {
		myCodes = theCodes;
	}

	public void setDescription(String theDescription) {
		myDescription = theDescription;
	}

	public void setId(String theId) {
		myId = theId;
	}

	public void setName(String theName) {
		myName = theName;
	}

	public static class Code {

		private String myCode;
		private String myDefinition;
		private String myDisplay;

		public Code(String theCode, String theDisplay, String theDefinition) {
			myCode = theCode.trim();
			myDisplay = theDisplay;
			myDefinition = theDefinition;
		}

		public String getCode() {
			return myCode;
		}

		public String getCodeEnumValue() {
			String retVal = myDisplay;
			if (StringUtils.isBlank(retVal)) {
				retVal = myCode;
			}
						
			if ("=".equals(retVal)) {
				retVal = "EQUALS";
			}
			if ("<=".equals(retVal)) {
				retVal = "LESSTHAN_OR_EQUALS";
			}
			if ("<".equals(retVal)) {
				retVal = "LESSTHAN";
			}
			if (">=".equals(retVal)) {
				retVal = "GREATERTHAN_OR_EQUALS";
			}
			if (">".equals(retVal)) {
				retVal = "GREATERTHAN";
			}

			StringBuilder b = new StringBuilder();
			for (char next : retVal.toUpperCase().replace("'", "").replace("(", "").replace(")", "").toCharArray()) {
				if (Character.isJavaIdentifierPart(next)) {
					b.append(next);
				}else {
					b.append("_");
				}
			}
			retVal = b.toString();

			if (!Character.isJavaIdentifierStart(retVal.charAt(0))) {
				retVal = '_' + retVal;
			}

			return retVal;
		}

		public String getDefinition() {
			return myDefinition;
		}

		public String getDisplay() {
			return myDisplay;
		}

		public boolean isHasDefinition() {
			return StringUtils.isNotBlank(myDefinition);
		}

		public boolean isHasDisplay() {
			return StringUtils.isNotBlank(myDisplay);
		}

	}

}
