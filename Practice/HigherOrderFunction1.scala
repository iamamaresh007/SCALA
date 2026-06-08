object Main {
    
    def applyOperation(x: Int, y: Int, operation: (Int, Int) => Int): Int = {
        operation(x, y)
    }

    def main(args: Array[String]) = {
        val sum = applyOperation(10, 20, (a, b) => a + b)
        val sub = applyOperation(20, 13, (a, b) => a - b)
        
        println(sum)
        println(sub)
    }
}
