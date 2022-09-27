package Exercício6;

public class PessoaIndividual extends Person{
    private String cpf;

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;

    }
    public String toString() {
        return ("{Individual}, CNPJ: " + this.cpf);
    }
}
