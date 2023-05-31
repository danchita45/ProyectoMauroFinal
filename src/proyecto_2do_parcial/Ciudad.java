/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2do_parcial;

import Models.Ciudades;
import Models.Farmacias;
import javax.swing.JOptionPane;

/**
 *
 * @author Angeles
 */
public class Ciudad extends javax.swing.JFrame
{
public static ML mlgeneral = new ML();
public static NodoLista r = null;
    /**
     * Creates new form Farmacia
     */
    public Ciudad(ML mul)
    {
        initComponents();
        FarmaciaCombo.removeAllItems();
        r = mul.r;
        
        NodoLista aux;
        aux = mul.r;

        mlgeneral = mul;
        if(aux!=null){
              //aqui se llena el combobox con el primer nivel, osease, farmacias
        while (aux != null) {
            FarmaciaCombo.addItem(aux.etiqueta);
            aux = aux.getSig();
        }
        FarmaciaCombo.getSelectedItem();     
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Estadotxt = new javax.swing.JTextField();
        municipiotxt = new javax.swing.JTextField();
        ciudadtxt = new javax.swing.JTextField();
        GuardarCiudad = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        FarmaciaCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel1.setText("Alta de Ciudades");

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel2.setText("Ingresa el Estado");

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel3.setText("Ingresa el Municipio");

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel4.setText("Ingresa la Ciudad");

        Estadotxt.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        Estadotxt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EstadotxtActionPerformed(evt);
            }
        });

        municipiotxt.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        municipiotxt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                municipiotxtActionPerformed(evt);
            }
        });

        ciudadtxt.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        ciudadtxt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ciudadtxtActionPerformed(evt);
            }
        });

        GuardarCiudad.setText("Guardar");
        GuardarCiudad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                GuardarCiudadActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        jLabel5.setText("Seleccione Farmacia");

        FarmaciaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Estadotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(municipiotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FarmaciaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(GuardarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Estadotxt)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipiotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(FarmaciaCombo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(GuardarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

    private void EstadotxtActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EstadotxtActionPerformed
    {//GEN-HEADEREND:event_EstadotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadotxtActionPerformed

    private void municipiotxtActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_municipiotxtActionPerformed
    {//GEN-HEADEREND:event_municipiotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_municipiotxtActionPerformed

    private void ciudadtxtActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ciudadtxtActionPerformed
    {//GEN-HEADEREND:event_ciudadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadtxtActionPerformed

    private void GuardarCiudadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_GuardarCiudadActionPerformed
    {//GEN-HEADEREND:event_GuardarCiudadActionPerformed
        // en vez de ser una nueva multilista, sacamos todos los datos de el archivo bianrio
        //así nos traeríamos toda la lista ya armada y de chingadazo
        

        
        if (municipiotxt.getText().length() > 0 && Estadotxt.getText().length() > 0 && ciudadtxt.getText().length() > 0) {
            Models.Ciudades NCiudad = new Ciudades();
            NCiudad.setCiudad(ciudadtxt.getText());
            NCiudad.setMunicipio(municipiotxt.getText());
            NCiudad.setEstado(Estadotxt.getText());
                
            
            NodoLista nls = new NodoLista(ciudadtxt.getText(), NCiudad);
            String[] etqs = new String[2];
            etqs[0] = FarmaciaCombo.getSelectedItem().toString();
            etqs[1] = ciudadtxt.getText();
            
            mlgeneral.inserta(etqs, 0, nls, r);
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error, favor de rellenar todos los campos");
            
        }
        
        Sucursal s = new Sucursal(mlgeneral);
        s.setVisible(true);
        
        


    }//GEN-LAST:event_GuardarCiudadActionPerformed

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
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Ciudad(mlgeneral).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Estadotxt;
    private javax.swing.JComboBox<String> FarmaciaCombo;
    private javax.swing.JButton GuardarCiudad;
    private javax.swing.JTextField ciudadtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField municipiotxt;
    // End of variables declaration//GEN-END:variables
}
