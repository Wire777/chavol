/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zapateria.vista;

import java.awt.Dimension;
import javax.swing.JComponent;

/**
 *
 * @author isaac
 */
public class ZapateriaV1_0 extends javax.swing.JFrame {

    /**
     * Creates new form ZapateriaV1_0
     */
    public ZapateriaV1_0() {
        initComponents();
        this.setSize(563,300);
        this.setLocationRelativeTo(null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu18 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu20 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenu17 = new javax.swing.JMenu();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenu22 = new javax.swing.JMenu();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem17.setText("jMenuItem17");

        jMenu12.setText("jMenu12");

        jMenuItem24.setText("jMenuItem24");

        jMenu16.setText("jMenu16");

        jMenu18.setText("File");
        jMenuBar2.add(jMenu18);

        jMenu19.setText("Edit");
        jMenuBar2.add(jMenu19);

        jMenu20.setText("File");
        jMenuBar3.add(jMenu20);

        jMenu21.setText("Edit");
        jMenuBar3.add(jMenu21);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        panel.setBackground(new java.awt.Color(102, 153, 255));
        panel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Bienvenido");
        panel.add(jLabel1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 504;
        gridBagConstraints.ipady = 247;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 22, 46, 33);
        getContentPane().add(panel, gridBagConstraints);

        jMenu1.setText("Ventas");

        jMenuItem1.setText("Venta Stock");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Venta Credito");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Corte de Caja");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Cancelar Venta");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Compras");

        jMenuItem6.setText("Nuevo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Cancelar Compra");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Cobranza");

        jMenuItem8.setText("Creditos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Abonar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Inventario");

        jMenuItem10.setText("Bimestral");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem36.setText("Anual");
        jMenu6.add(jMenuItem36);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Informes");

        jMenu5.setText("Consultas");

        jMenuItem11.setText("Venta");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Compra");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem13.setText("Cliente");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setText("Proveedor");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Producto");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenu7.add(jMenu5);

        jMenu9.setText("Reportes");

        jMenuItem16.setText("Ventas");
        jMenu9.add(jMenuItem16);

        jMenuItem18.setText("Compras");
        jMenu9.add(jMenuItem18);

        jMenu7.add(jMenu9);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Clientes");

        jMenuItem19.setText("Registrar");
        jMenu8.add(jMenuItem19);

        jMenuItem20.setText("Baja");
        jMenu8.add(jMenuItem20);

        jMenuItem21.setText("Modificar");
        jMenu8.add(jMenuItem21);

        jMenuBar1.add(jMenu8);

        jMenu10.setText("Configuración");

        jMenu11.setText("Productos");

        jMenuItem22.setText("Registrar");
        jMenu11.add(jMenuItem22);

        jMenuItem23.setText("Modificar");
        jMenu11.add(jMenuItem23);

        jMenuItem25.setText("Descontinuar");
        jMenu11.add(jMenuItem25);

        jMenu10.add(jMenu11);

        jMenu13.setText("Modificar");

        jMenuItem26.setText("Registrar");
        jMenu13.add(jMenuItem26);

        jMenuItem27.setText("Baja");
        jMenu13.add(jMenuItem27);

        jMenu10.add(jMenu13);

        jMenu14.setText("Usuarios");

        jMenuItem28.setText("Registrar");
        jMenu14.add(jMenuItem28);

        jMenuItem29.setText("Modificar");
        jMenu14.add(jMenuItem29);

        jMenuItem30.setText("Borrar");
        jMenu14.add(jMenuItem30);

        jMenu10.add(jMenu14);

        jMenuBar1.add(jMenu10);

        jMenu15.setText("Herramientas");

        jMenuItem31.setText("Calculadora");
        jMenu15.add(jMenuItem31);

        jMenu17.setText("BD");

        jMenuItem32.setText("Respaldar");
        jMenu17.add(jMenuItem32);

        jMenuItem33.setText("Restaurar");
        jMenu17.add(jMenuItem33);

        jMenu15.add(jMenu17);

        jMenuBar1.add(jMenu15);

        jMenu22.setText("Acerca de...");

        jMenuItem34.setText("SVP Zapateria");
        jMenu22.add(jMenuItem34);

        jMenuItem35.setText("Contacto");
        jMenu22.add(jMenuItem35);

        jMenuBar1.add(jMenu22);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        venta_credito vc=new venta_credito();
        vc.setLocation(5,5);
       
        panel.removeAll();
        panel.add(vc);
        panel.revalidate();
        panel.repaint();
        this.pack();
         
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        Abonar_Credito ab=new Abonar_Credito();
        
         panel.removeAll();
        panel.add(ab);
        panel.revalidate();
        panel.repaint();
        this.pack();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Bimestral_Inventario bi=new Bimestral_Inventario();
        
        panel.removeAll();
        panel.add(bi);
        panel.revalidate();
        panel.repaint();
        this.pack();
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Venta_Stock vs=new Venta_Stock();
        
       /* vs.setLocation(5,5);
        this.add(vs);
        this.pack();
        this.revalidate();
        this.repaint();
        */
        panel.removeAll();
        panel.add(vs);
        panel.revalidate();
        panel.repaint();
        this.pack();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Corte_de_caja cdc=new Corte_de_caja();
        
        panel.removeAll();
        panel.add(cdc);
        panel.revalidate();
        panel.repaint();
        this.pack();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Cancelar_venta cv=new Cancelar_venta();
        
        panel.removeAll();
        panel.add(cv);
        panel.revalidate();
        panel.repaint();
        this.pack();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Nueva_compra nc=new Nueva_compra();
        
        panel.removeAll();
        panel.add(nc);
        panel.revalidate();
        panel.repaint();
        this.pack();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Cancelar_compra cc=new Cancelar_compra();
        
        panel.removeAll();
        panel.add(cc);
        panel.revalidate();
        panel.repaint();
        this.pack();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Creditos_mostrar cm=new Creditos_mostrar();
        
         panel.removeAll();
        panel.add(cm);
        panel.revalidate();
        panel.repaint();
        this.pack();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        Compra_Informes ci=new Compra_Informes();
        
        panel.removeAll();
        panel.add(ci);
        panel.revalidate();
        panel.repaint();
        this.pack();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        Cliente_Informes ci=new Cliente_Informes();
        
         panel.removeAll();
        panel.add(ci);
        panel.revalidate();
        panel.repaint();
        this.pack();
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Ventas_Informes vi=new Ventas_Informes();
        
         panel.removeAll();
        panel.add(vi);
        panel.revalidate();
        panel.repaint();
        this.pack();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        Informes_Proveedor ip=new Informes_Proveedor();
        
         panel.removeAll();
        panel.add(ip);
        panel.revalidate();
        panel.repaint();
        this.pack();
        
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        Informes_Producto ip=new Informes_Producto();
        
         panel.removeAll();
        panel.add(ip);
        panel.revalidate();
        panel.repaint();
        this.pack();
        
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
