package Vistas;

import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.JOptionPane;
import weber_tp7.Alumno;
import weber_tp7.Materia;

public class viewFormInscripcion extends javax.swing.JInternalFrame {

    private HashSet <Alumno> alumnos;
    private HashSet <Materia> materias;
    
    public viewFormInscripcion(HashSet <Alumno> alumnos, HashSet <Materia> materias) {
        initComponents();
        this.alumnos=alumnos;
        this.materias=materias;
        llenarJcbalumnos();
        llenarJcbmaterias();
        jcbAlumnos.requestFocus();
    }

    private void llenarJcbalumnos(){
        for(Alumno alumno: alumnos){
            jcbAlumnos.addItem(alumno);
        }
    }
    
    private void llenarJcbmaterias(){
        for(Materia materia: materias){
            jcbMaterias.addItem(materia);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbInscribir = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        jlMateria = new javax.swing.JLabel();
        jlAlumno = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jcbMaterias = new javax.swing.JComboBox<>();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jlAlumno1 = new javax.swing.JLabel();
        jlAlumno2 = new javax.swing.JLabel();

        setTitle("Formulario de inscripción");
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N

        jbInscribir.setBackground(new java.awt.Color(0, 255, 46));
        jbInscribir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbInscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outline_history_edu_black_24dp.png"))); // NOI18N
        jbInscribir.setText("Inscribir");
        jbInscribir.setBorder(null);
        jbInscribir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });
        jbInscribir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbInscribirKeyPressed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Formulario de Inscripción");
        jlTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jlMateria.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlMateria.setText("Materia:");

        jlAlumno.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlAlumno.setText("Alumno:");

        jbSalir.setBackground(new java.awt.Color(255, 0, 0));
        jbSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outline_exit_to_app_black_24dp.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setBorder(null);
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jbSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbSalirKeyPressed(evt);
            }
        });

        jcbMaterias.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jcbMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriasActionPerformed(evt);
            }
        });

        jcbAlumnos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jlAlumno1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jlAlumno1.setForeground(new java.awt.Color(102, 102, 102));
        jlAlumno1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAlumno1.setText("(Apellido, Nombre, N° de legajo)");
        jlAlumno1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlAlumno2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jlAlumno2.setForeground(new java.awt.Color(102, 102, 102));
        jlAlumno2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAlumno2.setText("(Materia, Año, ID de materia)");
        jlAlumno2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbInscribir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(jlAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlAlumno2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlAlumno1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addGap(23, 23, 23)
                .addComponent(jlAlumno1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlumno)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlAlumno2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMateria)
                    .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        try{
            Alumno aInscribir = (Alumno) jcbAlumnos.getSelectedItem();
            Materia mInscribir = (Materia) jcbMaterias.getSelectedItem();
            aInscribir.agregarMateria(mInscribir);
            
        } catch (NullPointerException npe){
            JOptionPane.showMessageDialog(this,"ERROR!\nPrimero agregue Alumnos y Materias");
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbInscribirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbInscribirKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jbInscribir.doClick();
        }
    }//GEN-LAST:event_jbInscribirKeyPressed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbSalirKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jbSalir.doClick();
        }
    }//GEN-LAST:event_jbSalirKeyPressed

    private void jcbMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMateriasActionPerformed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAlumnosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JComboBox<Materia> jcbMaterias;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlAlumno1;
    private javax.swing.JLabel jlAlumno2;
    private javax.swing.JLabel jlMateria;
    private javax.swing.JLabel jlTitulo;
    // End of variables declaration//GEN-END:variables
}
