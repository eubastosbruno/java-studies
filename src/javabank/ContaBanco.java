package javabank;

public class ContaBanco {

    public int numConta;
    protected String tipoConta;
    private String userConta;
    private float saldoConta;
    private boolean statusConta;

    public void estadoAtual(){
        System.out.println("NÚMERO: "+ this.numConta);
        System.out.println("USUÁRIO: "+ this.userConta);
        System.out.println("SALDO: "+ this.saldoConta);
        System.out.println("STATUS "+ this.statusConta);
        System.out.println("-----------------------------------------------------");
    }

    public ContaBanco() {
        this.setSaldoConta(0);
        this.setStatusConta(false);
    }

    public void abrirConta(String tipoConta){
        this.setTipoConta(tipoConta);
        this.setStatusConta(true);
        if (tipoConta == "CC"){
            this.setSaldoConta(50);
            System.out.println("Conta Corrente aberta com sucesso, seu saldo é de: "+ getSaldoConta());
        }else if (tipoConta == "CP"){
            this.setSaldoConta(150);
            System.out.println("Conta Poupança aberta com sucesso, seu saldo é de: "+ getSaldoConta());
        }
    }

    public void fecharConta(){
        if (getSaldoConta() > 0){
            System.out.println("Conta não pode ser fechada, possue saldo: "+ getSaldoConta());
        }else if(getSaldoConta() < 0){
            System.out.println("Conta não pode ser fechada, salvado negativo!");
        }else{
            this.setStatusConta(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float depositar){
        if (this.getStatusConta() == true){
            this.setSaldoConta(this.getSaldoConta() + depositar);
            System.out.println("Parabéns "+ this.getUserConta() +" deposito realizado com sucesso!");
        }else {
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }

    public void sacar(float sacar){
        if (this.getStatusConta() == true && this.getSaldoConta() >= sacar){
            this.setSaldoConta(this.getSaldoConta() - sacar);
            System.out.println("Saque no valor: "+ sacar +", realizado com sucesso!");
        } else if (this.getStatusConta() == false){
            System.out.println("Impossivel sacar de uma conta fechada!");
        } else if (this.getSaldoConta() < sacar){
            System.out.println("Saldo Insuficiente: "+ this.getSaldoConta());
        }
    }

    public void pagarMensal(){
        int paymantMensal = 0;
        if (this.getTipoConta() == "CC"){
            paymantMensal = 12;
        }else if (this.getTipoConta() == "CP"){
            paymantMensal = 17;
        }
        if (this.getStatusConta()){
            this.setSaldoConta(this.getSaldoConta() - paymantMensal);
            System.out.println("Mensalidade paga com sucesso, SALDO ATUAL: "+ this.getSaldoConta());
        }else {
            System.out.println("Impossivel pagar mensalidade de uma conta fechada!");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getUserConta() {
        return userConta;
    }

    public void setUserConta(String userConta) {
        this.userConta = userConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
}
