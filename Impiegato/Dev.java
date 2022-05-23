package Impiegato;

public class Dev extends Dipendente
{
    private static int devSalario = 2000;

    Dev()
    {
    }

    Dev(String nome)
    {
        Dev.setNome(nome);
    }

    public static void setDevSalario(int devSalario)
    {
        Dev.devSalario = devSalario;
    }

    public static int getDevSalario()
    {
        return devSalario;
    }

    public void getid()
    {
        System.out.println("I'm a Dev!");
    }
}
