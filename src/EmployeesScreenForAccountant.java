
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/*It is a some asasd sadece yoruldum amk yeterrrr be yeter nolur duzel artik yaaajkllkjhkjh*/
/**
 *
 * @author begench
 */
public class EmployeesScreenForAccountant extends javax.swing.JDialog {

    DefaultTableModel model;
    
    TransactionForAccountant transactionsAcc = new TransactionForAccountant();
    

    public EmployeesScreenForAccountant(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        model = (DefaultTableModel) workers_table.getModel();
        
        workerShow();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workers_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        massage_write = new javax.swing.JLabel();
        search_box = new javax.swing.JTextField();
        workerUpdate = new javax.swing.JButton();
        screenRefresh = new javax.swing.JButton();
        hours_area = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        name_area = new javax.swing.JLabel();
        surname_area = new javax.swing.JLabel();
        gender_area = new javax.swing.JLabel();
        age_area = new javax.swing.JLabel();
        adress_area = new javax.swing.JLabel();
        telephone_area = new javax.swing.JLabel();
        departmant_area = new javax.swing.JLabel();
        calculatorButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        deposit_area = new javax.swing.JLabel();
        houlyear_area = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 0, 0));

        workers_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Surname", "Gender", "Age", "Departmant", "Adress", "Telephone", "Hours", "Deposit", "Hourly Earning"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workers_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workers_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(workers_table);
        if (workers_table.getColumnModel().getColumnCount() > 0) {
            workers_table.getColumnModel().getColumn(0).setResizable(false);
            workers_table.getColumnModel().getColumn(1).setResizable(false);
            workers_table.getColumnModel().getColumn(2).setResizable(false);
            workers_table.getColumnModel().getColumn(3).setResizable(false);
            workers_table.getColumnModel().getColumn(4).setResizable(false);
            workers_table.getColumnModel().getColumn(5).setResizable(false);
            workers_table.getColumnModel().getColumn(6).setResizable(false);
            workers_table.getColumnModel().getColumn(7).setResizable(false);
            workers_table.getColumnModel().getColumn(8).setResizable(false);
            workers_table.getColumnModel().getColumn(9).setResizable(false);
            workers_table.getColumnModel().getColumn(10).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Surname:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Adress:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Telephone:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Departmant:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Gender");

        search_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_boxActionPerformed(evt);
            }
        });
        search_box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_boxKeyReleased(evt);
            }
        });

        workerUpdate.setText("Update");
        workerUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workerUpdateActionPerformed(evt);
            }
        });

        screenRefresh.setText("Refresh");
        screenRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenRefreshActionPerformed(evt);
            }
        });

        hours_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Hours:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Deposit:");

        name_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        surname_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        gender_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        age_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        adress_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        telephone_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        departmant_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        calculatorButton.setText("Calculate");
        calculatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        deposit_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        houlyear_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Hourly Earning:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(massage_write, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(name_area, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(surname_area, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(age_area, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gender_area, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(adress_area, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telephone_area, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(departmant_area, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(312, 312, 312)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(hours_area, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(calculatorButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deposit_area, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(houlyear_area, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(workerUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(screenRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(search_box, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(houlyear_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(workerUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(screenRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)))
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(name_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(surname_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hours_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(calculatorButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(deposit_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel8)
                                                            .addComponent(gender_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel3))
                                                    .addComponent(age_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4))
                                            .addComponent(adress_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(telephone_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(departmant_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(55, 55, 55)))
                .addComponent(massage_write, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_boxActionPerformed
    
    public void dynamicSearch(String search){
       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
       
       workers_table.setRowSorter(tr);
       
       tr.setRowFilter(RowFilter.regexFilter(search));
    
    }
    
    private void search_boxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_boxKeyReleased
        // TODO add your handling code here:
        String search = search_box.getText();

        dynamicSearch(search);
    }//GEN-LAST:event_search_boxKeyReleased

    private void workerUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workerUpdateActionPerformed
        // TODO add your handling code here:
        String h = hours_area.getText();
        float hours = Float.parseFloat(h);
        String d = deposit_area.getText();
        float deposit = Float.parseFloat(d);
        
        int selectedrow = workers_table.getSelectedRow();
        
        if(selectedrow == -1){
            if(model.getRowCount() == 0){
                massage_write.setText("Worker table is empty...");
            }
            else{
                massage_write.setText("Please select an employee to update");
            }
        }
        else{
            int id = (int)model.getValueAt(selectedrow, 0);
            
            //transactionsA.workerUpdateAssistant(id,name,surname,password,departmant,gender,ageInt,adress,tel_no);
            transactionsAcc.workerUpadateAcc(id, hours, deposit);
            workerShow();

        }
    }//GEN-LAST:event_workerUpdateActionPerformed

    private void workers_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workers_tableMouseClicked
        // TODO add your handling code here:
        
        int selectedrow = workers_table.getSelectedRow();
        
        name_area.setText(model.getValueAt(selectedrow, 1).toString());
        surname_area.setText(model.getValueAt(selectedrow, 2).toString());
        //password_area.setText(model.getValueAt(selectedrow, 3).toString());
        gender_area.setText(model.getValueAt(selectedrow, 3).toString());
        age_area.setText(model.getValueAt(selectedrow, 4).toString());
        departmant_area.setText(model.getValueAt(selectedrow, 5).toString());
        adress_area.setText(model.getValueAt(selectedrow, 6).toString());
        telephone_area.setText(model.getValueAt(selectedrow, 7).toString());
        hours_area.setText(model.getValueAt(selectedrow, 8).toString());
        deposit_area.setText(model.getValueAt(selectedrow, 9).toString());
        houlyear_area.setText(model.getValueAt(selectedrow, 10).toString());
    }//GEN-LAST:event_workers_tableMouseClicked

    private void screenRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenRefreshActionPerformed
        // TODO add your handling code here:
        name_area.setText("");
        surname_area.setText("");
        //password_area.setText("");
        gender_area.setText("");
        age_area.setText("");
        departmant_area.setText("");
        adress_area.setText("");
        telephone_area.setText("");
        deposit_area.setText("");
        hours_area.setText("");
        houlyear_area.setText("");
        workerShow();
    }//GEN-LAST:event_screenRefreshActionPerformed

    private void calculatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorButtonActionPerformed
        // TODO add your handling code here:
        String hoursString = hours_area.getText();
        float hours = Float.parseFloat(hoursString);
        String hourlyEarningString = houlyear_area.getText();
        float hourlyEarning = Float.parseFloat(hourlyEarningString);
        float deposit = hours*hourlyEarning;
        String depositString = Float.toString(deposit);
        deposit_area.setText(depositString);
    }//GEN-LAST:event_calculatorButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_logoutButtonActionPerformed
    
    
    public void workerShow(){
        model.setRowCount(0);
        ArrayList<ModulForAccountant> workersAcc = new ArrayList<ModulForAccountant>();
        
        workersAcc = transactionsAcc.workerExtraction();
        
        if(workersAcc != null){
            for(ModulForAccountant worker : workersAcc){
                Object[] beAdded = {worker.getId(),worker.getName(),worker.getSurname(),worker.getGender(),worker.getAge(),worker.getDepartmant(),worker.getAdress(),worker.getTel_no(),worker.getHours(),worker.getDeposit(),worker.getHourly_earning()};
                
                model.addRow(beAdded);
                
                
            }
        }
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
            java.util.logging.Logger.getLogger(EmployeesScreenForAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeesScreenForAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeesScreenForAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeesScreenForAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EmployeesScreenForAccountant dialog = new EmployeesScreenForAccountant(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adress_area;
    private javax.swing.JLabel age_area;
    private javax.swing.JButton calculatorButton;
    private javax.swing.JLabel departmant_area;
    private javax.swing.JLabel deposit_area;
    private javax.swing.JLabel gender_area;
    private javax.swing.JLabel houlyear_area;
    private javax.swing.JTextField hours_area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel massage_write;
    private javax.swing.JLabel name_area;
    private javax.swing.JButton screenRefresh;
    private javax.swing.JTextField search_box;
    private javax.swing.JLabel surname_area;
    private javax.swing.JLabel telephone_area;
    private javax.swing.JButton workerUpdate;
    private javax.swing.JTable workers_table;
    // End of variables declaration//GEN-END:variables
}
