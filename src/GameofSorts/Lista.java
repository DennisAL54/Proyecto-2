package GameofSorts;

/**
 * Representacion de una Lista
 *
 * @author Rubén Salas
 * @version 1.1
 * @since 17/10/18
 *
 */
public class Lista {

    private Dragon head;
    private int size;

    /**
     * Constructor de Lista.
     */
    public Lista(){
        this.head = null;
        this.size = 0;
    }

    //Getters & Setters

    public Dragon getHead() {
        return head;
    }

    public void setHead(Dragon head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Dragon getPosition(int pos){
        if(pos <0 && pos >=size){
            return null;
        }
        Dragon temp = head;
        int i = 0;
        while(i < pos){
            temp = temp.getNext();
        }
        return temp;
    }
    public void setPosition(int pos, Dragon dragon){
        if(pos < 0 && pos >= size){
            System.out.println("No valido");
        }
        Dragon temp = head;
        int i = 0;
        while(i < pos-1){
            this.head = head.getNext();
        }
        dragon.setNext(temp.getNext().getNext();
        temp.setnext(dragon);
    }


    /**
     * Consulta si la lista está vacía.
     * @return true si el primer Enemy (head), no apunta a otro Enemy.
     */
    public boolean itsEmpty(){
        return this.head == null;
    }

    /**
     * Agrega un nuevo Dragon al final de la lista.
     * @param newDragon - nuevo Dragon por ingresar en lista
     */
    public void add(Dragon newDragon){
        if (this.itsEmpty()) { //Verifica que la lista esté vacia
            this.setHead(newDragon); //Agrega como head a newDragon
        }
        else { //Recorre la lista hasta llegar al ultimo Dragon
            Dragon temp = this.getHead(); //Crea un Dragon temporal para referencia
            while(temp.getNext() != null){ //Recorre la lista hasta llegar al ultimo Dragon
                temp = temp.getNext();
            }
            temp.setNext(newDragon); //Agrega a newDragon al final de la lista
        }
        this.setSize(this.getSize()+1);
    }


    /**
     * Elimina un Dragon
     * @param name - nombre del Dragon
     */
    /*public void destroyEnemy(String name) {

        if (this.getHead().getName() == name){

            //Interfaz
            //Pone la referencia de la imagen fuera de la ventana
            this.getHead().getImage().setLayoutX(-200);
            this.getHead().getImage().setLayoutY(-200);

            //Cambia de referencia en lista
            this.setHead(this.getHead().getNext());

        } else {
            Dragon temp = this.getHead();
            while(temp.getNext().getName() != name){
                temp = temp.getNext();
            }

            //Interfaz
            //Pone la referencia de la imagen fuera de la ventana
            temp.getNext().getImage().setLayoutX(-200);
            temp.getNext().getImage().setLayoutY(-200);

            //Cambia de referencia en lista
            temp.setNext( temp.getNext().getNext() );
        }
        this.setSize(this.getSize()-1);

    }


    /**
     * Imprime la Lista
     */
    public void print(){
        Dragon temp = this.getHead();
        while (temp != null){
            System.out.println("Nombre: " + temp.getName());
            System.out.println("Velocidad de recarga: "+ temp.getRechargeSpeed());
            System.out.println("Edad: " + temp.getAge());
            System.out.println("Resistencia: " + temp.getResistance());
            System.out.println("Clase: " + temp.getClassType());
            if (temp.getPadre() != null)
                System.out.println("Padre: " + temp.getPadre().getName());
            System.out.println("Coordinadas: (" + temp.getX() + "," + temp.getY() + ")");
            System.out.println("");

            temp = temp.getNext();
        }
    }


}

