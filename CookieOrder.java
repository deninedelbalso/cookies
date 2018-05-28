package cookies;

public class CookieOrder {

	public int numBoxes;
	public String variety;

	public CookieOrder(String variety, int numBoxes) {
    this.numBoxes = numBoxes;
    this.variety = variety;


	}

	public int getNumBoxes() {
		return numBoxes;
	}

	public String getVariety() {
		return variety;
	}

}
