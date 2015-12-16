package agoda

class DiamondShape(height : Int) {
  
    def printDiamond(): String = {
        var result = "";
        if (isOdd(height)) {
            var x = height/2;
            for (i <- -x to x) {
                for (j <- -x to x) {
                    if (math.abs(i) + math.abs(j) <= x) {
                        printf("+ ");
                        result = result + "+ ";
                    } else {
                        printf("  ");
                        result = result + "  ";
                    }
                }
                println();
                result = result + "\n";
            }
        }
        return result;
    }

    private def isOdd(input : Int) : Boolean = {
        return (input.toInt % 2 == 1);     
    }
}