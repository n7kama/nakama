public class Cooking{
  private static double teaspoons;
   private static double tablespoons;
   private static double cups;
   private static double ounces;
   private static double pints;
   
   
   
    public static double teaspoonsToTablespooons (double teaspoons){
        return teaspoons * 3;
    }
    public static double tablespoonsToTeaspoons(double tablespoons){
        return tablespoons *3;
    }
    public static double tablespoonsToCups(double tablespoons){
        return tablespoons / 16;
    }
    public static double cupsToTablespoons(double cups){
        return  cups * 16;
    }
    public static double ouncesToCups(double ounces){
        return ounces / 8;
    }
    public static double cupsToOunces (double cups){
        return cups * 8;
    }
    public static double cupsToPints(double cups){
        return cups / 2;
    }
    public static double pintsToCups(double pints){
        return pints * 2;
    }
}