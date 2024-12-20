/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import static formulario.Datos.spEdad;
import static formulario.Datos.txtApe;
import static formulario.Datos.txtDirec;
import static formulario.Datos.txtNom;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author Nicolas
 */

public class Verificacion extends javax.swing.JFrame {

    private ProductosPedir productosPedir;
    private final TablaDeRegistro registro;

    fondoPanel fondo = new fondoPanel();

    public Verificacion() {
        this.setContentPane(fondo);
        initComponents();
        registro = new TablaDeRegistro();

    }

    public void setProductosPedir(ProductosPedir productosPedir) {
        this.productosPedir = productosPedir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelVerifica = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaVerifica = new javax.swing.JTextArea();
        btnAtras = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabelVerifica.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelVerifica.setForeground(new java.awt.Color(153, 0, 0));
        jLabelVerifica.setText("VERIFICA INFORMACIÓN");
        jLabelVerifica.setToolTipText("");

        txtaVerifica.setColumns(20);
        txtaVerifica.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtaVerifica.setRows(5);
        jScrollPane1.setViewportView(txtaVerifica);

        btnAtras.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar))
                    .addComponent(jLabelVerifica))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelVerifica)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        productosPedir.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
  String genero = "";
        if (Datos.rbtnMujer.isSelected()) {
            genero = "Mujer";
        } else {
            genero = "Hombre";
        }

        txtaVerifica.setText("Estos son los datos que estas registrando!!!\n\n"
                + "Nombre: " + txtNom.getText()
                + "\nApellido: " + txtApe.getText()
                + "\nCorreo: " + spEdad.getValue().toString()
                + "\nDirección: " + txtDirec.getText()
                + "\nEdad: " + spEdad.getValue().toString()
                + "\nGenero: " + genero
                + "\nProducto elegido: " + Variables.getProducto()
                + "\nForma de pago:" + Variables.getFormaPago()
        );
    }//GEN-LAST:event_formWindowActivated

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        JOptionPane.showMessageDialog(null, "Datos Registrados Correctamente\n\n"     
        );

        registro.setVerificacion(this);
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
         
//protected static javax.swing.JComboBox jComboBoxPago;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabelVerifica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtaVerifica;
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
