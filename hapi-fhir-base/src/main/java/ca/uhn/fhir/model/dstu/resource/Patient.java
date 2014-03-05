















package ca.uhn.fhir.model.dstu.resource;

import java.util.*;
import ca.uhn.fhir.model.api.*;
import ca.uhn.fhir.model.api.annotation.*;
import ca.uhn.fhir.model.primitive.*;
import ca.uhn.fhir.model.dstu.composite.*;
import ca.uhn.fhir.model.dstu.valueset.*;

/**
 * HAPI/FHIR <b>Patient</b> Resource
 * (Information about a person or animal receiving health care services)
 *
 * <p>
 * <b>Definition:</b>
 * Demographics and other administrative information about a person or animal receiving care or other health-related services
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Tracking patient is the center of the healthcare process
 * </p> 
 */
@ResourceDef(name="Patient")
public class Patient extends BaseResource implements IResource {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>A patient identifier</b><br/>
	 * Type: <b>token</b><br/>
	 * Path: <b>Patient.identifier</b><br/>
	 * </p>
	 */
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * Search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>A portion of either family or given name of the patient</b><br/>
	 * Type: <b>string</b><br/>
	 * Path: <b>Patient.name</b><br/>
	 * </p>
	 */
	public static final String SP_NAME = "name";

	/**
	 * Search parameter constant for <b>family</b>
	 * <p>
	 * Description: <b>A portion of the family name of the patient</b><br/>
	 * Type: <b>string</b><br/>
	 * Path: <b>Patient.name.family</b><br/>
	 * </p>
	 */
	public static final String SP_FAMILY = "family";

	/**
	 * Search parameter constant for <b>given</b>
	 * <p>
	 * Description: <b>A portion of the given name of the patient</b><br/>
	 * Type: <b>string</b><br/>
	 * Path: <b>Patient.name.given</b><br/>
	 * </p>
	 */
	public static final String SP_GIVEN = "given";

	/**
	 * Search parameter constant for <b>phonetic</b>
	 * <p>
	 * Description: <b>A portion of either family or given name using some kind of phonetic matching algorithm</b><br/>
	 * Type: <b>string</b><br/>
	 * Path: <b></b><br/>
	 * </p>
	 */
	public static final String SP_PHONETIC = "phonetic";

	/**
	 * Search parameter constant for <b>telecom</b>
	 * <p>
	 * Description: <b>The value in any kind of telecom details of the patient</b><br/>
	 * Type: <b>string</b><br/>
	 * Path: <b>Patient.telecom</b><br/>
	 * </p>
	 */
	public static final String SP_TELECOM = "telecom";

	/**
	 * Search parameter constant for <b>address</b>
	 * <p>
	 * Description: <b>An address in any kind of address/part of the patient</b><br/>
	 * Type: <b>string</b><br/>
	 * Path: <b>Patient.address</b><br/>
	 * </p>
	 */
	public static final String SP_ADDRESS = "address";

	/**
	 * Search parameter constant for <b>gender</b>
	 * <p>
	 * Description: <b>Gender of the patient</b><br/>
	 * Type: <b>token</b><br/>
	 * Path: <b>Patient.gender</b><br/>
	 * </p>
	 */
	public static final String SP_GENDER = "gender";

	/**
	 * Search parameter constant for <b>language</b>
	 * <p>
	 * Description: <b>Language code (irrespective of use value)</b><br/>
	 * Type: <b>token</b><br/>
	 * Path: <b>Patient.communication</b><br/>
	 * </p>
	 */
	public static final String SP_LANGUAGE = "language";

	/**
	 * Search parameter constant for <b>birthdate</b>
	 * <p>
	 * Description: <b>The patient's date of birth</b><br/>
	 * Type: <b>date</b><br/>
	 * Path: <b>Patient.birthDate</b><br/>
	 * </p>
	 */
	public static final String SP_BIRTHDATE = "birthdate";

	/**
	 * Search parameter constant for <b>provider</b>
	 * <p>
	 * Description: <b>The organization at which this person is a patient</b><br/>
	 * Type: <b>reference</b><br/>
	 * Path: <b>Patient.managingOrganization</b><br/>
	 * </p>
	 */
	public static final String SP_PROVIDER = "provider";

	/**
	 * Search parameter constant for <b>active</b>
	 * <p>
	 * Description: <b>Whether the patient record is active</b><br/>
	 * Type: <b>token</b><br/>
	 * Path: <b>Patient.active</b><br/>
	 * </p>
	 */
	public static final String SP_ACTIVE = "active";

	/**
	 * Search parameter constant for <b>animal-species</b>
	 * <p>
	 * Description: <b>The species for animal patients</b><br/>
	 * Type: <b>token</b><br/>
	 * Path: <b>Patient.animal.species</b><br/>
	 * </p>
	 */
	public static final String SP_ANIMAL_SPECIES = "animal-species";

	/**
	 * Search parameter constant for <b>animal-breed</b>
	 * <p>
	 * Description: <b>The breed for animal patients</b><br/>
	 * Type: <b>token</b><br/>
	 * Path: <b>Patient.animal.breed</b><br/>
	 * </p>
	 */
	public static final String SP_ANIMAL_BREED = "animal-breed";

	/**
	 * Search parameter constant for <b>link</b>
	 * <p>
	 * Description: <b>All patients linked to the given patient</b><br/>
	 * Type: <b>reference</b><br/>
	 * Path: <b>Patient.link.other</b><br/>
	 * </p>
	 */
	public static final String SP_LINK = "link";


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED)	
	private List<IdentifierDt> myIdentifier;
	
	@Child(name="name", type=HumanNameDt.class, order=1, min=0, max=Child.MAX_UNLIMITED)	
	private List<HumanNameDt> myName;
	
	@Child(name="telecom", type=ContactDt.class, order=2, min=0, max=Child.MAX_UNLIMITED)	
	private List<ContactDt> myTelecom;
	
	@Child(name="gender", type=CodeableConceptDt.class, order=3, min=0, max=1)	
	private CodeableConceptDt myGender;
	
	@Child(name="birthDate", type=DateTimeDt.class, order=4, min=0, max=1)	
	private DateTimeDt myBirthDate;
	
	@Child(name="deceased", order=5, min=0, max=1, choice=@Choice(types= {
		BooleanDt.class,
		DateTimeDt.class,
	}))	
	private IDatatype myDeceased;
	
	@Child(name="address", type=AddressDt.class, order=6, min=0, max=Child.MAX_UNLIMITED)	
	private List<AddressDt> myAddress;
	
	@Child(name="maritalStatus", type=CodeableConceptDt.class, order=7, min=0, max=1)	
	private CodeableConceptDt myMaritalStatus;
	
	@Child(name="multipleBirth", order=8, min=0, max=1, choice=@Choice(types= {
		BooleanDt.class,
		IntegerDt.class,
	}))	
	private IDatatype myMultipleBirth;
	
	@Child(name="photo", type=AttachmentDt.class, order=9, min=0, max=Child.MAX_UNLIMITED)	
	private List<AttachmentDt> myPhoto;
	
	@Child(name="contact", order=10, min=0, max=Child.MAX_UNLIMITED)	
	private List<Contact> myContact;
	
	@Child(name="animal", order=11, min=0, max=1)	
	private Animal myAnimal;
	
	@Child(name="communication", type=CodeableConceptDt.class, order=12, min=0, max=Child.MAX_UNLIMITED)	
	private List<CodeableConceptDt> myCommunication;
	
	@Child(name="careProvider", order=13, min=0, max=Child.MAX_UNLIMITED)
	@ChildResource(types= {
		Organization.class,
		Practitioner.class,
	})	
	private List<ResourceReference> myCareProvider;
	
	@Child(name="managingOrganization", order=14, min=0, max=1)
	@ChildResource(types= {
		Organization.class,
	})	
	private ResourceReference myManagingOrganization;
	
	@Child(name="link", order=15, min=0, max=Child.MAX_UNLIMITED)	
	private List<Link> myLink;
	
	@Child(name="active", type=BooleanDt.class, order=16, min=0, max=1)	
	private BooleanDt myActive;
	
	/**
	 * Gets the value(s) for <b>identifier</b> (An identifier for the person as this patient).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that applies to this person as a patient
     * </p> 
	 */
	public List<IdentifierDt> getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new ArrayList<IdentifierDt>();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> (An identifier for the person as this patient)
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that applies to this person as a patient
     * </p> 
	 */
	public void setIdentifier(List<IdentifierDt> theValue) {
		myIdentifier = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>name</b> (A name associated with the patient).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A name associated with the individual. 
     * </p> 
	 */
	public List<HumanNameDt> getName() {  
		if (myName == null) {
			myName = new ArrayList<HumanNameDt>();
		}
		return myName;
	}

	/**
	 * Sets the value(s) for <b>name</b> (A name associated with the patient)
	 *
     * <p>
     * <b>Definition:</b>
     * A name associated with the individual. 
     * </p> 
	 */
	public void setName(List<HumanNameDt> theValue) {
		myName = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>telecom</b> (A contact detail for the individual).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted. 
     * </p> 
	 */
	public List<ContactDt> getTelecom() {  
		if (myTelecom == null) {
			myTelecom = new ArrayList<ContactDt>();
		}
		return myTelecom;
	}

	/**
	 * Sets the value(s) for <b>telecom</b> (A contact detail for the individual)
	 *
     * <p>
     * <b>Definition:</b>
     * A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted. 
     * </p> 
	 */
	public void setTelecom(List<ContactDt> theValue) {
		myTelecom = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>gender</b> (Gender for administrative purposes).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes. 
     * </p> 
	 */
	public CodeableConceptDt getGender() {  
		if (myGender == null) {
			myGender = new CodeableConceptDt();
		}
		return myGender;
	}

	/**
	 * Sets the value(s) for <b>gender</b> (Gender for administrative purposes)
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes. 
     * </p> 
	 */
	public void setGender(CodeableConceptDt theValue) {
		myGender = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>birthDate</b> (The date and time of birth for the individual).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time of birth for the individual
     * </p> 
	 */
	public DateTimeDt getBirthDate() {  
		if (myBirthDate == null) {
			myBirthDate = new DateTimeDt();
		}
		return myBirthDate;
	}

	/**
	 * Sets the value(s) for <b>birthDate</b> (The date and time of birth for the individual)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time of birth for the individual
     * </p> 
	 */
	public void setBirthDate(DateTimeDt theValue) {
		myBirthDate = theValue;
	}

 	/**
	 * Sets the value(s) for <b>birthDate</b> (The date and time of birth for the individual)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time of birth for the individual
     * </p> 
	 */
	public void setBirthDateWithSecondsPrecision( Date theDate) {
		myBirthDate = new DateTimeDt(theDate); 
	}
 
	/**
	 * Gets the value(s) for <b>deceased[x]</b> (Indicates if the individual is deceased or not).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates if the individual is deceased or not
     * </p> 
	 */
	public IDatatype getDeceased() {  
		return myDeceased;
	}

	/**
	 * Sets the value(s) for <b>deceased[x]</b> (Indicates if the individual is deceased or not)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates if the individual is deceased or not
     * </p> 
	 */
	public void setDeceased(IDatatype theValue) {
		myDeceased = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>address</b> (Addresses for the individual).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Addresses for the individual
     * </p> 
	 */
	public List<AddressDt> getAddress() {  
		if (myAddress == null) {
			myAddress = new ArrayList<AddressDt>();
		}
		return myAddress;
	}

	/**
	 * Sets the value(s) for <b>address</b> (Addresses for the individual)
	 *
     * <p>
     * <b>Definition:</b>
     * Addresses for the individual
     * </p> 
	 */
	public void setAddress(List<AddressDt> theValue) {
		myAddress = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>maritalStatus</b> (Marital (civil) status of a person).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This field contains a patient's most recent marital (civil) status.
     * </p> 
	 */
	public CodeableConceptDt getMaritalStatus() {  
		if (myMaritalStatus == null) {
			myMaritalStatus = new CodeableConceptDt();
		}
		return myMaritalStatus;
	}

	/**
	 * Sets the value(s) for <b>maritalStatus</b> (Marital (civil) status of a person)
	 *
     * <p>
     * <b>Definition:</b>
     * This field contains a patient's most recent marital (civil) status.
     * </p> 
	 */
	public void setMaritalStatus(CodeableConceptDt theValue) {
		myMaritalStatus = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>multipleBirth[x]</b> (Whether patient is part of a multiple birth).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the patient is part of a multiple or indicates the actual birth order.
     * </p> 
	 */
	public IDatatype getMultipleBirth() {  
		return myMultipleBirth;
	}

	/**
	 * Sets the value(s) for <b>multipleBirth[x]</b> (Whether patient is part of a multiple birth)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the patient is part of a multiple or indicates the actual birth order.
     * </p> 
	 */
	public void setMultipleBirth(IDatatype theValue) {
		myMultipleBirth = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>photo</b> (Image of the person).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Image of the person
     * </p> 
	 */
	public List<AttachmentDt> getPhoto() {  
		if (myPhoto == null) {
			myPhoto = new ArrayList<AttachmentDt>();
		}
		return myPhoto;
	}

	/**
	 * Sets the value(s) for <b>photo</b> (Image of the person)
	 *
     * <p>
     * <b>Definition:</b>
     * Image of the person
     * </p> 
	 */
	public void setPhoto(List<AttachmentDt> theValue) {
		myPhoto = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>contact</b> (A contact party (e.g. guardian, partner, friend) for the patient).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A contact party (e.g. guardian, partner, friend) for the patient
     * </p> 
	 */
	public List<Contact> getContact() {  
		if (myContact == null) {
			myContact = new ArrayList<Contact>();
		}
		return myContact;
	}

	/**
	 * Sets the value(s) for <b>contact</b> (A contact party (e.g. guardian, partner, friend) for the patient)
	 *
     * <p>
     * <b>Definition:</b>
     * A contact party (e.g. guardian, partner, friend) for the patient
     * </p> 
	 */
	public void setContact(List<Contact> theValue) {
		myContact = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>animal</b> (If this patient is an animal (non-human)).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This element has a value if the patient is an animal
     * </p> 
	 */
	public Animal getAnimal() {  
		if (myAnimal == null) {
			myAnimal = new Animal();
		}
		return myAnimal;
	}

	/**
	 * Sets the value(s) for <b>animal</b> (If this patient is an animal (non-human))
	 *
     * <p>
     * <b>Definition:</b>
     * This element has a value if the patient is an animal
     * </p> 
	 */
	public void setAnimal(Animal theValue) {
		myAnimal = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>communication</b> (Languages which may be used to communicate with the patient about his or her health).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Languages which may be used to communicate with the patient about his or her health
     * </p> 
	 */
	public List<CodeableConceptDt> getCommunication() {  
		if (myCommunication == null) {
			myCommunication = new ArrayList<CodeableConceptDt>();
		}
		return myCommunication;
	}

	/**
	 * Sets the value(s) for <b>communication</b> (Languages which may be used to communicate with the patient about his or her health)
	 *
     * <p>
     * <b>Definition:</b>
     * Languages which may be used to communicate with the patient about his or her health
     * </p> 
	 */
	public void setCommunication(List<CodeableConceptDt> theValue) {
		myCommunication = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>careProvider</b> (Patient's nominated care provider).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Patient's nominated care provider
     * </p> 
	 */
	public List<ResourceReference> getCareProvider() {  
		return myCareProvider;
	}

	/**
	 * Sets the value(s) for <b>careProvider</b> (Patient's nominated care provider)
	 *
     * <p>
     * <b>Definition:</b>
     * Patient's nominated care provider
     * </p> 
	 */
	public void setCareProvider(List<ResourceReference> theValue) {
		myCareProvider = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>managingOrganization</b> (Organization that is the custodian of the patient record).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Organization that is the custodian of the patient record
     * </p> 
	 */
	public ResourceReference getManagingOrganization() {  
		if (myManagingOrganization == null) {
			myManagingOrganization = new ResourceReference();
		}
		return myManagingOrganization;
	}

	/**
	 * Sets the value(s) for <b>managingOrganization</b> (Organization that is the custodian of the patient record)
	 *
     * <p>
     * <b>Definition:</b>
     * Organization that is the custodian of the patient record
     * </p> 
	 */
	public void setManagingOrganization(ResourceReference theValue) {
		myManagingOrganization = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>link</b> (Link to another patient resource that concerns the same actual person).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Link to another patient resource that concerns the same actual person
     * </p> 
	 */
	public List<Link> getLink() {  
		if (myLink == null) {
			myLink = new ArrayList<Link>();
		}
		return myLink;
	}

	/**
	 * Sets the value(s) for <b>link</b> (Link to another patient resource that concerns the same actual person)
	 *
     * <p>
     * <b>Definition:</b>
     * Link to another patient resource that concerns the same actual person
     * </p> 
	 */
	public void setLink(List<Link> theValue) {
		myLink = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>active</b> (Whether this patient's record is in active use).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this patient record is in active use
     * </p> 
	 */
	public BooleanDt getActive() {  
		if (myActive == null) {
			myActive = new BooleanDt();
		}
		return myActive;
	}

	/**
	 * Sets the value(s) for <b>active</b> (Whether this patient's record is in active use)
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this patient record is in active use
     * </p> 
	 */
	public void setActive(BooleanDt theValue) {
		myActive = theValue;
	}

  
	/**
	 * Block class for child element: <b>Patient.contact</b> (A contact party (e.g. guardian, partner, friend) for the patient)
	 *
     * <p>
     * <b>Definition:</b>
     * A contact party (e.g. guardian, partner, friend) for the patient
     * </p> 
	 */
	@Block(name="Patient.contact")	
	public static class Contact extends BaseElement implements IResourceBlock {
	
	@Child(name="relationship", type=CodeableConceptDt.class, order=0, min=0, max=Child.MAX_UNLIMITED)	
	private List<CodeableConceptDt> myRelationship;
	
	@Child(name="name", type=HumanNameDt.class, order=1, min=0, max=1)	
	private HumanNameDt myName;
	
	@Child(name="telecom", type=ContactDt.class, order=2, min=0, max=Child.MAX_UNLIMITED)	
	private List<ContactDt> myTelecom;
	
	@Child(name="address", type=AddressDt.class, order=3, min=0, max=1)	
	private AddressDt myAddress;
	
	@Child(name="gender", type=CodeableConceptDt.class, order=4, min=0, max=1)	
	private CodeableConceptDt myGender;
	
	@Child(name="organization", order=5, min=0, max=1)
	@ChildResource(types= {
		Organization.class,
	})	
	private ResourceReference myOrganization;
	
	/**
	 * Gets the value(s) for <b>relationship</b> (The kind of relationship).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The nature of the relationship between the patient and the contact person
     * </p> 
	 */
	public List<CodeableConceptDt> getRelationship() {  
		if (myRelationship == null) {
			myRelationship = new ArrayList<CodeableConceptDt>();
		}
		return myRelationship;
	}

	/**
	 * Sets the value(s) for <b>relationship</b> (The kind of relationship)
	 *
     * <p>
     * <b>Definition:</b>
     * The nature of the relationship between the patient and the contact person
     * </p> 
	 */
	public void setRelationship(List<CodeableConceptDt> theValue) {
		myRelationship = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>name</b> (A name associated with the person).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A name associated with the person
     * </p> 
	 */
	public HumanNameDt getName() {  
		if (myName == null) {
			myName = new HumanNameDt();
		}
		return myName;
	}

	/**
	 * Sets the value(s) for <b>name</b> (A name associated with the person)
	 *
     * <p>
     * <b>Definition:</b>
     * A name associated with the person
     * </p> 
	 */
	public void setName(HumanNameDt theValue) {
		myName = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>telecom</b> (A contact detail for the person).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A contact detail for the person, e.g. a telephone number or an email address.
     * </p> 
	 */
	public List<ContactDt> getTelecom() {  
		if (myTelecom == null) {
			myTelecom = new ArrayList<ContactDt>();
		}
		return myTelecom;
	}

	/**
	 * Sets the value(s) for <b>telecom</b> (A contact detail for the person)
	 *
     * <p>
     * <b>Definition:</b>
     * A contact detail for the person, e.g. a telephone number or an email address.
     * </p> 
	 */
	public void setTelecom(List<ContactDt> theValue) {
		myTelecom = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>address</b> (Address for the contact person).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Address for the contact person
     * </p> 
	 */
	public AddressDt getAddress() {  
		if (myAddress == null) {
			myAddress = new AddressDt();
		}
		return myAddress;
	}

	/**
	 * Sets the value(s) for <b>address</b> (Address for the contact person)
	 *
     * <p>
     * <b>Definition:</b>
     * Address for the contact person
     * </p> 
	 */
	public void setAddress(AddressDt theValue) {
		myAddress = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>gender</b> (Gender for administrative purposes).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes. 
     * </p> 
	 */
	public CodeableConceptDt getGender() {  
		if (myGender == null) {
			myGender = new CodeableConceptDt();
		}
		return myGender;
	}

	/**
	 * Sets the value(s) for <b>gender</b> (Gender for administrative purposes)
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes. 
     * </p> 
	 */
	public void setGender(CodeableConceptDt theValue) {
		myGender = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>organization</b> (Organization that is associated with the contact).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Organization on behalf of which the contact is acting or for which the contact is working.
     * </p> 
	 */
	public ResourceReference getOrganization() {  
		if (myOrganization == null) {
			myOrganization = new ResourceReference();
		}
		return myOrganization;
	}

	/**
	 * Sets the value(s) for <b>organization</b> (Organization that is associated with the contact)
	 *
     * <p>
     * <b>Definition:</b>
     * Organization on behalf of which the contact is acting or for which the contact is working.
     * </p> 
	 */
	public void setOrganization(ResourceReference theValue) {
		myOrganization = theValue;
	}

  

	}


	/**
	 * Block class for child element: <b>Patient.animal</b> (If this patient is an animal (non-human))
	 *
     * <p>
     * <b>Definition:</b>
     * This element has a value if the patient is an animal
     * </p> 
	 */
	@Block(name="Patient.animal")	
	public static class Animal extends BaseElement implements IResourceBlock {
	
	@Child(name="species", type=CodeableConceptDt.class, order=0, min=1, max=1)	
	private CodeableConceptDt mySpecies;
	
	@Child(name="breed", type=CodeableConceptDt.class, order=1, min=0, max=1)	
	private CodeableConceptDt myBreed;
	
	@Child(name="genderStatus", type=CodeableConceptDt.class, order=2, min=0, max=1)	
	private CodeableConceptDt myGenderStatus;
	
	/**
	 * Gets the value(s) for <b>species</b> (E.g. Dog, Cow).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the high level categorization of the kind of animal
     * </p> 
	 */
	public CodeableConceptDt getSpecies() {  
		if (mySpecies == null) {
			mySpecies = new CodeableConceptDt();
		}
		return mySpecies;
	}

	/**
	 * Sets the value(s) for <b>species</b> (E.g. Dog, Cow)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the high level categorization of the kind of animal
     * </p> 
	 */
	public void setSpecies(CodeableConceptDt theValue) {
		mySpecies = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>breed</b> (E.g. Poodle, Angus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the detailed categorization of the kind of animal.
     * </p> 
	 */
	public CodeableConceptDt getBreed() {  
		if (myBreed == null) {
			myBreed = new CodeableConceptDt();
		}
		return myBreed;
	}

	/**
	 * Sets the value(s) for <b>breed</b> (E.g. Poodle, Angus)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the detailed categorization of the kind of animal.
     * </p> 
	 */
	public void setBreed(CodeableConceptDt theValue) {
		myBreed = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>genderStatus</b> (E.g. Neutered, Intact).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the current state of the animal's reproductive organs
     * </p> 
	 */
	public CodeableConceptDt getGenderStatus() {  
		if (myGenderStatus == null) {
			myGenderStatus = new CodeableConceptDt();
		}
		return myGenderStatus;
	}

	/**
	 * Sets the value(s) for <b>genderStatus</b> (E.g. Neutered, Intact)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the current state of the animal's reproductive organs
     * </p> 
	 */
	public void setGenderStatus(CodeableConceptDt theValue) {
		myGenderStatus = theValue;
	}

  

	}


	/**
	 * Block class for child element: <b>Patient.link</b> (Link to another patient resource that concerns the same actual person)
	 *
     * <p>
     * <b>Definition:</b>
     * Link to another patient resource that concerns the same actual person
     * </p> 
	 */
	@Block(name="Patient.link")	
	public static class Link extends BaseElement implements IResourceBlock {
	
	@Child(name="other", order=0, min=1, max=1)
	@ChildResource(types= {
		Patient.class,
	})	
	private ResourceReference myOther;
	
	@Child(name="type", type=CodeDt.class, order=1, min=1, max=1)	
	private BoundCodeDt<LinkTypeEnum> myType;
	
	/**
	 * Gets the value(s) for <b>other</b> (The other patient resource that the link refers to).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The other patient resource that the link refers to
     * </p> 
	 */
	public ResourceReference getOther() {  
		if (myOther == null) {
			myOther = new ResourceReference();
		}
		return myOther;
	}

	/**
	 * Sets the value(s) for <b>other</b> (The other patient resource that the link refers to)
	 *
     * <p>
     * <b>Definition:</b>
     * The other patient resource that the link refers to
     * </p> 
	 */
	public void setOther(ResourceReference theValue) {
		myOther = theValue;
	}

  
	/**
	 * Gets the value(s) for <b>type</b> (replace | refer | seealso - type of link).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of link between this patient resource and another patient resource.
     * </p> 
	 */
	public BoundCodeDt<LinkTypeEnum> getType() {  
		if (myType == null) {
			myType = new BoundCodeDt<LinkTypeEnum>(LinkTypeEnum.VALUESET_BINDER);
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> (replace | refer | seealso - type of link)
	 *
     * <p>
     * <b>Definition:</b>
     * The type of link between this patient resource and another patient resource.
     * </p> 
	 */
	public void setType(BoundCodeDt<LinkTypeEnum> theValue) {
		myType = theValue;
	}

	/**
	 * Sets the value(s) for <b>type</b> (replace | refer | seealso - type of link)
	 *
     * <p>
     * <b>Definition:</b>
     * The type of link between this patient resource and another patient resource.
     * </p> 
	 */
	public void setType(LinkTypeEnum theValue) {
		getType().setValueAsEnum(theValue);
	}

  

	}




}