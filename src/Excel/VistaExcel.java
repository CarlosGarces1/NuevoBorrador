package Excel;

import Excel.ControladorExcel;
import borrador.Frm_login;
import borrador.Frm_menu;
import borrador.Mostrar_alumnos;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import borrador.persona;

public class VistaExcel extends javax.swing.JFrame {

    public VistaExcel() {
        initComponents();
        setSize(1200, 700);
        setLocationRelativeTo(null);
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/1200x700.png"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        
        
        /**Con este metodo llamamos la variable usuario
         * del frame anterior para
         * mostrar el mensaje de bienvenida 
        */
        Frm_login nombre = new Frm_login();
        jLabel_Nombre.setText("BIENVENIDO "+nombre.usuario.toUpperCase());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImportar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DatosExcel = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton = new javax.swing.JButton();
        jButton_nuevo = new javax.swing.JButton();
        jButton_definitiva = new javax.swing.JButton();
        jButton_informe = new javax.swing.JButton();
        jLabel_Nombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        btnImportar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnImportar.setText("IMPORTAR");
        btnImportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        btnExportar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExportar.setText("EXPORTAR");
        btnExportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        DatosExcel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DatosExcel.setToolTipText("");
        jScrollPane1.setViewportView(DatosExcel);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x-regular-36.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton.setText("ATRAS");
        jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        jButton_nuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_nuevo.setText("NUEVO ESTUDIANTE ");
        jButton_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevoActionPerformed(evt);
            }
        });

        jButton_definitiva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_definitiva.setText("DEFINITIVAS");
        jButton_definitiva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_definitiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_definitivaActionPerformed(evt);
            }
        });

        jButton_informe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_informe.setText("INFORME");
        jButton_informe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_informeActionPerformed(evt);
            }
        });

        jLabel_Nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jButton_nuevo)
                        .addGap(99, 99, 99)
                        .addComponent(jButton_definitiva)
                        .addGap(198, 198, 198))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_informe)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel_Nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_Nombre))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImportar)
                    .addComponent(btnExportar)
                    .addComponent(jButton_nuevo)
                    .addComponent(jButton_definitiva)
                    .addComponent(jButton_informe))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed

    }//GEN-LAST:event_btnImportarActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        Frm_menu ventana = new Frm_menu();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonActionPerformed
    int xx;
    int yy;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_formMouseDragged

    private void jButton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevoActionPerformed
        persona ventana = new persona();
        ventana.setVisible(true);

    }//GEN-LAST:event_jButton_nuevoActionPerformed

    private void jButton_definitivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_definitivaActionPerformed
            Mostrar_alumnos nueva = new Mostrar_alumnos();
            nueva.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton_definitivaActionPerformed

    private void jButton_informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_informeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_informeActionPerformed

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
            java.util.logging.Logger.getLogger(VistaExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        ModeloExcel ModeloEX = new ModeloExcel();
        VistaExcel VistaEX = new VistaExcel();
        ControladorExcel ControlExcel = new ControladorExcel(VistaEX, ModeloEX);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable DatosExcel;
    public javax.swing.JButton btnExportar;
    public javax.swing.JButton btnImportar;
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton_definitiva;
    private javax.swing.JButton jButton_informe;
    private javax.swing.JButton jButton_nuevo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
