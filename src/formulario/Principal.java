/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Nicolas
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    private Datos datos;

    fondoPanel fondo = new fondoPanel();

    public Principal() {
        this.setContentPane(fondo);
        initComponents();
        datos = new Datos();

        String root = "src\\imagenes\\Imagen.jpg";
        setImagenLabel(imagenLabel, root);
    }

    private void setImagenLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(
                        labelName.getWidth(),
                        labelName.getHeight(),
                        Image.SCALE_DEFAULT)
        );
        labelName.setIcon(icon);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIngreso = new javax.swing.JLabel();
        jLabelUsu = new javax.swing.JLabel();
        jLabelCont = new javax.swing.JLabel();
        txtUsu = new javax.swing.JTextField();
        ptCont = new javax.swing.JPasswordField();
        cbVer = new javax.swing.JCheckBox();
        btnIngresar = new javax.swing.JButton();
        imagenLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelIngreso.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelIngreso.setForeground(new java.awt.Color(153, 0, 0));
        jLabelIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIngreso.setText("INGRESO");

        jLabelUsu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelUsu.setText("Usuario:");

        jLabelCont.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelCont.setText("Contraseña:");

        txtUsu.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        ptCont.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ptCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptContActionPerformed(evt);
            }
        });

        cbVer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbVer.setText("Ver Contraseña");
        cbVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVerActionPerformed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(btnIngresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelIngreso)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCont)
                                    .addComponent(jLabelUsu))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsu)
                                    .addComponent(ptCont, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbVer)
                                .addGap(0, 3, Short.MAX_VALUE)))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelIngreso)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUsu)
                            .addComponent(txtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCont)
                    .addComponent(ptCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVer))
                .addGap(70, 70, 70)
                .addComponent(btnIngresar)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVerActionPerformed
        if (cbVer.isSelected()) {
            ptCont.setEchoChar((char) 0);
        } else {
            ptCont.setEchoChar(
                    '*');
        }
    }//GEN-LAST:event_cbVerActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
//        String usuario=this.txtUsu.getText();
//        String contraseña=this.ptCont.getText();
//        
//        if(usuario.equals("Profesor")&&contraseña.equals("12345")){
//            Principal ventana=new Principal();
//            ventana.setVisible(true);
//            this.setVisible(false);
//        }
//        else{
//            JOptionPane.showMessageDialog(this, "El acceso es incorrecto",
//                    "Error",JOptionPane.ERROR_MESSAGE);
//        }
        //Estoy probando algo con esto
        datos.setPrincipal(this);
        datos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void ptContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptContActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptContActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JCheckBox cbVer;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JLabel jLabelCont;
    private javax.swing.JLabel jLabelIngreso;
    private javax.swing.JLabel jLabelUsu;
    private javax.swing.JPasswordField ptCont;
    private javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables

    class fondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/Fondo.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);

        }

    }

}
