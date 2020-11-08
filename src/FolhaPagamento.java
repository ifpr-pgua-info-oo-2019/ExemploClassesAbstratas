public class FolhaPagamento {

    //conjunto de funcionários??

    public double totalFolha(Funcionario[] funcionarios){

        double totalFolha = 0.0;

        //calcular o salário de cada funcionario
        for(int i=0;i<funcionarios.length;i++){
            totalFolha += funcionarios[i].calculaSalario();
        }

        return totalFolha;
    }


}
