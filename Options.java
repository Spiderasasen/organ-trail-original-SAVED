import java.util.*;

public class Options
  {
    //scanner and scanner options
    Scanner scan = new Scanner(System.in);
    String command;
    int call;

    //vars
    private String question;
    private String o1;
    private String o2;
    private String o3;
    private String o4;
    private String o5;
    private String o6;

    //question oporators
    public Options(String initQuestion) //yes or no options
    {
      question = initQuestion;
    }

    public Options(String initQuestion, String initO1, String initO2) //for 2 differnt options
    {
      question = initQuestion;
      o1 = initO1;
      o2 = initO2;
    }

    public Options(String initQuestion, String initO1, String initO2, String initO3) //for 3 differnt options
    {
      question = initQuestion;
      o1 = initO1;
      o2 = initO2;
      o3 = initO3;
    }

    public Options(String initQuestion, String initO1, String initO2, String initO3, String initO4) //for 4 differnt options
    {
      question = initQuestion;
      o1 = initO1;
      o2 = initO2;
      o3 = initO3;
      o4 = initO4;
    }

    public Options(String initQuestion, String initO1, String initO2, String initO3, String initO4, String initO5) //for 5 differnt options
    {
      question = initQuestion;
      o1 = initO1;
      o2 = initO2;
      o3 = initO3;
      o4 = initO4;
      o5 = initO5;
    }

    public Options(String initQuestion, String initO1, String initO2, String initO3, String initO4, String initO5, String initO6) //for 6 differnt options
    {
      question = initQuestion;
      o1 = initO1;
      o2 = initO2;
      o3 = initO3;
      o4 = initO4;
      o5 = initO5;
      o6 = initO6;
    }

    //printing the options and the questions
    public void printYe() //printing for yes or no
    {
      System.out.println("\n" + question);
      System.out.println("Yes or No, Y/N");
    }
    
    public void print2Options() //printing for 2 options
    {
      System.out.println("\n" + question);
      System.out.println("1. " + o1);
      System.out.println("2. " + o2);
    }

    public void print3Options() //printing for 3 options
    {
      System.out.println("\n" + question);
      System.out.println("1. " + o1);
      System.out.println("2. " + o2);
      System.out.println("3. " + o3);
    }

    public void print4Options() //printing for 4 options
    {
      System.out.println("\n" + question);
      System.out.println("1. " + o1);
      System.out.println("2. " + o2);
      System.out.println("3. " + o3);
      System.out.println("4. " + o4);
    }

    public void print5Options() //printing for 5 options
    {
      System.out.println("\n" + question);
      System.out.println("1. " + o1);
      System.out.println("2. " + o2);
      System.out.println("3. " + o3);
      System.out.println("4. " + o4);
      System.out.println("5. " + o5);
    }

    public void print6Options() //printing for 5 options
    {
      System.out.println("\n" + question);
      System.out.println("1. " + o1);
      System.out.println("2. " + o2);
      System.out.println("3. " + o3);
      System.out.println("4. " + o4);
      System.out.println("5. " + o5);
      System.out.println("6. " + o6);
    }

    //just in case I need to return an option
    public String getO1(){return o1;}
    public String getO2(){return o2;}
    public String getO3(){return o3;}
    public String getO4(){return o4;}
    public String getO5(){return o5;}
    public String getO6(){return o6;}
  }