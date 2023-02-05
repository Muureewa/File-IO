Question Number One: 
Write a static method blueGreen that accepts as a parameter a Scanner that reads its 
input from a file containing a series of names followed by integers. The names alternate 
between blue team member names and green team member names. Your method should 
compute the absolute difference between the sum of the blue teams' integers and the sum 
of the green teams' integers. The input could end with either a blue or green team member; 
you may not assume that it contains an even number of names. If the input 
file score.txt contains the following text, 
Chad 3 James 7 Noah 14 Jimmy 13 Nancy 4 KK 12 Joey 6 Mitchelle 0 
 
Then your method could be called in the following way: 
Scanner input = new Scanner(new File("score.txt")); 
blueGreen(input); 
 
And produces this console output, since the blue team's sum is 3+14+4+6 = 27 and the 
green team's sum is 7+13+12+0 = 32: 
4 blue, 4 green 
Difference between blue team and green team sums: 5 
Question Number Two:
Write a method named countCoins that accepts as its parameter a Scanner for an 
input file whose data represents a person's money grouped into stacks of coins. 
Your method should add up the cash values of all the coins and print the total 
money at the end. The input consists of a series of pairs of tokens, where each 
pair begins with an integer and is followed by the type of coin, which will be either 
"pennies" (1 cent each), "nickels" (5 cents each), "dimes" (10 cents each), or 
"quarters" (25 cents each), case-insensitively. A given coin might appear more 
than once on the same line.
For example, if the input file contains the following text:
3 pennies 2 quarters 1 pennies 3 nickels 4 dimes
3 pennies are worth 3 cents, and 2 quarters are worth 50 cents, and 1 penny is 
worth 1 cent, and 3 nickels are worth 15 cents, and 4 dimes are worth 40 cents. 
The total of these is 1 dollar and 9 cents, therefore your method would produce 
the following output if passed this input data. Notice that the method should show 
exactly two digits after the decimal point, so it says 09 for 9 cents:
Total money: $1.09
Here is a second example. Suppose the input file contains the following text. 
Notice the capitalization and spacing:
12   QUARTERS      1   Pennies      33 
PeNnIeS      
  10    niCKELs
Then your method would produce the following output:
Total money: $3.84
You may assume that the file contains at least 1 pair of tokens. You may also 
assume that the input is valid; that the input has an even number of tokens, that 
every other token is an integer, and that the others are valid coin types.
