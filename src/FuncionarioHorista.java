public class FuncionarioHorista extends Funcionario{

    private double valorHora;
    private double horasTrabalhadas;

    public FuncionarioHorista(String nome, String cpf, double salarioBase, double valorHora){
        super(nome,cpf,salarioBase);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calculaSalario(){
        return this.salarioBase + (this.horasTrabalhadas * this.valorHora);
    }


}
