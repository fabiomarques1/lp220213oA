package conta1;

public class Conta {
    int codigoBanco;
    String nomeBanco;
    int numeroAgencia;
    int numeroConta;
    long cpf;
    String titular;
    double saldo;
    
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


    
    
    
            
            
}
