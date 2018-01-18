package Model;

public class Student {
	private String name;
	private String pnr;

	
	public Student(){
		
	}
	
	/*public Student(String name, String pnr){
		setName(name);
		setPnr(pnr);

		}*/
	
	public String getName() {
		return name;
	}
	
	public void setName(String sName) {
		this.name = sName;
	}
	
	public String getPnr() {
		return pnr;
	}
	
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

}