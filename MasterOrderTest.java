package cookies;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MasterOrderTest {

	@Test
	public void shouldReturnTotalBoxesAsOne() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("", 1));
		int check = underTest.getTotalBoxes();
		assertEquals(1, check);
	}

	@Test
	public void shouldReturnTotalBoxesOfOneAfterRemoval() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("plain", 1));
		underTest.addOrder(new CookieOrder("mints", 1));
		underTest.removeVariety("plain");
		int check = underTest.getTotalBoxes();
		assertEquals(1, check);
	}

	@Test
	public void shouldReturnTotalBoxesAsOneAfterRemovalOfAllPlain() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("plain", 1));
		underTest.addOrder(new CookieOrder("plain", 1));
		underTest.addOrder(new CookieOrder("mints", 1));
		underTest.removeVariety("plain");
		int check = underTest.getTotalBoxes();
		assertEquals(1, check);

	}
}
