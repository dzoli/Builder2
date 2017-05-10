package model;

public class Pizza {

	private String testo = "";
	private String sos = "";
	private String preliv = "";
	
	
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public void setSos(String sos) {
		this.sos = sos;
	}
	public void setPreliv(String preliv) {
		this.preliv = preliv;
	}

	
	
	@Override
	public String toString() {
		return "Pizza [testo=" + testo + ", sos=" + sos + ", preliv=" + preliv + "]";
	}	
	
}
