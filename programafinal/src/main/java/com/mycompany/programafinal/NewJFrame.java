/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programafinal;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TEFYTA
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        this.tabladetalles.setModel(modelo);
        this.modelo.addColumn("Sucursal");
        this.modelo.addColumn("Pizza");
        this.modelo.addColumn("Tipo de Pizza");
        this.modelo.addColumn("Descripcion");
        this.modelo.addColumn("Cantidad");
        this.modelo.addColumn("Total a Pagar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnnetopagar = new javax.swing.JButton();
        txtnetopagar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnquitar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbonacionalidad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        botonh = new javax.swing.JRadioButton();
        botonm = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtprenda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btngenerar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        cboclace = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalles = new javax.swing.JTable();
        btnlimpiartabla = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        btnnetopagar.setText("neto a pagar");
        btnnetopagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnetopagarActionPerformed(evt);
            }
        });

        jButton1.setText("clace");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("precio Q100");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("listado de pizzas disponible\n"));

        jLabel1.setText("pizza de peperoni");

        jLabel2.setText("pizza de jamon");

        jLabel3.setText("pizza de 5 carnes");

        jTextField2.setText("precio Q100");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("precio Q150");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        btnquitar.setText("quitar compra");
        btnquitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("orden"));

        jLabel4.setText("Sucursal");

        cbonacionalidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbonacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Jutiapa", "2 Jalapa", "3 Progreso" }));
        cbonacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonacionalidadActionPerformed(evt);
            }
        });

        jLabel5.setText("Ordenar");

        botonh.setText("pizza");
        botonh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonhActionPerformed(evt);
            }
        });

        botonm.setText("especialidades");

        jLabel6.setText("Descripcion");

        jLabel7.setText("Cantidad");

        jLabel8.setText("Precio");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Realizar Pedido");

        btngenerar.setText("generar");
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Limpiar Orden");

        btnlimpiar.setText("limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        cboclace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione", "peperoni", "jamon", "5carnes" }));
        cboclace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboclaceActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Total");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btngenerar)
                        .addGap(32, 32, 32)
                        .addComponent(btnlimpiar)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbonacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonm)))
                .addGap(18, 18, 18)
                .addComponent(cboclace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtprenda, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbonacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonh)
                        .addComponent(botonm)
                        .addComponent(txtprenda, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboclace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btngenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlimpiar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("pedido"));

        tabladetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladetalles);

        btnlimpiartabla.setText("LIMPIAR");
        btnlimpiartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiartablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnlimpiartabla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlimpiartabla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setText("Dominos Pizza");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 11, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     DefaultTableModel modelo = new DefaultTableModel();

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void cbonacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbonacionalidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        // TODO add your handling code here:
        Jutiapa();
        Jalapa();
        Monjas();
        if(botonh.isSelected()){
            this.modelo.addRow(new Object[]{this.cbonacionalidad.getSelectedIndex(),"pizza",
                this.cboclace.getSelectedItem(),this.txtprenda.getText(),this.txtcantidad.getText(),
                this.txtprenda.getText(),this.txttotal.getText()});
        }
        else if(botonm.isSelected()){
            this.modelo.addRow(new Object[]{this.cbonacionalidad.getSelectedIndex(),"especialidad",
                this.cboclace.getSelectedItem(),this.txtprenda.getText(),this.txtcantidad.getText(),
                this.txtprenda.getText(),this.txttotal.getText()});
        }
    }//GEN-LAST:event_btngenerarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        this.cbonacionalidad.setSelectedIndex(0);
        if(botonh.isSelected()){

        }
        if(botonm.isSelected()){

        }
        this.cboclace.setSelectedIndex(0);
        this.txtprenda.setText("");
        this.txtcantidad.setText("");
        this.txtprecio.setText("");
        this.txttotal.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnlimpiartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiartablaActionPerformed
        // TODO add your handling code here:
        int x = this.modelo.getColumnCount();
        for(int y = 0 ; y<= x ; y++){
            this.modelo.removeRow(0);
        }
        this.txtnetopagar.setText("");
    }//GEN-LAST:event_btnlimpiartablaActionPerformed
public void Jutiapa(){
        double cantidad_s,precio_s,total_s,desc_s=0;
        double cantidad_m,precio_m,total_m,desc_m=0;
        double cantidad_1,precio_1,total_1,desc_1=0;
        
        if(cbonacionalidad.getSelectedIndex()==2 ){
         if(this.botonh.isSelected()){
                
            
            if(cboclace.getSelectedIndex()== 1 ){
                //seleccione s
                
                cantidad_s=Double.parseDouble(this.txtcantidad.getText());
                precio_s=Double.parseDouble(this.txtprecio.getText());
                total_s=(precio_s*cantidad_s)-((cantidad_s*precio_s)*desc_s);
                this.txttotal.setText(String.valueOf(total_s));
                
                
            }
          }  
            
        }
        //seleccione m
          if(cbonacionalidad.getSelectedIndex()==2){
             if(this.botonh.isSelected()){
                 
             
              if(cboclace.getSelectedIndex()==2){
                  cantidad_m=Double.parseDouble(this.txtcantidad.getText());
                precio_m=Double.parseDouble(this.txtprecio.getText());
                total_m=(precio_m*cantidad_m)-((cantidad_m*precio_m)*desc_m);
                this.txttotal.setText(String.valueOf(total_m));
                  
                  
              }
             }  
          }
          // seleccon l
          if(cbonacionalidad.getSelectedIndex()==2){
              if(this.botonh.isSelected()){
                  
              
              if(cboclace.getSelectedIndex()==3){
                  cantidad_1=Double.parseDouble(this.txtcantidad.getText());
                precio_1=Double.parseDouble(this.txtprecio.getText());
                total_1=(precio_1*cantidad_1)-((cantidad_1*precio_1)*desc_1);
                this.txttotal.setText(String.valueOf(total_1));
                  
                  
              }
             } 
          }
    }//
    public void Jalapa(){
        double cantidad_s,precio_s,total_s,desc_s=0;
        double cantidad_m,precio_m,total_m,desc_m=0;
        double cantidad_1,precio_1,total_1,desc_1=0;
        
         if(cbonacionalidad.getSelectedIndex()== 2 ){
             if(this.botonh.isSelected()){
                 
             
            if(cboclace.getSelectedIndex()== 1 ){
                //seleccione s
                cantidad_s=Double.parseDouble(this.txtcantidad.getText());
                precio_s=Double.parseDouble(this.txtprecio.getText());
                total_s=(precio_s*cantidad_s)-((cantidad_s*precio_s)*desc_s);
                this.txttotal.setText(String.valueOf(total_s));
                
                
            }
            
          }  
        }
        //seleccione m
          if(cbonacionalidad.getSelectedIndex()==2){
              if(this.botonh.isSelected()){
                  
              
              if(cboclace.getSelectedIndex()==2){
                  cantidad_m=Double.parseDouble(this.txtcantidad.getText());
                precio_m=Double.parseDouble(this.txtprecio.getText());
                total_m=(precio_m*cantidad_m)-((cantidad_m*precio_m)*desc_m);
                this.txttotal.setText(String.valueOf(total_m));
                  
                  
              }
              }
          }
          // seleccon l
          if(cbonacionalidad.getSelectedIndex()==2){
               if(this.botonh.isSelected()){
                   
               
              if(cboclace.getSelectedIndex()==3){
                  cantidad_1=Double.parseDouble(this.txtcantidad.getText());
                precio_1=Double.parseDouble(this.txtprecio.getText());
                total_1=(precio_1*cantidad_1)-((cantidad_1*precio_1)*desc_1);
                this.txttotal.setText(String.valueOf(total_1));
                  
                  
              }
              }
          }
        
        
        
    }
    public void Monjas(){
        double cantidad_s,precio_s,total_s,desc_s=0;
        double cantidad_m,precio_m,total_m,desc_m=0;
        double cantidad_1,precio_1,total_1,desc_1=0;
        
         if(cbonacionalidad.getSelectedIndex()== 1){
             if(this.botonh.isSelected()){
                 
             
            if(cboclace.getSelectedIndex()== 1 ){
                //seleccione s
                cantidad_s=Double.parseDouble(this.txtcantidad.getText());
                precio_s=Double.parseDouble(this.txtprecio.getText());
                total_s=(precio_s*cantidad_s)-((cantidad_s*precio_s)*desc_s);
                this.txttotal.setText(String.valueOf(total_s));
                
                
            }
            
          }  
        }
        //seleccione m
          if(cbonacionalidad.getSelectedIndex()==1){
              if(this.botonh.isSelected()){
                  
              
              if(cboclace.getSelectedIndex()==2){
                  cantidad_m=Double.parseDouble(this.txtcantidad.getText());
                precio_m=Double.parseDouble(this.txtprecio.getText());
                total_m=(precio_m*cantidad_m)-((cantidad_m*precio_m)*desc_m);
                this.txttotal.setText(String.valueOf(total_m));
                  
                  
              }
              }
          }
          // seleccon l
          if(cbonacionalidad.getSelectedIndex()==1){
               if(this.botonh.isSelected()){
                   
               
              if(cboclace.getSelectedIndex()==3){
                  cantidad_1=Double.parseDouble(this.txtcantidad.getText());
                precio_1=Double.parseDouble(this.txtprecio.getText());
                total_1=(precio_1*cantidad_1)-((cantidad_1*precio_1)*desc_1);
                this.txttotal.setText(String.valueOf(total_1));
                  
                  
              }
              }
          }
        
        
        
    }
    private void btnquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitarActionPerformed
        // TODO add your handling code here:
        modelo.removeRow(this.tabladetalles.getSelectedRow());
    }//GEN-LAST:event_btnquitarActionPerformed

    private void btnnetopagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnetopagarActionPerformed
        // TODO add your handling code here:
        double sumatoria;
        double sumatorial=0;
        int totalrow=tabladetalles.getRowCount();
        totalrow-=1;
        for(int i = 0 ; i <= (totalrow);i++){
            sumatoria=Double.parseDouble(String.valueOf(tabladetalles.getValueAt(i, 6)));
            sumatorial+=sumatoria;

        }
        txtnetopagar.setText("S."+String.valueOf(sumatorial));
    }//GEN-LAST:event_btnnetopagarActionPerformed

    private void cboclaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboclaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboclaceActionPerformed

    private void botonhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonhActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonh;
    private javax.swing.JRadioButton botonm;
    private javax.swing.JButton btngenerar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnlimpiartabla;
    private javax.swing.JButton btnnetopagar;
    private javax.swing.JButton btnquitar;
    private javax.swing.JComboBox<String> cboclace;
    private javax.swing.JComboBox<String> cbonacionalidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tabladetalles;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtnetopagar;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtprenda;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
