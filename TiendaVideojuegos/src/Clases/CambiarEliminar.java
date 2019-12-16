/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.JuegosDisponibles.res;
import Conexiones.Procedimientos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class CambiarEliminar extends javax.swing.JFrame {

    /**
     * Creates new form CambiarEliminar
     */
    public CambiarEliminar() {
        initComponents();
        
        mostrarJuegosDisponibles(TablaJuegosDisponibles3, "SELECT * FROM Vista_Juegos_Disponibles;");
        
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMaximum(999);
        modeloSpinner.setMinimum(10);
        modeloSpinner.setStepSize(10);
        modeloSpinner.setValue(10);
        spnPrecio2.setModel(modeloSpinner);
        
        SpinnerNumberModel modeloSpinner2 = new SpinnerNumberModel();
        modeloSpinner2.setMaximum(300);
        modeloSpinner2.setMinimum(1);
        modeloSpinner2.setStepSize(1);
        modeloSpinner2.setValue(1);
        spnCantidad2.setModel(modeloSpinner2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCambiarBorrar = new javax.swing.JPanel();
        lblTitulo5 = new javax.swing.JLabel();
        lblGenero5 = new javax.swing.JLabel();
        lblEstudio5 = new javax.swing.JLabel();
        lblPlataforma5 = new javax.swing.JLabel();
        lblPrecio5 = new javax.swing.JLabel();
        lblCantidad5 = new javax.swing.JLabel();
        txtTitulo2 = new javax.swing.JTextField();
        spnCantidad2 = new javax.swing.JSpinner();
        spnPrecio2 = new javax.swing.JSpinner();
        cobPlataforma2 = new javax.swing.JComboBox<>();
        cobEstudio2 = new javax.swing.JComboBox<>();
        cobGenero2 = new javax.swing.JComboBox<>();
        btnCambiar = new javax.swing.JButton();
        btnRegresar2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtIDJuego3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaJuegosDisponibles3 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lblVender2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCambiarBorrar.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblTitulo5.setText("Titulo:");

        lblGenero5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblGenero5.setText("Genero:");

        lblEstudio5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblEstudio5.setText("Estudio:");

        lblPlataforma5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblPlataforma5.setText("Plataforma:");

        lblPrecio5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblPrecio5.setText("Precio:");

        lblCantidad5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblCantidad5.setText("Cantidad:");

        txtTitulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitulo2ActionPerformed(evt);
            }
        });
        txtTitulo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTitulo2KeyReleased(evt);
            }
        });

        cobPlataforma2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una plataforma...", "Xbox one", "Playstation 4", "Nintendo switch" }));

        cobEstudio2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccina un estudio...", "Capcom", "343", "Game freak", "Microsoft studios", "Naughty dog", "Ubisoft" }));
        cobEstudio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobEstudio2ActionPerformed(evt);
            }
        });

        cobGenero2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un genero...", "Terror", "Accion", "Disparos", "Aventura", "Peleas", "Carreras", "Estrategia" }));

        btnCambiar.setText("Cambiar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        btnRegresar2.setText("Regresar");
        btnRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar2ActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtIDJuego3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDJuego3KeyReleased(evt);
            }
        });

        jLabel4.setText("IDJuego:");

        javax.swing.GroupLayout panelCambiarBorrarLayout = new javax.swing.GroupLayout(panelCambiarBorrar);
        panelCambiarBorrar.setLayout(panelCambiarBorrarLayout);
        panelCambiarBorrarLayout.setHorizontalGroup(
            panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambiarBorrarLayout.createSequentialGroup()
                .addGroup(panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCambiarBorrarLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCambiarBorrarLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblTitulo5))
                            .addComponent(lblPrecio5)
                            .addGroup(panelCambiarBorrarLayout.createSequentialGroup()
                                .addComponent(lblEstudio5)
                                .addGap(20, 20, 20)
                                .addGroup(panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cobEstudio2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambiarBorrarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar2)
                        .addGap(14, 14, 14)))
                .addGroup(panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCambiarBorrarLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPlataforma5)
                            .addComponent(lblGenero5)
                            .addComponent(lblCantidad5))
                        .addGap(18, 18, 18)
                        .addGroup(panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cobGenero2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cobPlataforma2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCambiarBorrarLayout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCambiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDJuego3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        panelCambiarBorrarLayout.setVerticalGroup(
            panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambiarBorrarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo5)
                    .addComponent(lblGenero5)
                    .addComponent(cobGenero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstudio5)
                        .addComponent(cobEstudio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPlataforma5)
                        .addComponent(cobPlataforma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCantidad5)
                        .addComponent(spnCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPrecio5)))
                .addGap(38, 38, 38)
                .addGroup(panelCambiarBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiar)
                    .addComponent(btnRegresar2)
                    .addComponent(btnEliminar)
                    .addComponent(txtIDJuego3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        TablaJuegosDisponibles3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IDJuego", "Titulo", "Genero", "Estudio", "Plataforma", "Cantidad", "Precio"
            }
        ));
        TablaJuegosDisponibles3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaJuegosDisponibles3MouseClicked(evt);
            }
        });
        TablaJuegosDisponibles3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TablaJuegosDisponibles3KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaJuegosDisponibles3);

        jPanel5.setBackground(new java.awt.Color(79, 242, 222));
        jPanel5.setForeground(new java.awt.Color(79, 242, 222));

        lblVender2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblVender2.setForeground(new java.awt.Color(255, 255, 255));
        lblVender2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVender2.setText("Cambios/Bajas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblVender2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVender2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(panelCambiarBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCambiarBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaJuegosDisponibles3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaJuegosDisponibles3KeyPressed
        txtTitulo2.setText("");
        txtIDJuego3.setText("");

        int col = TablaJuegosDisponibles3.getSelectedRow();
        txtIDJuego3.setText(TablaJuegosDisponibles3.getValueAt(col, 0).toString());
        txtTitulo2.setText(TablaJuegosDisponibles3.getValueAt(col, 1).toString());
    }//GEN-LAST:event_TablaJuegosDisponibles3KeyPressed

    private void TablaJuegosDisponibles3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaJuegosDisponibles3MouseClicked
        txtTitulo2.setText("");
        txtIDJuego3.setText("");

        int col = TablaJuegosDisponibles3.getSelectedRow();
        txtIDJuego3.setText(TablaJuegosDisponibles3.getValueAt(col, 0).toString());
        txtTitulo2.setText(TablaJuegosDisponibles3.getValueAt(col, 1).toString());
    }//GEN-LAST:event_TablaJuegosDisponibles3MouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            if(txtIDJuego3.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No olvides ingresar el titulo del juego", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                Procedimientos.eliminarJuego(txtIDJuego3.getText());
                mostrarJuegosDisponibles(TablaJuegosDisponibles3, "SELECT * FROM Vista_Juegos_Disponibles;");
                txtIDJuego3.setText("");

                JOptionPane.showMessageDialog(this, "Tu juego ya no esta a la venta");
            }
        }catch(SQLException e){

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresar2ActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        try{
            if(txtTitulo2.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No olvides ingresar el titulo del juego", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
            }else if(cobEstudio2.getSelectedItem().equals("Seleccina un estudio...")){
                JOptionPane.showMessageDialog(this, "No olvides selecionar el estudio del juego", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
            }else if(cobGenero2.getSelectedItem().equals("Selecciona un genero...")){
                JOptionPane.showMessageDialog(this, "No olvides selecionar el Genero del juego", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
            }else if(cobPlataforma2.getSelectedItem().equals("Selecciona una plataforma...")){
                JOptionPane.showMessageDialog(this, "No olvides selecionar la plataforma del juego", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
            }else if(txtIDJuego3.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No olvides ingresar el id del juego", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                Procedimientos.modificarJuego(txtTitulo2.getText(), cobEstudio2.getSelectedItem().toString(), cobGenero2.getSelectedItem().toString(), cobPlataforma2.getSelectedItem().toString(),
                    Integer.parseInt(spnCantidad2.getValue().toString()), Double.parseDouble(spnPrecio2.getValue().toString()), txtIDJuego3.getText());
                mostrarJuegosDisponibles(TablaJuegosDisponibles3, "SELECT * FROM Vista_Juegos_Disponibles;");
                txtTitulo2.setText("");
                cobEstudio2.setSelectedIndex(0);
                cobGenero2.setSelectedIndex(0);
                cobPlataforma2.setSelectedIndex(0);
                spnCantidad2.setValue(1);
                spnPrecio2.setValue(10);
                txtIDJuego3.setText("");

                JOptionPane.showMessageDialog(this, "Modificacion completada!!!");
            }
        }catch(SQLException e){

        }
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void cobEstudio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobEstudio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cobEstudio2ActionPerformed

    private void txtTitulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitulo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitulo2ActionPerformed

    private void txtIDJuego3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDJuego3KeyReleased
        mostrarJuegosDisponibles(TablaJuegosDisponibles3, "SELECT * FROM Vista_Juegos_Disponibles where idJuego like "+ "'" + txtIDJuego3.getText()+ "%';");
    }//GEN-LAST:event_txtIDJuego3KeyReleased

    private void txtTitulo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTitulo2KeyReleased
        mostrarJuegosDisponibles(TablaJuegosDisponibles3, "SELECT * FROM Vista_Juegos_Disponibles where idJuego like "+ "'" + txtTitulo2.getText()+ "%';");
    }//GEN-LAST:event_txtTitulo2KeyReleased

    static ResultSet res; 
    
    public void mostrarJuegosDisponibles(JTable tabla,String com){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        res=Conexiones.Conexion.Consulta(com);
        try {
            
            while(res.next()){
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getInt(6));
                v.add(res.getDouble(7));
                modelo.addRow(v);
                tabla.setModel(modelo);
            }
                
        } catch (Exception e) {
        }    
    }
    
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
            java.util.logging.Logger.getLogger(CambiarEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarEliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaJuegosDisponibles3;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar2;
    private javax.swing.JComboBox<String> cobEstudio2;
    private javax.swing.JComboBox<String> cobGenero2;
    private javax.swing.JComboBox<String> cobPlataforma2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad5;
    private javax.swing.JLabel lblEstudio5;
    private javax.swing.JLabel lblGenero5;
    private javax.swing.JLabel lblPlataforma5;
    private javax.swing.JLabel lblPrecio5;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lblVender2;
    private javax.swing.JPanel panelCambiarBorrar;
    private javax.swing.JSpinner spnCantidad2;
    private javax.swing.JSpinner spnPrecio2;
    private javax.swing.JTextField txtIDJuego3;
    private javax.swing.JTextField txtTitulo2;
    // End of variables declaration//GEN-END:variables
}
