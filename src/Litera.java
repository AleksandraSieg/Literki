
public class Litera {
	private char nazwa;
	private double szerokosc;
	private double dlugosc;
	public Litera(char nazwa, double szerokosc, double dlugosc) {
		super();
		this.nazwa = nazwa;
		this.szerokosc = szerokosc;
		this.dlugosc = dlugosc;
	}
	public char getNazwa() {
		return nazwa;
	}
	public void setNazwa(char nazwa) {
		this.nazwa = nazwa;
	}
	public double getSzerokosc() {
		return szerokosc;
	}
	public void setSzerokosc(double szerokosc) {
		this.szerokosc = szerokosc;
	}
	public double getDlugosc() {
		return dlugosc;
	}
	public void setDlugosc(double dlugosc) {
		this.dlugosc = dlugosc;
	}
}
