**Rules For Declaration Of Variables ***

1.Case Sensitive
2.Contains Alphabets, Numbers,_ or $
3.Starts with Alphabet, _or $
4.Should not be a keyword
5.Should not be a class name, if class is also in use
6.No limit on length of name
7.Follow Camel Cases

*** ASCII values *** 
--------unicode.org-----
ASCII range 0-127 and 7 bits
A-Z (65-90)
a-z (97-122)
0-9 (48-57)
special symbol
unicode (has all language some code like english, marathi, hindi)
to support unicode java take 2 bytes ++1 byte - 8bits.
char is only postive.

+++++
			System.out.println("\t index: "+i +" ["+arr[i]+"]" );
+++++


---------
	variable arguments 
	void method(int ...A){
		foreach(int a: A)
		{
			sout(A); // because it array 
		}
	}


-----------------
 /*  
	 * used to achieve polymorphism as well as inheritance
     * abstract cls cannot be final 
     * --||-- method also cannot be final 
     *  only refrence created , no object
     *   no static class be abstract
     * if abstract inherited then abstract meth should override otherwise that cls is also abstract
*/