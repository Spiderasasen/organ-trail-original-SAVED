import java.util.*;

public class FamerGame
  {
    //scaner and item
    Scanner scan = new Scanner(System.in);
    String command;
    int call;

    //files
    Cleaner screen = new Cleaner();
    FamerParts doc = new FamerParts();
    Enter next = new Enter();
    Space line = new Space();
    MiniTitle title = new MiniTitle();
    
    //gameplay
    public void game()
    {
      title.print();
      doc.family();
      screen.clean();
      title.print();
      doc.store();
      System.out.println("Press enter to begin");
      command = scan.nextLine();
      screen.clean();
      while(doc.checkDays() != 136 || doc.getEveryonesHealth() == true) // the actual game
        {
          title.print();
          doc.getEveryonesHealth();
          System.out.println("Number of days: " + doc.checkDays());
         // doc.countNumber();
          doc.familyHealth();
          Options whatToDo = new Options("What will you do now?", "Check inventory", "Hunt", "Collect berries", "Heal family", "Look for store","Next day");
          whatToDo.print6Options();
          command = scan.nextLine();
          if(command.equals("1")) //checking inventory
          {
            doc.printInventory();
            next.print();
            command = scan.nextLine();
            screen.clean();
          }
          else if(command.equals("2")) //hunting
          {
            doc.hunt();
            next.print();
            command = scan.nextLine();
            screen.clean();
          }  
          else if(command.equals("3")) //collecting berries
          {
            doc.collecting();
            next.print();
            command = scan.nextLine();
            screen.clean();
          }
          else if(command.equals("4")) //healing your family
          {
            doc.heal();
            next.print();
            command = scan.nextLine();
            screen.clean();
          }
          else if(command.equals("5")) //looking for a store
          {
            doc.look();
            next.print();
            command = scan.nextLine();
            screen.clean();
          }
            else if(command.equals("6")) //going to the next day
            {
              doc.nextDay();
              next.print();
              command = scan.nextLine();
              screen.clean();
            }
          else //saftey net or just pressed the wrong key
          {
            System.out.println("What did you say?");
            command = scan.nextLine();
            if(command.equals("1")) //checking inventory
            {
              doc.printInventory();
              next.print();
              command = scan.nextLine();
              screen.clean();
            }
            else if(command.equals("2")) //hunting
            {
              doc.hunt();
              next.print();
              command = scan.nextLine();
              screen.clean();
            }
            else if(command.equals("3")) //collecting berries
            {
              doc.collecting();
              next.print();
              command = scan.nextLine();
              screen.clean();
            }
            else if(command.equals("4")) //healing your family
            {
              doc.heal();
              next.print();
              command = scan.nextLine();
              screen.clean();
            }
            else if(command.equals("5")) //looking for store
            {
              doc.look();
              next.print();
              command = scan.nextLine();
              screen.clean();
            }
            else if(command.equals("6")) //going to the next day
            {
              doc.nextDay();
              next.print();
              command = scan.nextLine();
              screen.clean();
            }
          }
          if(doc.checkDays() == 136){break;}
          else if(doc.getEveryonesHealth() == true){break;}
        }
      if(doc.getEveryonesHealth() == true)
      {
        title.print();
        System.out.println("\nYou sadly did not make it to Oregon.");
        Options stats = new Options("Would you like to see your stats?");
        stats.printYe();
        command = scan.nextLine();
        if(command.equals("y") || command.equals("Y")) //prints stats
        {
          line.print();
          doc.familyHealth();
          line.print();
          doc.printInventory();
          System.exit(0);
        }
        else //does not print stats
        {
          System.out.println("");
          System.exit(0);
        }
      }
      else
      {
        title.print();
        System.out.println("\nYou made it to Oregon.");
        Options stats = new Options("Would you like to see your stats?");
        stats.printYe();
        command = scan.nextLine();
        if(command.equals("y") || command.equals("Y")) //prints stats
        {
          line.print();
          doc.familyHealth();
          line.print();
          doc.printInventory();
          System.exit(0);
        }
        else //does not print stats
        {
          System.out.println("");
          System.exit(0);
        }
      }
    }
  }
