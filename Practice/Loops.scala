object Main {
    def main(args: Array[String]) = {

        for (i <- 1 to 10) { println(i) }
        
        for (j <- 11 until 20) { println(j) }
        
        var k = 1
        while (k <= 4) {
            println("value of k is " + k)
            k +=1
        }
        
        for(a <- 1 to 3; b <- 1 to 3) {
            println(a + " " + b)
        }
    }
}
