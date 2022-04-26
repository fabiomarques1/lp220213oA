package conta1;

public class Conta {
    private int codigoBanco;
    private String nomeBanco;
    private int numeroAgencia;
    private int numeroConta;
    private long cpf;
    private String titular;
    private double saldo;
    
    public boolean depositar(double deposito) {
        if (deposito > 0) {
            this.saldo = this.saldo + deposito;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean sacar(double saque) {
        if (this.saldo >= saque && saque > 0) {
            this.saldo = this.saldo - saque;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transferir (double transferencia, Conta destino) {
         if (this.saldo >= transferencia && transferencia > 0) {
            this.saldo = this.saldo - transferencia;
            destino.depositar(transferencia);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Conta{" + "codigoBanco=" + codigoBanco + ", nomeBanco=" + nomeBanco + ", numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta + ", cpf=" + cpf + ", titular=" + titular + ", saldo=" + saldo + '}';
    }

    public int getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    
    
    
            
            
}
