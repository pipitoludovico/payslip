package Impiegato;

public class bgExcept extends Exception
{
    public bgExcept(){
        super("No budget left: ");
    }
    @Override
    public String toString()
    {
        return getMessage() + "not enough funds to pay!";
    }

}
