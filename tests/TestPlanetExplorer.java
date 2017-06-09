import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

//	@Test
//	public void test_executeCommand() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void test_R() throws PlanetExplorerException{
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		assertEquals("Greska!", "(0,0,e)", pe.executeCommand("r"));
	}
	@Test
	public void test_L() throws PlanetExplorerException{
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		assertEquals("Greska!", "(0,0,w)", pe.executeCommand("l"));
	}
}
