
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
public class EmployeesScreenForAssistant extends javax.swing.JDialog {

    DefaultTableModel model;
    
    TransactionsForAssistant transactions = new TransactionsForAssistant();
    

    public EmployeesScreenForAssistant(java.awt.Frame parent, boolean modal) {
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
        name_area = new javax.swing.JTextField();
        surname_area = new javax.swing.JTextField();
        age_area = new javax.swing.JTextField();
        adress_area = new javax.swing.JTextField();
        telephone_area = new javax.swing.JTextField();
        departmant_area = new javax.swing.JTextField();
        addWorker = new javax.swing.JButton();
        gender_area = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        massage_write = new javax.swing.JLabel();
        search_box = new javax.swing.JTextField();
        workerUpdate = new javax.swing.JButton();
        screenRefresh = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 0, 0));

        workers_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Surname", "Gender", "Age", "Departmant", "Adress", "Telephone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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

        name_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_areaActionPerformed(evt);
            }
        });

        surname_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        age_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        age_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age_areaActionPerformed(evt);
            }
        });

        adress_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        telephone_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        departmant_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addWorker.setText("Register");
        addWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWorkerActionPerformed(evt);
            }
        });

        gender_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(surname_area, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name_area, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(telephone_area, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adress_area, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(age_area, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(departmant_area)
                                            .addComponent(gender_area, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(massage_write, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(596, 596, 596)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(workerUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(screenRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(workerUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(screenRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name_area, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(surname_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(gender_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(age_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(adress_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(telephone_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(departmant_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addComponent(massage_write, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_areaActionPerformed

    private void addWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWorkerActionPerformed
        // TODO add your handling code here:
        massage_write.setText("");
        String name = name_area.getText();
        String surname = surname_area.getText();
        //String password = password_area.getText();
        String departmant = departmant_area.getText();
        String gender = gender_area.getText();
        String age = age_area.getText();
        int ageInt = Integer.parseInt(age);
        String adress = adress_area.getText();
        String tel_no = telephone_area.getText();
        
        transactions.workerAddAssistant(name, surname, departmant,gender, ageInt, adress, tel_no);

        workerShow();

        massage_write.setText("Registration new user succesfull");
        
        
    }//GEN-LAST:event_addWorkerActionPerformed

    private void age_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age_areaActionPerformed

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
        
        String name = name_area.getText();
        String surname = surname_area.getText();
        String departmant = departmant_area.getText();
        String gender = gender_area.getText();
        String age = age_area.getText();
        int ageInt = Integer.parseInt(age);
        String adress = adress_area.getText();
        String tel_no = telephone_area.getText();
        //String password = password_area.getText();
        
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
            
            transactions.workerUpdateAssistant(id,name,surname,departmant,gender,ageInt,adress,tel_no);
        
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


        workerShow();
    }//GEN-LAST:event_screenRefreshActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_logoutButtonActionPerformed
    
    
    public void workerShow(){
        model.setRowCount(0);
        ArrayList<ModulForAssistant> workers = new ArrayList<ModulForAssistant>();
        
        workers = transactions.workerExtraction();
        
        if(workers != null){
            for(ModulForAssistant worker : workers){
                Object[] beAdded = {worker.getId(),worker.getName(),worker.getSurname(),worker.getGender(),worker.getAge(),worker.getDepartmant(),worker.getAdress(),worker.getTel_no()};
                
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
            java.util.logging.Logger.getLogger(EmployeesScreenForAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeesScreenForAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeesScreenForAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeesScreenForAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EmployeesScreenForAssistant dialog = new EmployeesScreenForAssistant(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton addWorker;
    private javax.swing.JTextField adress_area;
    private javax.swing.JTextField age_area;
    private javax.swing.JTextField departmant_area;
    private javax.swing.JTextField gender_area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel massage_write;
    private javax.swing.JTextField name_area;
    private javax.swing.JButton screenRefresh;
    private javax.swing.JTextField search_box;
    private javax.swing.JTextField surname_area;
    private javax.swing.JTextField telephone_area;
    private javax.swing.JButton workerUpdate;
    private javax.swing.JTable workers_table;
    // End of variables declaration//GEN-END:variables
}
