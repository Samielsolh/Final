// Note to User: you can freely ask any question as long as you do not spell
//any words wrong. Cap locks and other small words (e.g in or what) are
//accounted for

//Have Fun!

//Siri 2.0, Sami El Solh and Kai Marcos

import java.io.*; //package for system input and output. includes the File class
import java.util.Scanner;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Siri extends JPanel{


  public static boolean exit = false; //field to allow the user to exit the program
  public static boolean check = false; //used to check if there is an error or not
  public static String word = "Null... for now at least"; // empty to avoid a null error
  public static int error = 0; //used to avoid error
  public static String twoWordTest = "Null"; // used to find phrases, not single words
  public static String printWord = "Null"; // word that is tested in Morpher

  public static JFrame openWindow; //variable to open/close window after each command

  //will change each word to lower case and test if it sets off a key word
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

    if(line.equals("h")){
      Help();
      error = 1;
    }
    else if(Morpher("exit")){
      exit = true;
      error = 1;
    }
    else if(Morpher("superbowl")){
      printWord = "The Broncos won the Superbowl";
      error = 1;
    }
    else if(Morpher("capital")){
      printWord = "Washington D.C";
      error = 1;
    }
    else if(Morpher("presidency")|| Morpher("president")){
      if (twoWordTest.indexOf(" is ")!=-1 && twoWordTest.indexOf(" is going to be")==-1){
        printWord = "Barack Obama";
        error = 1;
      }
      else{
      printWord = "Donald Trump...";
      error = 1;
      }
    }

    else if(Morpher("world")){
      if(twoWordTest.indexOf("cup")!=-1 || twoWordTest.indexOf("Cup")!=-1){
        printWord = "Germany";
        error = 1;
      }
      else if(twoWordTest.indexOf("series")!=-1 || twoWordTest.indexOf("series")!=-1){
        printWord = "Patriots";
        error = 1;
      }

    }

  }

  // lists some possible questions the user might ask
  public static void Help(){
    System.out.println("Ask Siri about: \n Our President \n Who will be President \n Who won the superbowl \n What's the capital of the US \n Who won the World Cup \n Who won the World Series");
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
      System.out.println("Whats that again ?");
    else if(n==2)
      System.out.println("Sorry, I'm not sure I understand");
    else
      System.out.println("Sorry, I don't know the answer to that one");

  }

  // paints the rectangle and text
  public void paintComponent(Graphics g){
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //  to paint the background
    g.setColor(Color.RED);

    // Draw a 150 by 45 rectangle with the upper-left
    // corner at x = 20, y = 40:
    g.drawRect(20, 40, (printWord.length()*11+100), 45);

    g.setColor(Color.BLUE);

    // Draw a string of text starting at x = 55, y = 65:
    g.drawString(printWord, 55, 65);
  }


  //prompts the user and initiates methods
  public static void main( String args[] ) {

    Scanner userPrompt = new Scanner(System.in);
    Greetings();

    openWindow = null;



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


        }

      if (openWindow != null) {  //closes window
        openWindow.setVisible(false);
        openWindow.dispose();
      }

      JFrame window = new JFrame("Siri 2.0");  //creates window
      // Set this window's location and size:
      // upper-left corner at 300, 300; width 200, height 150
      window.setBounds(600, 100, 500, 150);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Siri panel = new Siri();
      panel.setBackground(Color.WHITE);  // the default color is light gray
      Container c = window.getContentPane();
      c.add(panel);
      window.setVisible(true);

      openWindow = window;

      if(error!=1){
        Error();
      }
    }
  }

  }
