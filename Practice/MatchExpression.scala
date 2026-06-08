object Main {
    def main(args: Array[String]) = {
        val age = 15
        age match {
            case 18 => println("You are major")
            case 16 => println("You are minor")
            case _ => println("Default")
        }
    }
}
