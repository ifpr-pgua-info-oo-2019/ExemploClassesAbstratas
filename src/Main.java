public class Main {


    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[3];
        FolhaPagamento folha = new FolhaPagamento();


        FuncionarioHorista horista = new FuncionarioHorista("Func 1","12345",500.0,2.5);
        horista.setHorasTrabalhadas(120);

        FuncionarioComissionado comissionado = new FuncionarioComissionado("Func 2","8761263",0.0,0.15);
        comissionado.setTotalVendas(25000);

        Gerente gerente = new Gerente("Gerente ","41876",1000.0,500);

        funcionarios[0] = horista;
        funcionarios[1] = comissionado;
        funcionarios[2] = gerente;

        double totalFolha = folha.totalFolha(funcionarios);


    }

}
