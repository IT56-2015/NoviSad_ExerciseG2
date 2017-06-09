import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_R(){
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		pe.executeCommand("r");
	}
}
