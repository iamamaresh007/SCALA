class Demo {
    var name = "Amaresh"
    var age = 27
    
    def display() = {
        println("Name is " + name)
        println("Age is " + age)
    }
}

object Main {
    def main(args: Array[String]) = {
        val ref = new Demo();
        ref.display()
    }
}
