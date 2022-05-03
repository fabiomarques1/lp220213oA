package cadastropessoas;

import javax.swing.JOptionPane;

public class Principal {

    
    public static void main(String[] args) {
        String teclado;
        int valor;
        boolean erro;
        
        Pessoa pessoa1 = new Pessoa();
        
        do {
            teclado = JOptionPane.showInputDialog("Informe o nome:");
            erro = pessoa1.setNome(teclado);

        } while (erro);
        
        do {
            teclado = JOptionPane.showInputDialog("Informe a idade:");
            valor = Integer.parseInt(teclado);
            erro = pessoa1.setIdade(valor);
        } while (erro);

        System.out.println(pessoa1);
    }
}
