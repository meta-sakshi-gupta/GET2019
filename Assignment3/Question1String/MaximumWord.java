
public class MaximumWord 
{
	 // method for finding the longest word in the entered string
 public void maxword()
 {
  UserInput stringinputmax = new UserInput();
  String stringmax = stringinputmax.getStringInput();
  
  stringmax = stringmax+" ";//adding an extra space in the last of the original string to check the last word
  int lengthofstring = stringmax.length();
  String word = "", max_word="";//initializing the strings
  int sublength, max_length=0;
  char character;
   //loop for extracting words from the string
   for(int charindex=0;charindex<lengthofstring;charindex++)
   {
	 character=stringmax.charAt(charindex);
	 if(character!=' ')
	 {
	  word = word+character;//if not end of the word, adding more characters to form the word
	 }
	 else
	 {
	  sublength=word.length();//calculating the length of the word
	  //checking if the word is longest
	  if(sublength>=max_length)
	  {
	   max_length=sublength;
	   max_word=word;
	  }
	  word="";//setting word to empty for adding next word of the string
	 }
   }
   System.out.println("Longest word : "+max_word);
 }
}