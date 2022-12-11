import java.io.*;
import java.nio.file.*;

public class Le_Inserts {

   public static final String delimiter = ", ";
   //public static FileWriter sqlConverter;
   public static void read(String csvFile) {
      try {
         File file = new File(csvFile);
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         String line = "";
         String tableName = "";
         //String[] tempArr;
         tableName = br.readLine();

        while((line = br.readLine()) != null) 
         {
            String insertStatement = "INSERT INTO " + tableName + " VALUES (" + line + ");";
            //System.out.println(insertStatement);

         	FileWriter fw = new FileWriter("Le_Inserts.sql", true);
      		PrintWriter pw = new PrintWriter(fw);

      		pw.println(insertStatement);
    		fw.flush();
    		pw.flush();
      		pw.close();
         }
         FileWriter fw = new FileWriter("Le_Inserts.sql", true);
      	PrintWriter pw = new PrintWriter(fw);

   
      		pw.println("COMMIT;");
    		fw.flush();
    		pw.flush();
      		pw.close();
         br.close();
         
        //sqlConverter = new FileWriter("Le_Inserts.sql");

         } catch(IOException ioe) {
            ioe.printStackTrace();
         }
   }

   public static void main(String[] args) throws Exception {
      // csv file to read
   		Path path
            = Paths.get("Le_Inserts.sql");
            Files.deleteIfExists(path);
        

      String physician = "csvfiles\\Physician.csv";
       Le_Inserts.read(physician);
      String bed = "csvfiles\\Bed.csv";
       Le_Inserts.read(bed);
      String test1 = "csvfiles\\Test1.csv";
       Le_Inserts.read(test1);
      String patient = "csvfiles\\Patient.csv";
       Le_Inserts.read(patient);
      String nurse = "csvfiles\\Nurse.csv";
       Le_Inserts.read(nurse);
      String timecard = "csvfiles\\Timecard.csv";
       Le_Inserts.read(timecard);
      String orderTest = "csvfiles\\OrderTest.csv";
       Le_Inserts.read(orderTest);
   }
  
   
}