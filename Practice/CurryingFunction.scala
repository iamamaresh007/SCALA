object Main {
    def add(x: Int, y: Int) = x + y
    def add2(i: Int)(j: Int) = i + j
    
    def main(args: Array[String]) = {
        println(add(11, 39))
        println(add2(77)(23))
    }
}

// Currying is the process of transforming a function that takes multiple parameters into a sequence of functions, each taking one parameter.

/*🔹 Key Benefits
✅ Improves code reuse
✅ Supports partial application
✅ Fits well with functional programming
✅ Helps create customized functions easily */
