public class Cleaner
  {
    public void clean()
    {
      System.out.println("\033[H\033[2J");
      System.out.flush();
    }
  }