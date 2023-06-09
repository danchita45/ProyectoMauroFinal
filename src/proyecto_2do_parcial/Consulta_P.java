/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2do_parcial;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static proyecto_2do_parcial.Consulta_S.mul;

/**
 *
 * @author Angeles
 */
public class Consulta_P extends javax.swing.JFrame
{

    public static ML mul = new ML();

    /**
     * Creates new form Farmacia
     */
    public Consulta_P(ML ml)
    {
        initComponents();
        mul = ml;
        NodoLista n = ml.getR();
        NodoLista nr;
        NodoLista nrs;
        NodoLista nrsp;

        SCombo.removeAllItems();

        SCombo.addItem("Seleccione Sucursal");
        while (n != null)
        {
            if (n.getAbajo() != null)
            {
                nr = n.getAbajo();
                while (nr != null)
                {
                    if (nr.getAbajo() != null)
                    {
                        nrs = nr.getAbajo();
                        while (nrs != null)
                        {
                            SCombo.addItem(nrs.getEtiqueta());
                            if (nrs.getAbajo() != null)
                            {
                                nrsp = nrs.getAbajo();
                            }
                            nrs = nrs.getSig();
                        }
                    }
                    nr = nr.getSig();
                }
            }
            n = n.getSig();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tProductos = new javax.swing.JTable();
        SCombo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel1.setText("Consulta de Productos");

        tProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tProductos);

        SCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SCombo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SComboActionPerformed(evt);
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
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(SCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SComboActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SComboActionPerformed
    {//GEN-HEADEREND:event_SComboActionPerformed
        NodoLista n = mul.getR();
        NodoLista nr;
        NodoLista nrs;
        NodoLista nrsp;

        ArrayList<Object> l = new ArrayList<>();

        while (n != null)
        {
            if (n.getAbajo() != null)
            {
                nr = n.getAbajo();
                while (nr != null)
                {
                    if (nr.getAbajo() != null)
                    {
                        nrs = nr.getAbajo();
                        while (nrs != null)
                        {
                            if (nrs.getEtiqueta() == SCombo.getSelectedItem())
                            {
                                if (nrs.getAbajo() != null)
                                {
                                    nrsp = nrs.getAbajo();
                                    while (nrsp != null)
                                    {
                                        l.add(nrsp);
                                        nrsp = nrsp.getSig();
                                    }
                                }
                            }
                            nrs = nrs.getSig();
                        }
                    }
                    nr = nr.getSig();
                }
            }
            n = n.getSig();
        }
        llenaTabla(l);
    }//GEN-LAST:event_SComboActionPerformed

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
            java.util.logging.Logger.getLogger(Consulta_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Consulta_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Consulta_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Consulta_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Consulta_P(mul).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SCombo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tProductos;
    // End of variables declaration//GEN-END:variables

    private void llenaTabla(ArrayList c)
    {

        DefaultTableModel dt = new DefaultTableModel(new String[]
        {
            "Clave", "Precio", "Existencia", "Nombre"
        }, c.size());
        tProductos.setModel(dt);
        TableModel modeldata = tProductos.getModel();

        for (int j = 0; j < c.size(); j++)
        {
            Object FarcFarmacia = c.get(j);
            NodoLista ff = (NodoLista) FarcFarmacia;

            Models.Productos f = (Models.Productos) ff.getObj();
            modeldata.setValueAt(f.getClave(), j, 0);
            modeldata.setValueAt(Double.toString(f.getPrecio()), j, 1);
            modeldata.setValueAt(Integer.toString(f.getExistencia()), j, 2);
            modeldata.setValueAt(f.getNombre(), j, 3);

        }
    }

    private ListaDoblementeLigada verNodo(NodoLista r)
    {
        ListaDoblementeLigada l = new ListaDoblementeLigada();
        while (r != null)
        {
            if (r.getSig() != null && (r.getSig() == r.getAnt()))
            {
                break;
            }
            l.inserta(r);
            r = r.getSig();
        }
        return l;
    }
}
