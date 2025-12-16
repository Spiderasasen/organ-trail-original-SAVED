import java.util.*;

public class FamerParts
  {
    //scanner
    Scanner scan = new Scanner(System.in);
    String command;
    int call;

    //vars for the store
    int money = 500;
    private int numYoke = 0;
    private int poundsFood = 0;
    private int setClothes = 0;
    private int boxesAmmo = 0;
    private int numWheel = 0;
    private int numAxel = 0;
    private int numTongue = 0;
    private int numBullets;

    //vars for the family
    private String wifeName;
    private String yourName;
    private String grandmaName;
    private String sonName;
    private String daughterName;

    //vars for health
    private String wifeHealth = "Healthy";
    private String yourHealth = "Healthy"; 
    private String grandmaHealth = "Healthy";
    private String sonHealth = "Healthy";
    private String daughterHealth = "Healthy";

    //vars for days
    private int days = 1;

    //counters for next day
    int clothesCount = 0;
    int wagonDamgeCount = 0;
    int moneyCount = 0;

    //checking the hunger of everyone
    int yourHunger = 0;
    int wifeHunger = 0;
    int grandmaHunger = 0;
    int sonHunger = 0;
    int daughterHunger = 0;

    //posined counter == 5 wont reset
    int yourPosined = 0;
    int wifePosined = 0;
    int grandmaPosined = 0;
    int sonPosined = 0;
    int daughterPosined = 0;

    //Injured counter == 2 wont reset
    int yourInjured = 0;
    int wifeInjured = 0;
    int grandmaInjured = 0;
    int sonInjured = 0;
    int daughterInjured = 0;

    //cold counter
    int yourCold = 0;
    int wifeCold = 0;
    int grandmaCold = 0;
    int sonCold = 0;
    int daughterCold = 0;

    //sick counter
    int yourSick = 0;
    int wifeSick = 0;
    int grandmaSick = 0;
    int sonSick = 0;
    int daughterSick = 0;
    
    //files
    Cleaner screen = new Cleaner();

    //arrays
    String[] names = {"","","","",""}; //getting the names of the family
    String[] health = {"Healthy", "Cold", "Injured", "Dead", "Hungry", "Poisoned", "Sick"}; //helth of family
    //checking invtory part1(String)
    String[] invtoeryString = {"Money: ", "Yolk: ", "Pounds of Food: ", "Sets of Clothes: ", "Number of bullets: ", "Extra wheels: ", "Extra axels: ", "Extra tongues: "};   
    int[] inventoryNumbers = {0,0,0,0,0,0,0,0}; //checking invorty part2(int)
    //the store
    public void store()
    { 
      //holding the number for a bit
      int spare1 = 1;
      int spare2 = 1;
      int spare3 = 1;
      
      Options items = new Options("What will you pick?", "Yoke", "Food", "Clothing", "Ammunition", "Spare Parts", "Exit");
      for(int i = 0; i < 100000; i++)
      {
        if(money > 0) //cheacking how much money you got
        {
         System.out.println("\nYou have $" + money); 
        }
        else
        {
          System.out.println("\nYou don't have enough money. You have to go with what you got. ");
          command = scan.nextLine();
          break;
        }
        items.print6Options();
        call = scan.nextInt();
        if(call == 1) //for yoke
        {
          int math = 0;
          int oxenSell = (int) (Math.random() * 20);
          System.out.println("\nA yoke has 2 oxen in it. \nI will sell you $" + oxenSell + " per yoke.");
          System.out.println("How many yoke do you want?");
          call = scan.nextInt();
          screen.clean();
          int initYoke = call;
          numYoke = numYoke + initYoke;
          System.out.println("You have " + numYoke + " yokes");
          math = call * oxenSell;
          money = money - math;
        }
        else if(call == 2) //for food
        {
          int math = 0;
          int foodSell = (int) (Math.random() * 20);
          System.out.println("\nYou need food to survive out there. \nI will sell you $" + foodSell + " per pound of food.");
          System.out.println("How many pounds do you want?");
          call = scan.nextInt();
          screen.clean();
          int initFood = call;
          poundsFood = poundsFood + initFood;
          System.out.println("You have " + poundsFood + " pounds of food");
          math = call * foodSell;
          money = money - math;
        }
        else if(call == 3) //for clothing
        {
          int math = 0;
          int clothesSell = (int) (Math.random() * 20);
          System.out.println("\nI will sell you a set of clothing, each set has 2 pieces of clothing. \nI will sell you $" + clothesSell + " per set of clothes.");
          System.out.println("How many sets do you want?");
          call = scan.nextInt();
          screen.clean();
          int initClothes = call;
          setClothes = setClothes + initClothes;
          System.out.println("You have " + setClothes + " sets of clothes");
          math = call * clothesSell;
          money = money - math;
        }
        else if(call == 4) //for ammunition
        {
          int math = 0;
          int ammoSell = (int) (Math.random() * 20);
          System.out.println("\nI have boxes of ammo for you. Each box has 20 bullets. \nI will sell you $" + ammoSell + " per box.");
          System.out.println("How many boxes do you want?");
          call = scan.nextInt();
          screen.clean();
          int initAmmo = call;
          boxesAmmo = boxesAmmo + initAmmo;
          System.out.println("You have " + boxesAmmo + " boxes of ammo");
          math = call * ammoSell;
          money = money - math;
        }
        else if(call == 5) //for spare parts
        {
          int math = 0;
          int partSell = (int) (Math.random() * 15);
          for(int j = 0; j < 1000; j++)
            {
              if(money > 0) //checking how much money you got
              {
                screen.clean();
                System.out.println("\nYou have $" + money);
              }
              else
              {
                break;
              }
              System.out.println("You have 3 options for spare parts. Each cost $" + partSell);
              Options parts = new Options("Which will you buy?", "Wagon Wheel", "Wagon Axel", "Wagon Tounge", "Exit");
              parts.print4Options();
              call = scan.nextInt();
              if(call == 1) //wheel
              {
                System.out.println("How many wheels do you want?");
                call = scan.nextInt();
                int initWheel = call;
                numWheel = numWheel + initWheel;
                if(numWheel == 1)
                {
                  System.out.println("You have " + numWheel + " wheel");
                }
                else
                {
                  System.out.println("You have " + numWheel + " wheels");
                }
                math = call * partSell;
                money = money - math;
                spare1 = numWheel;
                System.out.println("Press enter to continue");
                command = scan.nextLine();
              }
              else if(call == 2) //axel
              {
                System.out.println("How many axels do you want?");
                call = scan.nextInt();
                int initAxel = call;
                numAxel = numAxel + initAxel;
                if(numWheel == 1)
                {
                  System.out.println("You have " + numAxel + " axel");
                }
                else
                {
                  System.out.println("You have " + numAxel + " wheels");
                }
                math = call * partSell;
                money = money - math; 
                spare2 = numAxel;
                System.out.println("Press enter to continue");
                command = scan.nextLine();
              }
              else if(call == 3) //tounge
              {
                System.out.println("How many tounges do you want?");
                call = scan.nextInt();
                int initTounge = call;
                numTongue = numTongue + initTounge;
                if(numWheel == 1)
                {
                  System.out.println("You have " + numTongue + " axel");
                }
                else
                {
                  System.out.println("You have " + numTongue + " wheels");
                }
                math = call * partSell;
                money = money - math; 
                spare3 = numTongue;
                System.out.println("Press enter to continue");
                command = scan.nextLine();
              }
              else if(call == 4) //exit
              {
                int numParts = numTongue + numAxel + numWheel;
                System.out.println("You have " + numParts + " differnt parts");
                break;
              }
            }
          //holding the numbers until the task has to end
          this.numWheel = spare1;
          this.numAxel = spare2;
          this.numTongue = spare3;
        }
        else if(call == 6) //exit
        {
          System.out.println("\nGood luck on your journey");
          break;
        }
      }
      //adding to the array which will print out in the inventory
      inventoryNumbers[0] = money;
      inventoryNumbers[1] = numYoke;
      inventoryNumbers[2] = poundsFood;
      inventoryNumbers[3] = setClothes;
      numBullets = boxesAmmo * 20;
      inventoryNumbers[4] = numBullets;
      inventoryNumbers[5] = numWheel;
      inventoryNumbers[6] = numAxel;
      inventoryNumbers[7] = numTongue;
    }

    //Nameing your family
    public void family()
    {
      DoctorParts other = new DoctorParts();
      //putting in the names
      System.out.println("\nIn this game, you will need to travel with your family. \nPlease enter your name.");
      command = scan.nextLine();
      other.setYourName(command);
      System.out.println("\nPlease enter your wife's name.");
      command = scan.nextLine();
      other.setWifeName(command);
      System.out.println("\nPlease enter your Grandma's name.");
      command = scan.nextLine();
      other.setGrandmaName(command);
      System.out.println("\nPlease enter your son's name.");
      command = scan.nextLine();
      other.setSonName(command);
      System.out.println("\nPlease enter your daughter's name.");
      command = scan.nextLine();
      other.setDaughterName(command);

      //checking if the names are correct
      for(int i = 0; i < 9999; i++)
      {
        screen.clean();
        String[][] names = {{"Your Name: ", other.getYourName()},
                          {"Wife's Name: ", other.getWifeName()},
                          {"Grandma's Name: ", other.getGrandmaName()},
                          {"Son's Name: ", other.getSonName()},
                          {"Daughter's Name: ", other.getDaughterName()}};
        for(int row = 0; row < names.length; row++)
        {
          for(int col = 0; col < names[row].length; col++)
          {
            System.out.print(names[row][col]);
          }
          System.out.println("\n");
        }

        //checking if the names are right
        Options namesOp = new Options("Is everthing correct?");
        namesOp.printYe();
        command = scan.nextLine();
        if(command.equals("y") || command.equals("Y"))
        {
          break;
        }
        else
        {
          namesOp = new Options("Which name is wrong?", "My Name", "Wife's Name", "Grandma's Name", "Son's Name", "Daugther's Name");
          namesOp.print5Options();
          command = scan.nextLine();
          System.out.println("\n");
          if(command.equals("1")) //your name
          {
            System.out.println("What should the name be then?");
            command = scan.nextLine();
            other.setYourName(command);
          }
          else if(command.equals("2")) //wifes name
          {
            System.out.println("What should the name be then?");
            command = scan.nextLine();
            other.setWifeName(command);
          }
          else if(command.equals("3")) //grandamas name
          {
            System.out.println("What should the name be then?");
            command = scan.nextLine();
            other.setGrandmaName(command);
          }
          else if(command.equals("4")) //sons name
          {
            System.out.println("What should the name be then?");
            command = scan.nextLine();
            other.setSonName(command);
          }
          else if(command.equals("5")) //daughthers name
          {
            System.out.println("What should the name be then?");
            command = scan.nextLine();
            other.setDaughterName(command);
          }
          else //safty net
          {
            System.out.println("\nWhat did you say again?");
            command = scan.nextLine();
            System.out.println("\n");
            if(command.equals("1")) //your name
            {
              System.out.println("What should the name be then?");
              command = scan.nextLine();
              other.setYourName(command);
            }
            else if(command.equals("2")) //wifes name
            {
              System.out.println("What should the name be then?");
              command = scan.nextLine();
              other.setWifeName(command);
            }
            else if(command.equals("3")) //grandamas name
            {
              System.out.println("What should the name be then?");
              command = scan.nextLine();
              other.setGrandmaName(command);
            }
            else if(command.equals("4")) //sons name
            {
              System.out.println("What should the name be then?");
              command = scan.nextLine();
              other.setSonName(command);
            }
            else if(command.equals("5")) //daughthers name
            {
              System.out.println("What should the name be then?");
              command = scan.nextLine();
              other.setDaughterName(command);
            }
          }
        }
      }
      names[0] = other.getYourName();
      names[1] = other.getWifeName();
      names[2] = other.getGrandmaName();
      names[3] = other.getSonName();
      names[4] = other.getDaughterName();
    }

    //printing out the family array and thier hleath
    public void familyHealth()
    {
      for(int i = 0; i < names.length; i++)
        {
          if(i == 0){System.out.println(names[i] + ": " + yourHealth);} //getting your heath
          else if(i == 1){System.out.println(names[i] + ": " + wifeHealth);} //getting wifes health
          else if(i == 2){System.out.println(names[i] + ": " + grandmaHealth);} //getting grandmas health
          else if(i == 3){System.out.println(names[i] + ": " + sonHealth);} //getting sons health
          else if(i == 4){System.out.println(names[i] + ": " + daughterHealth);} //getting daugthers health
        }
    }

    //printing the inventory
    public void printInventory()
    {
      System.out.println("\n");
      for(int i = 0; i < invtoeryString.length; i++)
        {
          System.out.println(invtoeryString[i] + inventoryNumbers[i]);
        }
    }

    //hunting
    public void hunt()
    {
      //random numbers
      int bulletsLost = (int) (Math.random() * 10); //how many bullets you lost
      //animal pounds of food
      int gainedFoodRabit = (int) (Math.random() * 4) + 1; //how many pounds of food you gained for a rabbit
      int gainedFoodDeer = (int) (Math.random() * 25) + 1; // how much you gained for deer kill
      int gainedFoodwolves = (int) (Math.random() * 10) + 1; //how much you gained for wolf kill
      int gainedFoodBear = (int) (Math.random() * 120 + 1); //how much you gained for killing a bear
      int gainedFoodBuffolo = (int) (Math.random() * 250) + 1; //how much you gained for killing a buffolo
      int typeOfAnimal = (int) (Math.random() * 6); //what animal you killed
      if(numBullets == 0)
      {
        System.out.println("\nYou can't hunt now\nyou don't have any bullets");
      }
      else if(bulletsLost == 1)
      {
        System.out.println("\nYou lost " + bulletsLost + " bullet.");
        inventoryNumbers[4]--;
        if(typeOfAnimal == 1) //rabit
        {
          inventoryNumbers[2] = inventoryNumbers[2] + gainedFoodRabit;
          System.out.println("\nYou killed a rabbit and gained " + gainedFoodRabit + " pounds of food");
        }
        else if(typeOfAnimal == 2) //deer
        {
          inventoryNumbers[2] = inventoryNumbers[2] + gainedFoodDeer;
          System.out.println("\nYou killed a deer and gained " + gainedFoodDeer + " pounds of food");
        }
        else if(typeOfAnimal == 3) //wolves
        {
          inventoryNumbers[2] = inventoryNumbers[2] + gainedFoodwolves;
          System.out.println("\nYou killed a wolf and gained " + gainedFoodwolves + " pounds of food");
        }
        else if(typeOfAnimal == 4) //bear
        {
          inventoryNumbers[2] = inventoryNumbers[2] + gainedFoodBear;
          System.out.println("\nYou killed a bear and gained " + gainedFoodBear + " pounds of food");
        }
        else if(typeOfAnimal == 5) //buffolo
        {
          inventoryNumbers[2] = inventoryNumbers[2] + gainedFoodBuffolo;
          System.out.println("\nYou killed a buffolo and gained " + gainedFoodBuffolo + " pounds of food");
        }
        else
        {
          System.out.println("You missed all your shots and got nothing in return.");
        }
      }
      else
      {
        System.out.println("\nYou lost " + bulletsLost + " bullets.");
        inventoryNumbers[4] = inventoryNumbers[4] - bulletsLost;
        if(typeOfAnimal == 1) //rabit
        {
          this.poundsFood = this.poundsFood + gainedFoodRabit;
          System.out.println("\nYou killed a rabbit and gained " + gainedFoodRabit + " pounds of food");
        }
        else if(typeOfAnimal == 2) //deer
        {
          inventoryNumbers[2] = inventoryNumbers[2] + gainedFoodDeer;
          System.out.println("\nYou killed a deer and gained " + gainedFoodDeer + " pounds of food");
        }
        else if(typeOfAnimal == 3) //wolves
        {
          inventoryNumbers[2] = inventoryNumbers[2] + gainedFoodwolves;
          System.out.println("\nYou killed a wolf and gained " + gainedFoodwolves + " pounds of food");
        }
        else if(typeOfAnimal == 4) //bear
        {
          inventoryNumbers[2] = inventoryNumbers[2] + gainedFoodBear;
          System.out.println("\nYou killed a bear and gained " + gainedFoodBear + " pounds of food");
        }
        else if(typeOfAnimal == 5) //buffolo
        {
          inventoryNumbers[2] = inventoryNumbers[2] + gainedFoodBuffolo;
          System.out.println("\nYou killed a buffolo and gained " + gainedFoodBuffolo + " pounds of food");
        }
        else
        {
          System.out.println("You missed all your shots and got nothing in return.");
        }
      }
    }

    //collecting berrys
    public void collecting()
    {
      //arrays for the berries
      String[] berries = {"salmonberry", "Thimbleberry flowers", "Oregon Grape", "Evergreen Huckleberry", "Oval-leaved Blueberry", "Himalayan Blackberry"};
      String[] posision = {"Walter Siegmund", "Holly berries", "Jerusalem cherries", "Ivy berries", "Virginia creeper berries"};
      //numbers that will play out in the game
      int whichBerry = (int) (Math.random() * 1);
      int poundsOfBerries = (int) (Math.random() * 2) + 1;
      int goodBerries = (int) (Math.random() * berries.length);
      int badBerries = (int) (Math.random() * posision.length);
      int whoMightDie = (int) (Math.random() * names.length);
      if(whichBerry == 1) //good berries to eat
      {
        inventoryNumbers[2] = inventoryNumbers[2] + poundsOfBerries;
        System.out.println("\nYou gained " + poundsOfBerries + " pounds of " + berries[goodBerries]);
      }
      else if(whichBerry == 2) //you posined someone
      {
        if(whoMightDie == 0) //checking your stats
        {
          if(yourHealth.equals("Dead")){System.out.println("No berries to be found");}
          else
          {
            System.out.println("\n" + names[whoMightDie] + " tried the " + posision[badBerries] + " and now is sick");
            yourHealth = health[5];
          }
        }
        else if(whoMightDie == 1) //checking your wifes stats
        {
          if(wifeHealth.equals("Dead")){System.out.println("No berries to be found");}
          else
          {
            System.out.println("\n" + names[whoMightDie] + " tried the " + posision[badBerries] + " and now is sick");
            wifeHealth = health[5];
          }
        }
        else if(whoMightDie == 2) //checking your grandmas stats
        {
          if(grandmaHealth.equals("Dead")){System.out.println("No berries to be found");}
          else
          {
            System.out.println("\n" + names[whoMightDie] + " tried the " + posision[badBerries] + " and now is sick");
            grandmaHealth = health[5];
          }
        }
        else if(whoMightDie == 3) //checking your sons stats
        {
          if(sonHealth.equals("Dead")){System.out.println("No berries to be found");}
          else
          {
            System.out.println("\n" + names[whoMightDie] + " tried the " + posision[badBerries] + " and now is sick");
            sonHealth = health[5];
          }
        }
        else //checking your daughters stats
        {
          if(daughterHealth.equals("Dead")){System.out.println("No berries to be found");}
          else
          {
            System.out.println("\n" + names[whoMightDie] + " tried the " + posision[badBerries] + " and now is sick");
            daughterHealth = health[5];
          }
        }
      }
      else
      {
        System.out.println("No berries to be found");
      }
    }

    //healing your family
    public void heal()
    {
      //string array for the health of all the charchters
      String[] ourHealth = {yourHealth, wifeHealth, grandmaHealth, sonHealth, daughterHealth}; 
      //getting a random number out of 10
      int healing = (int) (Math.random() * 10);
      //printing out family
      System.out.println("\n");
      for(int i = 0; i < names.length; i++)
        {
          System.out.println(i + "." + names[i]);
        }
      System.out.println("\nWho will you heal?");
      call = scan.nextInt();
      if(ourHealth[call] == health[3]) //checking the person you are chosing is not dead
      {
        System.out.println("\nIm sorry, but " + names[call] + " has sadly passed away.");
      }
      else if(ourHealth[call] == health[1]) //checking if the person is cold
      {
        System.out.println("\n" + names[call] + " is cold, they dont need healing");
      }
      else if(ourHealth[call] == health[4]) //checking if the person is hungey
      {
        System.out.println("\n" + names[call] + " is hungrey, go hunting or collect some berries");
      }
      else if(healing <= 2) //saved the person
      {
        System.out.println("\n" + names[call] + " is now healthy");
        if(names[call] == names[0]){yourHealth = health[0];} //your health
        else if(names[call] == names[1]){wifeHealth = health[0];} //wifes health
        else if(names[call] == names[2]){grandmaHealth = health[0];} //gradmas health
        else if(names[call] == names[3]){sonHealth = health[0];} //son health
        else{daughterHealth = health[0];} //daugther health
      }
      else //couldnt save the person, which later dies
      {
        System.out.println("\nYou couldent heal " + names[call]);
        System.out.println(names[call] + " has sadly died");
        if(names[call] == names[0]){yourHealth = health[3];} //your health
        else if(names[call] == names[1]){wifeHealth = health[3];} //wifes health
        else if(names[call] == names[2]){grandmaHealth = health[3];} //gradmas health
        else if(names[call] == names[3]){sonHealth = health[3];} //son health
        else{daughterHealth = health[3];} //daugther health
      }
      
    }

    //looking for a store
    public void look()
    {
      //random number for finding the store
      int looking = (int) (Math.random() * 100);
      if(looking <= 50)
      {
        System.out.println("\nNo stores to found");
      }
      else
      {
        screen.clean();
        //copying the code from store
        //holding the number for a bit
        int spare1 = 0;
        int spare2 = 0;
        int spare3 = 0;
      
        Options items = new Options("What will you pick?", "Yoke", "Food", "Clothing", "Ammunition", "Spare Parts", "Exit");
        for(int i = 0; i < 100000; i++)
        {
          if(money > 0) //cheacking how much money you got
          {
          System.out.println("\nYou have $" + money); 
          }
          else
          {
            System.out.println("\nYou don't have enough money. You have to go with what you got. ");
            command = scan.nextLine();
            break;
          }
          items.print6Options();
          call = scan.nextInt();
          if(call == 1) //for yoke
          {
            int math = 0;
            int oxenSell = (int) (Math.random() * 20);
            System.out.println("\nA yoke has 2 oxen in it. \nI will sell you $" + oxenSell + " per yoke.");
            System.out.println("How many yoke do you want?");
            call = scan.nextInt();
            screen.clean();
            int initYoke = call;
            numYoke = numYoke + initYoke;
            System.out.println("You have " + numYoke + " yokes");
            math = call * oxenSell;
            money = money - math;
          }
          else if(call == 2) //for food
          {
            int math = 0;
            int foodSell = (int) (Math.random() * 20);
            System.out.println("\nYou need food to survive out there. \nI will sell you $" + foodSell + " per pound of food.");
            System.out.println("How many pounds do you want?");
            call = scan.nextInt();
            screen.clean();
            int initFood = call;
            poundsFood = poundsFood + initFood;
            System.out.println("You have " + poundsFood + " pounds of food");
            math = call * foodSell;
            money = money - math;
          }
          else if(call == 3) //for clothing
          {
            int math = 0;
            int clothesSell = (int) (Math.random() * 20);
            System.out.println("\nI will sell you a set of clothing, each set has 2 pieces of clothing. \nI will sell you $" + clothesSell + " per set of clothes.");
            System.out.println("How many sets do you want?");
            call = scan.nextInt();
            screen.clean();
            int initClothes = call;
            setClothes = setClothes + initClothes;
            System.out.println("You have " + setClothes + " sets of clothes");
            math = call * clothesSell;
            money = money - math;
          }
          else if(call == 4) //for ammunition
          {
            int math = 0;
            int ammoSell = (int) (Math.random() * 20);
            System.out.println("\nI have boxes of ammo for you. Each box has 20 bullets. \nI will sell you $" + ammoSell + " per box.");
            System.out.println("How many boxes do you want?");
            call = scan.nextInt();
            screen.clean();
            int initAmmo = call;
            boxesAmmo = boxesAmmo + initAmmo;
            System.out.println("You have " + boxesAmmo + " boxes of ammo");
            math = call * ammoSell;
            money = money - math;
          }
          else if(call == 5) //for spare parts
          {
            int math = 0;
            int partSell = (int) (Math.random() * 15);
            for(int j = 0; j < 1000; j++)
            {
              if(money > 0) //checking how much money you got
              {
                screen.clean();
                System.out.println("\nYou have $" + money);
              }
              else
              {
                break;
              }
              System.out.println("You have 3 options for spare parts. Each cost $" + partSell);
              Options parts = new Options("Which will you buy?", "Wagon Wheel", "Wagon Axel", "Wagon Tounge", "Exit");
              parts.print4Options();
              call = scan.nextInt();
              if(call == 1) //wheel
              {
                System.out.println("How many wheels do you want?");
                call = scan.nextInt();
                int initWheel = call;
                numWheel = numWheel + initWheel;
                if(numWheel == 1)
                {
                  System.out.println("You have " + numWheel + " wheel");
                }
                else
                {
                  System.out.println("You have " + numWheel + " wheels");
                }
                math = call * partSell;
                money = money - math;
                spare1 = numWheel;
                System.out.println("Press enter to continue");
                command = scan.nextLine();
              }
              else if(call == 2) //axel
              {
                System.out.println("How many axels do you want?");
                call = scan.nextInt();
                int initAxel = call;
                numAxel = numAxel + initAxel;
                if(numWheel == 1)
                {
                  System.out.println("You have " + numAxel + " axel");
                }
                else
                {
                  System.out.println("You have " + numAxel + " wheels");
                }
                math = call * partSell;
                money = money - math; 
                spare2 = numAxel;
                System.out.println("Press enter to continue");
                command = scan.nextLine();
              }
              else if(call == 3) //tounge
              {
                System.out.println("How many tounges do you want?");
                call = scan.nextInt();
                int initTounge = call;
                numTongue = numTongue + initTounge;
                if(numWheel == 1)
                {
                  System.out.println("You have " + numTongue + " axel");
                }
                else
                {
                  System.out.println("You have " + numTongue + " wheels");
                }
                math = call * partSell;
                money = money - math; 
                spare3 = numTongue;
                System.out.println("Press enter to continue");
                command = scan.nextLine();
              }
              else if(call == 4) //exit
              {
                int numParts = numTongue + numAxel + numWheel;
                System.out.println("You have " + numParts + " differnt parts");
                break;
              }
            }
          //holding the numbers until the task has to end
          this.numWheel = spare1;
          this.numAxel = spare2;
          this.numTongue = spare3;
          }
          else if(call == 6) //exit
          {
            System.out.println("\nGood luck on your journey");
            break;
          }
        }
        //adding to the array which will print out in the inventory
        inventoryNumbers[0] = money;
        inventoryNumbers[1] = numYoke;
        inventoryNumbers[2] = poundsFood;
        inventoryNumbers[3] = setClothes;
        numBullets = boxesAmmo * 20;
        inventoryNumbers[4] = numBullets;
        inventoryNumbers[5] = numWheel;
        inventoryNumbers[6] = numAxel;
        inventoryNumbers[7] = numTongue;
      }
    }

    //going to the next day
    public void nextDay()
    {
      //adding one to a number
      this.days++;
      clothesCount++;
      wagonDamgeCount++;
      moneyCount++;
      
      //lose one set of clothes every 15 days
      if(clothesCount == 15)
      {
        if(yourHealth != health[3] && inventoryNumbers[3] > 0){inventoryNumbers[3]--; yourHealth = health[0]; yourCold = 0;} //checking your health
        else if(yourHealth == health[3]){System.out.print("");} //you are dead
        else//starting to get cold
        {
          if(yourCold == 3)
          {
            yourHealth = health[3];
            System.out.println("\n" + names[0] + " was too cold and died.");
          }
          else
          {
            System.out.println("\n" + names[0] + " is getting cold.");
            yourHealth = health[1];
            yourCold++;
          }
        }
        if(wifeHealth != health[3] && inventoryNumbers[3] > 0){inventoryNumbers[3]--; wifeHealth = health[0]; wifeCold = 0;} // checking wifes health
        else if(wifeHealth == health[3]){System.out.print("");} //wife is dead
        else //starting to get cold
        {
          if(wifeCold == 3)
          {
            wifeHealth = health[3];
            System.out.println("\n" + names[1] + " was too cold and died.");
          }
          else
          {
            System.out.println("\n" + names[1] + " is getting cold.");
            wifeHealth = health[1];
            wifeCold++;
          }
        }
        if(grandmaHealth != health[3] && inventoryNumbers[3] > 0){inventoryNumbers[3]--; grandmaHealth = health[0]; grandmaCold = 0;} //checking grandmas health
        else if(grandmaHealth == health[3]){System.out.print("");} //grandma is dead
        else //starting to get cold
        {
         if(grandmaCold == 3)
          {
            grandmaHealth = health[3];
            System.out.println("\n" + names[2] + " was too cold and died.");
          }
          else
          {
            System.out.println("\n" + names[2] + " is getting cold.");
            grandmaHealth = health[1];
            grandmaCold++;
          }
        }
        if(sonHealth != health[3] && inventoryNumbers[3] > 0){inventoryNumbers[3]--; sonHealth = health[0]; sonCold = 0;} //checking your sons health
        else if(sonHealth == health[3]){System.out.print("");} //son is dead
        else//starting to get cold
        {
          if(sonCold == 3)
          {
            sonHealth = health[3];
            System.out.println("\n" + names[3] + " was too cold and died.");
          }
          else
          {
            System.out.println("\n" + names[3] + " is getting cold.");
            sonHealth = health[1];
            sonCold++;
          }
        }
        if(daughterHealth != health[3] && inventoryNumbers[3] > 0){inventoryNumbers[3]--; daughterHealth = health[0]; daughterCold = 0;} //checking daughter health
        else if(daughterHealth == health[3]){System.out.print("");} //daughter is dead
        else //starting to get cold
        {
          if(daughterCold == 3)
          {
            daughterHealth = health[3];
            System.out.println("\n" + names[4] + " was too cold and died.");
          }
          else
          {
            System.out.println("\n" + names[4] + " is getting cold.");
            daughterHealth = health[1];
            daughterCold++;
          }
        }
        clothesCount = 1;
      }

      //taking some damge to the wagon every 30 days
      if(wagonDamgeCount == 30)
      {
        //random number to deturmene the damage
        int hitMe = (int) (Math.random() * 4);
        if(hitMe == 1) // you lose yolk
        {
          //number of yole you lost
          int lost = (int) (Math.random() * inventoryNumbers[1]);
          inventoryNumbers[1] -= lost;
          if(inventoryNumbers[1] != 0){System.out.println("You lost " + lost + " yolk");} //have some yolk left over
          else{System.out.println("\nYou no longer have any yolk. You have to continue on foot");} //no yolk left over
          command = scan.nextLine(); //"safty net"
        }
        else if(hitMe == 2) //lose wheels
        {
          //number between 1 - 3 on how many wheels you lost
          int lost = (int) (Math.random() * 3);
          if(lost == 1) // if you are only missing one wheel
          {
            System.out.println("\nYou lost " + lost + " wheel");
            Options replace = new Options("\nWould you like to replace it?");
            replace.printYe();
            command = scan.nextLine();
            if(command.equals("y") || command.equals("Y")) //replaces wheels
            {
              if(inventoryNumbers[5] == lost || inventoryNumbers[5] > lost) //have the amount of wheels that was lost
              {
                inventoryNumbers[5] -= lost;
                System.out.println("\nYour wagon is ready to continue your journey");
              }
              else
              {
                System.out.println("\nYou don't have enough wheels to fix your wagon better off going on foot.");
              }
            }
            else if(command.equals("N") || command.equals("n"))
            {
              System.out.println("\nYou continue on foot");
            }
            else //safty net
            {
              System.out.println("\nWhat did you say again");
              command = scan.nextLine();
              if(command.equals("y") || command.equals("Y")) //replaces wheels
              {
                if(inventoryNumbers[5] == lost || inventoryNumbers[5] > lost) //have the amount of wheels that was lost
                {
                  inventoryNumbers[5] -= lost;
                  System.out.println("\nYour wagon is ready to continue your journey");
                }
                else
                {
                  System.out.println("\nYou don't have enough wheels to fix your wagon better off going on foot.");
                }
              }
              else
              {
                System.out.println("\nYou continue on foot");
              }
            }
          }
          else //missing more then one wheel
          {
            System.out.println("\nYou lost " + lost + " wheels");
            Options replace = new Options("\nWould you like to replace it?");
            replace.printYe();
            command = scan.nextLine();
            if(command.equals("y") || command.equals("Y")) //replaces wheels
            {
              if(inventoryNumbers[5] == lost || inventoryNumbers[5] > lost) //have the amount of wheels that was lost
              {
                inventoryNumbers[5] -= lost;
                System.out.println("\nYour wagon is ready to continue your journey");
              }
              else if(inventoryNumbers[5] != 0) //does not meet quata for lost wheels
              {
              System.out.println("\nYou only have " + inventoryNumbers[5] + " extra wheels to \"fix\" your wagon. Hey somthing is better then nothing");
                inventoryNumbers[5] = 0;
              }
              else //saftey net
              {
                System.out.println("\nYou don't have enough wheels to fix your wagon better off going on foot.");
              }
            }
            else if(command.equals("N") || command.equals("n"))
            {
              System.out.println("\nYou continue on foot");
            }
            else
            {
              System.out.println("\nWhat did you say again");
              command = scan.nextLine();
              if(command.equals("y") || command.equals("Y")) //replaces wheels
              {
                if(inventoryNumbers[5] == lost || inventoryNumbers[5] > lost) //have the amount of wheels that was lost
                {
                  inventoryNumbers[5] -= lost;
                  System.out.println("\nYour wagon is ready to continue your journey");
                }
                else if(inventoryNumbers[5] != 0) //does not meet quata for lost wheels
              {
              System.out.println("\nYou only have " + inventoryNumbers[5] + " extra wheels to \"fix\" your wagon. Hey somthing is better then nothing");
                inventoryNumbers[5] = 0;
              }
                else
                {
                  System.out.println("\nYou don't have enough wheels to fix your wagon better off going on foot.");
                }
              }
              else
              {
                System.out.println("\nYou continue on foot");
              }
            }
          }
        }
        else if(hitMe == 3) //broken axel
        {
          int lost = (int) (Math.random() * 2);
          if(lost == 1) //only lost one axel
          {
            System.out.println("\nYou lost " + lost + " axle.");
            Options fixIt = new Options("Will you like to fix it?");
            fixIt.printYe();
            command = scan.nextLine();
            if(command.equals("y") || command.equals("Y")) //fixes wagon
            {
              if(inventoryNumbers[6] == lost || inventoryNumbers[6] > lost) 
              {
                inventoryNumbers[6]--;
                System.out.println("\nYou are ready to hit the road again.");
              }
              else
              {
                System.out.println("\nYou're better off on foot because you don't have any more axels.");
              }
            }
            else if(command.equals("n") || command.equals("N"))//wont fix wagon
            {
              System.out.println("\nYou're better off on foot then.");
            }
            else //safty net
            {
              System.out.println("\nWhat did you say again?");
              command = scan.nextLine();
              if(command.equals("y") || command.equals("Y")) //fixes wagon
              {
                if(inventoryNumbers[6] == lost || inventoryNumbers[6] > lost) 
                {
                  System.out.println("\nYou are ready to hit the road again.");
                }
                else
                {
                  inventoryNumbers[6]--;
                  System.out.println("\nYou're better off on foot because you don't have any more axels.");
                }
              }
              else
              {
                System.out.println("\nYou're better off on foot then.");
              }
            }
          }
          else //has more then one axle damaged
          {
            System.out.println("\nYou lost " + lost + " axles.");
            Options fixIt = new Options("Will you like to fix it?");
            fixIt.printYe();
            command = scan.nextLine();
            if(command.equals("y") || command.equals("Y")) //fixes wagon
            {
              if(inventoryNumbers[6] == lost || inventoryNumbers[6] > lost) 
              {
                inventoryNumbers[6] -= lost;
                System.out.println("\nYou are ready to hit the road again.");
              }
              else
              {
                System.out.println("\nYou're better off on foot because you don't have any more axels.");
              }
            }
            else if(command.equals("n") || command.equals("N")) //wont fix wagon
            {
              System.out.println("\nYou're better off on foot then.");
            }
            else //safty net
            {
              System.out.println("\nWhat did you say again?");
              command = scan.nextLine();
              if(command.equals("y") || command.equals("Y")) //fixes wagon
              {
                if(inventoryNumbers[6] == lost || inventoryNumbers[6] > lost) 
                {
                  inventoryNumbers[6] -= lost;
                  System.out.println("\nYou are ready to hit the road again.");
                }
                else
                {
                  System.out.println("\nYou're better off on foot because you don't have any more axels.");
                }
              }
              else//wont fix wagon
              {
                System.out.println("\nYou're better off on foot then.");
              }
            }
          }
        }
        else //damged tounge
        {
          System.out.println("\nYour tongue is damaged, and all your yolk has escaped.");
          inventoryNumbers[0] = 0;
          Options fixIt = new Options("Will you fix it?");
          fixIt.printYe();
          command = scan.nextLine();
          if(command.equals("y") || command.equals("Y")) //fixing wagon
          {
            if(inventoryNumbers[7] >= 0)
            {
              inventoryNumbers[7]--;
              inventoryNumbers[1] = 0;
              System.out.println("\nYour wagon is ready, but you have no yolk to push it.");
            }
            else
            {
              inventoryNumbers[1] = 0;
              System.out.println("\nYou don't have any more tongues");
            }
          }
          else if(command.equals("n") || command.equals("N"))
          {
            System.out.println("\nSo instead of a fixed wagon with no yolk on it, you decided to have a damaged wagon with no yolk on it said wagon, which makes sense. I guess.");
          }
          else
          {
            System.out.println("\nWhat did you say again?");
            command = scan.nextLine();
            if(command.equals("y") || command.equals("Y")) //fixing wagon
            {
              if(inventoryNumbers[7] >= 0)
              {
                inventoryNumbers[7]--;
                System.out.println("\nYour wagon is ready, but you have no yolk to push it.");
              }
              else
              {
                System.out.println("\nYou don't have any more tongues");
              }
            }
            else if(command.equals("n") || command.equals("N"))
            {
              System.out.println("\nSo instead of a fixed wagon with no yolk on it, you decided to have a damaged wagon with no yolk on it said wagon, which makes sense. I guess.");
            } 
          }
        }
        wagonDamgeCount = 1;
      }

      //losing 2 pounds of food everday && hunger can also be affected here
      if(yourHealth != health[3] && inventoryNumbers[2] > 0) //checking for food and if your is alive
      {
        inventoryNumbers[2] -= 2;
        yourHealth = health[0];
        yourHunger = 0;
      }
      else if(yourHealth == health[3]){System.out.print("");} //you are dead and nothing happens
      else //you get hungry
      {
        if(yourHunger == 5)
        {
          yourHealth = health[3];
          System.out.println("\n" + names[0] + " died of hunger");
        }
        else
        {
          System.out.println("\n" + names[0] + " is now hungry.");
          yourHealth = health[4];
          yourHunger++;
        }
      }
      
      if(wifeHealth != health[3] && inventoryNumbers[2] > 0) //checking for food and if wife is alive
      {
        inventoryNumbers[2] -= 2;
        wifeHealth = health[0];
        wifeHunger = 0;
      }
      else if(wifeHealth == health[3]){System.out.print("");} //wife is dead
      else//wife is hungry
      {
        if(wifeHunger == 5)
        {
          wifeHealth = health[3];
          System.out.println("\n" + names[1] + " died of hunger");
        }
        else
        {
          System.out.println("\n" + names[1] + " is now hungry.");
          wifeHealth = health[4];
          wifeHunger++;
        }
      }
      
      if(grandmaHealth != health[3] && inventoryNumbers[2] > 0) //checking for food and if grandma is alive
      {
        inventoryNumbers[2] -= 2;
        grandmaHealth = health[0];
        grandmaHunger = 0;
      }
      else if(grandmaHealth == health[3]){System.out.print("");} //grandma is dead
      else //gradma is hungry
      {
        if(grandmaHunger == 5)
        {
          grandmaHealth = health[3];
          System.out.println("\n" + names[2] + " died of hunger");
        }
        else
        {
          System.out.println("\n" + names[2] + " is now hungry.");
          grandmaHealth = health[4];
          grandmaHunger++;
        }
      }
      
      if(sonHealth != health[3] && inventoryNumbers[2] > 0) //checking for food and if son is alive
      {
        inventoryNumbers[2] -= 2;
        sonHealth = health[0];
        sonHunger = 0;
      }
      else if(sonHealth == health[3]){System.out.print("");} //son is dead
      else//son is hungry
      {
        if(sonHunger == 5)
        {
          sonHealth = health[3];
          System.out.println("\n" + names[3] + " died of hunger");
        }
        else
        {
          System.out.println("\n" + names[3] + " is now hungry.");
          sonHealth = health[4];
          sonHunger++;
        }
      }
      
      if(daughterHealth != health[3] && inventoryNumbers[2] > 0) //checking for food and if daughter is alive
      {
        inventoryNumbers[2] -= 2;
        daughterHealth = health[0];
        daughterHunger = 0;
      }
      else if(daughterHealth == health[3]){System.out.print("");} //daughter is dead
      else //daughter is hungry
      {
        if(daughterHunger == 5)
        {
          daughterHealth = health[3];
          System.out.println("\n" + names[4] + " died of hunger");
        }
        else
        {
          System.out.println("\n" + names[4] + " is now hungry.");
          daughterHealth = health[4];
          daughterHunger++;
        }
      }

      //posined people that arn't healed
      if(yourHealth == health[5] && yourPosined != 5) //you are posioned
      {
        yourPosined++;
        System.out.println("\n" + names[0] + " is still poisoned.");
      }
      else if(yourHealth != health[5])
      {
        System.out.print("");
      }
      else
      {
        yourHealth = health[3];
        System.out.println("\n" + names[0] + " has passed away from poisoning");
      }

      if(wifeHealth == health[5] && wifePosined != 5) //wife is posioned
      {
        wifePosined++;
        System.out.println("\n" + names[1] + " is still poisoned.");
      }
      else if(wifeHealth != health[5])
      {
        System.out.print("");
      }
      else
      {
        wifeHealth = health[3];
        System.out.println("\n" + names[1] + " has passed away from poisoning");
      }

      if(grandmaHealth == health[5] && grandmaPosined != 5) //grandma is posioned
      {
        grandmaPosined++;
        System.out.println("\n" + names[2] + " is still poisoned.");
      }
       else if (grandmaHealth != health[5])
      {
          System.out.print("");
        }
      else
      {
        grandmaHealth = health[3];
        System.out.println("\n" + names[2] + " has passed away from poisoning");
      }

      if(sonHealth == health[5] && sonPosined != 5) //son is posioned
      {
        sonPosined++;
        System.out.println("\n" + names[3] + " is still poisoned.");
      }
      else if(sonHealth != health[5])
      {
        System.out.print("");
      }
      else
      {
        sonHealth = health[3];
        System.out.println("\n" + names[3] + " has passed away from poisoning");
      }

      if(daughterHealth == health[5] && daughterPosined != 5) //dauguater is posioned
      {
        daughterPosined++;
        System.out.println("\n" + names[4] + " is still poisoned.");
      }
      else if(daughterHealth != health[5])
      {
        System.out.println();
      }
      else
      {
        daughterHealth = health[3];
        System.out.println("\n" + names[4] + " has passed away from poisoning");
      }

      //injured people that arn't healed
      if(yourHealth == health[2] && yourInjured != 2) //your injured
      {
        yourInjured++;
        System.out.println("\n" + names[0] + " is badly injured.");
      }
      else if(yourHealth != health[2])
      {
        System.out.print("");
      }
      else
      {
        yourHealth = health[3];
        System.out.println("\n" + names[0] + " died to there injuries");
      }

      if(wifeHealth == health[2] && wifeInjured != 2) //wife is injured
      {
        wifeInjured++;
        System.out.println("\n" + names[1] + " is badly injured.");
      }
      else if(wifeHealth != health[2])
      {
          System.out.print("");
        }
      else
      {
        wifeHealth = health[3];
        System.out.println("\n" + names[1] + " died to there injuries");
      }

      if(grandmaHealth == health[2] && grandmaInjured != 2) //grandma is injured
      {
        grandmaInjured++;
        System.out.println("\n" + names[2] + " is badly injured.");
      }
      else if(grandmaHealth != health[2])
      {
          System.out.print("");
        }
      else
      {
        grandmaHealth = health[3];
        System.out.println("\n" + names[2] + " died to there injuries");
      }

      if(sonHealth == health[2] && sonInjured != 2) //son is injured
      {
        sonInjured++;
        System.out.println("\n" + names[3] + " is badly injured.");
      }
      else if(sonHealth != health[2])
      {
        System.out.print("");
      }
      else
      {
        sonHealth = health[3];
        System.out.println("\n" + names[3] + " died to there injuries");
      }

      if(daughterHealth == health[2] && daughterInjured != 2) //daughter is injured
      {
        daughterInjured++;
        System.out.println("\n" + names[4] + " is badly injured.");
      }
      else if(daughterHealth != health[2])
      {
        System.out.print("");
      }
      else
      {
        daughterHealth = health[3];
        System.out.println("\n" + names[4] + " died to there injuries");
      }

      //sick counter
      if(yourHealth == health[6] && yourSick != 10) //your sick
      {
        yourSick++;
        System.out.println("\n" + names[0] + " is still sick");
      }
      else if(yourHealth != health[6]) //your not sick
      {
        System.out.print("");
      }
      else //you diead for being sick
      {
        System.out.println("\n" + names[0] + " died from thier illness");
        yourHealth = health[3];
      }

      if(wifeHealth == health[6] && wifeSick != 10) //wife is sick
      {
        wifeSick++;
        System.out.println("\n" + names[1] + " is still sick");
      }
      else if(wifeHealth != health[6]) //wife not sick
      {
        System.out.print("");
      }
      else //wife diead for being sick
      {
        System.out.println("\n" + names[1] + " died from thier illness");
        wifeHealth = health[3];
      }

      if(grandmaHealth == health[6] && grandmaSick != 10) //grandma is sick
      {
        grandmaSick++;
        System.out.println("\n" + names[2] + " is still sick");
      }
      else if(grandmaHealth != health[6]) //grandma is not sick
      {
        System.out.print("");
      }
      else //grandma diead for being sick
      {
        System.out.println("\n" + names[2] + " died from thier illness");
        grandmaHealth = health[3];
      }

      if(sonHealth == health[6] && sonSick != 10) //son is sick
      {
        yourSick++;
        System.out.println("\n" + names[3] + " is still sick");
      }
      else if(sonHealth != health[6]) //son is not sick
      {
        System.out.print("");
      }
      else //son is diead for being sick
      {
        System.out.println("\n" + names[3] + " died from thier illness");
        sonHealth = health[3];
      }

      if(daughterHealth == health[6] && daughterSick != 10) //daughter is sick
      {
        daughterSick++;
        System.out.println("\n" + names[4] + " is still sick");
      }
      else if(daughterHealth != health[6]) //daughter is not sick
      {
        System.out.print("");
      }
      else //daughter is diead for being sick
      {
        System.out.println("\n" + names[4] + " died from thier illness");
        daughterHealth = health[3];
      }

      //anything bad that could happen
      //randmom numbers
      int badStuff = (int) (Math.random() * 2000);
      int personAffected = (int) (Math.random() * names.length);
      //array for the helth of all the players
      String[] ourHealth = {yourHealth, wifeHealth, grandmaHealth, sonHealth, daughterHealth};
      for(int i = 0; i < 200; i++)
        {
          if(ourHealth[personAffected] == health[3]) //person chosen is dead
          {
            personAffected = (int) (Math.random() * names.length);
          }
          else //person chosen is not dead
          {
            if(badStuff >= 0 && badStuff <= 100) //you shot yourself or somone shoots you by acident
            {
              int chance = (int) (Math.random() * 100);
              if(chance <= 50) //you shoot yourself
              {
                System.out.println("\nWhile out on your journey," + names[personAffected] + " found a deer and decided to kill it. \nI don't know how " + names[personAffected] + " held the gun, but they shot themselves in the leg.");
                if(personAffected == 0){yourHealth = health[2];}
                else if(personAffected == 1){wifeHealth = health[2];}
                else if(personAffected == 2){grandmaHealth = health[2];}
                else if(personAffected == 3){sonHealth = health[2];}
                else{daughterHealth = health[2];}
                break;
              }
              else
              {
                int dead = (int) (Math.random() * 50);
                System.out.println("Out on a hunting trip, " + names[personAffected] + " was shot in the back.");
                if(dead <= 50)
                {
                  System.out.println("\nThey are badly hurt but can still live for a day or 2");
                  if(personAffected == 0){yourHealth = health[2];}
                  else if(personAffected == 1){wifeHealth = health[2];}
                  else if(personAffected == 2){grandmaHealth = health[2];}
                  else if(personAffected == 3){sonHealth = health[2];}
                  else{daughterHealth = health[2];}
                  break;
                }
                else
                {
                  System.out.println("\nSadly the bullet hit them straight in the heart, killing them instantly");
                  if(personAffected == 0){yourHealth = health[3];}
                  else if(personAffected == 1){wifeHealth = health[3];}
                  else if(personAffected == 2){grandmaHealth = health[3];}
                  else if(personAffected == 3){sonHealth = health[3];}
                  else{daughterHealth = health[3];}
                  break;
                }
              }
            }
            else if(badStuff >= 101 && badStuff <= 200) //snake bits you getting you posined
            {
              System.out.println("\n" + names[personAffected] + " was bitten by a snake and is now poisoned.");
              if(personAffected == 0){yourHealth = health[5];}
              else if(personAffected == 1){wifeHealth = health[5];}
              else if(personAffected == 2){grandmaHealth = health[5];}
              else if(personAffected == 3){sonHealth = health[5];}
              else{daughterHealth = health[5];}
              break;
            }
            else if(badStuff >= 201 && badStuff <= 300) //falling off the wagon and getting trampled by either yolk or the wagon wheels
            {
              int chance = (int) (Math.random() * 50);
              if(personAffected == 0){yourHealth = health[2];}
              else if(personAffected == 1){wifeHealth = health[2];}
              else if(personAffected == 2){grandmaHealth = health[2];}
              else if(personAffected == 3){sonHealth = health[2];}
              else{daughterHealth = health[2];}
              System.out.println("\n" + names[personAffected] + " fell off the wagon");
              if(chance >= 25) //gets injured by yolk
              {
                System.out.println("They were later trambled by yolk");
                break;
              }
              else
              {
                System.out.println("They were later run over by the wheels on the wagon");
                break;
              }
            }
            else if(badStuff >= 301 && badStuff <= 400) //killed by a mercenary
            {
              System.out.println("\n" + names[personAffected] + " was killed by a mercenary.");
              if(personAffected == 0){yourHealth = health[3];}
              else if(personAffected == 1){wifeHealth = health[3];}
              else if(personAffected == 2){grandmaHealth = health[3];}
              else if(personAffected == 3){sonHealth = health[3];}
              else{daughterHealth = health[3];}
              break;
            }
            else if(badStuff >= 401 && badStuff <= 500) //falling off the wagon and dying beacuse your gus where close to a cliff
            {
              System.out.println("\n" + names[personAffected] + " fell off the wagon while we are next to a cliff. \nI'm sorry, but we lost " + names[personAffected]);
              if(personAffected == 0){yourHealth = health[3];}
              else if(personAffected == 1){wifeHealth = health[3];}
              else if(personAffected == 2){grandmaHealth = health[3];}
              else if(personAffected == 3){sonHealth = health[3];}
              else{daughterHealth = health[3];}
              break;
            }
            else if(badStuff >= 501 && badStuff <= 600) //theves steal your money
            {
              int lost = (int) (Math.random() * 50);
              System.out.println("\n we lost $" + lost + " from some thieves.");
              inventoryNumbers[0] -= lost;
              break;
            }
            else if(badStuff >= 601 && badStuff <= 900) //someone is sick
            {
              System.out.println("\n" + names[personAffected] + " is now sick");
              if(personAffected == 0){yourHealth = health[6];}
              else if(personAffected == 1){wifeHealth = health[6];}
              else if(personAffected == 2){grandmaHealth = health[6];}
              else if(personAffected == 3){sonHealth = health[6];}
              else{daughterHealth = health[6];}
              break;
            }
            else
            {
              System.out.print("");
              break;
            }
          }
        }
      

      //gaining some extra cash
      int dayCounts = (int) (Math.random() * 6);
      if(moneyCount == dayCounts)
      {
        int gainedMoney = (int) (Math.random() * 200) + 2;
        System.out.println("\nYou gained $" + gainedMoney );
        inventoryNumbers[0] += gainedMoney;
        this.money += inventoryNumbers[0];
        moneyCount = 1;
      }
      else
      {
        if(moneyCount > 7)
        {
          moneyCount = 1;
        }
      }
    }
    
    //seting the names
    public String setYourName(String name){return this.yourName =  name;} //setting your name
    public String setWifeName(String name){return this.wifeName =  name;} //setting wife name
    public String setGrandmaName(String name){return this.grandmaName =  name;} //setting gradma's name
    public String setSonName(String name){return this.sonName =  name;} //setting son name
    public String setDaughterName(String name){return this.daughterName =  name;} //setting daughter name

    //getting name
    public String getYourName(){return this.yourName;} //getting your name
    public String getWifeName(){return this.wifeName;} //getting wife's name
    public String getGrandmaName(){return this.grandmaName;} //getting grandma's name
    public String getSonName(){return this.sonName;} //getting son's name
    public String getDaughterName(){return this.daughterName;} //getting daughters name

    //getting the health of everyone
    public boolean getEveryonesHealth()
    {
      if(yourHealth == health[3] && wifeHealth == health[3] && grandmaHealth == health[3] && sonHealth == health[3] && daughterHealth == health[3])
      {
        return true;
      }
      else
      {
        return false;
      }
    }
  
    //checking the number of days;
    public int checkDays(){return this.days;}
    
    //testing parts

    //killing off somone randomley
    public void kill()
    {
      //random number
      int kills = (int) (Math.random() * names.length);
      if(kills == 0){yourHealth = health[3];}
      else if(kills == 1){wifeHealth = health[3];}
      else if(kills == 2){grandmaHealth = health[3];}
      else if(kills == 3){sonHealth = health[3];}
      else{daughterHealth = health[3];}
    }

    //advance 15 days
    public int day15()
    {
      clothesCount += 15;
      return this.days += 15;
    }

    //advancing 30 days
    public int day30()
    {
      wagonDamgeCount += 30;
      return this.days += 30;
    }
  //printing out count
    public void countNumber(){System.out.println(clothesCount + "\n" + wagonDamgeCount + "\n" + moneyCount);}
  }
