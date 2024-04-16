
package Clases;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author LJ
 */
public class CEjemplo1 extends javax.swing.JFrame {

   Operaciones Opera =new Operaciones();
    public CEjemplo1() {
        initComponents();
        formulario();
    }
private void formulario(){
        this.setTitle("Operaciones Matematicas");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.PnaleOperaciones.setBackground(new Color(255,255,255));
        this.PanelDatos.setBackground(new Color(255,255,255));
        this.txtnum1.requestFocus();
}
private float leernumero1(){
    float num1;
    num1=Float.parseFloat(this.txtnum1.getText().trim());
    return num1;
}
private float leernumero2(){
    float num2;
    num2 =Float.parseFloat(this.txtnum2.getText().trim());
    return num2;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnaleOperaciones = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        PanelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnum1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(360, 300));

        btnCalcular.setBackground(new java.awt.Color(255, 102, 102));
        btnCalcular.setText("Calcular");
        btnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(153, 255, 153));
        btnNuevo.setText("Nuevo");
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnSalir.setBackground(new java.awt.Color(255, 255, 153));
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setText("Ingrese un numero");

        jLabel3.setText("Ingrese un numero");

        txtnum1.setBackground(new java.awt.Color(255, 204, 204));
        txtnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum1ActionPerformed(evt);
            }
        });

        txtnum2.setBackground(new java.awt.Color(204, 255, 204));
        txtnum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum2ActionPerformed(evt);
            }
        });

        txtSalida.setBackground(new java.awt.Color(204, 204, 255));
        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PnaleOperacionesLayout = new javax.swing.GroupLayout(PnaleOperaciones);
        PnaleOperaciones.setLayout(PnaleOperacionesLayout);
        PnaleOperacionesLayout.setHorizontalGroup(
            PnaleOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnaleOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnaleOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular)
                    .addComponent(btnNuevo)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnaleOperacionesLayout.setVerticalGroup(
            PnaleOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnaleOperacionesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PnaleOperacionesLayout.createSequentialGroup()
                .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Operaciones Aritmeticas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnaleOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PnaleOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
float num1, num2;
num1 = leernumero1();
num2 = leernumero2();
this.txtSalida.setText("\tResultado\n");
this.txtSalida.append("\t-----------\n");
Operaciones Opera = new Operaciones();
this.txtSalida.append("La suma es: " + String.valueOf(Opera.suma(num1, num2)) + "\n");
this.txtSalida.append("La resta es: " + String.valueOf(Opera.resta(num1, num2)) + "\n");
this.txtSalida.append("La multiplicación es: " + String.valueOf(Opera.multiplicacion(num1, num2)) + "\n");
this.txtSalida.append("La división es: " + String.valueOf(Opera.division(num1, num2)) + "\n");

try {
    float resultadoRaiz = Opera.raizCuadrada(num1); // Calcular la raíz cuadrada
    this.txtSalida.append("La raíz cuadrada de " + num1 + " es: " + String.valueOf(resultadoRaiz) + "\n");
} catch (IllegalArgumentException e) {
    this.txtSalida.append("Error al calcular la raíz cuadrada de " + num1 + ": " + e.getMessage() + "\n");
}

this.txtSalida.append("El número " + num1 + " elevado a la potencia " + num2 + " es: " + String.valueOf(Opera.potencia(num1, num2)) + "\n");
this.txtSalida.append("El seno de " + num1 + " es: " + String.valueOf(Opera.seno(num1)) + "\n");
this.txtSalida.append("El coseno de " + num1 + " es: " + String.valueOf(Opera.coseno(num1)) + "\n");
this.txtSalida.append("La raíz cúbica de " + num1 + " es: " + String.valueOf(Opera.raizCubica(num1)) + "\n");
this.txtSalida.append("El mayor de los números " + num1 + " y " + num2 + " es: " + String.valueOf(Opera.mayor(num1, num2)) + "\n");



    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum1ActionPerformed

    private void txtnum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum2ActionPerformed

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
            java.util.logging.Logger.getLogger(CEjemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CEjemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CEjemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CEjemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CEjemplo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JPanel PnaleOperaciones;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    // End of variables declaration//GEN-END:variables
}
