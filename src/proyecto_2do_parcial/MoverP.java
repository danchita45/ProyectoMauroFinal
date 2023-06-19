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
import static proyecto_2do_parcial.Baja_Producto.muls;
import static proyecto_2do_parcial.Ciudad.r;
import static proyecto_2do_parcial.Producto.mul;

/**
 *
 * @author Angeles
 */
public class MoverP extends javax.swing.JFrame
{

    public static ML mulg = new ML();
    public static NodoLista rGen = null;

    /**
     * Creates new form Farmacia
     */
    public MoverP()
    {
        initComponents();

        muesFarm.addItem("Seleccione una farmacia...");
        muesCiud.addItem("Seleccione una ciudad...");
        SucOri.addItem("Seleccione la sucursal origen...");
        SucDest.addItem("Seleccione la sucursal destino...");

        lsarchivo a = new lsarchivo();

        ML mul = a.SacaDatos();
        mulg = mul;

        if (mul == null) {
            JOptionPane.showMessageDialog(this, "no hay datos para mover");
            Menu m = new Menu();
            m.setVisible(true);
            this.dispose();
        }
        muesCiud.setVisible(false);
        SucOri.setVisible(false);
        SucDest.setVisible(false);
        ProductDelete.setEnabled(false);
        NodoLista aux;
        aux = mul.r;
        if (aux != null) {
            //aqui se llena el combobox con el primer nivel, osease, farmacias
            while (aux != null) {
                muesFarm.addItem(aux.etiqueta);
                aux = aux.getSig();
            }
            muesFarm.getSelectedItem();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        muesFarm = new javax.swing.JComboBox<>();
        muesCiud = new javax.swing.JComboBox<>();
        SucOri = new javax.swing.JComboBox<>();
        SucDest = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ProductDelete = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel1.setText("Mover Productos");

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel2.setText("Selecciona la ciudad");

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel3.setText("Selecciona la farmacia");

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel4.setText("Selecciona la sucursal destino");

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel5.setText("Selecciona la sucursal origen");

        muesFarm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        muesFarm.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                muesFarmItemStateChanged(evt);
            }
        });
        muesFarm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                muesFarmActionPerformed(evt);
            }
        });

        muesCiud.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        muesCiud.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                muesCiudItemStateChanged(evt);
            }
        });
        muesCiud.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                muesCiudActionPerformed(evt);
            }
        });

        SucOri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SucOri.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                SucOriItemStateChanged(evt);
            }
        });
        SucOri.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SucOriActionPerformed(evt);
            }
        });

        SucDest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SucDest.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                SucDestItemStateChanged(evt);
            }
        });
        SucDest.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SucDestActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnGuardarActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel6.setText("Codigo Producto");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(SucOri, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(muesCiud, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(muesFarm, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(84, 84, 84))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SucDest, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProductDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muesFarm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muesCiud, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SucOri, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SucDest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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

    private void muesFarmItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_muesFarmItemStateChanged
    {//GEN-HEADEREND:event_muesFarmItemStateChanged

    }//GEN-LAST:event_muesFarmItemStateChanged

    private void muesFarmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_muesFarmActionPerformed
    {//GEN-HEADEREND:event_muesFarmActionPerformed
        muesCiud.removeAllItems();

        lsarchivo arc = new lsarchivo();

        if (muesFarm.getSelectedItem() != "Seleccione una farmacia...") {
            muesCiud.setVisible(true);
            muesCiud.addItem("Seleccione Ciudad");
            NodoLista aux;
            NodoLista auxc = null;
            int bnd = 0;

            aux = arc.SacaDatos().getR();
            String muestrac = (String) muesFarm.getSelectedItem();
            if (muesFarm.getSelectedItem() != null) {
                if (muestrac.compareTo(aux.getEtiqueta()) != 0) {

                    while (aux.getEtiqueta() != muestrac) {
                        aux = aux.getSig();
                    }
                }

            }
            if (aux != null) {
                if (aux.getAbajo() != null) {
                    aux = aux.getAbajo();
                    while (aux != null) {
                        muesCiud.addItem(aux.etiqueta);
                        auxc = aux;
                        aux = aux.getSig();

                    }
                }
            }
            if (auxc != null) {
                while (auxc.getAnt() != null) {

                    auxc = auxc.getAnt();
                }
            }

            if (muesCiud.getSelectedItem() != null) {

                while (bnd != 1) {
                    if (auxc.getEtiqueta() == muesCiud.getSelectedItem()) {
                        bnd = 1;
                        rGen = auxc;
                    } else {
                        if (auxc.getSig() != null) {
                            auxc = auxc.getSig();
                        } else {
                            break;
                        }
                    }
                }
            }

        } else {
            muesCiud.setVisible(false);
            muesCiud.removeAllItems();
            SucDest.setVisible(false);
            SucDest.removeAllItems();
            SucOri.setVisible(false);
            SucOri.removeAllItems();
            ProductDelete.setEnabled(false);
        }
    }//GEN-LAST:event_muesFarmActionPerformed

    private void muesCiudItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_muesCiudItemStateChanged
    {//GEN-HEADEREND:event_muesCiudItemStateChanged

    }//GEN-LAST:event_muesCiudItemStateChanged

    private void muesCiudActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_muesCiudActionPerformed
    {//GEN-HEADEREND:event_muesCiudActionPerformed

        lsarchivo arch = new lsarchivo();

        SucDest.removeAllItems();
        if (muesCiud.getSelectedItem() != "Seleccione una ciudad...") {
            SucDest.setVisible(true);
            SucDest.removeAllItems();
            SucOri.removeAllItems();
            SucOri.setVisible(true);

            NodoLista aux;
            NodoLista auxc = null;
            int bnd = 0;

            aux = arch.SacaDatos().getR();
            String s = (String) muesCiud.getSelectedItem();
            if (s != "Seleccione Farmacia" && s != null) {

                if (!muesCiud.getSelectedItem().equals(aux.getEtiqueta())) {
                    while (aux.getEtiqueta().compareTo((String) muesFarm.getSelectedItem()) != 0) {
                        if (aux == null) {
                            break;
                        }
                        aux = aux.getSig();
                    }
                }

            }
            if (aux.getAbajo() != null) {
                aux = aux.getAbajo();
                while (aux.getEtiqueta().equals((muesCiud.getSelectedItem()))) {
                    if (aux.getSig() == null) {
                        break;
                    }
                    aux = aux.getSig();
                }
            }

            if (aux.getAbajo() != null) {
                aux = aux.getAbajo();
                while (aux != null) {
                    SucDest.addItem(aux.getEtiqueta());
                    SucOri.addItem(aux.getEtiqueta());
                    rGen = aux;
                    aux = aux.getSig();

                }
            }
        } else {
            SucDest.setVisible(false);
            SucDest.removeAllItems();
            SucOri.setVisible(false);
            SucOri.removeAllItems();
            ProductDelete.setEnabled(false);
        }
    }//GEN-LAST:event_muesCiudActionPerformed

    private void SucOriItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_SucOriItemStateChanged
    {//GEN-HEADEREND:event_SucOriItemStateChanged

    }//GEN-LAST:event_SucOriItemStateChanged

    private void SucOriActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SucOriActionPerformed
    {//GEN-HEADEREND:event_SucOriActionPerformed
        ProductDelete.setEnabled(true);
    }//GEN-LAST:event_SucOriActionPerformed

    private void SucDestItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_SucDestItemStateChanged
    {//GEN-HEADEREND:event_SucDestItemStateChanged

    }//GEN-LAST:event_SucDestItemStateChanged

    private void SucDestActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SucDestActionPerformed
    {//GEN-HEADEREND:event_SucDestActionPerformed

    }//GEN-LAST:event_SucDestActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnGuardarActionPerformed
    {//GEN-HEADEREND:event_btnGuardarActionPerformed
        lsarchivo ls = new lsarchivo();

        ML mulgene = ls.SacaDatos();
        NodoLista nodomovido = new NodoLista();

        if (ProductDelete.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "ingrese producto a eliminar");

        } else {
            NodoLista productos = rGen;
            NodoLista producto = rGen;
            while (productos != null) {
                producto = productos;
                productos = productos.getAnt();
            }

            while (!producto.getEtiqueta().equals(SucOri.getSelectedItem())) {
                if (producto == null) {
                    break;
                }
                producto = producto.getSig();
            }
            producto = producto.getAbajo();

            NodoLista n[] = new NodoLista[2];
            String s[] = new String[4];
            s[0] = (String) muesFarm.getSelectedItem();
            s[1] = (String) muesCiud.getSelectedItem();
            s[2] = (String) SucOri.getSelectedItem();
            s[3] = ProductDelete.getText();
            int bandera = 0;

            String et = producto.getEtiqueta();
            String tex = ProductDelete.getText();

            while (producto != null) {
                if (et.equals(tex)) {
                    nodomovido = mulgene.borrarRetornado(mulgene.r, s, 0, n);
                    System.out.println(nodomovido.getEtiqueta());
                    bandera = 1;
                }

                producto = producto.getSig();
                if (producto == null) {
                    break;
                }
                et = producto.getEtiqueta();
            }
            if (bandera == 0) {
                JOptionPane.showMessageDialog(this, "Producto no encontrado");
                ProductDelete.setFocusable(true);
                ProductDelete.setText("");
            } else {
                
                NodoLista nls = nodomovido;
                String[] etqs = new String[4];
                etqs[0] = muesFarm.getSelectedItem().toString();
                etqs[1] = muesCiud.getSelectedItem().toString();
                etqs[2] = SucDest.getSelectedItem().toString();
                etqs[3] = ProductDelete.getText();
                //insertamos multilista
                mulgene.inserta(etqs, 0, nls, mulgene.getR());

                JOptionPane.showMessageDialog(this, "Producto Movido");
                lsarchivo nuevo = new lsarchivo();
                try {
                    nuevo.InsertarnuevaLista(mulgene);
                } catch (IOException ex) {
                    Logger.getLogger(Baja_Producto.class.getName()).log(Level.SEVERE, null, ex);
                }

                Menu nmenu = new Menu();
                nmenu.setVisible(true);
                this.dispose();
            }

        }

        NodoLista f = mul.busca(mul.getR(), muesFarm.getSelectedItem().toString());
        if (f != null) {
            NodoLista c = mul.busca(f.getAbajo(), muesCiud.getSelectedItem().toString());
            if (c != null) {
                NodoLista s1 = mul.busca(c.getAbajo(), SucOri.getSelectedItem().toString());
                NodoLista s2 = mul.busca(c.getAbajo(), SucDest.getSelectedItem().toString());
                if (s1.getAbajo() != null) {
                    while (s1.getAbajo() != null) {
                        NodoLista n[] = elimina(s1.getAbajo());
                        s1.setAbajo(n[1]);
                        NodoLista r = existe(s2.getAbajo(), ((Productos) n[0].getObj()).getNombre());
                        if (r != null) {
                            ((Productos) r.getObj()).setExistencia(((Productos) r.getObj()).getExistencia() + ((Productos) n[0].getObj()).getExistencia());
                        }
                    }
                    JOptionPane.showMessageDialog(this, "Se Movieron los Productos con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Esta sucursal no tiene productos para mover.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ProductDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ProductDeleteActionPerformed
    {//GEN-HEADEREND:event_ProductDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductDeleteActionPerformed

    private void ProductDeleteKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_ProductDeleteKeyPressed
    {//GEN-HEADEREND:event_ProductDeleteKeyPressed
        ProductDelete.setEnabled(true);
    }//GEN-LAST:event_ProductDeleteKeyPressed

    private void ProductDeleteKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_ProductDeleteKeyTyped
    {//GEN-HEADEREND:event_ProductDeleteKeyTyped
        ProductDelete.setEnabled(true);
    }//GEN-LAST:event_ProductDeleteKeyTyped

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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MoverP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoverP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoverP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoverP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MoverP().setVisible(true);
            }
        });
    }

    public NodoLista[] elimina(NodoLista r)
    {
        NodoLista n = r;
        r = n.getSig();
        r.setAnt(n.getAnt());
        r.getAnt().setSig(r);
        n.setSig(null);
        n.setAnt(null);
        n.setArriba(null);
        if (n == r) {
            r = null;
        }
        return new NodoLista[]{
            n, r
        };
    }

    public NodoLista existe(NodoLista n, String s)
    {
        if (n != null) {
            NodoLista aux = n;
            do {
                if (((Productos) aux.getObj()).getNombre().equals(s)) {
                    return aux;
                }
                aux = aux.getSig();
            } while (aux != n);
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ProductDelete;
    private javax.swing.JComboBox<String> SucDest;
    private javax.swing.JComboBox<String> SucOri;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> muesCiud;
    private javax.swing.JComboBox<String> muesFarm;
    // End of variables declaration//GEN-END:variables

    public void ponerCombox(ML m)
    {
        muesCiud.removeAllItems();
        NodoLista aux;
        NodoLista auxc = null;
        int bnd = 0;

        aux = m.getR();
        if (muesCiud.getSelectedItem() != null) {
            while (aux.getEtiqueta() != muesCiud.getSelectedItem()) {
                aux = aux.getSig();

            }
        }
        if (aux != null) {
            if (aux.getAbajo() != null) {
                aux = aux.getAbajo();
                while (aux != null) {
                    muesCiud.addItem(aux.etiqueta);
                    auxc = aux;
                    aux = aux.getSig();

                }
            }
        }
        if (auxc != null) {
            while (auxc.getAnt() != null) {

                auxc = auxc.getAnt();
            }
        }

        if (muesCiud.getSelectedItem() != null) {

            while (bnd != 1) {
                if (auxc.getEtiqueta() == muesCiud.getSelectedItem()) {
                    bnd = 1;
                    rGen = auxc;
                } else {
                    if (auxc.getSig() != null) {
                        auxc = auxc.getSig();
                    } else {
                        break;
                    }
                }
            }
        }

        SucOri.removeAllItems();
        SucDest.removeAllItems();
        if (rGen != null) {
            if (rGen.getAbajo() != null) {
                rGen = rGen.getAbajo();
                while (rGen != null) {
                    SucOri.addItem(rGen.etiqueta);
                    SucDest.addItem(rGen.etiqueta);
                    rGen = rGen.getSig();
                }
            }
        }

    }

}
