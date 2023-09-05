package ex_11;

public class Main {
    public static void main(String[] args) {
        // Instanciar contas
        Conta conta1 = new Conta(1,1000,"Hugo");
        Conta conta2 = new Conta(2,2000,"Manuel");
        Conta conta3 = new Conta(3,3000,"Joaquim");

        // Método depositar 1000 euros
        conta1.depositar(1000);
        System.out.println("Saldo da Conta 1 : "+conta1.mostrarSaldo());

        // Método levantar 120 euros
        conta1.levantar(120);
        System.out.println("Saldo da Conta 1 : "+conta2.mostrarSaldo());

        // Método Transferência entre uma conta
        conta1.transferencia(1000,conta2);

        // Mostrar Saldo das 3 contas
        System.out.println(conta1.mostrarSaldo());
        System.out.println(conta2.mostrarSaldo());
        System.out.println(conta3.mostrarSaldo());
    }
}
