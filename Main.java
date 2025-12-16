import java.util.*;

class Main {
  public static void main(String[] args) {
    //scanner
    Scanner scan = new Scanner(System.in);
    String command;

    //files
    Cleaner screen = new Cleaner();
    Game game = new Game();
    GameHard hard = new GameHard();
    Title title = new Title();
    
    //title
    screen.clean();
    title.print();
    
    //actual code
    Options option = new Options("What would you like to do?", "Play the game", "How to Play", "Exit");
    option.print3Options();
    command = scan.nextLine();
    if(command.equals("1")) //game
    {
      screen.clean();
      title.print();
      Options difficalty = new Options("Chose a difficulty", "Normal", "Difficult");
      difficalty.print2Options();
      command = scan.nextLine();
      if(command.equals("1"))
      {
        screen.clean();
        game.chosing();
      }
      else
      {
        screen.clean();
        hard.chosing();
      }
    }
    else if(command.equals("2")) //learning the game
    {
      System.out.println("\nThis game is inspired by an old Commandor game. \nIn the game there are options for you to take, most of them being yes or no options. \nThe goal of this game is to make it to Oregon, with most of your family with you in about 136 days. \nYou might have a chance to items for free in the store as well, so keep a look out for that in your journey.");
      option = new Options("What would you like to do?", "Play the game", "Exit");
      option.print2Options();
      command = scan.nextLine();
      if(command.equals("1")) //game 2
      {
        screen.clean();
        title.print();
        Options difficalty = new Options("Chose a difficulty", "Normal", "Difficult");
        difficalty.print2Options();
        command = scan.nextLine();
        if(command.equals("1"))
        {
          screen.clean();
          game.chosing();
        }
        else
        {
          screen.clean();
          hard.chosing();
        }
      }
      else if(command.equals("2")) //exit 2
      {
        System.out.println("Goodbye then");
        System.exit(0);
      }
      else // second exit 2
      {
        System.out.println("Since you didn't pick one of the options above, ill just end the game. Have a good day.");
        System.exit(0);
      }
    }
    else if(command.equals("3")) //exit
    {
      System.out.println("Goodbye then");
      System.exit(0);
    }
    else //second exit
    {
      System.out.println("Since you didn't pick one of the options above, ill just end the game. Have a good day.");
      System.exit(0);
      //DoctorParts test = new DoctorParts();

    }
  }
}
/*ideas for the game
thieves will steal $230 max to the rich class while the rest get only $50 stolen max
  */

//printing out the title
class Title
  {
    public void print()
    {
      System.out.println("████████╗██╗░░██╗███████╗  ░█████╗░██████╗░███████╗░██████╗░░█████╗░███╗░░██╗");
      System.out.println("╚══██╔══╝██║░░██║██╔════╝  ██╔══██╗██╔══██╗██╔════╝██╔════╝░██╔══██╗████╗░██║");
      System.out.println("░░░██║░░░███████║█████╗░░  ██║░░██║██████╔╝█████╗░░██║░░██╗░██║░░██║██╔██╗██║");
      System.out.println("░░░██║░░░██╔══██║██╔══╝░░  ██║░░██║██╔══██╗██╔══╝░░██║░░╚██╗██║░░██║██║╚████║");
      System.out.println("░░░██║░░░██║░░██║███████╗  ╚█████╔╝██║░░██║███████╗╚██████╔╝╚█████╔╝██║░╚███║");
      System.out.println("░░░╚═╝░░░╚═╝░░╚═╝╚══════╝  ░╚════╝░╚═╝░░╚═╝╚══════╝░╚═════╝░░╚════╝░╚═╝░░╚══╝");
      System.out.println("\n");
      System.out.println("████████╗██████╗░██╗░█████╗░██╗░░░░░");
      System.out.println("╚══██╔══╝██╔══██╗██║██╔══██╗██║░░░░░");
      System.out.println("░░░██║░░░██████╔╝██║███████║██║░░░░░");
      System.out.println("░░░██║░░░██╔══██╗██║██╔══██║██║░░░░░");
      System.out.println("░░░██║░░░██║░░██║██║██║░░██║███████╗");
      System.out.println("░░░╚═╝░░░╚═╝░░╚═╝╚═╝╚═╝░░╚═╝╚══════╝");
    }
  }

class MiniTitle
  {
    public void print()
    {
      String[] title = {
"▀█▀ █░█ █▀▀   █▀█ █▀█ █▀▀ █▀▀ █▀█ █▄░█   ▀█▀ █▀█ ▄▀█ █ █░░",
"░█░ █▀█ ██▄   █▄█ █▀▄ ██▄ █▄█ █▄█ █░▀█   ░█░ █▀▄ █▀█ █ █▄▄"};
 
      for(int i = 0; i < title.length; i++)
        {
          System.out.println(title[i]);
        }
      System.out.println("__________________________________________________________");
    }
  }