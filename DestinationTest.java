package fr.gtm.jsp.entitiestest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.jsp.entities.DatesVoyages;
import fr.gtm.jsp.entities.Destination;

public class DestinationTest {

	private List<String> imgs = new ArrayList<String>();
	private List<DatesVoyages> dvs = new ArrayList<DatesVoyages>();
	private Destination d = new Destination("foo","bar");
	
	
	@Test
	public void testDestination() {
	 assertNotNull(d);
	}


	@Test
	public void testGetImg() {
	 assertNotNull(d.getImg());////////////////////////
	}

	@Test
	public void testSetImg() {
		String s = "fooo";
		d.setImg(s);
		assertEquals(s,d.getImg());
	
	}

	@Test
	public void testGetDateVoyage() {
		
		dvs.add(new DatesVoyages(LocalDate.of(2042, 01, 01),LocalDate.of(2042, 01, 02),10));
		d.setDateVoyage(dvs);
		assertEquals(dvs,d.getDateVoyage());
	}

	@Test
	public void testSetDateVoyage() {
		LocalDate d1 = LocalDate.of(2042, 01, 03);
		LocalDate d2 = LocalDate.of(2042, 01, 04);
		DatesVoyages dv1 = new DatesVoyages(d1,d2,10);
		dvs.add(dv1);
		d.setDateVoyage(dvs);
		assertEquals(dvs,d.getDateVoyage());
		
	}
	@Test
	public void testGetId() {
		assertNotNull(d.getId());
	}

	@Test
	public void testSetId() {
		d.setId(5);
		assertEquals(5,d.getId());
	}

	@Test
	public void testGetRegion() {
		assertEquals("foo",d.getRegion());
	}

	@Test
	public void testSetRegion() {
		d.setRegion("loin");
		assertEquals("loin",d.getRegion());
	}

	@Test
	public void testGetDescription() {
		assertEquals("bar",d.getDescription());
	}

	@Test
	public void testSetDescription() {
		d.setDescription("barbar");
		assertEquals("barbar",d.getDescription());
	}

	@Test
	public void testGetImage() {
	assertNotNull(d.getImage());
	}

	@Test
	public void testSetImage() {
		String s1 = "barfoo";
		imgs.add(s1);
		d.setImage(imgs);
		assertNotNull(d.getImage());
	}

//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}

}
