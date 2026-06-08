object Main {
    def main(args: Array[String]) = {
        val a = 7
        val b = 3
        
        println("Addition of 2 numbers is " + add(a, b))
        println("Substraction of 2 numbers is " + sub(a, b))
        println("Multiplication of 2 numbers is " + multi(a, b))
        println("Division of 2 numbers is " + div(a, b))
    }
    
    def add(a: Int, b: Int) : Int = {
        return a + b
    }
    
    def sub(a: Int, b: Int) = a - b 
    
    def multi(a: Int, b: Int) : Int = a * b
    
    def div(a: Int, b: Int) : Int = {
         a / b
    }
}
