package GameofSorts;

public class SelectionSort {
    private int lenght;
    private Nodo head;
    private Nodo tail;
    public void añadir(int valor){
        Nodo nodo = new Nodo(valor);
        if(lenght == 0){
            nodo.siguiente = null;

        }
        else{
            nodo.siguiente = head;

        }
        head = nodo;
        lenght++;


    }
    public void Selection(){
        for(Nodo nodo1 = head; nodo1 != null; nodo1 = nodo1.siguiente) {
            Nodo min = nodo1;
            for(Nodo nodo2 = nodo1; nodo2 != null; nodo2 = nodo2.siguiente){
                if(min.Data > nodo2.Data){
                    min = nodo2;
                }

            }
            Nodo temp = new Nodo(nodo1.Data);
            nodo1.Data = min.Data;
            min.Data = temp.Data;

        }
    }

}
