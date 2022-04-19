package conta1;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        //Declarar Variáveis
        String teclado;
        Double quantia;
        
        //Realizar Cadastro
        Conta minhaconta = new Conta();
        teclado = JOptionPane.showInputDialog("Informe o código do banco:");
        minhaconta.codigoBanco = Integer.parseInt(teclado);
        teclado = JOptionPane.showInputDialog("Informe o nome do banco:");
        minhaconta.nomeBanco = teclado;
        teclado = JOptionPane.showInputDialog("Informe o número da agência:");
        minhaconta.numeroAgencia = Integer.parseInt(teclado);
        teclado = JOptionPane.showInputDialog("Informe o número da conta:");
        minhaconta.numeroConta = Integer.parseInt(teclado);
        teclado = JOptionPane.showInputDialog("Informe o cpf do titular:");
        minhaconta.cpf = Long.parseLong(teclado);
        teclado = JOptionPane.showInputDialog("Informe o nome do titular:");
        minhaconta.titular = teclado;
        
        //Realizar Depósito
        teclado = JOptionPane.showInputDialog("Informe o valor do depósito:");
        quantia = Double.parseDouble(teclado);
        minhaconta.depositar(quantia);
        
        System.out.println("Minha Conta: " + minhaconta);
}
    
}
