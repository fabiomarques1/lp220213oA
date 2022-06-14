package aplicacao;

import dao.ContatoDAO;
import java.util.Date;
import javax.swing.UIManager;
import modelo.Contato;

public class Principal {

    public static void main(String[] args) {
        
        UIManager.put("OptionPane.noButtonText" , "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        
        
        new frmPrincipal().setVisible(true);
        
    }
}
