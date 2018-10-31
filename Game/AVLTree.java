package Game;

import static Game.Main.creador;

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

    /**
     *
     * @param dragon
     * @return
     */
    public int height(Dragon dragon){
        if (dragon == null) {
            return 0;
        }
        return dragon.getHeight();
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public int max(int a, int b){
        return (a > b) ? a : b;
    }

    /**
     *
     * @param y
     * @return
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
     *
     * @param x
     * @return
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
     * @param dragon
     * @return
     */
    public int getBalance(Dragon dragon) {
        if (dragon == null)
            return 0;

        return height(dragon.getLeft()) - height(dragon.getRight());
    }

    public Dragon insert(Dragon dragon){
        if (this.getRoot() == null){
            this.setRoot(dragon);
            return dragon;
        } else {
            return insertAux(this.getRoot(), dragon);
        }
    }


    private Dragon insertAux(Dragon root, Dragon dragon) {

        int key = dragon.getAge();

        if (root == null)
            return (dragon);

        if (key < root.getAge())
            root.setLeft(insertAux(root.getLeft(),dragon));
        else if (key > root.getAge())
            root.setRight(insertAux(root.getRight(),dragon));
        else // Duplicate keys not allowed
            return root;

        /* 2. Update height of this ancestor BNode */
        root.setHeight(1 + max(height(root.getLeft()), height(root.getRight())));

		/* 3. Get the balance factor of this ancestor
			BNode to check whether this BNode became
			unbalanced */
        int balance = getBalance(root);

        // If this BNode becomes unbalanced, then there
        // are 4 cases Left Left Case
        if (balance > 1 && key < root.getLeft().getAge())
            return rightRotate(root);

        // Right Right Case
        if (balance < -1 && key > root.getRight().getAge())
            return leftRotate(root);

        // Left Right Case
        if (balance > 1 && key > root.getLeft().getAge()) {
            root.setLeft(leftRotate(root.getLeft()));
            return rightRotate(root);
        }

        // Right Left Case
        if (balance < -1 && key < root.getRight().getAge()) {
            root.setRight(rightRotate(root.getRight()));
            return leftRotate(root);
        }

        /* return the (unchanged) BNode pointer */
        return root;
    }


    public void preOrder() {
        preOrderAux(this.getRoot());
    }

    private void preOrderAux(Dragon node) {
        if (node != null) {
            System.out.print(node.getAge() + " ");
            preOrderAux(node.getLeft());
            preOrderAux(node.getRight());
        }
    }


}
