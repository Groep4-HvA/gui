/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiluggage;


/**
 *
 * @author sean
 */
public class Manager extends java.awt.Frame {
private passwordConfirm passOverlay = new passwordConfirm(new javax.swing.JFrame(),true);
    /**
     * Creates new form MainGuiFrame
     */
    public String t = "mederker";
    public String button1;
    public String button2;
    
    public Manager() {
        if (t=="medewerker"){
            button1 = "Medewerker";
            button2 = "Manager";
        }else{
            button1 = "Luggage";
            button2 = "Passenger";
        }
        
        
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        addNewButton1 = new javax.swing.JButton();
        addNewButton2 = new javax.swing.JButton();
        javax.swing.JButton moreButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableResults = new javax.swing.JTable();
        myAccountButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        missingManager = new javax.swing.JButton();
        foundManager = new javax.swing.JButton();
        processedManager = new javax.swing.JButton();
        graphManager = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
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
        jScrollPane3.setViewportView(tableResults);

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

        missingManager.setText("Missing");
        missingManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missingManagerActionPerformed(evt);
            }
        });

        foundManager.setText("Found");

        processedManager.setText("Processed");
        processedManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processedManagerActionPerformed(evt);
            }
        });

        graphManager.setText("Graph");
        graphManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphManagerActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(myAccountButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(logoutButton)
                .addContainerGap())
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(missingManager)
                        .add(33, 33, 33)
                        .add(foundManager)
                        .add(43, 43, 43)
                        .add(processedManager)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(graphManager))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                        .add(addNewButton1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(addNewButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(moreButton))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 928, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(myAccountButton)
                    .add(logoutButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 38, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(missingManager)
                    .add(foundManager)
                    .add(processedManager)
                    .add(graphManager))
                .add(18, 18, 18)
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

    private void moreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moreButtonActionPerformed

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

    private void clickedButton2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickedButton2
            addPassenger gui3 = new addPassenger();
            addMedewerker gui2 = new addMedewerker();
        if (t=="medewerker"){
            gui2.setVisible(true);
        }else{
            gui3.setVisible(true);
        }
    }//GEN-LAST:event_clickedButton2

    private void clickedButton1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickedButton1
        addLuggage gui = new addLuggage();
        addMedewerker gui2 = new addMedewerker();
        if (t=="medewerker"){
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

    private void missingManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missingManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_missingManagerActionPerformed

    private void processedManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processedManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_processedManagerActionPerformed

    private void graphManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphManagerActionPerformed
       ManagerGraph showGraph = new ManagerGraph();
       showGraph.setVisible(true);
    }//GEN-LAST:event_graphManagerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewButton1;
    private javax.swing.JButton addNewButton2;
    private javax.swing.JButton foundManager;
    private javax.swing.JButton graphManager;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton missingManager;
    private javax.swing.JButton myAccountButton;
    private javax.swing.JButton processedManager;
    private javax.swing.JTable tableResults;
    // End of variables declaration//GEN-END:variables
}
