/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myboston.calculator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author getWorth
 */
public class CalculatorEditorUI extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorEditorUI
     */
    public CalculatorEditorUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CalculatorPanel1 = new javax.swing.JPanel();
        resultPanel = new javax.swing.JPanel();
        txtResult = new javax.swing.JTextField();
        btnMemoryPlus = new javax.swing.JButton();
        btnMemoryMinus = new javax.swing.JButton();
        btnMemoryRecall = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnMultiple = new javax.swing.JButton();
        btnDivion = new javax.swing.JButton();
        btnEquivalent = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum7 = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        btnSeparator = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(450, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CalculatorPanel1.setBackground(new java.awt.Color(255, 255, 255));
        CalculatorPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
            .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtResult, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
        );

        CalculatorPanel1.add(resultPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 467, -1));

        btnMemoryPlus.setBackground(new java.awt.Color(153, 153, 153));
        btnMemoryPlus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMemoryPlus.setText("M+");
        btnMemoryPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMemoryPlusMouseClicked(evt);
            }
        });
        btnMemoryPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoryPlusActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnMemoryPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 65, 40));

        btnMemoryMinus.setBackground(new java.awt.Color(153, 153, 153));
        btnMemoryMinus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMemoryMinus.setText("M-");
        btnMemoryMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMemoryMinusMouseClicked(evt);
            }
        });
        btnMemoryMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoryMinusActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnMemoryMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 65, 40));

        btnMemoryRecall.setBackground(new java.awt.Color(153, 153, 153));
        btnMemoryRecall.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMemoryRecall.setText("MR");
        btnMemoryRecall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMemoryRecallMouseClicked(evt);
            }
        });
        btnMemoryRecall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoryRecallActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnMemoryRecall, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 65, 40));

        btnClear.setBackground(new java.awt.Color(204, 0, 0));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CE");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        CalculatorPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 65, 40));

        btnNum2.setBackground(new java.awt.Color(255, 255, 255));
        btnNum2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNum2.setText("2");
        btnNum2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNum2MouseClicked(evt);
            }
        });
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 65, 40));

        btnNum1.setBackground(new java.awt.Color(255, 255, 255));
        btnNum1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNum1.setText("1");
        btnNum1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNum1MouseClicked(evt);
            }
        });
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 65, 40));

        btnNum3.setBackground(new java.awt.Color(255, 255, 255));
        btnNum3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNum3.setText("3");
        btnNum3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNum3MouseClicked(evt);
            }
        });
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 65, 40));

        btnAdd.setBackground(new java.awt.Color(204, 204, 255));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("+");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 65, 40));

        btnMinus.setBackground(new java.awt.Color(204, 204, 255));
        btnMinus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMinus.setText("-");
        btnMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinusMouseClicked(evt);
            }
        });
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 65, 40));

        btnMultiple.setBackground(new java.awt.Color(204, 204, 255));
        btnMultiple.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMultiple.setText("*");
        btnMultiple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultipleMouseClicked(evt);
            }
        });
        btnMultiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultipleActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnMultiple, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 65, 40));

        btnDivion.setBackground(new java.awt.Color(204, 204, 255));
        btnDivion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDivion.setText("/");
        btnDivion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDivionMouseClicked(evt);
            }
        });
        btnDivion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivionActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnDivion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 65, 40));

        btnEquivalent.setBackground(new java.awt.Color(204, 204, 255));
        btnEquivalent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEquivalent.setText("=");
        btnEquivalent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEquivalentMouseClicked(evt);
            }
        });
        btnEquivalent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquivalentActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnEquivalent, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 65, 40));

        btnNum4.setBackground(new java.awt.Color(255, 255, 255));
        btnNum4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNum4.setText("4");
        btnNum4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNum4MouseClicked(evt);
            }
        });
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });
        btnNum4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNum4KeyPressed(evt);
            }
        });
        CalculatorPanel1.add(btnNum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 65, 40));

        btnNum5.setBackground(new java.awt.Color(255, 255, 255));
        btnNum5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNum5.setText("5");
        btnNum5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNum5MouseClicked(evt);
            }
        });
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnNum5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 65, 40));

        btnNum6.setBackground(new java.awt.Color(255, 255, 255));
        btnNum6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNum6.setText("6");
        btnNum6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNum6MouseClicked(evt);
            }
        });
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnNum6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 65, 40));

        btnNum9.setBackground(new java.awt.Color(255, 255, 255));
        btnNum9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNum9.setText("9");
        btnNum9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNum9MouseClicked(evt);
            }
        });
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnNum9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 65, 40));

        btnNum8.setBackground(new java.awt.Color(255, 255, 255));
        btnNum8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNum8.setText("8");
        btnNum8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNum8MouseClicked(evt);
            }
        });
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnNum8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 65, 40));

        btnNum7.setBackground(new java.awt.Color(255, 255, 255));
        btnNum7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNum7.setText("7");
        btnNum7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNum7MouseClicked(evt);
            }
        });
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnNum7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 65, 40));

        btnNum0.setBackground(new java.awt.Color(255, 255, 255));
        btnNum0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNum0.setText("0");
        btnNum0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNum0MouseClicked(evt);
            }
        });
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnNum0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 65, 40));

        btnSeparator.setBackground(new java.awt.Color(255, 255, 255));
        btnSeparator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSeparator.setText(".");
        btnSeparator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeparatorActionPerformed(evt);
            }
        });
        CalculatorPanel1.add(btnSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 65, 40));

        getContentPane().add(CalculatorPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultActionPerformed

    private void btnMemoryRecallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemoryRecallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMemoryRecallActionPerformed

    private void btnMemoryMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemoryMinusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMemoryMinusActionPerformed

    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNum3ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnMultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultipleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMultipleActionPerformed

    private void btnDivionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDivionActionPerformed

    private void btnEquivalentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquivalentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEquivalentActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNum0ActionPerformed

    private void btnSeparatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeparatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeparatorActionPerformed

    private void btnMemoryPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemoryPlusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMemoryPlusActionPerformed

    private void btnNum1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNum1MouseClicked
        // TODO add your handling code here: 
        String res = txtResult.getText();
        if(txtResult.getText().isEmpty())
            txtResult.setText("1");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            txtResult.setText(txtResult.getText() + "1");
            value2 = Integer.parseInt(value2 + "1");
        }
        else
            txtResult.setText(txtResult.getText()+ "1");
    }//GEN-LAST:event_btnNum1MouseClicked

    private void btnNum2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNum2MouseClicked
        // TODO add your handling code here:
        String res = txtResult.getText();
        if(txtResult.getText().isEmpty())
            txtResult.setText("2");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            txtResult.setText(txtResult.getText() + "2");
            value2 = Integer.parseInt(value2 + "2");
        }
        else
            txtResult.setText(txtResult.getText()+ "2");
    }//GEN-LAST:event_btnNum2MouseClicked

    private void btnNum3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNum3MouseClicked
        // TODO add your handling code here:
        String res = txtResult.getText();
        if(txtResult.getText().isEmpty())
            txtResult.setText("3");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            txtResult.setText(txtResult.getText() + "3");
            value2 = Integer.parseInt(value2 + "3");
        }
        else
            txtResult.setText(txtResult.getText()+ "3");
    }//GEN-LAST:event_btnNum3MouseClicked

    private void btnNum4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNum4MouseClicked
        // TODO add your handling code here:
        String res = txtResult.getText();
        if(txtResult.getText().isEmpty())
            txtResult.setText("4");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            txtResult.setText(txtResult.getText() + "4");
            value2 = Integer.parseInt(value2 + "4");
        }
        else
            txtResult.setText(txtResult.getText()+ "4");
    }//GEN-LAST:event_btnNum4MouseClicked

    private void btnNum4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNum4KeyPressed
        // TODO add your handling code here:
        String res = txtResult.getText();
        if(txtResult.getText().isEmpty())
            txtResult.setText("4");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            txtResult.setText(txtResult.getText() + "4");
            value2 = Integer.parseInt(value2 + "4");
        }
        else
            txtResult.setText(txtResult.getText()+ "4");
    }//GEN-LAST:event_btnNum4KeyPressed

    private void btnNum5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNum5MouseClicked
        // TODO add your handling code here:
        String res = txtResult.getText();
        if(txtResult.getText().isEmpty())
            txtResult.setText("5");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            txtResult.setText(txtResult.getText() + "5");
            value2 = Integer.parseInt(value2 + "5");
        }
        else
            txtResult.setText(txtResult.getText()+ "5");
    }//GEN-LAST:event_btnNum5MouseClicked

    private void btnNum6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNum6MouseClicked
        // TODO add your handling code here:
        String res = txtResult.getText();
        if(txtResult.getText().isEmpty())
            txtResult.setText("6");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            txtResult.setText(txtResult.getText() + "6");
            value2 = Integer.parseInt(value2 + "6");
        }
        else
            txtResult.setText(txtResult.getText()+ "6");
    }//GEN-LAST:event_btnNum6MouseClicked

    private void btnNum7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNum7MouseClicked
        // TODO add your handling code here:
        String res = txtResult.getText();
        if(txtResult.getText().isEmpty())
            txtResult.setText("7");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            txtResult.setText(txtResult.getText() + "7");
            value2 = Integer.parseInt(value2 + "7");
        }
        else
            txtResult.setText(txtResult.getText()+ "7");
    }//GEN-LAST:event_btnNum7MouseClicked

    private void btnNum8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNum8MouseClicked
        // TODO add your handling code here:
        String res = txtResult.getText();
        if(txtResult.getText().isEmpty())
            txtResult.setText("8");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            txtResult.setText(txtResult.getText() + "8");
            value2 = Integer.parseInt(value2 + "8");
        }
        else
            txtResult.setText(txtResult.getText()+ "8");
    }//GEN-LAST:event_btnNum8MouseClicked

    private void btnNum9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNum9MouseClicked
        // TODO add your handling code here:
        String res = txtResult.getText();
        if(txtResult.getText().isEmpty())
            txtResult.setText("9");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            txtResult.setText(txtResult.getText() + "9");
            value2 = Integer.parseInt(value2 + "9");
        }
        else
            txtResult.setText(txtResult.getText()+ "9");
    }//GEN-LAST:event_btnNum9MouseClicked

    private void btnNum0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNum0MouseClicked
        // TODO add your handling code here:
        String res = txtResult.getText();
        if(txtResult.getText().isEmpty())
            txtResult.setText("0");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            txtResult.setText(txtResult.getText() + "0");
            value2 = Integer.parseInt(value2 + "0");
        }
        else
            txtResult.setText(txtResult.getText()+ "0");
    }//GEN-LAST:event_btnNum0MouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        txtResult.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        if(txtResult.getText().isEmpty())
           return;
        else
           value1 = Integer.parseInt(txtResult.getText());
           txtResult.setText( txtResult.getText() + "" + btnAdd.getText() );
           operator = "plus";
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinusMouseClicked
        // TODO add your handling code here:
        if(txtResult.getText().isEmpty())
           return;
        else
            value1 = Integer.parseInt(txtResult.getText());
            txtResult.setText( txtResult.getText() + " " + btnMinus.getText() );
            operator = "minus";
    }//GEN-LAST:event_btnMinusMouseClicked

    private void btnMultipleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultipleMouseClicked
        // TODO add your handling code here:
        if(txtResult.getText().isEmpty())
           return;
        else
            value1 = Integer.parseInt(txtResult.getText());
            txtResult.setText( txtResult.getText() + " " + btnMultiple.getText() );
            operator = "multiplecation";
    }//GEN-LAST:event_btnMultipleMouseClicked

    private void btnDivionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivionMouseClicked
        // TODO add your handling code here:
        
        if(txtResult.getText().isEmpty())
           return;
        else
            value1 = Integer.parseInt(txtResult.getText());
            txtResult.setText( txtResult.getText() + " " + btnDivion.getText() );
            operator = "division";
    }//GEN-LAST:event_btnDivionMouseClicked

    private void btnEquivalentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEquivalentMouseClicked
        // TODO add your handling code here:
        double answer = 0;
        switch ( operator ) {
            case "plus":
            answer = value1 + value2;
            break;
            case "minus":
            answer = value1 - value2;
            break;
            case "multiplication":
            answer = value1 * value2;
            break;
            case "division":
             answer = value1/value2;
            break;
            default:
        }
        String Result = Double.toString(answer);
        txtResult.setText(Result);
    }//GEN-LAST:event_btnEquivalentMouseClicked

    private void btnMemoryPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemoryPlusMouseClicked
        // TODO add your handling code here:
 
            try {
              if(txtResult.getText().isEmpty()) {
               JOptionPane.showMessageDialog(null, "Please enter a number", "Alert", JOptionPane.ERROR_MESSAGE);  
              }
              else {
                File userDataFile = new File("memory.txt");
                if (userDataFile.exists());
                FileWriter fr = new FileWriter("memory.txt");
                BufferedWriter br = new BufferedWriter(fr);
                br.write(txtResult.getText());
                JOptionPane.showMessageDialog(null, "Value successfully saved to memory", "Alert", JOptionPane.INFORMATION_MESSAGE);
                br.close();
              }
            }
            catch(IOException i){
                i.printStackTrace();
            }
    }//GEN-LAST:event_btnMemoryPlusMouseClicked

    private void btnMemoryMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemoryMinusMouseClicked
        // TODO add your handling code here:
            try {
                File userDataFile = new File("memory.txt");
                if (userDataFile.exists());
                FileWriter fr = new FileWriter("memory.txt");
                BufferedWriter br = new BufferedWriter(fr);
                br.flush();
                JOptionPane.showMessageDialog(null, "Value successfully removed from memory", "Alert", JOptionPane.INFORMATION_MESSAGE);
                br.close();
              }
            catch(IOException i){
                i.printStackTrace();
            }
    }//GEN-LAST:event_btnMemoryMinusMouseClicked

    private void btnMemoryRecallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemoryRecallMouseClicked
        // TODO add your handling code here:
       try {
        BufferedReader in = new BufferedReader(new FileReader("memory.txt"));
        String line;
        while((line = in.readLine()) != null){
            System.out.println(line);
            txtResult.setText(line);
            JOptionPane.showMessageDialog(null, "Retrived value is:" + " " + line, "Alert", JOptionPane.INFORMATION_MESSAGE);
        }
        in.close();
       } catch (IOException i) {
         i.printStackTrace();
       }
       
    }//GEN-LAST:event_btnMemoryRecallMouseClicked

    /**
     * @param args the command line arguments
     */
    public int value1;
    public int value2;
    public String operator;
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
            java.util.logging.Logger.getLogger(CalculatorEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorEditorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CalculatorPanel1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivion;
    private javax.swing.JButton btnEquivalent;
    private javax.swing.JButton btnMemoryMinus;
    private javax.swing.JButton btnMemoryPlus;
    private javax.swing.JButton btnMemoryRecall;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiple;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnSeparator;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
