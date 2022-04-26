package conta1;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        //Declarar Variáveis
        String teclado;
        Double quantia;
        
        //Realizar Cadastro
        Conta minhaconta = realizarCadastro();
        
        //Realizar Depósito
        teclado = JOptionPane.showInputDialog("Informe o valor do depósito:");
        quantia = Double.parseDouble(teclado);
        minhaconta.depositar(quantia);
        
        System.out.println("Minha Conta: " + minhaconta);
}
    
public static Conta realizarCadastro() { 
    //Realizar Cadastro
    String teclado;
    Conta conta = new Conta();
    teclado = JOptionPane.showInputDialog("Informe o código do banco:");
    conta.setCodigoBanco(Integer.parseInt(teclado));
    teclado = JOptionPane.showInputDialog("Informe o nome do banco:");
    conta.setNomeBanco(teclado);
    teclado = JOptionPane.showInputDialog("Informe o número da agência:");
    conta.setNumeroAgencia(Integer.parseInt(teclado));
    teclado = JOptionPane.showInputDialog("Informe o número da conta:");
    conta.setNumeroConta(Integer.parseInt(teclado));
    teclado = JOptionPane.showInputDialog("Informe o cpf do titular:");
    conta.setCpf(Long.parseLong(teclado));
    teclado = JOptionPane.showInputDialog("Informe o nome do titular:");
    conta.setTitular(teclado);

    return conta;
}
    
}
