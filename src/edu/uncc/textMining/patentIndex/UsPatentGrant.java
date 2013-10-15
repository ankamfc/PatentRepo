package edu.uncc.textMining.patentIndex;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;



public class UsPatentGrant {
	private String patentId;
	private String abstractOfThePatent;
	private String title;
	private String Assigned;
	private String textOfThePatent;
	private String lastName;
	private String firstName;
	private String fullName;
	private String city;
	private String state;
	private String classification;
	private String type;
	private String kind;
	private List<String> patentText = new ArrayList<String>();
	private List<String> citationList = new ArrayList<String>();
	private Claims claims;

	public Claims getClaims() {
		return claims;
	}

	public void setClaims(Claims claims) {
		this.claims = claims;
	}

	public List<String> getCitationList() {
		return citationList;
	}

	public void setCitationList(String citation) {
		citationList.add(citation);
	}

	private List<String> claimText = new ArrayList<String>();

	private String usClaim;

	public String getUsClaim() {
		return usClaim;
	}

	public void setUsClaim(String usClaim) {
		this.usClaim = usClaim;
	}

	public List<String> getClaimText() {
		return claimText;
	}

	public void setClaimText(String claim) {
		claimText.add(claim);
	}

	public List<String> getPatentText() {
		return patentText;
	}

	public void setPatentText(String patent)
			throws UnsupportedEncodingException {

		byte[] b = patent.getBytes("UTF-8");
		String s = new String(b, "US-ASCII");
		patentText.add(s);
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public List<String> getClassificationList() {
		return classificationList;
	}

	public void setClassificationList(String arg0) {
		classificationList.add(arg0);
	}

	private List<String> classificationList = new ArrayList<String>();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	private String country;
	private String datePublished;

	public String getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return lastName + "," + firstName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPatentId() {
		return patentId;
	}

	public void setPatentId(String patentId) {
		this.patentId = patentId;
	}

	public String getAbstractOfThePatent() {
		return abstractOfThePatent;
	}

	public void setAbstractOfThePatent(String abstractOfThePatent) {
		this.abstractOfThePatent = abstractOfThePatent;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAssigned() {
		return Assigned;
	}

	public void setAssigned(String assigned) {
		Assigned = assigned;
	}

	public String getTextOfThePatent() {
		return textOfThePatent;
	}

	public void setTextOfThePatent(String textOfThePatent) {
		this.textOfThePatent = textOfThePatent;
	}

}
