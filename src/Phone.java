
public class Phone {
	private int countryCode;
	private int cityCode;
	private int number;
	
	public Phone(int countryCode,int cityCode,int number) {
		this.countryCode=countryCode;
		this.cityCode=cityCode;
		this.number=number;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public int getCityCode() {
		return cityCode;
	}

	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public String display() {
		return "+"+this.countryCode+" ("+this.cityCode+") "+this.number;
	}
}
