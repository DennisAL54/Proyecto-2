package GameofSorts;


public class InsertionSort {
    private Nodo raiz;

    public InsertionSort(){

        raiz = null;


    }
    public void insertarN(int x){
        Nodo nuevo = new Nodo(x);

        Nodo recon1;
        Nodo recon2;
        if(raiz==null){
            nuevo = raiz;
            nuevo.siguiente = null;

        }
        else{
            recon1 = raiz;
            while(recon1 != null){
                recon2 = recon1.siguiente;
                if(nuevo.Data < recon1.Data){
                    nuevo.siguiente = raiz;
                    raiz = nuevo;
                    break;
                }
                else{
                    if(nuevo.Data > recon1.Data && recon2 == null){
                        recon1 = nuevo;
                        recon1.siguiente = null;
                        break;

                    }
                    else{
                        if(recon1.Data < nuevo.Data && recon2.Data>= nuevo.Data){
                            recon1.siguiente = nuevo;
                            nuevo.siguiente = recon2;
                            break;
                        }
                        else{
                            recon1 = recon1.siguiente;

                        }
                    }
                }
            }
        }

    }


}
