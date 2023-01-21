/*Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
Input format :
Numeric string S (string, Eg. "1234")
Output format :
Corresponding integer N (int, Eg. 1234)
Constraints :
0 < |S| <= 9
where |S| represents length of string S.
Sample Input 1 :
00001231
Sample Output 1 :
1231
Sample Input 2 :
12567
Sample Output 2 :
12567
*/


public class solution {

	public static int convertStringToInt(String input){
		if (input.length() == 0) {
        return 0;
    }
    int lastDigit = input.charAt(input.length() - 1) - '0';
    int smallNumber = convertStringToInt(input.substring(0, input.length() - 1));
    return smallNumber * 10 + lastDigit;

	}
}
