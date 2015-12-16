package agoda

import org.scalatest.{FlatSpec, Matchers}

class DiamondShapeTest extends FlatSpec with Matchers {
    val expected3 = "  +   \n+ + + \n  +   \n";

    val expected5 = "    +     \n  + + +   \n+ + + + + \n  + + +   \n    +     \n";
     
    "If n = 3" should "print the right shape" in {
        val d3 = new DiamondShape(3); 
        val result = d3.printDiamond();
        result should be (expected3)
    }

    "If n = 5" should "print the right shape" in {
        val d5 = new DiamondShape(5);
        val result = d5.printDiamond();
        result should be (expected5)
    }
    
     "If n = 6" should "print size of the diamond must be odd value" in {
        val d6 = new DiamondShape(6); 
        val result = d6.printDiamond();
        result should be ("");
    }
}