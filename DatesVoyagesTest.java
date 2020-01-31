package fr.gtm.jsp.entitiestest;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import fr.gtm.jsp.entities.DatesVoyages;
import fr.gtm.jsp.entities.Destination;

public class DatesVoyagesTest {

	private DatesVoyages dv = new DatesVoyages(LocalDate.of(2042, 01, 01),LocalDate.of(2042, 01, 02),10);
	
	@Test
	public void testGetDestination() {
		Destination d = new Destination("foo","bar");
		dv.setDestination(d);
		assertEquals(d,dv.getDestination());
	}

	@Test
	public void testSetDestination() {
	Destination d = new Destination("foo","bar");
	dv.setDestination(d);
	assertEquals(d,dv.getDestination());
	}

	@Test
	public void testDatesVoyages() {
	assertNotNull(dv);
	}


	@Test
	public void testGetId() {
		assertNotNull(dv.getId());
	}

	@Test
	public void testSetId() {
		dv.setId(10L);
		assertEquals(10L,dv.getId());
	}

	@Test
	public void testGetDateAller() {
		assertNotNull(dv.getDateAller());
	}

	@Test
	public void testSetDateAller() {
		dv.setDateAller(LocalDate.of(2042, 01, 01));
		assertEquals(LocalDate.of(2042, 01, 01),dv.getDateAller());
	}

	@Test
	public void testGetDateRetour() {
		assertNotNull(dv.getDateRetour());
	}

	@Test
	public void testSetDateRetour() {
		dv.setDateRetour(LocalDate.of(2042, 01, 06));
		assertEquals(LocalDate.of(2042, 01, 06),dv.getDateRetour());
	}

	@Test
	public void testGetNbrPlacesDispo() {
		assertNotNull(dv.getNbrPlacesDispo());
	}

	@Test
	public void testSetNbrPlacesDispo() {
		dv.setNbrPlacesDispo(21);
		assertEquals(21,dv.getNbrPlacesDispo());
	}

}
