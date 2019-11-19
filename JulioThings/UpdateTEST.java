import java.sql.*;


public class fetch {
    
    // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/info";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "vermilion171190";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.cj.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();

      String sql = "UPDATE Users SET id=?, first_name=?, Last_name=? birth_date=? WHERE id=?";
      PreparedStatement stmt = conn.prepareStatement(sql);
      stmt.setString(1, "id");
      stmt.setString(2, "first_name");
      stmt.setString(3, "last_name");
      stmt.setString(4, "birth_date");
     
     
   } catch(Exception e){
      System.out.println(e);
   }
   
}//end main
}//end JDBCExample