import java.util.*;

public class GameHard
  {
    //scanner and other items
    Scanner scan = new Scanner(System.in);
    String command;
    int call;

    //files
    Cleaner screen = new Cleaner();
    DoctrorGameHard doctor = new DoctrorGameHard();
    HunterGameHard hunter = new HunterGameHard();
    FarmerGameHard farmer = new FarmerGameHard();
    CheapsakeGameHard cheapsake = new CheapsakeGameHard();
    RichGameHard rich = new RichGameHard();
    MiniTitle title = new MiniTitle();

    //cahracter select screen
    public void chosing()
    {
      for(int i = 0; i < 100; i++)
      {
        title.print();
        Options character = new Options("Choose a character: ", "Doctor", "Hunter", "Farmer", "Cheapskate", "Rich");
        character.print5Options();
        command = scan.nextLine();
        if(command.equals("1")) //doctor
        {
          screen.clean();
          title.print();
          System.out.println("\nYou selcted " + character.getO1());
          System.out.println("\nPlaying the doctor class allows you to be more successful in healing your family along the journey. \nBut since you are a doctor, you don't know how to handle a gun. \nSo expect a lot of unsuccessful hunts.");
          character = new Options("Are you sure you want to pick this class?");
          character.printYe();
          command = scan.nextLine();
          if(command.equals("y") || command.equals("Y")) //confoming to be doctor
          {
            screen.clean();
            doctor.game();
          }
          else{screen.clean();}
        }
        else if(command.equals("2")) //hunter
        {
          screen.clean();
          title.print();
          System.out.println("\nYou selcted " + character.getO2());
          System.out.println("\nAs a hunter, you have more successful hunts along the journey. \nThe drawback here is that you almost always get the wrong type of berries to eat.");
          character = new Options("Are you sure you want to pick this class?");
          character.printYe();
          command = scan.nextLine();
          if(command.equals("y") || command.equals("Y")) //confoming to be hunter
          {
            screen.clean();
            hunter.game();
          }
          else{screen.clean();}
        }
        else if(command.equals("3")) //Farmer
        {
          screen.clean();
          title.print();
          System.out.println("\nYou selcted " + character.getO3());
          System.out.println("\nThe Famer class allows you to pick out the right plants for you and your family to eat. \nBut there will be a low chance of you healing your family");
          character = new Options("Are you sure you want to pick this class?");
          character.printYe();
          command = scan.nextLine();
          if(command.equals("y") || command.equals("Y")) //confoming to be famer
          {
            screen.clean();
            farmer.game();
          }
          else{screen.clean();}
        }
        else if(command.equals("4")) //cheapsake
        {
          screen.clean();
          title.print();
          System.out.println("\nYou selcted " + character.getO4());
          System.out.println("\nAs the cheapskate, you always find a bargain in the shop. \nNo matter what your family thinks about this, it helps you financially.");
          character = new Options("Are you sure you want to pick this class?");
          character.printYe();
          command = scan.nextLine();
          if(command.equals("y") || command.equals("Y")) //confoming to be cheapsake
          {
            screen.clean();
            cheapsake.game();
          }
          else{screen.clean();}
        }
        else if(command.equals("5")) //rich
        {
          screen.clean();
          title.print();
          System.out.println("\nYou selcted " + character.getO5());
          System.out.println("\nAs the rich class, you start with double the amount of money than any of the other classes. \nBut the drawback is that your success rate is cut in half.");
          character = new Options("Are you sure you want to pick this class?");
          character.printYe();
          command = scan.nextLine();
          if(command.equals("y") || command.equals("Y")) //confoming to be rich
          {
            screen.clean();
            rich.game();
          }
          else{screen.clean();}
        }
      }  
    }
  }