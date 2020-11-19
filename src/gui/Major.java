/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.MajorDTO;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ngoba
 */
public class Major extends javax.swing.JPanel {

    int luu = 0;
    ArrayList<MajorDTO> listma;
    boolean find = false;

    public Major() {
        initComponents();
        loadMajor();
        loadMajor222();
        jTextFieldMajorCode.setEnabled(false);
        jTextFieldMajorCode.setText("");
        jTextFieldMajorName.setEnabled(false);
        jTextFieldMajorName.setText("");
        jTextFieldStatus.setEnabled(false);
        jTextFieldStatus.setText("");
        jButtonFind.setEnabled(true);
        jButtonSave.setEnabled(false);
        jButtonCreate.setEnabled(true);
        jButtonDelete.setEnabled(false);
        jButtonUpdate.setEnabled(false);
        jButtonCancel.setEnabled(true);
    }

    void loadMajor() {
        try {
            listma = dao.majorDAO.getAllMajor();
            Vector header = new Vector();
            header.add("MajorCode");
            header.add("MajorName");
//            header.add("Status");

            Vector data = new Vector();
            for (MajorDTO s : listma) {
                Vector row = new Vector();
                row.add(s.getMajorCode());
                row.add(s.getMajorName());
//                row.add(s.getStatus());
                data.add(row);
            }
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setDataVector(data, header);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    void loadMajor222() {
        try {
            listma = dao.majorDAO.getAllMajor();
            if (!listma.isEmpty()) {
                Vector header = new Vector();
                header.add("MajorCode");
                header.add("MajorName");
//            header.add("Status");

                Vector data = new Vector();
                for (MajorDTO s : listma) {
                    Vector row = new Vector();
                    row.add(s.getMajorCode());
                    row.add(s.getMajorName());
//                row.add(s.getStatus());
                    data.add(row);
                }
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setDataVector(data, header);
            } else {
                JOptionPane.showMessageDialog(this, "List is Null");

            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldMajorCode = new javax.swing.JTextField();
        jTextFieldMajorName = new javax.swing.JTextField();
        jButtonCreate = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonFind = new javax.swing.JButton();
        checkMajorCode = new javax.swing.JLabel();
        checkmajorName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldStatus = new javax.swing.JTextField();
        jbuttonDeletePre = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MajorCode", "MajorName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("MajorCode");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("MajorName");

        jTextFieldMajorCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMajorCodeActionPerformed(evt);
            }
        });

        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonCreate.setText("Create");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonSave.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonFind.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonFind.setText("Find");
        jButtonFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindActionPerformed(evt);
            }
        });

        checkMajorCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        checkmajorName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Status");

        jbuttonDeletePre.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbuttonDeletePre.setText("Pre-Delete");
        jbuttonDeletePre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonDeletePreActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("GetALL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jButtonCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jButtonUpdate)
                                        .addGap(36, 36, 36)
                                        .addComponent(jButtonDelete)
                                        .addGap(45, 45, 45)
                                        .addComponent(jButtonSave)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButtonCancel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(checkmajorName, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                                            .addComponent(jTextFieldMajorCode, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                                            .addComponent(jTextFieldMajorName, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                                            .addComponent(checkMajorCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldStatus)))))
                            .addComponent(jButtonFind, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jbuttonDeletePre)
                        .addGap(75, 75, 75)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCancel, jButtonCreate, jButtonDelete, jButtonSave, jButtonUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButtonFind)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMajorCode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(checkMajorCode, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMajorName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(checkmajorName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreate)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonCancel))
                .addContainerGap(351, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jbuttonDeletePre))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonCancel, jButtonCreate, jButtonDelete, jButtonSave, jButtonUpdate});

    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int pos = jTable1.getSelectedRow();
        resetJtext();
        try {
            if (pos >= 0) {
                jTextFieldMajorCode.setText("" + jTable1.getValueAt(pos, 0));
                jTextFieldMajorName.setText("" + jTable1.getValueAt(pos, 1));
                jTextFieldStatus.setText("" + listma.get(pos).getStatus());
                jTextFieldMajorName.setEditable(false);
                jTextFieldStatus.setEditable(false);
                jTextFieldStatus.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select row to show");

        }
        luu = 0;
        checkMajorCode.setText("");
        checkmajorName.setText("");

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed

        jTextFieldMajorCode.setEnabled(true);
        jTextFieldMajorCode.setEditable(true);
        jTextFieldMajorCode.setText("");
        jTextFieldMajorName.setEnabled(true);
        jTextFieldMajorName.setEditable(true);
        jTextFieldMajorName.setText("");
        jTextFieldStatus.setEnabled(false);
        jTextFieldStatus.setEditable(false);
        jTextFieldStatus.setText("1");
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jButtonFind.setEnabled(false);
        jButtonSave.setEnabled(true);
        jButtonCancel.setEnabled(true);
        luu = 1;
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        if (checkMajorCode() == true && checkMajorName() == true) {
            String majorCode = jTextFieldMajorCode.getText().trim().toUpperCase();
            String majorName = jTextFieldMajorName.getText().trim();
            String status = jTextFieldStatus.getText().trim();
            if (luu == 1) {
                if (!majorCode.isEmpty() && !majorName.isEmpty()) {

                    try {
                        int result = dao.majorDAO.InsertMajor(majorCode, majorName, status);
                        if (result != 0) {
                            JOptionPane.showMessageDialog(null, "Saved");
                            loadMajor();
                            jButtonFind.setEnabled(true);
                            jButtonSave.setEnabled(false);
                            checkMajorCode.setText("");
                            checkmajorName.setText("");
                            jTextFieldMajorCode.setEnabled(false);
                            jTextFieldMajorName.setEnabled(false);

                        } else {
                            JOptionPane.showMessageDialog(null, "Not saved");
                        }

                    } catch (Exception e) {
                        if (e.getMessage().contains("duplicate")) {
                            JOptionPane.showMessageDialog(null, "Duplication MajorCode,You must be really delete MajorCode");
                            jTextFieldMajorCode.grabFocus();
                            jTextFieldMajorCode.selectAll();
                        }
                    }
                }
            } else if (luu == 0) {
                if (!majorName.isEmpty() && !majorCode.isEmpty()) {
                    try {
                        int result = dao.majorDAO.UpdateMajor(majorName, majorCode);
                        if (result != 0) {
                            JOptionPane.showMessageDialog(this, "Update successfully");
                            loadMajor();
                            checkMajorCode.setText("");
                            checkmajorName.setText("");
                            jTextFieldMajorCode.setEnabled(false);
                            jTextFieldMajorName.setEnabled(false);
                        } else {
                            JOptionPane.showMessageDialog(this, "Update fail");

                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());

                    }
                }
            }
        }


    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int pos = jTable1.getSelectedRow();
        String majorCode = jTextFieldMajorCode.getText();
        if (pos >= 0) {
            try {
                int a = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (a == JOptionPane.YES_OPTION) {
                    int result = dao.majorDAO.DeleteMajor(majorCode);
                    if (result != 0) {
                        JOptionPane.showMessageDialog(null, "Deleted successfully");
                        loadMajor();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Delete faileds");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Select to delete");

        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        loadMajor();
        jTextFieldMajorCode.setEnabled(false);
        jTextFieldMajorCode.setText("");
        jTextFieldMajorName.setEnabled(false);
        jTextFieldMajorName.setText("");
        jButtonFind.setEnabled(true);
        jButtonSave.setEnabled(false);
        jButtonCreate.setEnabled(true);
        jButtonDelete.setEnabled(false);
        jButtonUpdate.setEnabled(false);
        jButtonCancel.setEnabled(true);
        jTable1.setEnabled(true);
        checkMajorCode.setText("");
        checkmajorName.setText("");

    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

        jButtonCreate.setEnabled(false);
        jButtonCreate.setEnabled(false);
        jButtonFind.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jButtonSave.setEnabled(true);
        int click = jTable1.getSelectedRow();
        if (click >= 0) {
            jTextFieldMajorCode.setEditable(false);
            jTextFieldMajorName.setEditable(true);

        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
        }

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindActionPerformed
        jTextFieldMajorCode.setEditable(true);
        jTextFieldMajorCode.setEnabled(true);
        jTextFieldMajorName.setEnabled(false);
        jButtonCreate.setEnabled(false);
        jButtonFind.setEnabled(true);
        jButtonSave.setEnabled(false);
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
        if (checkMajorCode() == true) {
            String Code = jTextFieldMajorCode.getText().trim().toUpperCase();

            int x = findmajor(Code);
            if (x >= 0) {
                ArrayList<MajorDTO> listfound = new ArrayList<>();
                MajorDTO major = new MajorDTO(Code, listma.get(x).getMajorName(), listma.get(x).getStatus());
                listfound.add(major);
                loadFindMajor(listfound);
                jTable1.setRowSelectionInterval(0, 0);
                JOptionPane.showMessageDialog(this, "Found a major!");
                jTextFieldMajorCode.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(this, "Sorry...Not Found");
                jTextFieldMajorCode.grabFocus();
                jTextFieldMajorCode.selectAll();
            }
        }

//        else
//        {
//            JOptionPane.showMessageDialog(this, "Please input majorCode");
//        }
//

    }//GEN-LAST:event_jButtonFindActionPerformed
    int findmajor(String id) {
        int count = 0;
        for (MajorDTO x : listma) {
            if (id.equals(x.getMajorCode())) {
                return count;
            }
            count = count + 1;
        }
        return -1;

    }
    private void jTextFieldMajorCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMajorCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMajorCodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadMajor();
        loadMajor222();
//        jTextFieldMajorCode.setEnabled(false);
//        jTextFieldMajorCode.setText("");
//        jTextFieldMajorName.setEnabled(false);
//        jTextFieldMajorName.setText("");
//        jButtonFind.setEnabled(true);
//        jButtonSave.setEnabled(false);
//        jButtonCreate.setEnabled(true);
//        jButtonDelete.setEnabled(false);
//        jButtonUpdate.setEnabled(false);
//        jButtonCancel.setEnabled(true);
//        jTable1.setEnabled(true);
//        checkMajorCode.setText("");
//        checkmajorName.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbuttonDeletePreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonDeletePreActionPerformed
        Pre_DELETE1 pr = new Pre_DELETE1();
        pr.setVisible(true);
    }//GEN-LAST:event_jbuttonDeletePreActionPerformed

    public void resetJtext() {
        jTextFieldMajorCode.setEnabled(false);
        jTextFieldMajorName.setEnabled(true);
        jButtonCreate.setEnabled(false);
        jButtonFind.setEnabled(false);
        jButtonSave.setEnabled(false);
        jButtonUpdate.setEnabled(true);
        jButtonDelete.setEnabled(true);

    }

    public void resetJtext1() {
        jTextFieldMajorCode.setEnabled(true);
        jTextFieldMajorName.setEnabled(true);
    }

    public boolean checkMajorCode() {
        String majorcode = jTextFieldMajorCode.getText().trim();
        String regex = "[a-zA-Z\\s]*";

        if (majorcode.equals("")) {
            checkMajorCode.setText("Please input MajorCode");
            checkMajorCode.setForeground(Color.red);
            jTextFieldMajorCode.grabFocus();
            jTextFieldMajorCode.selectAll();

        } else {
            if (!majorcode.matches(regex) || majorcode.length() > 2 || majorcode.length() < 2) {
                checkMajorCode.setText("Max length is 2 character,not contains special characters");
                checkMajorCode.setForeground(Color.red);
                jTextFieldMajorCode.grabFocus();
                jTextFieldMajorCode.selectAll();

            } else {
                checkMajorCode.setText("");
                checkMajorCode.setForeground(Color.WHITE);
                return true;
            }

        }
        return false;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkMajorCode;
    private javax.swing.JLabel checkmajorName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonFind;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldMajorCode;
    private javax.swing.JTextField jTextFieldMajorName;
    private javax.swing.JTextField jTextFieldStatus;
    private javax.swing.JButton jbuttonDeletePre;
    // End of variables declaration//GEN-END:variables

    public boolean checkMajorName() {
        String majorname = jTextFieldMajorName.getText().trim();
        String regex = "[a-zA-Z\\s]*";
        if (majorname.equals("")) {
            checkmajorName.setText("Please input MajorName");
            checkmajorName.setForeground(Color.red);
            jTextFieldMajorName.grabFocus();
            jTextFieldMajorName.selectAll();
        } else {
            if (!majorname.matches(regex) || majorname.length() >= 50) {
                checkmajorName.setText("Max length is 50 characters, not contains special characters");
                checkmajorName.setForeground(Color.red);
                jTextFieldMajorName.grabFocus();
                jTextFieldMajorName.selectAll();

            } else {
                checkmajorName.setText("");
                checkmajorName.setForeground(Color.WHITE);
                return true;
            }

        }
        return false;
    }

    void loadFindMajor(ArrayList<MajorDTO> list) {
        try {
            Vector header = new Vector();
            header.add("MajorCode");
            header.add("MajorName");
            if (list != null) {
                Vector data = new Vector();
                for (MajorDTO s : list) {
                    Vector row = new Vector();
                    row.add(s.getMajorCode());
                    row.add(s.getMajorName());
                    data.add(row);
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.setDataVector(data, header);
                }
            } else {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadMajor111() {
        try {
            listma = dao.majorDAO.getAllMajor111();
            Vector header = new Vector();
            header.add("MajorCode");
            header.add("MajorName");
//            header.add("Status");

            Vector data = new Vector();
            for (MajorDTO s : listma) {
                Vector row = new Vector();
                row.add(s.getMajorCode());
                row.add(s.getMajorName());
//                row.add(s.getStatus());
                data.add(row);
            }
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setDataVector(data, header);
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
