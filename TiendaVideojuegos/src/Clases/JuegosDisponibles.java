/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Component;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JOptionPane;



/**
 *
 * @author mario
 */
public class JuegosDisponibles extends javax.swing.JFrame {


    ArrayList<String> carrito = new ArrayList<String>();
    
    IniciarSesion iniciarSesion = new IniciarSesion();
    Vender vender = new Vender();
    HacerPedido hacerPedido = new HacerPedido();
    CambiarEliminar cambiar = new CambiarEliminar();
    
    public JuegosDisponibles() {
        initComponents();
        mostrarJuegosDisponibles(TablaJuegosDisponibles, "SELECT * FROM Vista_Juegos_Disponibles;");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblJuegosDisponibles = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCambios = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnAgregarAlCarrito = new javax.swing.JButton();
        lblImprimirCompra = new javax.swing.JLabel();
        lblVender = new javax.swing.JLabel();
        lblHacerPedido = new javax.swing.JLabel();
        txtIDJuego = new javax.swing.JTextField();
        lblIDJuego = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaJuegosDisponibles = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSuperior = new javax.swing.JMenu();
        jMenuItemGrafica = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Vender.png"))); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(140, 140));
        jButton2.setMinimumSize(new java.awt.Dimension(140, 140));
        jButton2.setPreferredSize(new java.awt.Dimension(140, 140));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(79, 242, 222));
        jPanel3.setForeground(new java.awt.Color(79, 242, 222));

        lblJuegosDisponibles.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblJuegosDisponibles.setForeground(new java.awt.Color(255, 255, 255));
        lblJuegosDisponibles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJuegosDisponibles.setText("Juegos Disponibles");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJuegosDisponibles)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJuegosDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/RevisarCompras.png"))); // NOI18N
        btnCambios.setMaximumSize(new java.awt.Dimension(140, 140));
        btnCambios.setMinimumSize(new java.awt.Dimension(140, 140));
        btnCambios.setPreferredSize(new java.awt.Dimension(140, 140));
        btnCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiosActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/HacerCompra.png"))); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(140, 140));
        jButton3.setMinimumSize(new java.awt.Dimension(140, 140));
        jButton3.setPreferredSize(new java.awt.Dimension(140, 140));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Vender.png"))); // NOI18N
        jButton4.setMaximumSize(new java.awt.Dimension(140, 140));
        jButton4.setMinimumSize(new java.awt.Dimension(140, 140));
        jButton4.setPreferredSize(new java.awt.Dimension(140, 140));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lblBuscar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblBuscar.setText("Buscar Juego:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnAgregarAlCarrito.setText("Añadir al carrito");
        btnAgregarAlCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlCarritoActionPerformed(evt);
            }
        });

        lblImprimirCompra.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblImprimirCompra.setText("Cambiar/Borrar Juegos");

        lblVender.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblVender.setText("Vender");

        lblHacerPedido.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblHacerPedido.setText("Hacer pedido");

        txtIDJuego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDJuegoKeyReleased(evt);
            }
        });

        lblIDJuego.setText("ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregarAlCarrito)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImprimirCompra)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblIDJuego)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIDJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblVender)
                        .addGap(147, 147, 147)
                        .addComponent(lblHacerPedido)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarAlCarrito))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIDJuego)
                            .addComponent(lblBuscar)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImprimirCompra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVender, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHacerPedido, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        TablaJuegosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaJuegosDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaJuegosDisponiblesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaJuegosDisponibles);

        menuSuperior.setText("Menu");

        jMenuItemGrafica.setText("Guerra de consolas");
        jMenuItemGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGraficaActionPerformed(evt);
            }
        });
        menuSuperior.add(jMenuItemGrafica);

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuSuperior.add(menuItemSalir);

        jMenuBar1.add(menuSuperior);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
      iniciarSesion.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void btnAgregarAlCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlCarritoActionPerformed

        boolean repetido = false;
        
        for(int i = 0; i < carrito.size(); i++) {
            
            if(carrito.get(i).equals(txtIDJuego.getText())){
               repetido = true;
            }
        }
        if(repetido == false){
            carrito.add(txtIDJuego.getText());
        }else{
            JOptionPane.showMessageDialog(this, "Ya has agregado este juego al carrito", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAgregarAlCarritoActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        vender.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        hacerPedido.mostrarInformacion(carrito);
        hacerPedido.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        
        
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void TablaJuegosDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaJuegosDisponiblesMouseClicked
        txtBuscar.setText("");
        txtIDJuego.setText("");
        
        int col = TablaJuegosDisponibles.getSelectedRow();
        txtIDJuego.setText(TablaJuegosDisponibles.getValueAt(col, 0).toString());
        txtBuscar.setText(TablaJuegosDisponibles.getValueAt(col, 1).toString());
    }//GEN-LAST:event_TablaJuegosDisponiblesMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        mostrarJuegosDisponibles(TablaJuegosDisponibles, "SELECT * FROM Vista_Juegos_Disponibles where titulo like "+ "'" + txtBuscar.getText()+ "%';");
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtIDJuegoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDJuegoKeyReleased
        mostrarJuegosDisponibles(TablaJuegosDisponibles, "SELECT * FROM Vista_Juegos_Disponibles where idJuego like "+ "'" + txtIDJuego.getText()+ "%';");
    }//GEN-LAST:event_txtIDJuegoKeyReleased

    private void jMenuItemGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGraficaActionPerformed

        new Graficas().setVisible(true);
    }//GEN-LAST:event_jMenuItemGraficaActionPerformed

    private void btnCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiosActionPerformed
       
       cambiar.setVisible(true);
    
    }//GEN-LAST:event_btnCambiosActionPerformed
    
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
            java.util.logging.Logger.getLogger(JuegosDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegosDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegosDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegosDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegosDisponibles().setVisible(true);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaJuegosDisponibles;
    private javax.swing.JButton btnAgregarAlCarrito;
    private javax.swing.JButton btnCambios;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemGrafica;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblHacerPedido;
    private javax.swing.JLabel lblIDJuego;
    private javax.swing.JLabel lblImprimirCompra;
    private javax.swing.JLabel lblJuegosDisponibles;
    private javax.swing.JLabel lblVender;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenu menuSuperior;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtIDJuego;
    // End of variables declaration//GEN-END:variables
}
