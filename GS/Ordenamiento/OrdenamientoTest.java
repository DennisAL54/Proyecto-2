package Ordenamiento;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import Juego.*;

public class OrdenamientoTest {

    AVLTree avl;
    BinaryTree binary;
    BTree b;
    CreadorDeOleadas creador;
    Lista lista;

    @BeforeAll
    public void before(){
        System.out.println("Before");
    }

    @AfterAll
    public void after(){
        System.out.println("After");
    }
    
    @Test
    public void testCreadorDeOleadas(){
        System.out.println(newDragon()");
        Dragon result = newDragon();
        Dragon esperado = new Dragon();
        asserEquals(esperado,dragon);
    }    

}
