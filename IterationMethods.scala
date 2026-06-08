object Main {
    def main(args: Array[String]) = {
        val list = List(1, 3, 2, 6, 0, 10, 23, 8)
        println(list)
        
        for(l <- list) {
            println(l)
        }
        
        list.foreach(x => println(x))
        
        val itr = list.iterator
        while(itr.hasNext) {
            println(itr.next)
        }
    }
}
