package funcionario;

public class Funcionario {
    private String nome;
    private double salario;
    private double bonusOuDesconto;
    private double salarioLiquido;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getBonusOuDesconto() {
        if(this.salario < 1000){
            bonusOuDesconto =  this.salario*0.2;
        }else{
            bonusOuDesconto = this.salario*0.1 ;
        }
        return bonusOuDesconto;
    }


    public double getSalarioLiquido() {
        if (salario < 1000) {
            this.bonusOuDesconto =  salario * 0.2;
            this.salarioLiquido = this.bonusOuDesconto + this.salario;
        }else if(salario < 2000){
            this.bonusOuDesconto = this.salario * 0.1;
            this.salarioLiquido =  this.salario + this.bonusOuDesconto;
        }else{
            this.bonusOuDesconto = this.salario * 0.1;
            this.salarioLiquido =  this.salario - this.bonusOuDesconto;
        }
        return this.salarioLiquido;
    }
}
