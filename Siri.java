import java.io.*; //package for system input and output. includes the File class
import java.util.Scanner;
import java.util.Random;


public class Siri{

  boolean exit = false;
  boolean check = false;



  //this method will mutatate a word and then send it to checkMorpher
  public String Morpher(String searchingFor, String line){
    if(check == false){
    checkMorpher()
    searchingFor = line.toLowerCase(searching For)
    }
    
  }

  //will check if word is in Line
  public boolean checkMorpher(String checkWord){
    if(line.indexOf(searchingFor) != -1)
      return true;
  }

  // exectuted at start of program to welcome user and get name
  public String Greetings(){
    Scanner userPrompt = new Scanner(System.in);
    System.out.print("Hi! My name is Siri 2.0. What is your name?";
    String line = userPrompt.nextLine();
    return name;
  }

  // will identify what the user is saying
  public int Identify(String line){
    if(line.equals("h"))
      Help();
    else if(Morpher("SuperBowl"))

    else
      Error();


  // will execute what needs to be said after Identifty method identifies very specific responses
  public int Responses(int id){

    if (Identify(line)==404)
      Error();

    else if(Identify(line)==1)
      Help();

    else if(Identify(line)==2){
      System.out.println("I'm good thanks! What about you?")
      System.out.println(">>> ")

    }

  // lists some possible questions the user might ask
  public void Help(){
    System.out.println("List of Commands (you do not have to type it in exactly): \n What is the Date? \n Draw a rectangle \n How are you? \n Who won the superbowl? \n Who won the presidency?");
  }

  // chooses a random response to avoid Siri being repetitive
  public int Random(int n){
    Random random = new Random();
    return rand.nextInt(n)+1;
  }

  // gives a very generic response
  public void General(){
  }

  // executed if user input is unrecognizable
  public void Error(String name){

    int n = Random(4); // chooses a random response to avoid Siri being repetitive

    if(n=1)
    System.out.println("What's that again");
    else if(n=2)
      System.out.println("I'm not sure I understand");
    else if(n=3)
      System.out.println("Sorry "+name+", I don't know the answer to that one");

    System.out.println(">>> ");
    String line = userPrompt.nextLine();

  }

  //prompts the user and initiates methods
  public static void main( String args[] ) {

    Scanner userPrompt = new Scanner(System.in);

    while(exit==false){
      System.out.println("ask me a question :) (for help enter 'h')  ");
      System.out.println(">>>");
      String line = userPrompt.nextLine();
      Identify(line);
      Responses(id);
    }


  }

}
