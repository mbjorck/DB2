package Model;

public class Studied {
	private String pnr;
	private String cCode;
	private String grade;
	
	public Studied(String pnr, String cCode, String grade){
		setCCode(cCode);
		setPnr(pnr);
		setGrade(grade);
	}
	
	public String getSPnr() {
		return pnr;
	}
	
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	
	public String getCCode() {
		return cCode;
	}
	
	public void setCCode(String cCode) {
		this.cCode = cCode;
	}
	
	public String getCGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
