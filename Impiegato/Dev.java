package Impiegato;

public class Dev extends Dipendente
{
    private int devSalario = 2000;

    Dev(){}
    Dev(String nome){this.setNome(nome);}

    public void setDevSalario(int devSalario)
    {
        this.devSalario = devSalario;
    }

    public int getDevSalario()
    {
        return devSalario;
    }

    public String getid()
    {
        return "I'm a Dev!";
    }
}
