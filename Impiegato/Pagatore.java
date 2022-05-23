package Impiegato;

import java.util.Scanner;

public class Pagatore
{


    public static void main(String[] args) throws bgExcept
    {
        System.out.println("Set your budget: \n");
        Scanner input = new Scanner(System.in);
        Azienda azienda = new Azienda(input.nextInt());
        int credito = azienda.getBg();


        ListaDipendenti lista = new ListaDipendenti();
        lista.addElement(new Dipendente("Gianni"));
        lista.addElement(new Dev("Diablo"));
        lista.addElement(new Dipendente("Baal"));
        lista.addElement(new Dev("Mephisto"));
        lista.addElement(new Dev("Baba"));
        lista.addElement(new Dipendente("Baba"));

        System.out.println("Buisness credit: " + credito + "\n\n");
        System.out.println("Let's pay employees: \n");

        for (Object x : lista.getLista())
        {
            System.out.println(x);
        }
        int i = 0;
        for (Object x : lista.getLista())
        {
            if (credito <= 1000)
            {
                throw new bgExcept();
            }
            else
            {
                if (x instanceof Dev)
                {
                    System.out.println("questo è un Dev e si chiama : " + ((Dev) x).getNome() + ": ed il suo salario è di " + ((Dev) x).getDevSalario());
                    credito -= ((Dev) x).getDevSalario();
                }
                else if (x instanceof Dipendente)
                {
                    ((Dipendente) x).getid();
                    System.out.println("Questo è un Dipendente Generico, si chiama: " + ((Dipendente) x).getNome() + " ed il suo salario è di: " + ((Dipendente) x).getSalario());
                    credito -= ((Dipendente) x).getSalario();
                }
            }
            System.out.println("credito rimasto: " + credito);
            System.out.println(i);
            i++;
            try
            {
                System.out.println("Next employee to pay: " + lista.getElement(i));
            } catch (IndexOutOfBoundsException e)
            {
                System.out.print("No more employees in the list:");
                System.out.print(e.getMessage());
            }
        }
    }
}