/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.FoodDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Food;
import model.User;

/**
 *
 * @author luuhuy
 */
public class OrderFoodFrm extends javax.swing.JFrame {
    
    private FoodDAO fd;
    private User user;
    private String numberTable;
    static int i =1 ;
    static int total =0;

    public OrderFoodFrm(){
    }
    
    public OrderFoodFrm(String numberTable, User user) {
        initComponents();
        this.setTitle("Gọi món");
        this.numberTable = numberTable;        
        this.user = user;
        jLabelName.setText(user.getName() +": " +user.getPosition());
        this.jTextFieldNumber.setText(numberTable);
        fd = new FoodDAO();
        ArrayList arrFood = fd.getFood();
        this.showFoodSearch(jTableSearch, arrFood);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSearch = new javax.swing.JTable();
        jButtonOK = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableOrderFood = new javax.swing.JTable();
        jButtonConfirm = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelTable = new javax.swing.JLabel();
        jTextFieldNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã", "Loại", "Tên món ăn", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableSearch);

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jTableOrderFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã món ăn", "Tên món ăn", "Giá", "Số lượng", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableOrderFood);

        jButtonConfirm.setText("Confirm");
        jButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0");
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel1.setText("Tổng cộng : ");

        jTextFieldNumber.setEditable(false);

        jLabel2.setText("Bàn số");

        jLabelName.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonConfirm)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTable)
                        .addGap(115, 115, 115))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearch)
                        .addGap(44, 44, 44)
                        .addComponent(jLabelName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jScrollPane3)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTable)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSearch)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelName)))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonOK)
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jButtonConfirm))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        ArrayList<Food> arr = fd.searchFood(jTextFieldSearch.getText());
        DefaultTableModel dtm = (DefaultTableModel) jTableSearch.getModel();
        dtm.setNumRows(0);
        showFoodSearch(jTableSearch, arr);
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        int i = jTableSearch.getSelectedRow();
        int amount = Integer.parseInt(JOptionPane.showInputDialog(this,"Nhập số lượng"));
        String name = (String) jTableSearch.getValueAt(i, 3);
        int price = (int) jTableSearch.getValueAt(i, 4);
        int id = (int) jTableSearch.getValueAt(i, 1);
        Food f = new Food(name, price);
        f.setId(id);
        i++;        
        int n = showFoodOrder(jTableOrderFood, f, amount);
        total =  total + n;
        jTextField1.setText(total+"");        
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmActionPerformed
        int n = jTableOrderFood.getRowCount();
        int [] idFood = new int[n];
        int [] amount = new int[n];
        for(int i=0; i< n; i++){
            idFood[i] = (int) jTableOrderFood.getValueAt(i, 1);
            amount[i] = (int) jTableOrderFood.getValueAt(i, 4);
        }
        fd.saveFood(Integer.parseInt(numberTable), idFood, amount);
        JOptionPane.showMessageDialog(this, "Bạn đã lưu hóa đơn thành công");
        this.setVisible(false);        
        new ManageHomeFrm(user).setVisible(true);
    }//GEN-LAST:event_jButtonConfirmActionPerformed
    public void showFood(JTable table, ArrayList<Food> arr) {
        DefaultTableModel dtb = (DefaultTableModel) table.getModel();
        int t=1;
        for (Food f : arr) {
            dtb.addRow(new Object[]{
                t++, f.getId(),f.getType(),  f.getName(), f.getPrice()
            });
        }
    }
    public void showFoodSearch(JTable table, ArrayList<Food> arr){
        DefaultTableModel dtb = (DefaultTableModel) table.getModel();
        int t=1;
        for (Food f : arr) {
            dtb.addRow(new Object[]{
                t++, f.getId(),f.getType(),  f.getName(), f.getPrice()
            });
        }
    }
    
    public int showFoodOrder(JTable table, Food f , int quantity){
        int money =f.getPrice()*quantity;
        DefaultTableModel dtb = (DefaultTableModel) table.getModel();
        dtb.addRow(new Object[]{
            i++, f.getId() , f.getName(), f.getPrice(), quantity, money
        });
        return money;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableOrderFood;
    private javax.swing.JTable jTableSearch;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldNumber;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
