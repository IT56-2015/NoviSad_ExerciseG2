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
	@Test
	public void test_F() throws PlanetExplorerException{
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		assertEquals("Greska!", "(0,1,n)", pe.executeCommand("f"));
	}
	@Test
	public void test_RF() throws PlanetExplorerException{
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		assertEquals("Greska!", "(1,0,e)", pe.executeCommand("rf"));
	}
	public void test_FFFF() throws PlanetExplorerException{
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		assertEquals("Greska!", "(1,0,n)", pe.executeCommand("ffff"));
	}
	public void test_Prepreka() throws PlanetExplorerException{
		String prepreke = "(1,1)";
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		assertEquals("Greska!", "(1,0,e)", pe.executeCommand("frff"));
	}
}
