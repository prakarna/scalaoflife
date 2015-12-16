package agoda

import org.scalatest.{FlatSpec, Matchers}

class ButterflyShapeTest extends FlatSpec with Matchers {
    val expected2 = "+       + \n+ + - + + \n+       + \n";

    val expected4 = "+               + \n+ +           + + \n+ + +       + + + \n+ + + + - + + + + \n+ + +       + + + \n+ +           + + \n+               + \n";
    
    "If n = 2" should "print the right shape" in {
        val b2 = new ButterflyShape(2);
        val result = b2.printButterFly();
        result should be (expected2)
    }

    "If n = 4" should "print the right shape" in {
        val b4 = new ButterflyShape(4); 
        val result = b4.printButterFly();
        result should be (expected4)
    }
    
     "If n=5" should "print size of the butterfly must be even value" in {
        val b5 = new ButterflyShape(5); 
        val result = b5.printButterFly();
        result should be ("");
    }
}