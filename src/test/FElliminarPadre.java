/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.PadresJDBC;
import domain.Padres;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author User
 */
public class FElliminarPadre extends javax.swing.JFrame {

    private PadresJDBC lista_padres = new PadresJDBC();
    private Padres al1 = new Padres();

    private DefaultTableModel modelo;
    private TableRowSorter buscador;
    Object o[] = null;
    List<Padres> arr1 = lista_padres.select();
    public FElliminarPadre() {
        super("Actualizacion de Padres");

        initComponents();

        modelo = (DefaultTableModel) jTable2.getModel();

        for (int i = 0; i < arr1.size(); i++) {
            modelo.addRow(o);
            jTable2.setValueAt(arr1.get(i).getMarcaTemporal(), i, 0);
            jTable2.setValueAt(arr1.get(i).getDni(), i, 1);
            jTable2.setValueAt(arr1.get(i).getDniAlumno(), i, 2);
            jTable2.setValueAt(arr1.get(i).getRelacionAlumno(), i, 3);
            jTable2.setValueAt(arr1.get(i).getApellido(), i, 4);
            jTable2.setValueAt(arr1.get(i).getNombre(), i, 5);
            jTable2.setValueAt(arr1.get(i).getFechaN(), i, 6);
            jTable2.setValueAt(arr1.get(i).getNacionalidad(), i, 7);
            jTable2.setValueAt(arr1.get(i).getProfesion(), i, 8);
            jTable2.setValueAt(arr1.get(i).getCelular(), i, 9);
            jTable2.setValueAt(arr1.get(i).getEmail(), i, 10);
            jTable2.setValueAt(arr1.get(i).getDireccion(), i, 11);
            jTable2.setValueAt(arr1.get(i).getVive_Con_Alumo(), i, 12);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        textDni = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Reset2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese el DNI del Padre/Tutor que desea Dar de Baja");

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Eliminar Padres/Totures");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca Temporal", "DNI", "Dni Alumno", "Relacion Alumno", "Apellido", "Nombres", "Fecha Nacimiento", "Nacionalidad", "Profesion", "Celular", "Email", "Direccion", "Vive Alumno?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        Reset2.setText("Reset");
        Reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Inicio");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sistema");

        jMenu4.setText("Alumnos");

        jMenuItem1.setText("Visualizar Base De Datos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem8.setText("Agregar Alumnos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem2.setText("Editar Base de Datos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Dar de Baja");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenu2.add(jMenu4);

        jMenu5.setText("Padres y Tutores");

        jMenuItem5.setText("Visualizar Base de Datos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem9.setText("Agregar Padres/Tutores");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem6.setText("Editar Base de Datos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Dar de Baja");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMenuItem10.setText("Acerca de");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Manual de Usuario");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textDni, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reset2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDni, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jButton1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String ID = textDni.getText();
        int idP = Integer.parseInt(ID);

        for (int i = 0; i < arr1.size(); i++) {
            lista_padres.delete(idP);
        }
        modelo.removeRow(idP-1);

        for (int i = 0; i < arr1.size(); i++) {
            modelo.addRow(o);
            jTable2.setValueAt(arr1.get(i).getMarcaTemporal(), i, 0);
            jTable2.setValueAt(arr1.get(i).getDni(), i, 1);
            jTable2.setValueAt(arr1.get(i).getDniAlumno(), i, 2);
            jTable2.setValueAt(arr1.get(i).getRelacionAlumno(), i, 3);
            jTable2.setValueAt(arr1.get(i).getApellido(), i, 4);
            jTable2.setValueAt(arr1.get(i).getNombre(), i, 5);
            jTable2.setValueAt(arr1.get(i).getFechaN(), i, 6);
            jTable2.setValueAt(arr1.get(i).getNacionalidad(), i, 7);
            jTable2.setValueAt(arr1.get(i).getProfesion(), i, 8);
            jTable2.setValueAt(arr1.get(i).getCelular(), i, 9);
            jTable2.setValueAt(arr1.get(i).getEmail(), i, 10);
            jTable2.setValueAt(arr1.get(i).getDireccion(), i, 11);
            jTable2.setValueAt(arr1.get(i).getVive_Con_Alumo(), i, 12);
        }
        JOptionPane.showMessageDialog(null, "Se elimino correctamente");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset2ActionPerformed

        modelo.getDataVector().removeAllElements();
        modelo.fireTableDataChanged();
        for (int i = 0; i < arr1.size(); i++) {
            modelo.addRow(o);
            jTable2.setValueAt(arr1.get(i).getMarcaTemporal(), i, 0);
            jTable2.setValueAt(arr1.get(i).getDni(), i, 1);
            jTable2.setValueAt(arr1.get(i).getDniAlumno(), i, 2);
            jTable2.setValueAt(arr1.get(i).getRelacionAlumno(), i, 3);
            jTable2.setValueAt(arr1.get(i).getApellido(), i, 4);
            jTable2.setValueAt(arr1.get(i).getNombre(), i, 5);
            jTable2.setValueAt(arr1.get(i).getFechaN(), i, 6);
            jTable2.setValueAt(arr1.get(i).getNacionalidad(), i, 7);
            jTable2.setValueAt(arr1.get(i).getProfesion(), i, 8);
            jTable2.setValueAt(arr1.get(i).getCelular(), i, 9);
            jTable2.setValueAt(arr1.get(i).getEmail(), i, 10);
            jTable2.setValueAt(arr1.get(i).getDireccion(), i, 11);
            jTable2.setValueAt(arr1.get(i).getVive_Con_Alumo(), i, 12);

        }
    }//GEN-LAST:event_Reset2ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        this.setVisible(false);
        FPrincipal f=new FPrincipal();
        f.show();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        FvisualizacionBD f=new FvisualizacionBD();
        f.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        this.setVisible(false);
        FInsertarAlumno is = new FInsertarAlumno();
        is.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setVisible(false);
        FActualizarAlumnos f=new FActualizarAlumnos();
        f.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.setVisible(false);
        FEliminarAlumno f=new FEliminarAlumno();
        f.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.setVisible(false);
        FvisualizacionPadres f=new FvisualizacionPadres();
        f.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.setVisible(false);
        FInsertarPadre f=new FInsertarPadre();
        f.show();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.setVisible(false);
        FActualizarPadres f=new FActualizarPadres();
        f.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.setVisible(false);
        FElliminarPadre f=new FElliminarPadre();
        f.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        this.setVisible(false);
        FAcercaDe f=new FAcercaDe();
        f.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        this.setVisible(false);
        FManualUsuario f=new FManualUsuario();
        f.show();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField textDni;
    // End of variables declaration//GEN-END:variables
}
