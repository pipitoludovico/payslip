package Impiegato;

import java.util.ArrayList;
import java.util.Collections;

public class ListaDipendenti
{
    private final ArrayList<Object> lista = new ArrayList<>();

    ListaDipendenti()
    {

        Collections.addAll(lista, new Dipendente("Carlo"), new Dev("Rakanishu"));
    }

    public ArrayList<Object> getLista()
    {
        return lista;
    }
    public void addElement(Object x){
        Collections.addAll(lista, x);
    }
    public Object getElement(int x){
        return lista.get(x);
    }
}


