/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2do_parcial;

import Models.Ciudades;
import Models.Sucursales;
import Models.lsarchivo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static proyecto_2do_parcial.Ciudad.mlgeneral;
import static proyecto_2do_parcial.Ciudad.r;
//import cjb.ci.Validaciones;

/**
 *
 * @author Angeles
 */
public class Sucursal extends javax.swing.JFrame
{

    public static ML mul = new ML();
    public static NodoLista rGen = null;

    /**
     * Creates new form Farmacia
     */
    public Sucursal(ML ml)
    {
        initComponents();
        mul = ml;
        rGen = mul.getR();

        FCombo.removeAllItems();
        CCombo.removeAllItems();

        NodoLista aux = mul.getR();

        r = mul.r;

        if (aux != null)
        {
            //aqui se llena el combobox con el primer nivel, osease, farmacias
            while (aux != null)
            {
                FCombo.addItem(aux.etiqueta);
                aux = aux.getSig();
            }
            FCombo.getSelectedItem();
        }
        if (FCombo.getSelectedItem() == null)
        {
            JOptionPane.showMessageDialog(this, "No hay farmacias, imposible agregar, agregue una farmacia");
            GuardarSuc.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Post = new javax.swing.JTextField();
        SucKey = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CCombo = new javax.swing.JComboBox<>();
        GuardarSuc = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel1.setText("Alta de Sucursales");

        Post.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        Post.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PostActionPerformed(evt);
            }
        });
        Post.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                PostKeyTyped(evt);
            }
        });

        SucKey.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        SucKey.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SucKeyActionPerformed(evt);
            }
        });
        SucKey.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                SucKeyKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel3.setText("Ingresa el Nombre");

        Nombre.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        Nombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NombreActionPerformed(evt);
            }
        });
        Nombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                NombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel2.setText("Ingresa la Clave");

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel4.setText("Ingresa el Código Postal");

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel5.setText("Seleccione Farmacia");

        FCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FCombo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                FComboActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel6.setText("Seleccione Ciudad");

        CCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CCombo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CComboActionPerformed(evt);
            }
        });

        GuardarSuc.setText("Guardar");
        GuardarSuc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                GuardarSucActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Casa.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Post, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(SucKey, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(FCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(194, 194, 194))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GuardarSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SucKey, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Post, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FCombo)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CCombo)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addComponent(GuardarSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SucKeyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SucKeyActionPerformed
    {//GEN-HEADEREND:event_SucKeyActionPerformed
        
    }//GEN-LAST:event_SucKeyActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NombreActionPerformed
    {//GEN-HEADEREND:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void PostActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PostActionPerformed
    {//GEN-HEADEREND:event_PostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PostActionPerformed

    private void GuardarSucActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_GuardarSucActionPerformed
    {//GEN-HEADEREND:event_GuardarSucActionPerformed
        // en vez de ser una nueva multilista, sacamos todos los datos de el archivo bianrio
        //así nos traeríamos toda la lista ya armada y de jalon

        if (SucKey.getText().length() > 0 && Nombre.getText().length() > 0 && Post.getText().length() > 0)
        {
            //asignamos valores
            Models.Sucursales suc = new Sucursales();
            suc.setClave(SucKey.getText());
            suc.setCodigoPostal(Post.getText());
            suc.setNombre(Nombre.getText());
            //hacemos nodo 
            NodoLista nls = new NodoLista(SucKey.getText(), suc);
            //armamos etqs
            String[] etqs = new String[3];
            etqs[0] = FCombo.getSelectedItem().toString();
            etqs[1] = CCombo.getSelectedItem().toString();
            etqs[2] = SucKey.getText();
            //insertamos multilista
            mul.r = mul.inserta(etqs, 0, nls, mul.getR());
            lsarchivo a = new lsarchivo();
            try
            {
                a.InsertarnuevaLista(mul);
                //falta agregar al archivo para guardarlo
            } catch (IOException ex)
            {
                Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else
        {
            JOptionPane.showMessageDialog(rootPane, "Error, favor de rellenar todos los campos");

        }
        Producto p = new Producto(mul);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GuardarSucActionPerformed

    private void FComboActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_FComboActionPerformed
    {//GEN-HEADEREND:event_FComboActionPerformed
        CCombo.removeAllItems();
        NodoLista aux;
        aux = mul.getR();
        if (FCombo.getSelectedItem() != null)
        {
            while (aux.getEtiqueta() != FCombo.getSelectedItem())
            {
                aux = aux.getSig();
            }
        }

        if (aux != null)
        {
            if (aux.getAbajo() != null)
            {
                aux = aux.getAbajo();
                while (aux != null)
                {
                    CCombo.addItem(aux.etiqueta);
                    aux = aux.getSig();
                }
            }
        }

        if (CCombo.getSelectedItem() == null)
        {
            JOptionPane.showMessageDialog(this, "No hay Ciudades, imposible agregar, agregue una Ciudad");
            GuardarSuc.setEnabled(false);
            this.dispose();
        }

    }//GEN-LAST:event_FComboActionPerformed

    private void CComboActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CComboActionPerformed
    {//GEN-HEADEREND:event_CComboActionPerformed

    }//GEN-LAST:event_CComboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SucKeyKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_SucKeyKeyTyped
    {//GEN-HEADEREND:event_SucKeyKeyTyped
        //Validaciones.validaAlfanumerico(evt, 20, SucKey.getText());
    }//GEN-LAST:event_SucKeyKeyTyped

    private void NombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_NombreKeyTyped
    {//GEN-HEADEREND:event_NombreKeyTyped
        //Validaciones.validaAlfanumerico(evt, 15, Nombre.getText());
    }//GEN-LAST:event_NombreKeyTyped

    private void PostKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_PostKeyTyped
    {//GEN-HEADEREND:event_PostKeyTyped
        //Validaciones.validaEntero(evt, 5, Post.getText());
    }//GEN-LAST:event_PostKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Sucursal(mul).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CCombo;
    private javax.swing.JComboBox<String> FCombo;
    private javax.swing.JButton GuardarSuc;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Post;
    private javax.swing.JTextField SucKey;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
