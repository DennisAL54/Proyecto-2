package Game;

/**
 * Representación de un Binary Tree.
 *
 * @author Rubén Salas
 * @since 30/10/18
 * @version 1.0
 */
public class BinaryTree {
    private Dragon root;

    public BinaryTree(){
        this.root = null;
    }

    //Getters & Setters
    public Dragon getRoot() {
        return root;
    }

    public void setRoot(Dragon root) {
        this.root = root;
    }


    public boolean isEmpty() {
        return this.root == null;
    }

    /**
     * Recorre el arbol y lo imprime en Preorden
     */
    public void preOrder() {
        this.preOrderAux(this.getRoot());
    }

    /**
     * Auxiliar de preOrder
     * @param node - root
     */
    private void preOrderAux(Dragon node) {
        if (node != null) {
            System.out.print(node.getName() + " ");
            preOrderAux(node.getLeft());
            preOrderAux(node.getRight());
        }
    }
}
