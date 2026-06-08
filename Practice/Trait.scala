trait Animal {
    def run() : Unit
    def fly() : Unit
}

class Lion extends Animal {
    def run() = {
        println("Lion is running")
    }
    
    def fly() = {
        println("Lion is flying")
    }
}

object Main {
    def main(args: Array[String]) = {
        val lion = new Lion()
        lion.run()
        lion.fly()
    }
}
