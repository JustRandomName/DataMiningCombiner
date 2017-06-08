/**
 * 
 */
package evm.dmc.core;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;

import evm.dmc.core.function.DMCFunction;

/**
 * @author id23cat
 *
 */
@RunWith(MockitoJUnitRunner.StrictStubs.class)
public class AlgorithmTest {
	
	@Mock private Algorithm mockedAlg;
	@Mock private DMCFunction mockedCmd;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * Test method for {@link evm.dmc.core.Algorithm#addCommand(evm.dmc.core.function.DMCFunction)}.
	 */
	@Test
	public final void testAddCommand() {		
		mockedAlg.addCommand(mockedCmd);
		
		verify(mockedAlg, times(1)).addCommand(mockedCmd);
	}

	/**
	 * Test method for {@link evm.dmc.core.Algorithm#delCommand(evm.dmc.core.function.DMCFunction)}.
	 */
	@Test
	public final void testDelCommand() {		
		mockedAlg.addCommand(mockedCmd);
		mockedAlg.delCommand(mockedCmd);
		
		verify(mockedAlg, times(1)).addCommand(mockedCmd);
		verify(mockedAlg, times(1)).delCommand(mockedCmd);
	}

	/**
	 * Test method for {@link evm.dmc.core.Algorithm#execute()}.
	 */
	@Test
	public final void testExecute() {
		mockedAlg.addCommand(mockedCmd);
		
		mockedAlg.execute();
		
	}

}