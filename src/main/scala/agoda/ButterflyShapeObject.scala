package agoda

object ButterflyShapeObject {
    def main(args: Array[String]) {
        println("Butterfly Shape n=2");  
        val b2 = new ButterflyShape(2);
        b2.printButterFly();
        
        println("Butterfly Shape n=4");
        val b4 = new ButterflyShape(4);
        b4.printButterFly();
    }
}