package ahorcado.interfazGrafica;

import ahorcado.Ahorcado;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class IniciarJuego extends javax.swing.JFrame {
    
    public IniciarJuego() {
        initComponents();
        Ahorcado.iniciarJuego();
        mostrarLetras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        contenedorLetras = new javax.swing.JPanel();
        letraTextField = new javax.swing.JTextField();
        letraLabel = new javax.swing.JLabel();
        agregarBoton = new javax.swing.JButton();
        volverBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        contenedorLetras.setBackground(new java.awt.Color(255, 255, 255));
        contenedorLetras.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        letraTextField.setBackground(new java.awt.Color(255, 255, 255));
        letraTextField.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        letraTextField.setForeground(new java.awt.Color(0, 0, 0));
        letraTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraTextFieldActionPerformed(evt);
            }
        });

        letraLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        letraLabel.setForeground(new java.awt.Color(0, 0, 0));
        letraLabel.setText("Digite una letra: ");

        agregarBoton.setBackground(new java.awt.Color(204, 0, 51));
        agregarBoton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        agregarBoton.setForeground(new java.awt.Color(0, 0, 0));
        agregarBoton.setText("Agregar");
        agregarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarBoton.setFocusable(false);
        agregarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarBotonMouseClicked(evt);
            }
        });

        volverBoton.setBackground(new java.awt.Color(255, 255, 255));
        volverBoton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        volverBoton.setForeground(new java.awt.Color(0, 0, 0));
        volverBoton.setText("Volver");
        volverBoton.setBorder(null);
        volverBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverBoton.setFocusable(false);
        volverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(volverBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(letraLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(agregarBoton))
                    .addComponent(contenedorLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap(408, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(contenedorLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agregarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(letraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(letraLabel)
                                .addGap(28, 28, 28))))
                    .addComponent(volverBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void letraTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraTextFieldActionPerformed

    private void agregarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarBotonMouseClicked
        int posicionLetra = Ahorcado.agregarLetra(letraTextField.getText().toLowerCase());
        if(posicionLetra != 0){
            JLabel texto = (JLabel) contenedorLetras.getComponent(posicionLetra);
            texto.setText(letraTextField.getText().toLowerCase());
        }else{
            JOptionPane.showMessageDialog(null, "Letra equivocada :( \nSe ha cortado una parte del muñeco, sobran "+Ahorcado.partesDeMuneco.size()+" partes", "XD", JOptionPane.ERROR_MESSAGE);
        }
        letraTextField.setText("");
        
        if(!Ahorcado.perderJuego()){
            JOptionPane.showMessageDialog(null, "Has perdido el juego", "Game Over :(", JOptionPane.ERROR_MESSAGE);
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
            this.dispose();
        }
        
        if(Ahorcado.ganarJuego()){
            JOptionPane.showMessageDialog(null, "Has ganado el juego :D tienes un iq sobre el promedio");
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_agregarBotonMouseClicked

    private void volverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBotonActionPerformed
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverBotonActionPerformed

    public void mostrarLetras(){
        String palabra = Ahorcado.palabraAleatoria;
        JLabel PrimeraLetra =  new JLabel();
        PrimeraLetra.setText(String.valueOf(palabra.charAt(0)));
        PrimeraLetra.setSize(40,50);
        PrimeraLetra.setFont(new Font("Segoe UI", Font.PLAIN, 48));
        contenedorLetras.add(PrimeraLetra);
        
        for (int i = 1; i < palabra.length(); i++) {
            JLabel letra =  new JLabel();
            letra.setText("__");
            letra.setSize(40,50);
            letra.setFont(new Font("Segoe UI", Font.PLAIN, 48));
            contenedorLetras.add(letra);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBoton;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel contenedorLetras;
    private javax.swing.JLabel letraLabel;
    private javax.swing.JTextField letraTextField;
    private javax.swing.JButton volverBoton;
    // End of variables declaration//GEN-END:variables
}
