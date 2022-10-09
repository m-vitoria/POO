package Exercício6;

public class PessoaLegal extends Person{
    private String cnpj;

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String toString() {
        return ("{Legal}, CNPJ: " + this.cnpj);
    }
}
