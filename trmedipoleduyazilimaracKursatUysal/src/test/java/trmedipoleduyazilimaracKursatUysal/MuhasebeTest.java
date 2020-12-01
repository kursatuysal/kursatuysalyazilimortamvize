package trmedipoleduyazilimaracKursatUysal;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.*;
import trmedipoleduyazilimaracKursatUysal.MuhasebeProgrami;
import static junit.framework.TestCase.assertTrue;

public class MuhasebeTest {
			
	@Test
	public void testMuhasebe() {
		
		MuhasebeProgrami muhs = new MuhasebeProgrami();
		
		assertTrue(muhs.ucretHesapla(12 , 50));
		
	} 
}
