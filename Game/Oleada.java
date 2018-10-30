package Game;

/**
 * Representa a una Oleada
 *
 * @author Rubén Salas
 * @since 16/10/18
 * @version 1.0
 */
public class Oleada {

    private Dragon comandante;

    /**
     * Constructor Oleada.
     */
    public Oleada(){
        this.comandante = null;
    }

    public Dragon getComandante() {
        return comandante;
    }

    public void setComandante(Dragon comandante) {
        this.comandante = comandante;
    }


    public boolean isLista(){
        if (this.comandante.getHeight() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void SelectionSortEdad(){

    }

    public void InsertionSortVelocidad(){

    }

    public void QuickSortEdad(){

    }

    public void balancearEdades(){

    }

}
