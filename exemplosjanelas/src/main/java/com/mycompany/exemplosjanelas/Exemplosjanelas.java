package com.mycompany.exemplosjanelas;
/* @author lucca*/

public class Exemplosjanelas {
    public static void main(String[] args){
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }   
        }
        
            TelaPrincipal novaTela = new TelaPrincipal();
            novaTela.setVisible(true);
        
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
