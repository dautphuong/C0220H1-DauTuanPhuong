package model;

import java.util.Date;

public class Personal {
	private int PERSONAL_ID;
	private String 	EMPLOYEE_ID;
	private String CURRENT_FIRST_NAME;
	private String CURRENT_LAST_NAME;
	private String CURRENT_MIDDLE_NAME;
	private Date BIRTH_DATE;
	private String CURRENT_ADDRESS_1;
	private String CURRENT_CITY;
	private String CURRENT_COUNTRY;
	private String CURRENT_PHONE_NUMBER;
	private String CURRENT_GENDER;
	private String CURRENT_PERSONAL_EMAIL;
	private Employee_Working employee_Working;
	private String ETHNICITY;
	private int SHAREHOLDER_STATUS;
	private int BENEFIT_PLANS;
	private String DEPARTMENT;
	private String DIVISION;
	public Personal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personal(int pERSONAL_ID, String eMPLOYEE_ID, String cURRENT_FIRST_NAME, String cURRENT_LAST_NAME,
			String cURRENT_MIDDLE_NAME, Date bIRTH_DATE, String cURRENT_COUNTRY, String cURRENT_PHONE_NUMBER,
			String cURRENT_GENDER, String cURRENT_PERSONAL_EMAIL) {
		super();
		PERSONAL_ID = pERSONAL_ID;
		EMPLOYEE_ID = eMPLOYEE_ID;
		CURRENT_FIRST_NAME = cURRENT_FIRST_NAME;
		CURRENT_LAST_NAME = cURRENT_LAST_NAME;
		CURRENT_MIDDLE_NAME = cURRENT_MIDDLE_NAME;
		BIRTH_DATE = bIRTH_DATE;
		CURRENT_COUNTRY = cURRENT_COUNTRY;
		CURRENT_PHONE_NUMBER = cURRENT_PHONE_NUMBER;
		CURRENT_GENDER = cURRENT_GENDER;
		CURRENT_PERSONAL_EMAIL = cURRENT_PERSONAL_EMAIL;
	}
	public Personal(int pERSONAL_ID, String eMPLOYEE_ID, String cURRENT_FIRST_NAME, String cURRENT_LAST_NAME,
			String cURRENT_MIDDLE_NAME, Date bIRTH_DATE, String cURRENT_COUNTRY, String cURRENT_PHONE_NUMBER,
			String cURRENT_GENDER, String cURRENT_PERSONAL_EMAIL,String dEPARTMENT,String dIVISION) {
		super();
		PERSONAL_ID = pERSONAL_ID;
		EMPLOYEE_ID = eMPLOYEE_ID;
		CURRENT_FIRST_NAME = cURRENT_FIRST_NAME;
		CURRENT_LAST_NAME = cURRENT_LAST_NAME;
		CURRENT_MIDDLE_NAME = cURRENT_MIDDLE_NAME;
		BIRTH_DATE = bIRTH_DATE;
		CURRENT_COUNTRY = cURRENT_COUNTRY;
		CURRENT_PHONE_NUMBER = cURRENT_PHONE_NUMBER;
		CURRENT_GENDER = cURRENT_GENDER;
		CURRENT_PERSONAL_EMAIL = cURRENT_PERSONAL_EMAIL;
		DEPARTMENT = dEPARTMENT;
		DIVISION  = dIVISION;
	}
	
	
	
	public Personal(int pERSONAL_ID, String eMPLOYEE_ID, String cURRENT_FIRST_NAME, String cURRENT_LAST_NAME,
			String cURRENT_MIDDLE_NAME, Date bIRTH_DATE, String cURRENT_COUNTRY, String cURRENT_PHONE_NUMBER,
			String cURRENT_GENDER, String cURRENT_PERSONAL_EMAIL,int sHAREHOLDER_STATUS,String eTHNICITY) {
		super();
		PERSONAL_ID = pERSONAL_ID;
		EMPLOYEE_ID = eMPLOYEE_ID;
		CURRENT_FIRST_NAME = cURRENT_FIRST_NAME;
		CURRENT_LAST_NAME = cURRENT_LAST_NAME;
		CURRENT_MIDDLE_NAME = cURRENT_MIDDLE_NAME;
		BIRTH_DATE = bIRTH_DATE;
		CURRENT_COUNTRY = cURRENT_COUNTRY;
		CURRENT_PHONE_NUMBER = cURRENT_PHONE_NUMBER;
		CURRENT_GENDER = cURRENT_GENDER;
		CURRENT_PERSONAL_EMAIL = cURRENT_PERSONAL_EMAIL;
		SHAREHOLDER_STATUS = sHAREHOLDER_STATUS;
		ETHNICITY = eTHNICITY;
		
		
	}
	public Personal(int pERSONAL_ID, String eMPLOYEE_ID, String cURRENT_FIRST_NAME, String cURRENT_LAST_NAME,
			String cURRENT_MIDDLE_NAME, Date bIRTH_DATE,String cURRENT_ADDRESS_1,String cURRENT_CITY, String cURRENT_COUNTRY, String cURRENT_PHONE_NUMBER,
			String cURRENT_GENDER, String cURRENT_PERSONAL_EMAIL,int sHAREHOLDER_STATUS,String eTHNICITY,int bENEFIT_PLANS) {
		super();
		PERSONAL_ID = pERSONAL_ID;
		EMPLOYEE_ID = eMPLOYEE_ID;
		CURRENT_FIRST_NAME = cURRENT_FIRST_NAME;
		CURRENT_LAST_NAME = cURRENT_LAST_NAME;
		CURRENT_MIDDLE_NAME = cURRENT_MIDDLE_NAME;
		BIRTH_DATE = bIRTH_DATE;
		CURRENT_ADDRESS_1 = cURRENT_ADDRESS_1;
		CURRENT_CITY = cURRENT_CITY;
		CURRENT_COUNTRY = cURRENT_COUNTRY;
		CURRENT_PHONE_NUMBER = cURRENT_PHONE_NUMBER;
		CURRENT_GENDER = cURRENT_GENDER;
		CURRENT_PERSONAL_EMAIL = cURRENT_PERSONAL_EMAIL;
		SHAREHOLDER_STATUS = sHAREHOLDER_STATUS;
		ETHNICITY = eTHNICITY;
		BENEFIT_PLANS =bENEFIT_PLANS;
	}
	
	
	
	
	public String getDIVISION() {
		return DIVISION;
	}
	public void setDIVISION(String dIVISION) {
		DIVISION = dIVISION;
	}
	public String getDEPARTMENT() {
		return DEPARTMENT;
	}
	public void setDEPARTMENT(String dEPARTMENT) {
		DEPARTMENT = dEPARTMENT;
	}
	public int getBENEFIT_PLANS() {
		return BENEFIT_PLANS;
	}
	public void setBENEFIT_PLANS(int bENEFIT_PLANS) {
		BENEFIT_PLANS = bENEFIT_PLANS;
	}
	public String getETHNICITY() {
		return ETHNICITY;
	}
	public void setETHNICITY(String eTHNICITY) {
		ETHNICITY = eTHNICITY;
	}
	public int getSHAREHOLDER_STATUS() {
		return SHAREHOLDER_STATUS;
	}
	public void setSHAREHOLDER_STATUS(int sHAREHOLDER_STATUS) {
		SHAREHOLDER_STATUS = sHAREHOLDER_STATUS;
	}
	public int getPERSONAL_ID() {
		return PERSONAL_ID;
	}
	public void setPERSONAL_ID(int pERSONAL_ID) {
		PERSONAL_ID = pERSONAL_ID;
	}
	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(String eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public String getCURRENT_FIRST_NAME() {
		return CURRENT_FIRST_NAME;
	}
	public void setCURRENT_FIRST_NAME(String cURRENT_FIRST_NAME) {
		CURRENT_FIRST_NAME = cURRENT_FIRST_NAME;
	}
	public String getCURRENT_LAST_NAME() {
		return CURRENT_LAST_NAME;
	}
	public void setCURRENT_LAST_NAME(String cURRENT_LAST_NAME) {
		CURRENT_LAST_NAME = cURRENT_LAST_NAME;
	}
	public String getCURRENT_MIDDLE_NAME() {
		return CURRENT_MIDDLE_NAME;
	}
	public void setCURRENT_MIDDLE_NAME(String cURRENT_MIDDLE_NAME) {
		CURRENT_MIDDLE_NAME = cURRENT_MIDDLE_NAME;
	}
	public Date getBIRTH_DATE() {
		return BIRTH_DATE;
	}
	public void setBIRTH_DATE(Date BIRTH_DATE) {
		BIRTH_DATE = BIRTH_DATE;
	}
	public String getCURRENT_COUNTRY() {
		return CURRENT_COUNTRY;
	}
	public void setCURRENT_COUNTRY(String cURRENT_COUNTRY) {
		CURRENT_COUNTRY = cURRENT_COUNTRY;
	}
	public String getCURRENT_PHONE_NUMBER() {
		return CURRENT_PHONE_NUMBER;
	}
	public void setCURRENT_PHONE_NUMBER(String cURRENT_PHONE_NUMBER) {
		CURRENT_PHONE_NUMBER = cURRENT_PHONE_NUMBER;
	}
	public String getCURRENT_GENDER() {
		return CURRENT_GENDER;
	}
	public void setCURRENT_GENDER(String cURRENT_GENDER) {
		CURRENT_GENDER = cURRENT_GENDER;
	}
	public String getCURRENT_PERSONAL_EMAIL() {
		return CURRENT_PERSONAL_EMAIL;
	}
	public void setCURRENT_PERSONAL_EMAIL(String cURRENT_PERSONAL_EMAIL) {
		CURRENT_PERSONAL_EMAIL = cURRENT_PERSONAL_EMAIL;
	}
	
	public Personal(int pERSONAL_ID, String eMPLOYEE_ID, String cURRENT_FIRST_NAME, String cURRENT_LAST_NAME,
			String cURRENT_MIDDLE_NAME, Date bIRTH_DATE, String cURRENT_ADDRESS_1, String cURRENT_CITY,
			String cURRENT_COUNTRY, String cURRENT_PHONE_NUMBER, String cURRENT_GENDER, String cURRENT_PERSONAL_EMAIL,
			Employee_Working employee_Working) {
		super();
		PERSONAL_ID = pERSONAL_ID;
		EMPLOYEE_ID = eMPLOYEE_ID;
		CURRENT_FIRST_NAME = cURRENT_FIRST_NAME;
		CURRENT_LAST_NAME = cURRENT_LAST_NAME;
		CURRENT_MIDDLE_NAME = cURRENT_MIDDLE_NAME;
		BIRTH_DATE = bIRTH_DATE;
		CURRENT_ADDRESS_1 = cURRENT_ADDRESS_1;
		CURRENT_CITY = cURRENT_CITY;
		CURRENT_COUNTRY = cURRENT_COUNTRY;
		CURRENT_PHONE_NUMBER = cURRENT_PHONE_NUMBER;
		CURRENT_GENDER = cURRENT_GENDER;
		CURRENT_PERSONAL_EMAIL = cURRENT_PERSONAL_EMAIL;
		this.employee_Working = employee_Working;
	}
	
	public String getCURRENT_ADDRESS_1() {
		return CURRENT_ADDRESS_1;
	}
	public void setCURRENT_ADDRESS_1(String cURRENT_ADDRESS_1) {
		CURRENT_ADDRESS_1 = cURRENT_ADDRESS_1;
	}
	public String getCURRENT_CITY() {
		return CURRENT_CITY;
	}
	public void setCURRENT_CITY(String cURRENT_CITY) {
		CURRENT_CITY = cURRENT_CITY;
	}
	public Employee_Working getEmployee_Working() {
		return employee_Working;
	}
	public void setEmployee_Working(Employee_Working employee_Working) {
		this.employee_Working = employee_Working;
	}
	
	
	
}