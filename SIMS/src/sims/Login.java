/**
 * This class houses the login password check, methods for adding a class to 
 * a student record, deleting a class from a student record, viewing grades for 
 * all courses, viewing enrolled classes, viewing GPA, and GPA calculation.
 */
package sims;




/**
 *
 * @author Jacquelyn Johnson and Andrew Tomich
 */
public class Login {
    String pass, UID;
    
    /**
     * constructor for the Login class, accepts two Strings for the password verification
    */
    public Login(String a, String ID){
        pass = a;
        UID = ID;
        
        if (passCheck(a,UID))
        {
            //EXECUTE SUCCESSFUL LOGIN
        }
        else
        {
            //DENY LOGIN AND DISPLAY MESSAGE IN FRAMES
        }
    }
    
    /**
     * check password method. accepts a string variable to test for password
     * validation
     * @param a password to validate
     */
    public boolean passCheck(String a, String ID){
        boolean valid = false;
        //needs to pull password associated with the student ID from database to 
        //validate
        //return boolean
        
        try{
            String queryString = "SELECT SadminName, Spw FROM admins where SadminName=? and Spw=?";
           
            ps = con.prepareStatement(queryString);
            ps.setString(1,a);
            ps.setString(2,ID);
            ResultSet results = ps.executeQuery();
            
            while (results.next()){
                String dbID = results.getString("SadminName");
                String dbPass = results.getString("Spw");
                
                if (ID.equals(dbID))
                {
                    if (a.equals(dbPass))
                    {
                        valid = true;
                        break;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            results.close();
        } catch (SQLException sql) {
            out.println(sql);
        }  
        
        return valid;
    }
    
    /**
     * add a class method
     */
    public void addClass(){
        
    }
    
    /**
     * delete a class method
     */
    public void delClass(){
        
    }
    
    /**
     * view enrolled class method
     */
    public void viewClasses(){
        
    }
    
    /**
     * view grades for all courses enrolled
     */
    public void viewGrades(){
        
    }
    
    /**
     * view GPA
     */
    public void showGPA(){
        
    }
    
//    /**
//     * calculation of GPA
//     */
//    public double calcGPA(){
//        
//    }
}
