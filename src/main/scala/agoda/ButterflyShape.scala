package agoda

class ButterflyShape(size : Int) {
    
    def printButterFly() : String = {
        var result = "";
        if (isEven(size)) {
            var halfI = (2*size - 1)/2;
            var halfJ = (2*size + 1)/2;
            
            for (i <- -halfI to halfI) {
                for (j <- -halfJ to halfJ) {
                    if (math.abs(j) - math.abs(i) > 0) {
                        printf("+ ");
                         result = result + "+ ";
                    } else {
                        if (i == 0 && j == 0) {
                            printf("- ");
                             result = result + "- ";
                        } else {
                            printf("  ");
                             result = result + "  ";
                        }
                    }
                }
                println();
                result = result + "\n";
            }
        }
        return result;
    }
    
    private def isEven(input : Int) : Boolean = {
        return (input.toInt % 2 == 0);     
    }
}