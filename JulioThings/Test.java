package fetch;
import java.sql.*;


public class Test {
    
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   
   try{

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = Db.java_db();
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();

      String sql = "SELECT * FROM student_info";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         int student_id  = rs.getInt("student_id");
         String first = rs.getString("first_name");
         String last = rs.getString("last_name");
         String birth = rs.getString("birth_date");
         String password = rs.getString("password");

         //Display values
         System.out.print("ID: " + student_id);
         System.out.print(", First: " + first);
         System.out.print(", Last: " + last);
         System.out.print(", Birth Date: " + birth);
         System.out.println(", Password: " + password);
      }
      rs.close();
   } catch (Exception e){
       //JOptionPane.showMessageDialog(null, "Could not connect to database");
       System.out.println("Could not connect to database");
   	}
  }//end main
}//end JDBCExample