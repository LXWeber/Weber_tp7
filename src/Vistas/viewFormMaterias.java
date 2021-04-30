package Vistas;

import com.sun.glass.events.KeyEvent;
import java.util.HashSet;
import javax.swing.JOptionPane;
import weber_tp7.Materia;

public class viewFormMaterias extends javax.swing.JInternalFrame {

    private HashSet <Materia> materias;
    
    public viewFormMaterias(HashSet <Materia> materias) {
        initComponents();
        this.materias=materias;
        jtId.requestFocus();
    }

    public void habilitarAgregar(){
        if(!jtId.getText().isEmpty() && !jtAnio.getText().isEmpty()
                && !jtNombre.getText().isEmpty()){
            jbAgregar.setEnabled(true);
        } else {
            jbAgregar.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jlId = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlAnio = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setTitle("Formulario de Materias");

        jlTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Formulario de Materias");
        jlTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jlId.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlId.setText("ID de la materia:");

        jlNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlNombre.setText("Nombre de la materia:");

        jlAnio.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlAnio.setText("Año al que pertenece:");

        jtId.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtIdKeyReleased(evt);
            }
        });

        jtNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });

        jtAnio.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtAnio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtAnioKeyReleased(evt);
            }
        });

        jbAgregar.setBackground(new java.awt.Color(0, 255, 46));
        jbAgregar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outline_school_black_24dp.png"))); // NOI18N
        jbAgregar.setText("Agregar materia");
        jbAgregar.setBorder(null);
        jbAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbAgregar.setEnabled(false);
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jbAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbAgregarKeyPressed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombre)
                            .addComponent(jlAnio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAnio))
                .addGap(35, 35, 35)
                .addComponent(jbAgregar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jtAnio, jtId, jtNombre});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbAgregar, jlTitulo});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbNuevo, jbSalir});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jtId.setText("");
        jtNombre.setText("");
        jtAnio.setText("");
        
        jbAgregar.setEnabled(false);
        
        jtId.requestFocus();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        
        try{
            int id = Integer.parseInt(jtId.getText());
            String nombre = jtNombre.getText();
            int anio = Integer.parseInt(jtAnio.getText());
            
            Materia materia = new Materia(id,nombre,anio);
            boolean yaExiste=false;
            for(Materia i: materias){
                if(i.equals(materia)){
                    yaExiste=true;
                }
            }
            
            if(yaExiste){
                JOptionPane.showMessageDialog(this,"ERROR!\nMateria ya existente");
            } else {
                materias.add(materia);
                JOptionPane.showMessageDialog(this,"EXITO!\nMateria creada correctamente");
            }
            
        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "ERROR!\nID y Año deben ser numeros enteros");
            jtId.requestFocus();
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdKeyReleased
        habilitarAgregar();
    }//GEN-LAST:event_jtIdKeyReleased

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
        habilitarAgregar();
    }//GEN-LAST:event_jtNombreKeyReleased

    private void jtAnioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAnioKeyReleased
        habilitarAgregar();
    }//GEN-LAST:event_jtAnioKeyReleased

    private void jbAgregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbAgregarKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jbAgregar.doClick();
        }
    }//GEN-LAST:event_jbAgregarKeyPressed

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
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAnio;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
