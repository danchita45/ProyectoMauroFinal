/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2do_parcial;

import Models.lsarchivo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static proyecto_2do_parcial.Producto.mul;

/**
 *
 * @author Angeles
 */
public class Baja_Producto extends javax.swing.JFrame
{

    public static ML muls = new ML();
    NodoLista AuxGen = new NodoLista();
    public static int bnd = 0;

    /**
     * Creates new form Farmacia
     */
    public Baja_Producto()
    {
        initComponents();

        lsarchivo a = new lsarchivo();

        ML mul = a.SacaDatos();
        muls = mul;
        FCombo.removeAllItems();
        CCombo.removeAllItems();
        SCombo.removeAllItems();

        CCombo.setVisible(false);
        SCombo.setVisible(false);
        ProductDelete.setEnabled(false);
        NodoLista aux;
        aux = mul.r;

        FCombo.addItem("Seleccione Farmacia");
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
        ProductDelete = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        CCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        SCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel1.setText("Baja de Productos");

        ProductDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ProductDeleteActionPerformed(evt);
            }
        });
        ProductDelete.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                ProductDeleteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                ProductDeleteKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel6.setText("Seleccione Farmacia");

        FCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FCombo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                FComboActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel8.setText("Seleccione Ciudad");

        CCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CCombo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CComboActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel7.setText("Ingrese Codigo de Producto:");

        SCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SCombo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SComboActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel9.setText("Seleccione Sucursal");

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(FCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ProductDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(194, 194, 194))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProductDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProductDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ProductDeleteActionPerformed
    {//GEN-HEADEREND:event_ProductDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductDeleteActionPerformed

    private void FComboActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_FComboActionPerformed
    {//GEN-HEADEREND:event_FComboActionPerformed
        CCombo.removeAllItems();

        if (FCombo.getSelectedItem() != "Seleccione Farmacia")
        {
            CCombo.setVisible(true);
            CCombo.addItem("Seleccione Ciudad");
            NodoLista aux;
            NodoLista auxc = null;
            int bnd = 0;

            aux = muls.getR();
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
                        auxc = aux;
                        aux = aux.getSig();

                    }
                }
            }
            if (auxc != null)
            {
                while (auxc.getAnt() != null)
                {

                    auxc = auxc.getAnt();
                }
            }

            if (CCombo.getSelectedItem() != null)
            {

                while (bnd != 1)
                {
                    if (auxc.getEtiqueta() == CCombo.getSelectedItem())
                    {
                        bnd = 1;
                        AuxGen = auxc;
                    } else
                    {
                        if (auxc.getSig() != null)
                        {
                            auxc = auxc.getSig();
                        } else
                        {
                            break;
                        }
                    }
                }
            }

        } else
        {
            CCombo.setVisible(false);
            CCombo.removeAllItems();
            SCombo.setVisible(false);
            SCombo.removeAllItems();
            ProductDelete.setEnabled(false);
        }

    }//GEN-LAST:event_FComboActionPerformed

    private void CComboActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CComboActionPerformed
    {//GEN-HEADEREND:event_CComboActionPerformed
        SCombo.removeAllItems();
        if (CCombo.getSelectedItem() != "Seleccione Ciudad")
        {
            SCombo.setVisible(true);
            SCombo.addItem("Seleccione Sucursal");
            NodoLista aux;
            NodoLista auxc = null;
            int bnd = 0;

            aux = muls.getR();
            String s = (String) CCombo.getSelectedItem();
            if (s != "Seleccione Farmacia" && s != null)
            {
                while (aux.getEtiqueta() != FCombo.getSelectedItem())
                {
                    if (aux == null)
                    {
                        break;
                    }
                    aux = aux.getSig();
                }
            }
            if (aux.getAbajo() != null)
            {
                aux = aux.getAbajo();
                while (aux.getEtiqueta() != CCombo.getSelectedItem())
                {
                    if (aux.getSig() == null)
                    {
                        break;
                    }
                    aux = aux.getSig();
                }
            }

            if (aux.getAbajo() != null)
            {
                aux = aux.getAbajo();
                while (aux != null)
                {
                    SCombo.addItem(aux.getEtiqueta());
                    AuxGen = aux;
                    aux = aux.getSig();

                }
            }
        } else
        {
            SCombo.setVisible(false);
            SCombo.removeAllItems();
            ProductDelete.setEnabled(false);
        }

    }//GEN-LAST:event_CComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed

        if (ProductDelete.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "ingrese producto a eliminar");

        } else
        {
            NodoLista productos = AuxGen;
            NodoLista producto = AuxGen;
            while (productos != null)
            {
                producto = productos;
                productos = productos.getAnt();
            }

            while (producto.getEtiqueta() != SCombo.getSelectedItem())
            {
                if (producto == null)
                {
                    break;
                }
                producto = producto.getSig();
            }
            producto = producto.getAbajo();

            NodoLista n[] = new NodoLista[2];
            String s[] = new String[4];
            s[0] = (String) FCombo.getSelectedItem();
            s[1] = (String) CCombo.getSelectedItem();
            s[2] = (String) SCombo.getSelectedItem();
            s[3] = ProductDelete.getText();
            int bandera = 0;

            String et = producto.getEtiqueta();
            String tex = ProductDelete.getText();

            while (producto != null)
            {
                if (et.equals(tex))
                {
                    muls.borrar(muls.r, s, 0, n);
                    bandera = 1;
                }

                producto = producto.getSig();
                if (producto == null)
                {
                    break;
                }
                et = producto.getEtiqueta();
            }
            if (bandera == 0)
            {
                JOptionPane.showMessageDialog(this, "Producto no encontrado");
                ProductDelete.setFocusable(true);
                ProductDelete.setText("");
            } else
            {
                JOptionPane.showMessageDialog(this, "Producto eliminado");
                lsarchivo nuevo = new lsarchivo();
                try
                {
                    nuevo.InsertarnuevaLista(muls);
                } catch (IOException ex)
                {
                    Logger.getLogger(Baja_Producto.class.getName()).log(Level.SEVERE, null, ex);
                }
                Menu nmenu = new Menu();
                nmenu.setVisible(true);
                this.dispose();
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void SComboActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SComboActionPerformed
    {//GEN-HEADEREND:event_SComboActionPerformed

        if (SCombo.getSelectedItem() != "Seleccione Sucursal")
        {
            ProductDelete.setEnabled(true);
        } else
        {
            ProductDelete.setEnabled(false);
        }
    }//GEN-LAST:event_SComboActionPerformed

    private void ProductDeleteKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_ProductDeleteKeyTyped
    {//GEN-HEADEREND:event_ProductDeleteKeyTyped
        ProductDelete.setEnabled(true);
    }//GEN-LAST:event_ProductDeleteKeyTyped

    private void ProductDeleteKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_ProductDeleteKeyPressed
    {//GEN-HEADEREND:event_ProductDeleteKeyPressed
        ProductDelete.setEnabled(true);
    }//GEN-LAST:event_ProductDeleteKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Baja_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Baja_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Baja_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Baja_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Baja_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CCombo;
    private javax.swing.JComboBox<String> FCombo;
    private javax.swing.JTextField ProductDelete;
    private javax.swing.JComboBox<String> SCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
