/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Nicolas
 */
public class ProductosPedir extends javax.swing.JFrame {

    private Datos datos;
    private final Verificacion verificacion;
    
    fondoPanel fondo = new fondoPanel();

    public ProductosPedir() {
        this.setContentPane(fondo);
        initComponents();
        verificacion = new Verificacion();

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

    public void setDatos(Datos datos) {
        this.datos = datos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgProd = new javax.swing.ButtonGroup();
        jLabelProd = new javax.swing.JLabel();
        jCheckBoxCollarPerro = new javax.swing.JCheckBox();
        jCheckBoxCollarGato = new javax.swing.JCheckBox();
        jCheckBoxCamaPerro = new javax.swing.JCheckBox();
        jCheckBoxCamaGato = new javax.swing.JCheckBox();
        jCheckBoxArenero = new javax.swing.JCheckBox();
        jCheckBoxCocaPerro = new javax.swing.JCheckBox();
        jCheckBoxCocaGato = new javax.swing.JCheckBox();
        jLabelFormaPago = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        imagenLabel = new javax.swing.JLabel();
        jComboBoxPago = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelProd.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelProd.setForeground(new java.awt.Color(153, 0, 0));
        jLabelProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProd.setText("Productos Disponibles");

        btgProd.add(jCheckBoxCollarPerro);
        jCheckBoxCollarPerro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCheckBoxCollarPerro.setText("Collar para perro");

        btgProd.add(jCheckBoxCollarGato);
        jCheckBoxCollarGato.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCheckBoxCollarGato.setText("Collar para gato");

        btgProd.add(jCheckBoxCamaPerro);
        jCheckBoxCamaPerro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCheckBoxCamaPerro.setText("Cama para perro");

        btgProd.add(jCheckBoxCamaGato);
        jCheckBoxCamaGato.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCheckBoxCamaGato.setText("Cama para gato");

        btgProd.add(jCheckBoxArenero);
        jCheckBoxArenero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCheckBoxArenero.setText("Arenero");

        btgProd.add(jCheckBoxCocaPerro);
        jCheckBoxCocaPerro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCheckBoxCocaPerro.setText(" Coca para alimento Perro");
        jCheckBoxCocaPerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCocaPerroActionPerformed(evt);
            }
        });

        btgProd.add(jCheckBoxCocaGato);
        jCheckBoxCocaGato.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCheckBoxCocaGato.setText(" Coca para alimento Gato");
        jCheckBoxCocaGato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCocaGatoActionPerformed(evt);
            }
        });

        jLabelFormaPago.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelFormaPago.setText("Forma de Pago:");

        btnAtras.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnEnviar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEnviar.setText("Resgistrar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jComboBoxPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Efectivo", "Tarjeta", "Transferencia" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxCocaGato)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabelProd, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFormaPago)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jComboBoxPago, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxCollarPerro)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxCollarGato)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxCamaPerro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxCamaGato)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxArenero)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxCocaPerro)))
                .addGap(0, 77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabelProd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxCollarPerro)
                            .addComponent(jCheckBoxCollarGato)
                            .addComponent(jCheckBoxCamaPerro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxCamaGato)
                            .addComponent(jCheckBoxArenero)
                            .addComponent(jCheckBoxCocaPerro)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxCocaGato)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFormaPago)
                    .addComponent(jComboBoxPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxCocaPerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCocaPerroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxCocaPerroActionPerformed

    private void jCheckBoxCocaGatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCocaGatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxCocaGatoActionPerformed


    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        datos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

     Variables.setFormaPago(jComboBoxPago.getSelectedItem().toString());


        String producto = "sin seleccion";
        if (this.jCheckBoxCollarPerro.isSelected()) {
            producto = "Collar para Perro";
        } else if (this.jCheckBoxCollarGato.isSelected()) {
            producto = "Collar para Gato";
        } else if (this.jCheckBoxCocaPerro.isSelected()) {
            producto = "Coca para Perro";
        } else if (this.jCheckBoxCocaGato.isSelected()) {
            producto = "Coca para Gato";
        } else if (this.jCheckBoxCamaPerro.isSelected()) {
            producto = "Cama para Perro";
        } else if (this.jCheckBoxCamaGato.isSelected()) {
            producto = "Cama para Gato";
        } else if (this.jCheckBoxArenero.isSelected()) {
            producto = "Arenero";
        }
//
        Variables.setProducto(producto);

        verificacion.setProductosPedir(this);
        verificacion.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(ProductosPedir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductosPedir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductosPedir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductosPedir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductosPedir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgProd;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JCheckBox jCheckBoxArenero;
    private javax.swing.JCheckBox jCheckBoxCamaGato;
    private javax.swing.JCheckBox jCheckBoxCamaPerro;
    private javax.swing.JCheckBox jCheckBoxCocaGato;
    private javax.swing.JCheckBox jCheckBoxCocaPerro;
    private javax.swing.JCheckBox jCheckBoxCollarGato;
    private javax.swing.JCheckBox jCheckBoxCollarPerro;
    protected static javax.swing.JComboBox jComboBoxPago;
    private javax.swing.JLabel jLabelFormaPago;
    private javax.swing.JLabel jLabelProd;
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
