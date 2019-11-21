/**
 * This frame displays the actions that an administrator can perform on a student
 * 
 */
package sims;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author owner
 */
public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
        initComponents();
        setLocationRelativeTo(null);
        dispTableInfo();
        getRootPane().setDefaultButton(modStudent);
        String[] chooseCourse = {"4315 Operating Systems","2302 Digital Logic",
                "3308 Numerical Methods","3321 Software Engineering","3326 Network Security",
        "4328 Parallel Computing"};
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminTabbedPane = new javax.swing.JTabbedPane();
        modify = new javax.swing.JPanel();
        stuID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        modStudent = new javax.swing.JButton();
        selectStudentDisp = new javax.swing.JScrollPane();
        selStudTable = new javax.swing.JTable();
        allStudentDisp = new javax.swing.JScrollPane();
        dispAllTable = new javax.swing.JTable();
        addClass = new javax.swing.JButton();
        dispAllLabel = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        allCourseDisp = new javax.swing.JScrollPane();
        dispCourseTable = new javax.swing.JTable();
        courseLabel = new javax.swing.JLabel();
        courseList = new javax.swing.JComboBox<>();
        addNew = new javax.swing.JPanel();
        stuNameLabel = new javax.swing.JLabel();
        passwLabel = new javax.swing.JLabel();
        studName = new javax.swing.JTextField();
        passw = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        addGradesPanel = new javax.swing.JPanel();
        studentLabel = new javax.swing.JLabel();
        courseSelectLabel = new javax.swing.JLabel();
        examLabel = new javax.swing.JLabel();
        gradeLabel = new javax.swing.JLabel();
        gradeEntered = new javax.swing.JTextField();
        studentSelection = new javax.swing.JComboBox<>();
        courseSelection = new javax.swing.JComboBox<>();
        assignmentSelection = new javax.swing.JComboBox<>();
        changeGrade = new javax.swing.JButton();
        clearSelections = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        previous = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator View - SIMS");
        setBackground(new java.awt.Color(165, 191, 217));

        adminTabbedPane.setBackground(new java.awt.Color(165, 191, 217));
        adminTabbedPane.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        stuID.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Enter Student ID: ");

        modStudent.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        modStudent.setMnemonic('s');
        modStudent.setText("Select");
        modStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modStudentActionPerformed(evt);
            }
        });

        selStudTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        selectStudentDisp.setViewportView(selStudTable);

        dispAllTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        allStudentDisp.setViewportView(dispAllTable);

        addClass.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        addClass.setText("Add Class");
        addClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassActionPerformed(evt);
            }
        });

        dispAllLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        dispAllLabel.setText("Enrolled Students:");

        clear.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        dispCourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        allCourseDisp.setViewportView(dispCourseTable);

        courseLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        courseLabel.setText("Active Courses");

        courseList.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        courseList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4315 Operating Systems", "2302 Digital Logic", "3308 Numerical Methods", "3321 Software Engineering", "3326 Network Security", "4328 Parallel Computing" }));
        courseList.setToolTipText("Select a Course to Add...");

        javax.swing.GroupLayout modifyLayout = new javax.swing.GroupLayout(modify);
        modify.setLayout(modifyLayout);
        modifyLayout.setHorizontalGroup(
            modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allStudentDisp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
                    .addComponent(selectStudentDisp)
                    .addComponent(allCourseDisp)
                    .addGroup(modifyLayout.createSequentialGroup()
                        .addGroup(modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(dispAllLabel)
                            .addComponent(courseLabel)
                            .addGroup(modifyLayout.createSequentialGroup()
                                .addComponent(stuID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(modStudent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(courseList, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(addClass, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        modifyLayout.setVerticalGroup(
            modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modStudent)
                    .addComponent(addClass)
                    .addComponent(clear)
                    .addComponent(courseList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectStudentDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(courseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allCourseDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dispAllLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(allStudentDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        adminTabbedPane.addTab("Modify", modify);

        stuNameLabel.setText("Student's Name: ");

        passwLabel.setText("Password: ");

        submit.setMnemonic('b');
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addNewLayout = new javax.swing.GroupLayout(addNew);
        addNew.setLayout(addNewLayout);
        addNewLayout.setHorizontalGroup(
            addNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submit)
                    .addGroup(addNewLayout.createSequentialGroup()
                        .addGroup(addNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stuNameLabel)
                            .addComponent(passwLabel))
                        .addGap(18, 18, 18)
                        .addGroup(addNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studName)
                            .addComponent(passw, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))))
                .addContainerGap(690, Short.MAX_VALUE))
        );
        addNewLayout.setVerticalGroup(
            addNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stuNameLabel)
                    .addComponent(studName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(addNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwLabel)
                    .addComponent(passw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(submit)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        adminTabbedPane.addTab("Add New", addNew);

        studentLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        studentLabel.setText("Select Student: ");

        courseSelectLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        courseSelectLabel.setText("Select Course: ");

        examLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        examLabel.setText("Choose Assignment:");

        gradeLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        gradeLabel.setText("Enter Grade:");

        studentSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<null>", "1", "2", "3", "4" }));

        courseSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        assignmentSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<null>", "exam_one", "final_exam" }));

        changeGrade.setMnemonic('g');
        changeGrade.setText("Submit Grade");
        changeGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeGradeActionPerformed(evt);
            }
        });

        clearSelections.setText("Clear");
        clearSelections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSelectionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addGradesPanelLayout = new javax.swing.GroupLayout(addGradesPanel);
        addGradesPanel.setLayout(addGradesPanelLayout);
        addGradesPanelLayout.setHorizontalGroup(
            addGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addGradesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(gradeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(examLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseSelectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(addGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addGradesPanelLayout.createSequentialGroup()
                        .addComponent(changeGrade)
                        .addGap(18, 18, 18)
                        .addComponent(clearSelections, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(studentSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(assignmentSelection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gradeEntered))
                    .addComponent(courseSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(534, Short.MAX_VALUE))
        );
        addGradesPanelLayout.setVerticalGroup(
            addGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addGradesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseSelectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(examLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignmentSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(addGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradeEntered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(addGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeGrade)
                    .addComponent(clearSelections))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        adminTabbedPane.addTab("Add Grades", addGradesPanel);

        exit.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        exit.setMnemonic('x');
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        previous.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        previous.setText("Previous");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminTabbedPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(previous)
                        .addGap(18, 18, 18)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminTabbedPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(previous))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dispTableInfo(){
    	
        try{
            Connection conn = Db.java_db();
            String sql = "SELECT * FROM student_info";
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            dispAllTable.setModel(DbUtils.resultSetToTableModel(rs));             
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void modStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modStudentActionPerformed
        // TODO add your handling code here:
        int studID = Integer.parseInt(stuID.getText());
        stuID.setEditable(false);
        //send this studID to the database and return the info associated with it
        //and put in selStudTable
        try{
            Connection conn = Db.java_db();
            String sql = "SELECT * FROM student_info WHERE student_id = " + studID;
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            selStudTable.setModel(DbUtils.resultSetToTableModel(rs));
              
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{           
            Connection conn = Db.java_db();
            String sql = "SELECT * FROM courses WHERE student_id = " + studID;
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            dispCourseTable.setModel(DbUtils.resultSetToTableModel(rs));
              
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_modStudentActionPerformed

    /**
     * this button will add the student to the database and display the generated
     * student ID number.
     * @param evt 
     */
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        int p = newIDGen();
        JOptionPane.showMessageDialog(null, "The student's Institution ID is: "+p);
        //add the student to the database with sql statements here
        
        
    }//GEN-LAST:event_submitActionPerformed

    /**
     * This method will pull the values from the stuID JLabel and the selected value
     * from the courseList JComboBox, change them to integer values and pass them 
     * to the addClass method in the Login class.
     * @param evt the button click that initiates the action.
     */
    private void addClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassActionPerformed
        // TODO add your handling code here:
        //pull from stuID and new JLabel and pass to Update.java
        int idNum = Integer.parseInt(stuID.getText());
        int courseID; String p;
        String x = String.valueOf(courseList.getSelectedItem());
        if(x.length()>4){
            p = x.substring(0,4);
        }else{
            p =x;
        }
        courseID = Integer.parseInt(p);
        System.out.println(idNum+"\t"+ courseID);
        Login.addClass(idNum, courseID);
    }//GEN-LAST:event_addClassActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        // TODO add your handling code here:
        new mainFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_previousActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        stuID.setText("");
        stuID.setEditable(true);
    }//GEN-LAST:event_clearActionPerformed

    private void changeGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeGradeActionPerformed
        // TODO add your handling code here:
        //collect the values from the combo boxes and send them to Login class
        //addGrades method.
    }//GEN-LAST:event_changeGradeActionPerformed

    private void clearSelectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSelectionsActionPerformed
        // TODO add your handling code here:
        //set studentSelection to null          these three are JComboBoxes...
        //clear courseSelection somehow
        //set assignmentSelection to null
        gradeEntered.setText("");
    }//GEN-LAST:event_clearSelectionsActionPerformed

    /**
     * this method will pull the last id from the database, add one to it, and
     * return the new number as the next ID number to be assigned to the new student.
     */
    private int newIDGen(){
        //pull the last id number from the database
        int i = 4;
        
        int newID = i + 1;
        return newID;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClass;
    private javax.swing.JPanel addGradesPanel;
    private javax.swing.JPanel addNew;
    private javax.swing.JTabbedPane adminTabbedPane;
    private javax.swing.JScrollPane allCourseDisp;
    private javax.swing.JScrollPane allStudentDisp;
    private javax.swing.JComboBox<String> assignmentSelection;
    private javax.swing.JButton changeGrade;
    private javax.swing.JButton clear;
    private javax.swing.JButton clearSelections;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JComboBox<String> courseList;
    private javax.swing.JLabel courseSelectLabel;
    private javax.swing.JComboBox<String> courseSelection;
    private javax.swing.JLabel dispAllLabel;
    private javax.swing.JTable dispAllTable;
    private javax.swing.JTable dispCourseTable;
    private javax.swing.JLabel examLabel;
    private javax.swing.JButton exit;
    private javax.swing.JTextField gradeEntered;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modStudent;
    private javax.swing.JPanel modify;
    private javax.swing.JTextField passw;
    private javax.swing.JLabel passwLabel;
    private javax.swing.JButton previous;
    private javax.swing.JTable selStudTable;
    private javax.swing.JScrollPane selectStudentDisp;
    private javax.swing.JTextField stuID;
    private javax.swing.JLabel stuNameLabel;
    private javax.swing.JTextField studName;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JComboBox<String> studentSelection;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
