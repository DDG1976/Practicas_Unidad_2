/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Operaciones extends javax.swing.JInternalFrame {
int c=0,c2=0;

    /**
     * Creates new form Operaciones
     */
    public Operaciones() {
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

        jPanel1 = new javax.swing.JPanel();
        Txt_1 = new javax.swing.JTextField();
        Txt_2 = new javax.swing.JTextField();
        lblXD = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        BtnCalcular = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        BotSuma = new javax.swing.JRadioButton();
        BotResta = new javax.swing.JRadioButton();
        BotMult = new javax.swing.JRadioButton();
        BotDivision = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setLayout(new java.awt.GridLayout(4, 1));

        Txt_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_1KeyTyped(evt);
            }
        });
        jPanel1.add(Txt_1);

        Txt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_2ActionPerformed(evt);
            }
        });
        Txt_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_2KeyTyped(evt);
            }
        });
        jPanel1.add(Txt_2);

        lblXD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXD.setText("0.0");
        jPanel1.add(lblXD);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(450, 80));
        jPanel2.setLayout(new java.awt.GridLayout(1, 1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Operaciones Aritmeticas XD");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel5.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel5.setLayout(new java.awt.GridLayout(1, 4));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7);

        BtnCalcular.setText("Calcular");
        BtnCalcular.setEnabled(false);
        jPanel5.add(BtnCalcular);

        jButton6.setText("Cerrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6);

        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel4.setPreferredSize(new java.awt.Dimension(200, 150));
        jPanel4.setLayout(new java.awt.GridLayout(4, 1));

        BotSuma.setText("Suma");
        BotSuma.setEnabled(false);
        jPanel4.add(BotSuma);

        BotResta.setText("Resta");
        BotResta.setEnabled(false);
        jPanel4.add(BotResta);

        BotMult.setText("Multiplicacion");
        BotMult.setEnabled(false);
        jPanel4.add(BotMult);

        BotDivision.setText("Division");
        BotDivision.setEnabled(false);
        jPanel4.add(BotDivision);

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.setLayout(new java.awt.GridLayout(4, 1));

        btnSuma.setText("Suma");
        btnSuma.setEnabled(false);
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSuma);

        btnResta.setText("Resta");
        btnResta.setEnabled(false);
        jPanel3.add(btnResta);

        btnMultiplicacion.setText("Multiplicacion");
        btnMultiplicacion.setEnabled(false);
        jPanel3.add(btnMultiplicacion);

        btnDivision.setText("Division");
        btnDivision.setEnabled(false);
        jPanel3.add(btnDivision);

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Txt_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_1KeyTyped
        // TODO add your handling code here:
  int key = evt.getKeyChar();//convertir un char a ascii
   if(key==8){
    c--;
    if((key>=48 && key<=57)||key==46){
    c++;
  
    }else{
      evt.consume();
  }
  if(c<0 && c2<0){
      btnSuma.setEnabled(true);
      btnResta.setEnabled(true);
      btnMultiplicacion.setEnabled(true);
      btnDivision.setEnabled(true);
    }else{
      btnSuma.setEnabled(true);
      btnResta.setEnabled(true);
      btnMultiplicacion.setEnabled(true);
      btnDivision.setEnabled(true);
  }
  if(key==8){
   c--;   
  }
   }
    }//GEN-LAST:event_Txt_1KeyTyped

    private void Txt_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_2KeyTyped
    // TODO add your handling code here:
    int key = evt.getKeyChar();//convertir un char a ascii
    if(key>=48 && key<=57){
    c++;    
    }else{
      evt.consume();
  }
  if(c>0 && c2>0){
      btnSuma.setEnabled(true);
      btnResta.setEnabled(true);
      btnMultiplicacion.setEnabled(true);
      btnDivision.setEnabled(true);
      BotSuma.setEnabled(true);
      BotResta.setEnabled(true);
      BotMult.setEnabled(true);
      BotDivision.setEnabled(true);
      BtnCalcular.setEnabled(true);
    }else{
      btnSuma.setEnabled(false);
      btnResta.setEnabled(false);
      btnMultiplicacion.setEnabled(false);
      btnDivision.setEnabled(false);
      BotSuma.setEnabled(false);
      BotResta.setEnabled(false);
      BotMult.setEnabled(false);
      BotDivision.setEnabled(false);
      BtnCalcular.setEnabled(false);
  }
 
    }//GEN-LAST:event_Txt_2KeyTyped

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
        String n1,n2;
        n1=Txt_1.getText();
        n2=Txt_2.getText();
        Validaciones v= new Validaciones();
    if (v.validarEnteros(n1).equals("decimal")){
           //JOptionPane.showMessageDialog(null, "hola");
          float a=Float.parseFloat(n1);
          
    if (v.validarEnteros(n2).equals("decimal")){
              
             float b=Float.parseFloat(n2);
             float r= a + b;
             lblXD.setText(Float.toString(r));
    }else if(v.validarEnteros(n1).equals("decimal")){
        int b=Integer.parseInt(n1);
        float r= a+b;
        lblXD.setText(Float.toString(r));
    } 
    }else if(v.validarEnteros(n1).equals("entero")){
         int a=Integer.parseInt(n1);
    if(v.validarEnteros(n2).equals("entero")){
         int b=Integer.parseInt(n2);
         int r = a + b ;
         lblXD.setText(Integer.toString(r));
    }else if(v.validarEnteros(n2).equals("decimal")){
        float t=Float.parseFloat(n2);
        float r= a+t;
        lblXD.setText(Float.toString(r));
    }
         }
         
    }//GEN-LAST:event_btnSumaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotDivision;
    private javax.swing.JRadioButton BotMult;
    private javax.swing.JRadioButton BotResta;
    private javax.swing.JRadioButton BotSuma;
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JTextField Txt_1;
    private javax.swing.JTextField Txt_2;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblXD;
    // End of variables declaration//GEN-END:variables
}
