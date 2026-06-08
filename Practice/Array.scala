object Main {
    def main(args: Array[String]) = {
        var names = Array("Amaresh", "Dhoni", "Rocky", "Preetham")
        println(names(0))
        
            names.foreach {
                x => 
                println(x)
            }
    }
}
