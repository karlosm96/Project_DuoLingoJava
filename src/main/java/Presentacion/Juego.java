/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.util.Locale;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class Juego extends javax.swing.JFrame {
    /**
     * Creates new form Juego
     */
    public Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private double localWidth = screenSize.getWidth();
    private double localHeight = screenSize.getHeight();
    private final int intWindowWidth = (int) this.localWidth/2;
    private final int intWindowHeight = (int) (this.localHeight/2)+200;
    private final int localFramePositionX = (int) this.intWindowWidth - (this.intWindowWidth/2);
    private final int localFramePositionY = (int) (this.intWindowHeight - this.intWindowHeight/2)-200;
    
    public Juego() {
        initComponents();
        framePrincipalTyU();
        PanelPreguntasTyU();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jReiniciar = new javax.swing.JButton();
        jFinalizar = new javax.swing.JButton();
        jPanelPreguntas = new javax.swing.JPanel();
        jIniciar = new javax.swing.JButton();
        jTextoPalabra = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRespuesta = new javax.swing.JTextField();
        jTextoTraduccion = new javax.swing.JLabel();
        jMostrarPalabra1 = new javax.swing.JTextField();
        jVerificar = new javax.swing.JButton();
        jTextoIncorrectas = new javax.swing.JLabel();
        jCountCorrectas = new javax.swing.JLabel();
        jCountIncorrectas = new javax.swing.JLabel();
        jTextoCorrectas2 = new javax.swing.JLabel();
        jRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jReiniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jReiniciar.setText("Reiniciar");
        jReiniciar.setName("nameReiniciar"); // NOI18N
        jReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(jReiniciar);
        jReiniciar.setBounds(440, 480, 180, 70);

        jFinalizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jFinalizar.setText("Finalizar");
        jFinalizar.setName("nameFinalizar"); // NOI18N
        getContentPane().add(jFinalizar);
        jFinalizar.setBounds(639, 475, 180, 70);

        jPanelPreguntas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelPreguntas.setLayout(null);

        jIniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jIniciar.setText("Iniciar");
        jIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIniciarActionPerformed(evt);
            }
        });
        jPanelPreguntas.add(jIniciar);
        jIniciar.setBounds(290, 510, 133, 59);

        jTextoPalabra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextoPalabra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTextoPalabra.setText("Palabra");
        jPanelPreguntas.add(jTextoPalabra);
        jTextoPalabra.setBounds(14, 286, 132, 49);

        jLabel2.setText("aca va la imagen");
        jPanelPreguntas.add(jLabel2);
        jLabel2.setBounds(329, 15, 327, 442);

        jRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRespuestaActionPerformed(evt);
            }
        });
        jPanelPreguntas.add(jRespuesta);
        jRespuesta.setBounds(173, 342, 129, 49);

        jTextoTraduccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextoTraduccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTextoTraduccion.setText("Traducción");
        jPanelPreguntas.add(jTextoTraduccion);
        jTextoTraduccion.setBounds(173, 286, 129, 49);
        jPanelPreguntas.add(jMostrarPalabra1);
        jMostrarPalabra1.setBounds(14, 342, 132, 48);

        jVerificar.setText("Verificar");
        jPanelPreguntas.add(jVerificar);
        jVerificar.setBounds(94, 409, 129, 40);

        jTextoIncorrectas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextoIncorrectas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTextoIncorrectas.setText("Incorrectas");
        jPanelPreguntas.add(jTextoIncorrectas);
        jTextoIncorrectas.setBounds(14, 121, 111, 49);

        jCountCorrectas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCountCorrectas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPreguntas.add(jCountCorrectas);
        jCountCorrectas.setBounds(164, 46, 111, 49);

        jCountIncorrectas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCountIncorrectas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPreguntas.add(jCountIncorrectas);
        jCountIncorrectas.setBounds(164, 121, 111, 49);

        jTextoCorrectas2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextoCorrectas2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTextoCorrectas2.setText("Correctas");
        jPanelPreguntas.add(jTextoCorrectas2);
        jTextoCorrectas2.setBounds(14, 46, 111, 49);

        getContentPane().add(jPanelPreguntas);
        jPanelPreguntas.setBounds(110, 40, 670, 470);

        jRegresar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRegresar.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\regresarImage.png")); // NOI18N
        jRegresar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jRegresar.setBorderPainted(false);
        jRegresar.setContentAreaFilled(false);
        jRegresar.setName(""); // NOI18N
        jRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jRegresar);
        jRegresar.setBounds(780, 20, 100, 103);
        jRegresar.getAccessibleContext().setAccessibleName("1");
        jRegresar.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void framePrincipalTyU(){
        this.setSize(this.intWindowWidth, this.intWindowHeight);
        this.setLocation(this.localFramePositionX, this.localFramePositionY);
        
        buttonEspecificaciones(jRegresar, 100, 100, this.intWindowWidth-115, this.intWindowHeight-730);
        buttonEspecificaciones(jFinalizar, 150, 80, this.intWindowWidth-190, this.intWindowHeight-150);
        buttonEspecificaciones(jReiniciar, 150, 80, this.intWindowWidth-340, this.intWindowHeight-150);
    }
    
    public void buttonEspecificaciones(JButton newBTN, int btnWidth, int btnHeigt, int btnUbicationX, int btnUbicationY){
        newBTN.setSize(btnWidth, btnHeigt);
        newBTN.setLocation(btnUbicationX, btnUbicationY);
    }
    
    public void PanelPreguntasTyU(){
        this.jPanelPreguntas.setSize(this.intWindowWidth-260, this.intWindowHeight-240);
        this.jPanelPreguntas.setLocation(this.localFramePositionX/4, this.localFramePositionY/4);
        buttonEspecificaciones(jIniciar, 130, 40, (this.intWindowWidth/4)+65, (this.intWindowHeight/4)+20);
    }
    
    private void jIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIniciarActionPerformed
        // TODO add your handling code here:
        this.jIniciar.setEnabled(false);
        this.jIniciar.setVisible(false);
        this.jPanelPreguntas.setVisible(true);
    }//GEN-LAST:event_jIniciarActionPerformed

    private void jRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegresarActionPerformed
        // TODO add your handling code here:
        Principal ventanaP = new Principal();
        ventanaP.setVisible(true);
        dispose();
    }//GEN-LAST:event_jRegresarActionPerformed

    private void jReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReiniciarActionPerformed
        // TODO add your handling code here:
        this.jIniciar.setEnabled(true);
        this.jIniciar.setVisible(true);
    }//GEN-LAST:event_jReiniciarActionPerformed

    private void jRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRespuestaActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCountCorrectas;
    private javax.swing.JLabel jCountIncorrectas;
    private javax.swing.JButton jFinalizar;
    private javax.swing.JButton jIniciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jMostrarPalabra1;
    private javax.swing.JPanel jPanelPreguntas;
    private javax.swing.JButton jRegresar;
    private javax.swing.JButton jReiniciar;
    private javax.swing.JTextField jRespuesta;
    private javax.swing.JLabel jTextoCorrectas2;
    private javax.swing.JLabel jTextoIncorrectas;
    private javax.swing.JLabel jTextoPalabra;
    private javax.swing.JLabel jTextoTraduccion;
    private javax.swing.JButton jVerificar;
    // End of variables declaration//GEN-END:variables
}
