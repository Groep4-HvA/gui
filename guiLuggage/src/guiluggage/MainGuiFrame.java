/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiluggage;


/**
 *
 * @author sean
 */
public class MainGuiFrame extends java.awt.Frame {
private passwordConfirm passOverlay = new passwordConfirm(new javax.swing.JFrame(),true);
    /**
     * Creates new form MainGuiFrame
     */
    public String button1;
    public String button2;
    public boolean inBeheer = false;
    public boolean beheer = false;
    public void beheerSetter(boolean value){
        beheer = value;
    }
    public MainGuiFrame() {
        if (beheer){
            button1 = "Medewerker";
            button2 = "Manager";
        }else{
            button1 = "Luggage";
            button2 = "Passenger";
        }
        
        initComponents();
        if(beheer){appManagementButton.setVisible(false);};
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        advanced = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchInput = new javax.swing.JTextArea();
        searchButton = new javax.swing.JButton();
        addNewButton1 = new javax.swing.JButton();
        addNewButton2 = new javax.swing.JButton();
        javax.swing.JButton moreButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableResults = new javax.swing.JTable();
        appManagementButton = new javax.swing.JButton();
        myAccountButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        advanced.setText("Advanced");
        advanced.setToolTipText("Advanced search");
        advanced.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                advancedClicked(evt);
            }
        });
        advanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedActionPerformed(evt);
            }
        });

        searchInput.setColumns(20);
        searchInput.setRows(1);
        searchInput.setToolTipText("");
        jScrollPane1.setViewportView(searchInput);

        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        addNewButton1.setText("Add new: " + button1);
        addNewButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewButton1MouseClicked(evt);
            }
        });
        addNewButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickedButton1(evt);
            }
        });

        addNewButton2.setText("Add new: "+ button2);
        addNewButton2.setToolTipText("");
        addNewButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewButton2MouseClicked(evt);
            }
        });
        addNewButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickedButton2(evt);
            }
        });

        moreButton.setText("More");
        moreButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moreButtonMouseClicked(evt);
            }
        });
        moreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreButtonActionPerformed(evt);
            }
        });

        tableResults.setModel(new javax.swing.table.DefaultTableModel(
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
        tableResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableResultsMousePressed(evt);
            }
        });
        tableResults.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableResultsKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tableResults);

        appManagementButton.setText("Application management");
        appManagementButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appManagementButtonMouseClicked(evt);
            }
        });
        appManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appManagementButtonActionPerformed(evt);
            }
        });

        myAccountButton.setText("My account");
        myAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myAccountButtonMouseClicked(evt);
            }
        });
        myAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myAccountButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(advanced)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(searchButton)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 931, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(addNewButton1)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(addNewButton2)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(moreButton))
                        .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 928, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(appManagementButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(myAccountButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(logoutButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(appManagementButton)
                    .add(myAccountButton)
                    .add(logoutButton))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(searchButton)
                    .add(advanced))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(addNewButton1)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(moreButton)
                        .add(addNewButton2)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void advancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advancedActionPerformed
      Advanced advancedPopUp = new Advanced();
      advancedPopUp.setVisible(true);
    }//GEN-LAST:event_advancedActionPerformed

    private void moreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moreButtonActionPerformed

    private void appManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appManagementButtonActionPerformed
       
    }//GEN-LAST:event_appManagementButtonActionPerformed

    private void advancedClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advancedClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_advancedClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonMouseClicked

    private void moreButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moreButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_moreButtonMouseClicked

    private void addNewButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewButton1MouseClicked

    private void addNewButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewButton2MouseClicked

    private void myAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAccountButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_myAccountButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void appManagementButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appManagementButtonMouseClicked
        while(beheer){
            if(inBeheer){
                inBeheer = false;
                addNewButton1.setText("Add new: " + button1);
                addNewButton2.setText("Add new: " + button2);
                appManagementButton.setText("Application Management");
            }else{
                inBeheer = true;
                appManagementButton.setText("Overzicht");
            addNewButton1.setText("Add new: Manager");
            addNewButton2.setText("Add new: Medewerker");
            }
        }
    }//GEN-LAST:event_appManagementButtonMouseClicked

    private void clickedButton2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickedButton2
            addPassenger gui3 = new addPassenger();
            addMedewerker gui2 = new addMedewerker();
        if (inBeheer){
            gui2.setVisible(true);
        }else{
            gui3.setVisible(true);
        }
    }//GEN-LAST:event_clickedButton2

    private void clickedButton1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickedButton1
        addLuggage gui = new addLuggage();
        addMedewerker gui2 = new addMedewerker();
        if (inBeheer){
            gui2.setVisible(true);
        }else{
            gui.setVisible(true);
        }
    }//GEN-LAST:event_clickedButton1

    private void myAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAccountButtonActionPerformed
        
        passOverlay.pack();
        passOverlay.setVisible(true);
        passOverlay.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_myAccountButtonActionPerformed

    private void tableResultsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableResultsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableResultsKeyPressed

    private void tableResultsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableResultsMousePressed
        addLuggage l = new addLuggage();
        l.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_tableResultsMousePressed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        logIn logOut = new logIn();
        logOut.setVisible(true);
        
    }//GEN-LAST:event_logoutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGuiFrame().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewButton1;
    private javax.swing.JButton addNewButton2;
    private javax.swing.JButton advanced;
    private javax.swing.JButton appManagementButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton myAccountButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextArea searchInput;
    private javax.swing.JTable tableResults;
    // End of variables declaration//GEN-END:variables
}
