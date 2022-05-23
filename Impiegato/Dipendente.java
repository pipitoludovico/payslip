package Impiegato;

public class Dipendente
{
    private int salario = 1000;
    private String nome;

    Dipendente()
    {
    }

    Dipendente(String nome)
    {
        this.setNome(nome);
    }


    public int getSalario()
    {
        return salario;
    }

    public void setSalario(int salario)
    {
        this.salario = salario;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public String getid()
    {
        return "I'm a generic employee!";
    }
}
