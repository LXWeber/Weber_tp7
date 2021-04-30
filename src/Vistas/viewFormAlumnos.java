package Vistas;

import com.sun.glass.events.KeyEvent;
import java.util.HashSet;
import javax.swing.JOptionPane;
import weber_tp7.Alumno;

public class viewFormAlumnos extends javax.swing.JInternalFrame {

    private HashSet <Alumno> alumnos;
    
    public viewFormAlumnos(HashSet <Alumno> alumnos) {
        initComponents();
        this.alumnos=alumnos;
    }

    public void habilitarAgregar(){
        if(!jtLegajo.getText().isEmpty() && !jtNombre.getText().isEmpty()
                && !jtApellido.getText().isEmpty()){
            jbAlta.setEnabled(true);
        } else {
            jbAlta.setEnabled(false);
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

        jlTitulo = new javax.swing.JLabel();
        jlLegajo = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jtLegajo = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jbAlta = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Formulario de Alumnos");

        jlTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Formulario de Alumnos");
        jlTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jlLegajo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlLegajo.setText("Legajo:");

        jlApellido.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlApellido.setText("Apellido:");

        jlNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlNombre.setText("Nombre:");

        jtLegajo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtLegajo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jtLegajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtLegajoKeyReleased(evt);
            }
        });

        jtApellido.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtApellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtApellidoKeyReleased(evt);
            }
        });

        jtNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });

        jbAlta.setBackground(new java.awt.Color(0, 255, 46));
        jbAlta.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outline_person_add_black_24dp.png"))); // NOI18N
        jbAlta.setText("Alta");
        jbAlta.setBorder(null);
        jbAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbAlta.setEnabled(false);
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });
        jbAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbAltaKeyPressed(evt);
            }
        });

        jbNuevo.setBackground(new java.awt.Color(0, 127, 255));
        jbNuevo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outline_add_circle_outline_black_24dp.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.setBorder(null);
        jbNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jbNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbNuevoKeyPressed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlApellido)
                            .addComponent(jlNombre)
                            .addComponent(jlLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre)
                            .addComponent(jtApellido)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jbAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlTitulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLegajo)
                    .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre))
                .addGap(35, 35, 35)
                .addComponent(jbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jtApellido, jtLegajo, jtNombre});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jtLegajo.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        
        jbAlta.setEnabled(false);
        
        jtLegajo.requestFocus();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
        
        try{
            int legajo = Integer.parseInt(jtLegajo.getText());
            String nombre = jtNombre.getText();
            String apellido = jtApellido.getText();
            
            Alumno alumno = new Alumno(legajo,nombre,apellido);
            boolean yaExiste=false;
            for(Alumno i: alumnos){
                if(i.equals(alumno)){
                    yaExiste=true;
                }
            }
            
            if(yaExiste){
                JOptionPane.showMessageDialog(this,"Alumno ya existente");
            } else {
                alumnos.add(alumno);
                JOptionPane.showMessageDialog(this,"Alta de alumno exitosa");
            }
            
        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "El Legajo debe ser un numero entero");
            jtLegajo.requestFocus();
        }
    }//GEN-LAST:event_jbAltaActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtLegajoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLegajoKeyReleased
        habilitarAgregar();
    }//GEN-LAST:event_jtLegajoKeyReleased

    private void jtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyReleased
        habilitarAgregar();
    }//GEN-LAST:event_jtApellidoKeyReleased

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
        habilitarAgregar();
    }//GEN-LAST:event_jtNombreKeyReleased

    private void jbAltaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbAltaKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jbAlta.doClick();
        }
    }//GEN-LAST:event_jbAltaKeyPressed

    private void jbNuevoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbNuevoKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jbNuevo.doClick();
        }
    }//GEN-LAST:event_jbNuevoKeyPressed

    private void jbSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbSalirKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jbSalir.doClick();
        }
    }//GEN-LAST:event_jbSalirKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAlta;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlLegajo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtLegajo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}