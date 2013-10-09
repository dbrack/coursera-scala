object Main extends App {
	def countChange(money: Int, coins: List[Int]): Int ={

	    def count(money: Int, coins: List[Int]): Int ={
	    	println("Money: " + money)
	    	println(coins.isEmpty)
	        if(money == 0) 1 // change was found
	        else if(money < 0) 0 // no change found
	        else if(coins.isEmpty && money >= 1) 0
	        else
	            count(money, coins.tail) + count(money - coins.head, coins)
	    }

   	    count(money, coins)
	    //count(money, coins.sortWith(_.compareTo(_) < 0))
	}
}

println(Main.countChange(18, List(1, 2, 5)) + " different ways")