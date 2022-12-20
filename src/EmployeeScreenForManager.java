
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author begench
 */
public class EmployeeScreenForManager extends javax.swing.JDialog {

     DefaultTableModel model;
     DefaultTableModel model2;
    
    TransactionForManager transactionsMan = new TransactionForManager();
    /**
     * Creates new form EmployeeScreenForManager
     */
    public EmployeeScreenForManager(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) workers_table.getModel();
        model2 = (DefaultTableModel) workers_history_table.getModel();
        workerHistoryShow();
        
        workerShow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        name_area = new javax.swing.JTextField();
        surname_area = new javax.swing.JTextField();
        password_area = new javax.swing.JTextField();
        gender_area = new javax.swing.JTextField();
        age_area = new javax.swing.JTextField();
        adress_area = new javax.swing.JTextField();
        telephone_area = new javax.swing.JTextField();
        departmant_area = new javax.swing.JTextField();
        hours_area = new javax.swing.JTextField();
        houlyear_area = new javax.swing.JTextField();
        deposit_area = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        workers_table = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        id_area = new javax.swing.JLabel();
        addWorker = new javax.swing.JButton();
        workerUpdate = new javax.swing.JButton();
        screenRefresh = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        search_box = new javax.swing.JTextField();
        massage_write = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workers_history_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Surname:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Password:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Gender");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Adress:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Telephone:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Departmant:");

        jLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel.setText("Hours:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Hourly Earning:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Deposit:");

        name_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        surname_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        password_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        gender_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        age_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        adress_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        telephone_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        departmant_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        hours_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        houlyear_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        deposit_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        workers_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Surname", "Password", "Gender", "Age", "Departmant", "Adress", "Telephone", "Hours", "Deposit", "Hourly Earning"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("ID:");

        id_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addWorker.setText("Register");
        addWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWorkerActionPerformed(evt);
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

        workers_history_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Withdraw", "Hourly Earning", "Hours", "Id Worker"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workers_history_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workers_history_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(workers_history_table);
        if (workers_history_table.getColumnModel().getColumnCount() > 0) {
            workers_history_table.getColumnModel().getColumn(0).setResizable(false);
            workers_history_table.getColumnModel().getColumn(1).setResizable(false);
            workers_history_table.getColumnModel().getColumn(2).setResizable(false);
            workers_history_table.getColumnModel().getColumn(3).setResizable(false);
            workers_history_table.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name_area, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(surname_area, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(gender_area, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(age_area, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(adress_area, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(telephone_area, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(departmant_area, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(id_area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(password_area, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(screenRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hours_area, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(houlyear_area, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deposit_area, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(workerUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(massage_write, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1289, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(id_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(name_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(surname_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(password_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(gender_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(age_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(adress_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(telephone_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(departmant_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel)
                            .addComponent(hours_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(houlyear_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(deposit_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(workerUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(screenRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(massage_write, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void workers_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workers_tableMouseClicked
        // TODO add your handling code here:

        int selectedrow = workers_table.getSelectedRow();
        id_area.setText(model.getValueAt(selectedrow, 0).toString());
        name_area.setText(model.getValueAt(selectedrow, 1).toString());
        surname_area.setText(model.getValueAt(selectedrow, 2).toString());
        password_area.setText(model.getValueAt(selectedrow, 3).toString());
        gender_area.setText(model.getValueAt(selectedrow, 4).toString());
        age_area.setText(model.getValueAt(selectedrow, 5).toString());
        departmant_area.setText(model.getValueAt(selectedrow, 6).toString());
        adress_area.setText(model.getValueAt(selectedrow, 7).toString());
        telephone_area.setText(model.getValueAt(selectedrow, 8).toString());
        hours_area.setText(model.getValueAt(selectedrow, 9).toString());
        deposit_area.setText(model.getValueAt(selectedrow, 10).toString());
        houlyear_area.setText(model.getValueAt(selectedrow, 11).toString());
    }//GEN-LAST:event_workers_tableMouseClicked

    private void addWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWorkerActionPerformed
        // TODO add your handling code here:
        massage_write.setText("");
        String name = name_area.getText();
        String surname = surname_area.getText();
        String password = password_area.getText();
        String departmant = departmant_area.getText();
        String gender = gender_area.getText();
        String age = age_area.getText();
        int ageInt = Integer.parseInt(age);
        String adress = adress_area.getText();
        String tel_no = telephone_area.getText();
        String h = hours_area.getText();
        float hours = Float.parseFloat(h);
        String d = deposit_area.getText();
        float deposit = Float.parseFloat(d);
        String hourlyEs = houlyear_area.getText();
        float houtly_earning = Float.parseFloat(hourlyEs);
        
        transactionsMan.workerAddManager(name, surname,password,departmant,gender, ageInt, adress, tel_no,hours,deposit,houtly_earning);

        workerShow();

        massage_write.setText("Registration new user succesfull");

    }//GEN-LAST:event_addWorkerActionPerformed

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
        String password = password_area.getText();
        String h = hours_area.getText();
        float hours = Float.parseFloat(h);
        String d = deposit_area.getText();
        float deposit = Float.parseFloat(d);
        String hourlyEs = houlyear_area.getText();
        float houtly_earning = Float.parseFloat(hourlyEs);
        
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

            transactionsMan.workerUpdateManager(id,name,surname,password,departmant,gender,ageInt,adress,tel_no,hours,deposit,houtly_earning);

            workerShow();

        }
    }//GEN-LAST:event_workerUpdateActionPerformed

    private void screenRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenRefreshActionPerformed
        // TODO add your handling code here:
        id_area.setText("");
        name_area.setText("");
        surname_area.setText("");
        password_area.setText("");
        gender_area.setText("");
        age_area.setText("");
        departmant_area.setText("");
        adress_area.setText("");
        telephone_area.setText("");
        houlyear_area.setText("");
        hours_area.setText("");
        deposit_area.setText("");
        workerHistoryShow();
        workerShow();
    }//GEN-LAST:event_screenRefreshActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void search_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_boxActionPerformed

    private void search_boxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_boxKeyReleased
        // TODO add your handling code here:
        String search = search_box.getText();

        dynamicSearch(search);
    }//GEN-LAST:event_search_boxKeyReleased

    private void workers_history_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workers_history_tableMouseClicked
        // TODO add your handling code here:

        /*int selectedrow = workers_table.getSelectedRow();
        id_area.setText(model.getValueAt(selectedrow, 0).toString());
        name_area.setText(model.getValueAt(selectedrow, 1).toString());
        surname_area.setText(model.getValueAt(selectedrow, 2).toString());
        password_area.setText(model.getValueAt(selectedrow, 3).toString());
        gender_area.setText(model.getValueAt(selectedrow, 4).toString());
        age_area.setText(model.getValueAt(selectedrow, 5).toString());
        departmant_area.setText(model.getValueAt(selectedrow, 6).toString());
        adress_area.setText(model.getValueAt(selectedrow, 7).toString());
        telephone_area.setText(model.getValueAt(selectedrow, 8).toString());
        hours_area.setText(model.getValueAt(selectedrow, 9).toString());
        deposit_area.setText(model.getValueAt(selectedrow, 10).toString());
        houlyear_area.setText(model.getValueAt(selectedrow, 11).toString());*/
    }//GEN-LAST:event_workers_history_tableMouseClicked
public void dynamicSearch(String search){
       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
       
       //workers_table.setRowSorter(tr);
       
       tr.setRowFilter(RowFilter.regexFilter(search));
    
    }
    /**
     * @param args the command line arguments
     */
     public void workerHistoryShow(){
         model2.setRowCount(0);
         
         ArrayList<ModulHistory> workersHistorys = new ArrayList<ModulHistory>();
         
         workersHistorys = transactionsMan.workerHistory();
         
         if(workersHistorys != null){
             for(ModulHistory workModulHistory : workersHistorys){
                 Object[] adding = {workModulHistory.getId_history(),workModulHistory.getWithdraw(),workModulHistory.getHourly_earning(),workModulHistory.getHours(),workModulHistory.getId_worker()};
                 
                 model2.addRow(adding);
             }
         }
         
     }
     public void workerShow(){
         model.setRowCount(0);
         ArrayList<ModulForManager> workersMan = new ArrayList<ModulForManager>();
         
         workersMan = transactionsMan.workerExtraction();
         
         if(workersMan != null){
             for(ModulForManager worker:workersMan){
                 Object[] beAdded = {worker.getId(),worker.getName(),worker.getSurname(),worker.getPassw(),worker.getGender(),worker.getAge(),worker.getDepartmant(),worker.getAdress(),worker.getTel_no(),worker.getHours(),worker.getDeposit(),worker.getHourly_earning()};
                 
                 model.addRow(beAdded);
                 
             }
         }
     }
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
            java.util.logging.Logger.getLogger(EmployeeScreenForManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeScreenForManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeScreenForManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeScreenForManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EmployeeScreenForManager dialog = new EmployeeScreenForManager(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField deposit_area;
    private javax.swing.JTextField gender_area;
    private javax.swing.JTextField houlyear_area;
    private javax.swing.JTextField hours_area;
    private javax.swing.JLabel id_area;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel massage_write;
    private javax.swing.JTextField name_area;
    private javax.swing.JTextField password_area;
    private javax.swing.JButton screenRefresh;
    private javax.swing.JTextField search_box;
    private javax.swing.JTextField surname_area;
    private javax.swing.JTextField telephone_area;
    private javax.swing.JButton workerUpdate;
    private javax.swing.JTable workers_history_table;
    private javax.swing.JTable workers_table;
    // End of variables declaration//GEN-END:variables
}