package agoda

object DiamondShapeObject {
    def main(args: Array[String]) {
        println("DiamondShape n=3");
        val d3 = new DiamondShape(3);
        d3.printDiamond();
        
        println("DiamondShape n=5");
        val d5 = new DiamondShape(5);
        d5.printDiamond();
    }
}