import java.io.*; //package for system input and output. includes the File class
import java.util.Scanner;

public class Siri{

  public Response(String line){

    if(line.charAt(0).equals('h') || line.charAt(1).equals('h') ){
      System.out.println("");
      System.out.println("");

    }

  }

  public static void main( String args[] ) {
    Scanner userPrompt = new Scanner(System.in);
    System.out.print("Hi! My name is Siri 2.0, ask me a question :) (for help enter 'h')  ");
    String line = userPrompt.nextLine();


  }

}
