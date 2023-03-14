package Ustbatchno3.TestNG1;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import TestNG1.Visha;
import TestNG1.Visha1;

import org.testng.annotations.Test;

public class Vishatest {
      @Test
      public void Constru()
      {
    	  int expected =2000;
    	  
    	  Visha1 vx=new Visha1("Hyderabad", 2000, 900);
    	  String city="Hyderabad";
    	  List<Visha1> details=Arrays.asList(vx);
    	  int ch=1,sq=1;
    	  
    	  assertEquals(expected, Visha.cons(details, ch, city, sq));
    	  ch=2;
    	  
    	  expected=900;
    	  assertEquals(expected,  Visha.cons(details, ch, city, sq));
    	  
      }
}
