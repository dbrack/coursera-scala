def balance(chars: List[Char]): Boolean ={
		def loop (chars: List[Char], acc: Int): Boolean ={
			if (chars.isEmpty && acc != 0) false
			else if (chars.isEmpty) true
			else if (chars.head !=')' &&  chars.head !='(' ) loop(chars.tail, acc)
			else if (chars.head == '(' && acc > -1) loop(chars.tail, acc + 1)
			else if (chars.head == ')' && acc >  0 ) loop(chars.tail, acc -1 )
			else false
		}
		loop(chars, 0)
	}


println(balance("()dsaidhsaihdsa(())".toList))