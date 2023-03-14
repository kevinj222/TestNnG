package Ustbatchno3.TestNG1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.TestNG;
import org.testng.annotations.*;
import org.testng.asserts.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestNG
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( );
    }

    /**
     * Rigourous Test :-)
     */
    @Test
	public void testApp()
    {
        AssertJUnit.assertTrue( true );
    }
}
