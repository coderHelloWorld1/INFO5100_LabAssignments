/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.User;
import util.DatabaseConnector;
/**
 *
 * @author Purvam Sheth
 */
public class RegistrationPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegistrationPanel
     */
    private JPanel bottomPanel;
    public RegistrationPanel(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLable = new javax.swing.JLabel();
        legalNameLabel = new javax.swing.JLabel();
        legalNameField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        imageViewLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 98, 129));
        setMinimumSize(new java.awt.Dimension(700, 600));

        titleLable.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titleLable.setForeground(new java.awt.Color(255, 255, 255));
        titleLable.setText("Patient Registration Form");

        legalNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        legalNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        legalNameLabel.setText("Legal Name");

        legalNameField.setBackground(new java.awt.Color(242, 98, 129));
        legalNameField.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        legalNameField.setForeground(new java.awt.Color(255, 255, 255));
        legalNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                legalNameFieldFocusLost(evt);
            }
        });
        legalNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                legalNameFieldKeyReleased(evt);
            }
        });

        userNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("User Name");

        userNameField.setBackground(new java.awt.Color(242, 98, 129));
        userNameField.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        userNameField.setForeground(new java.awt.Color(255, 255, 255));
        userNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameFieldFocusLost(evt);
            }
        });

        phoneLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneLabel.setText("Phone Number");

        phoneField.setBackground(new java.awt.Color(242, 98, 129));
        phoneField.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        phoneField.setForeground(new java.awt.Color(255, 255, 255));
        phoneField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneFieldFocusLost(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email ID");

        emailField.setBackground(new java.awt.Color(242, 98, 129));
        emailField.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        emailField.setForeground(new java.awt.Color(255, 255, 255));
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(255, 110, 66));
        submitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(phoneField))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(userNameField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(legalNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(legalNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(imageViewLabel))
                    .addComponent(titleLable))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(legalNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legalNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(210, 210, 210)
                .addComponent(imageViewLabel)
                .addGap(56, 56, 56)
                .addComponent(submitButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void legalNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_legalNameFieldKeyReleased
        // TODO add your handling code here:
        String Name = legalNameField.getText();
        for (char c : Name.toCharArray()) {
            System.out.println(c);
            if (Character.isDigit(c)) {
                legalNameField.setText("");
                JOptionPane.showMessageDialog(this, "No Digits are allowded", "Enter Correct Name", HEIGHT);
            }
        }
    }//GEN-LAST:event_legalNameFieldKeyReleased

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        // TODO add your handling code here:
        // TODO add your handling code here:
        String email = emailField.getText();
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(!(email.length()==0)){
            if(!(matcher.matches())){
                emailField.setText("");
                JOptionPane.showMessageDialog(this, "Please Enter Valid Email", "Enter Correct Email", HEIGHT);
            }
        }
    }//GEN-LAST:event_emailFieldFocusLost

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        User pat = new User();
        pat.setLegalName(legalNameField.getText());
        pat.setUserName(userNameField.getText());
        pat.setPhoneNumber(phoneField.getText());
        pat.setEmailId(emailField.getText());

        String[] C= new String[4];
        int[] i = {0,0,0,0};
        if(pat.getLegalName().length()==0){
            C[0]="Legal Name ";
            i[0]=1;
        }
        if(pat.getUserName().length()==0){
            C[1]="User Name ";
            i[1]=1;
        }
        if(pat.getPhoneNumber().length()==0){
            C[2]="Phone Number ";
            i[2]=1;
        }
        if(pat.getEmailId().length()==0){
            C[3]="Email ";
            i[3]=1;
        }
        
        int z;
        String st= "";
        for(z=0; z<4; z++){
            if(i[z]==1){
                st += C[z];
                if(z < C.length - 1) {
                    st += ", ";
                }
            }
        }
        System.out.println(st);
        if(st.length()==0){
            JOptionPane.showMessageDialog(this, "Hurray, Form Sumbitted! \n Legal Name is "+pat.getLegalName()+" \n User Name is "+pat.getUserName()+" \n Phone Number is "+pat.getPhoneNumber()+" \n Email is "+pat.getEmailId(), "Form Submitted", HEIGHT);
            
            DatabaseConnector.addUser(pat);

            ViewPanel pan = new ViewPanel();
            bottomPanel.add(pan);
            CardLayout lay = (CardLayout)bottomPanel.getLayout();
            lay.next(bottomPanel);            
            
            legalNameField.setText("");
            userNameField.setText("");
            phoneField.setText("");
            emailField.setText("");
        }
        else{
            JOptionPane.showMessageDialog(this, "Please Fill Out Remaning Values: "+st, "Enter All Values", HEIGHT);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void phoneFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneFieldFocusLost
        // TODO add your handling code here:
        String phoneNumber = phoneField.getText();
        if(phoneNumber.length()>0){
            boolean isval = isValidPhoneNumber(phoneNumber);
            if(!isval){
                phoneField.setText("");
                    JOptionPane.showMessageDialog(this, "Please Enter 10 Digits Mobile Number", "Enter Correct Mobile Number", HEIGHT);
            }        
        }
    }//GEN-LAST:event_phoneFieldFocusLost

    private void legalNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_legalNameFieldFocusLost
        // TODO add your handling code here:
        String Name = legalNameField.getText();
        if(Name.length()>0){
            if(Name.length()<2){
                legalNameField.setText("");
                JOptionPane.showMessageDialog(this, "Too Small Name (Atleast 2 Letters!)", "Enter Correct Name", HEIGHT);            
            }
        }
    }//GEN-LAST:event_legalNameFieldFocusLost

    private void userNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFieldFocusLost
        // TODO add your handling code here:
        String Name = userNameField.getText();
        if(Name.length()>0){
            if(Name.length()<4){
                userNameField.setText("");
                JOptionPane.showMessageDialog(this, "Minimum 4 Character/Digits are Required", "Enter Correct User Name", HEIGHT);            
            }        
        }
    }//GEN-LAST:event_userNameFieldFocusLost

    public static boolean isValidPhoneNumber(String phoneNumber){
        String cleaned = phoneNumber.replaceAll("[^0-9]", "");
        return cleaned.length()==10;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel imageViewLabel;
    private javax.swing.JTextField legalNameField;
    private javax.swing.JLabel legalNameLabel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLable;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
