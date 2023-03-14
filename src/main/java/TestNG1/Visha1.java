package TestNG1;

public class Visha1 
{
	String city;
	int pricem,pricew;
	public Visha1(String city, int pricem, int pricew) {
		super();
		this.city = city;
		this.pricem = pricem;
		this.pricew = pricew;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPricem() {
		return pricem;
	}
	public void setPricem(int pricem) {
		this.pricem = pricem;
	}
	public int getPricew() {
		return pricew;
	}
	public void setPricew(int pricew) {
		this.pricew = pricew;
	}
	@Override
	public String toString() {
		return "city=" + city + ", pricem=" + pricem + ", pricew=" + pricew ;
	}
}
