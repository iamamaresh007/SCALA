object Main {
    def main(args: Array[String]) = {
        
        val greet = () => "Hello Scala"
        println(greet())
        
        val add = (a: Int, b: Int) => a + b
        println("Add is " + add(7, 3))
        
        var func = (_: Int) + (_: Int)
        println("func is " + func(1107, 8110))
        
        val addOne = (x: Int) => x + 1
        println(addOne(5))
    }
}
