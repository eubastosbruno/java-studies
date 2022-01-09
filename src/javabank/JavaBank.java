package javabank;

public class JavaBank {
    public static void main(String[] args) {

        ContaBanco persona1 = new ContaBanco();
        persona1.abrirConta("CC");
        persona1.setNumConta(454583);
        persona1.setUserConta("Bruno");

        persona1.depositar(20);
        persona1.sacar(10);

        persona1.estadoAtual();

        ContaBanco persona2 = new ContaBanco();
        persona2.abrirConta("CP");
        persona2.setNumConta(942082);
        persona2.setUserConta("Suelen");

        persona2.depositar(30);
        persona2.sacar(20);

        persona2.estadoAtual();
    }
}
