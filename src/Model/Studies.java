package Model;

public class Studies {
	private String pnr;
	private String cCode;
	
	public Studies(String pnr, String cCode){
		setPnr(pnr);
		setCCode(cCode);
	}
	
	public String getPnr() {
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
	
}
