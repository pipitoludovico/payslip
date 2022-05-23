package Impiegato;

public class Dipendente
{
    private static int salario = 1000;
    private static String nome;

    Dipendente()
    {
    }

    Dipendente(String nome)
    {
        Dipendente.setNome(nome);
    }
    
    public static void setSalario(int salario)
    {
        Dipendente.salario = salario;
    }

    public static int getSalario()
    {
        return salario;
    }

    public static void setNome(String nome)
    {
        Dipendente.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void getid()
    {
        System.out.println("I am an employee!");
    }
    public static class Tester extends Dipendente{
        Tester(String nome){
            Tester.setNome(nome);
        }
        public static int getTestSalario(){
            return Dipendente.getSalario() +500;
        }

    }
}
