/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiluggage;

import popups.PasswordConfirm;
import popups.Popupappmedewerker;
import popups.addLuggage;
import popups.Advanced;
import popups.AddMedewerker;
import popups.AddPassenger;
import popups.PopUpMedewerker;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author sean
 */
public class MainGuiFrame extends java.awt.Frame {

    private final PasswordConfirm passOverlay = new PasswordConfirm(new javax.swing.JFrame(), true);
   /**
     * Creates new form MainGuiFrame
     */
    private Connection con = null;
    private Statement st = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String url = "jdbc:mysql://159.253.0.5:3306/seanmoy58_hva";
    private String user = "seanmoy58_hva";
    private String pw = "cWCl7Itb";
    private String button1;
    private String button2;
    private boolean inBeheer = false;
    private boolean beheer;

    /**
     *
     * @param value
     */
    public MainGuiFrame(boolean value) {
        beheer = value;
        button1 = (inBeheer) ? "Medewerker" : "Luggage";
        button2 = (inBeheer) ? "Manager" : "Passenger";
        initComponents();
        appManagementButton.setVisible(beheer);
        searchInput.requestFocusInWindow();
        try {
            con = DriverManager.getConnection(url, user, pw);
            String sql = "select * from `luggage`";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            tableResults.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }

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
        LabelDescription = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("guiluggage/Bundle"); // NOI18N
        advanced.setText(bundle.getString("MainGuiFrame.advanced.text")); // NOI18N
        advanced.setToolTipText(bundle.getString("MainGuiFrame.advanced.toolTipText")); // NOI18N
        advanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedActionPerformed(evt);
            }
        });

        searchInput.setColumns(20);
        searchInput.setForeground(new java.awt.Color(102, 102, 102));
        searchInput.setRows(1);
        searchInput.setText(bundle.getString("MainGuiFrame.searchInput.text")); // NOI18N
        searchInput.setToolTipText(bundle.getString("MainGuiFrame.searchInput.toolTipText")); // NOI18N
        searchInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchInputFocusLost(evt);
            }
        });
        searchInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchInputKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(searchInput);

        searchButton.setText(bundle.getString("MainGuiFrame.searchButton.text")); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        addNewButton1.setText("Add new: " + button1);
        addNewButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickedButton1(evt);
            }
        });

        addNewButton2.setText("Add new: "+ button2);
        addNewButton2.setToolTipText(bundle.getString("MainGuiFrame.addNewButton2.toolTipText")); // NOI18N
        addNewButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickedButton2(evt);
            }
        });

        moreButton.setText(bundle.getString("MainGuiFrame.moreButton.text")); // NOI18N
        moreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreButtonActionPerformed(evt);
            }
        });

        tableResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableResultsMouseClicked(evt);
            }
        });
        tableResults.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableResultsKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tableResults);

        appManagementButton.setText(bundle.getString("MainGuiFrame.appManagementButton.text")); // NOI18N
        appManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appManagementButtonActionPerformed(evt);
            }
        });

        myAccountButton.setText(bundle.getString("MainGuiFrame.myAccountButton.text")); // NOI18N
        myAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myAccountButtonActionPerformed(evt);
            }
        });

        logoutButton.setText(bundle.getString("MainGuiFrame.logoutButton.text")); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        LabelDescription.setText(bundle.getString("MainGuiFrame.LabelDescription.text")); // NOI18N
        LabelDescription.setToolTipText(bundle.getString("MainGuiFrame.LabelDescription.toolTipText")); // NOI18N

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
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
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
                        .add(0, 8, Short.MAX_VALUE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(LabelDescription)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 395, Short.MAX_VALUE)
                        .add(appManagementButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(myAccountButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(logoutButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(appManagementButton)
                            .add(myAccountButton)
                            .add(logoutButton))
                        .add(20, 20, 20))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(LabelDescription)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(searchButton)
                    .add(advanced))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED, 24, Short.MAX_VALUE)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(addNewButton1)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(moreButton)
                        .add(addNewButton2)))
                .addContainerGap(45, Short.MAX_VALUE))
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
        if (beheer) {
            if (inBeheer) {
                inBeheer = false;
                addNewButton1.setText("Add new: " + button1);
                addNewButton2.setText("Add new: " + button2);
                appManagementButton.setText("Application Management");
                LabelDescription.setText("Search labelnumber:");

            } else {
                inBeheer = true;
                addNewButton1.setText("Add new: Manager");
                addNewButton2.setText("Add new: Medewerker");
                appManagementButton.setText("Overzicht");
                LabelDescription.setText("Search name:");

            }
        } else {
            System.out.print("You are not authorized!");
        }
    }//GEN-LAST:event_appManagementButtonActionPerformed

    private void clickedButton2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickedButton2
        AddPassenger gui3 = new AddPassenger();
        AddMedewerker gui2 = new AddMedewerker();
        if (inBeheer) {
            gui2.setVisible(true);
        } else {
            gui3.setVisible(true);
        }
    }//GEN-LAST:event_clickedButton2

    private void clickedButton1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickedButton1
        addLuggage gui = new addLuggage();
        AddMedewerker gui2 = new AddMedewerker();
        if (inBeheer) {
            gui2.setVisible(true);
        } else {
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

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        logIn logOut = new logIn();
        logOut.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void tableResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableResultsMouseClicked
        if (inBeheer) {
            Popupappmedewerker popup1 = new Popupappmedewerker();
            popup1.setVisible(true);
        } else {
            PopUpMedewerker popup = new PopUpMedewerker();
            popup.setVisible(true);
        }
    }//GEN-LAST:event_tableResultsMouseClicked

    private void searchInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchInputFocusGained
        Color black = new Color(0, 0, 0);
        searchInput.setText("");
        searchInput.setForeground(black);
    }//GEN-LAST:event_searchInputFocusGained

    private void searchInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchInputFocusLost
       /*
        Color grey = new Color(142, 142, 142);
        searchInput.setText("search");
        searchInput.setForeground(grey);
        */
    }//GEN-LAST:event_searchInputFocusLost

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        //String search = searchInput.getText();
        System.out.println(searchInput.getText());
        try{
            con = DriverManager.getConnection(url, user, pw);
            String sql = "SELECT * FROM luggage WHERE `labelNumber` LIKE '%" + searchInput.getText() + "%' OR `color` LIKE '%" + searchInput.getText() + "%' OR `shape` LIKE '%" + searchInput.getText() + "%' OR `storageLocation` LIKE '%" + searchInput.getText() + "%' OR `status` LIKE '%" + searchInput.getText() + "%'";
            
            ps = con.prepareStatement(sql); // SELECT * FROM luggage WHERE labelNumber LIKE '%"+ searchInput.getText() +"%';
            rs = ps.executeQuery();
            tableResults.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInputKeyPressed
        // TO CODE HERE <!- CODE -!>
        /*
         * here the enter code to come/ if enter pressed in search it goes to searching instead of making a new line. 
         * it's not that difficult and should be written in this method and make use of the evt parameter. ok. i love you. ok
         */
    }//GEN-LAST:event_searchInputKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDescription;
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
