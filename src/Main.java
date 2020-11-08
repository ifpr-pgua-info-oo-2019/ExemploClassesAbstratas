public class Main {


    public static void main(String[] args) {

        FuncionarioHorista horista = new FuncionarioHorista("Func 1","12345",500.0,2.5);
        horista.setHorasTrabalhadas(120);
        System.out.println(horista.calculaSalario());

        FuncionarioComissionado comissionado = new FuncionarioComissionado("Func 2","8761263",0.0,0.15);
        comissionado.setTotalVendas(25000);
        System.out.println(comissionado.calculaSalario());

        Gerente gerente = new Gerente("Gerente ","41876",1000.0,500);
        System.out.println(gerente.calculaSalario());



    }

}
