/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author colegio luis ponce
 */
public class ViewMessage extends javax.swing.JFrame {

    /**
     * Creates new form ViewMessage
     */
    public ViewMessage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlMessage = new javax.swing.JLabel();
        jbtnHello = new javax.swing.JButton();
        jbtnBye = new javax.swing.JButton();
        jlwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMessage.setForeground(new java.awt.Color(255, 255, 255));
        jlMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMessage.setText("It is work");
        jlMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 420, 20));

        jbtnHello.setBackground(new java.awt.Color(51, 0, 153));
        jbtnHello.setForeground(new java.awt.Color(255, 255, 255));
        jbtnHello.setText("Hello");
        getContentPane().add(jbtnHello, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jbtnBye.setBackground(new java.awt.Color(51, 0, 153));
        jbtnBye.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBye.setText("Bye");
        getContentPane().add(jbtnBye, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jlwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/purple.jpg"))); // NOI18N
        jlwallpaper.setText("jLabel1");
        getContentPane().add(jlwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 440, 348));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ViewMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMessage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtnBye;
    public javax.swing.JButton jbtnHello;
    public javax.swing.JLabel jlMessage;
    private javax.swing.JLabel jlwallpaper;
    // End of variables declaration//GEN-END:variables
}
