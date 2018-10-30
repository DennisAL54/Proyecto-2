package Game;

/**
 * Representa un árbol AVL.
 *
 * @author Rubén Salas
 * @since 29/10/18
 * @version 1.0
 */
public class AVLTree {
    private Dragon root;

    /**
     * Constructor de AVLTree.
     */
    public AVLTree(){
        this.root = null;
    }

    //Getters & Setters
    public Dragon getRoot() {
        return root;
    }

    public void setRoot(Dragon root) {
        this.root = root;
    }


    public int height(Dragon dragon){
        if (dragon == root) {
            return 0;
        }
        return dragon.getHeight();
    }
}
