package GameofSorts;

/**
 * Representa un árbol AVL.
 *
 * @author Rubén Salas
 * @since 29/10/18
 * @version 1.2
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


    /**
     * Retorna la altura del dragon en el arbol.
     * @param dragon
     * @return altura
     */
    public int height(Dragon dragon){
        if (dragon == null) {
            return 0;
        }
        return dragon.getHeight();
    }

    /**
     * Retorna el mayor.
     * @param a
     * @param b
     * @return
     */
    public int max(int a, int b){
        return (a > b) ? a : b;
    }

    /**
     * Genera una rotacion hacia la derecha.
     * @param y - Dragon
     * @return Dragon
     */
    public Dragon rightRotate(Dragon y){
        Dragon x = y.getLeft();
        Dragon z = x.getRight();

        //Produce la rotacion
        x.setRight(y);
        y.setLeft(z);

        //Actualiza la altura
        y.setHeight(max(height(y.getLeft()), height(y.getRight())) + 1);
        x.setHeight(max(height(x.getLeft()), height(x.getRight())) + 1);

        //Retorna el nuevo root
        return x;

    }

    /**
     * Genera una rotacion a la izquierda.
     * @param x - Dragon
     * @return Dragon
     */
    public Dragon leftRotate(Dragon x) {
        Dragon y = x.getRight();
        Dragon z = y.getLeft();

        //Produce la rotacion
        y.setLeft(x);
        x.setRight(z);

        //Actualiza la altura
        x.setHeight(max(height(x.getLeft()), height(x.getRight())) + 1);
        y.setHeight(max(height(y.getLeft()), height(y.getRight())) + 1);

        //Retorna el nuevo root
        return y;
    }

    /**
     * Obtiene el factor de balanceo del Dragon
     * @param dragon - Dragon por verificar
     * @return factor de balanceo
     */
    public int getBalance(Dragon dragon) {
        if (dragon == null)
            return 0;

        return height(dragon.getLeft()) - height(dragon.getRight());
    }


    /**
     * Insertar un Dragon al arbol AVL.
     * @param dragon - root
     * @return dragon insertado
     */
    public Dragon insert(Dragon dragon){
        if (this.getRoot() == null){
            this.setRoot(dragon);
            return dragon;

        } else {
            return insertAux(this.getRoot(), dragon);
        }
    }

    /**
     * Auxiliar de insertar.
     * @param node
     * @param dragon
     * @return dragon insertado
     */
    public Dragon insertAux(Dragon node, Dragon dragon) {

        int key = dragon.getAge();

        /* 1. Perform the normal BST insertion */
        if (node == null) {
            //System.out.println("Added: " + dragon.getName());
            return (dragon);

        }
        if (key < node.getAge())
            node.setLeft(insertAux(node.getLeft(), dragon));
        else if (key > node.getAge())
            node.setRight(insertAux(node.getRight(), dragon));
        else // Duplicate keys not allowed
            return node;

        /* 2. Update height of this ancestor BNode */
        node.setHeight(1 + max(height(node.getLeft()), height(node.getRight())));

		/* 3. Get the balance factor of this ancestor
			BNode to check whether this BNode became
			unbalanced */
        int balance = getBalance(node);

        // If this BNode becomes unbalanced, then there
        // are 4 cases Left Left Case
        if (balance > 1 && key < node.getLeft().getAge()) {
            return rightRotate(node);
        }

        // Caso Right Right
        if (balance < -1 && key > node.getRight().getAge()) {
            return leftRotate(node);
        }

        // Caso Left Right
        if (balance > 1 && key > node.getLeft().getAge()) {
            node.setLeft(leftRotate(node.getLeft()));
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.getRight().getAge()) {
            node.setRight(rightRotate(node.getRight()));
            return leftRotate(node);
        }

        /* return the (unchanged) BNode pointer */
        return node;
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
            System.out.print(node.getAge() + " ");
            preOrderAux(node.getLeft());
            preOrderAux(node.getRight());
        }
    }

}
