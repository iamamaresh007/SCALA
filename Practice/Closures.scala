object Main {
    def main(args: Array[String]) = {
        var factor = 7
        
        val add = (x: Int) => x + factor
        println(add(7))
        
        factor = 8
        println(add(7))
        
        /*factor is defined outside the function.
        The lambda (x: Int) => x + factor captures factor.
        This makes the function a closure.

        ✅ Even when factor changes, the closure reflects the updated value.*/
    }
}
