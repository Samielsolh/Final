import java.io.*; //package for system input and output. includes the File class
import java.util.Scanner;
import java.util.Random;
//problem: when I enter superbowl, it will repeat the previous print option x times
//where x is length of new scanner statement

public class Siri{

  public static boolean exit = false;
  public static boolean check = false;
  public static String word = "Null... for now at least";
  public static boolean error = true;
  public static String twoWordTest = "Null";



  public static boolean Morpher(String keyWord){
    if(keyWord.equals(word) == false){

      word = word.toLowerCase();
      word = word.trim();

      if(keyWord.equals(word) == false)
        return false;
      else
        return true;
    }
    else
      return true;
  }

  // exectuted at start of program to welcome user and get name
  public static String Greetings(){
    Scanner userPrompt = new Scanner(System.in);
    System.out.print("Hi! My name is Siri 2.0. What is your name? ");
    String name = userPrompt.nextLine();
    return name;
  }

  // will identify what the user is saying
  public static void Identify(String line){
    if(line.equals("h"))
      Help();
    else if(Morpher("exit"))
      exit = true;
    else if(line.equals("error"))
      Error();

    else if(Morpher("superbowl")){
      System.out.println("The cubs won it");
      Graphics2 cubs = new Graphics2(1);

    }
    else if(Morpher("presidency")|| Morpher("president")){
      if (twoWordTest.indexOf(" is ")!=-1 && twoWordTest.indexOf(" is going to be")==-1)
        System.out.println("Barack Obama");
      else
        System.out.println("Donald Trump");
    }

    else if(Morpher("world")){
      if(twoWordTest.indexOf("cup")!=-1 || twoWordTest.indexOf("Cup")!=-1){
        System.out.println("Germany");
      }
      else if(twoWordTest.indexOf("series")!=-1 || twoWordTest.indexOf("series")!=-1){
        System.out.println("Patriots");
      }
      else
        Error();
    }
  }



  public static void Response(){
    Identify()
  }

  // lists some possible questions the user might ask
  public static void Help(){
    System.out.println("List of Commands (you do not have to type it in exactly): \n What is the Date? \n Draw a rectangle \n How are you? \n Who won the superbowl? \n Who won the presidency?");
  }

  // chooses a random response to avoid Siri being repetitive
  public static int Random(int n){
    Random random = new Random();
    return random.nextInt(n)+1;
  }

  // executed if user input is unrecognizable
  public static void Error(){

    int n = Random(3); // chooses a random response to avoid Siri being repetitive

    if(n==1)
    System.out.println("What's that again ?");
    else if(n==2)
      System.out.println(", I'm not sure I understand");
    else if(n==3)
      System.out.println("Sorry, I don't know the answer to that one");

  }


  //prompts the user and initiates methods
  public static void main( String args[] ) {

    Scanner userPrompt = new Scanner(System.in);
    Greetings();
    while(exit == false){
      String line;
      System.out.println("ask me a question :) (for help enter 'h')  "); //kai
      System.out.print(">>>");
      line = userPrompt.nextLine(); //scanner


      line = line.replace("?"," "); // adds a space to end of line if nothing is there
      if(line.charAt((line.length()-1))!= ' ')
        line = line+  " ";
      twoWordTest = line;


      for( int k=0; k<line.length(); k++ ) {

        boolean print = false;
        int length = line.length()-1;
        //System.out.print("x");

        if(line.charAt(k) == ' ') {

          if(line.lastIndexOf(" ",k-1)==-1){
            word = line.substring(0,k);
            print = true;
          }
          else{
            word = line.substring(line.lastIndexOf(' ',k-1)+1,k);
            //System.out.print(line.substring(line.lastIndexOf(' ',k)));
            print = true;
          }
          }
        if(print == true){
          //System.out.println(word);
          //System.out.println(word);
        Identify(word);
      }
        if(Morpher(word)==true){
          error=false;
          }
        }

      if(error==true){
        Identify("error");

      }
    }
  }

}
