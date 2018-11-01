package GameofSorts;

public class QuickSort {
    public Nodo quickSort(Nodo head){
        if(head == null || head.siguiente == null){
            return head;
        }
        return quick(head, null);

    }
    private Nodo quick(Nodo inicio, Nodo fin){
        if(inicio == null || inicio == fin || inicio.siguiente == fin){
            return inicio;
        }
        Nodo[] resultado = partir(inicio, fin);
        Nodo resultIZ = quick(resultado[0], resultado[1]);
        Nodo resultDer = quick(resultado[1].siguiente, fin );
        return resultIZ;
    }
    private Nodo[] partir(Nodo inicio, Nodo fin){
        if(inicio == null || inicio == fin || inicio.siguiente == fin){
            return new Nodo[]{inicio, inicio};
        }
        Nodo pivote = new Nodo(0);
        pivote.siguiente = inicio;
        for(Nodo j = inicio; j != null && j.siguiente != null && j.siguiente != fin; j = j.siguiente){
            while(j.siguiente !=null && j.siguiente.Data <= inicio.Data){
                Nodo tmp = j.siguiente;
                j.siguiente = j.siguiente.siguiente;
                tmp.siguiente = pivote.siguiente;
                pivote.siguiente = tmp;

            }

        }
        return new Nodo[] {pivote.siguiente, inicio};


    }
}
