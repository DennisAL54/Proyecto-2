package Game;

/**
 * Creador de Oleadas
 *
 * @author Rubén Salas
 * @since 18/10/18
 * @version 1.0
 */
public class CreadorDeOleadas {

    //Lista donde se guardarán los Dragones (Oleada)
    private Lista oleada = new Lista();

    /**
     * Verifica cuantos dragones quedan por salir en el nivel para crear la oleada dependiendo de la cantidad restante.
     * @return - cantidad de dragones para la siguiente oleada
     */
    private int checkDragonesTotales(){
        //Total de dragones restantes
        int total = Main.dragones;

        //Cuando queden más de 8 dragones
         if (total > 8){
             //Se crearan oleadas de máximo 8 dragones
             return 8;
         }
         //Cuando hayan menos de 8 dragones
         else if ( total <=8 && total > 0) {
             //Se creará la ultima oleada con los dragones restantes antes de pasar de nivel.
             return total;
         } else {
             return 0;
         }

    }


    /**
     * Crea una Oleada de Dragones
     * @return - lista desordenada de dragones (Oleada)
     */
    public Lista newOleada(){
        //Recibe la cantidad de dragones que habrán en la oleada
        int cantidad = checkDragonesTotales();


        //*******************************//
        //Agregar posX y posY al crearlos//
        //*******************************//


        //Son aregados la cantidad de Dragones anteriormente dada a una lista enlazada.
        for (int i = 0; i <= cantidad; i++){
            //Cada dragon es creado co atributos aleatorios por sus respectivos métodos.
            Dragon dragon = new Dragon(generateName(), generateSpeed(), generateAge(), generateResistence(), generateClass());
            //Se agrega a la lista.
            oleada.add(dragon);
        }
        return oleada;
    }

    /**
     * Genera un nombre al Dragon aleatoriamente sin repetir en la misma Oleada.
     * @return - nombre
     */
    private String generateName(){

        //Flag para revisar si se repite
        boolean doubled = false;

        //Lista con nombres predefinidos para los Dragones
        String[] names = {"Andres", "Antonio", "Bruno", "Bryan", "Carlos", "David", "Dennis",
                 "Esteban", "Fabian", "Gabriel", "Jose", "Luis", "Mario", "Oscar", "Ruben", "Santiago"};

        //Indice creado aleatoriamente
        int indice = (int) Math.floor(Math.random()*(15-0+1)+0);

        //Nombre tomado de la lista con el indice previamete definido
        String name = names[indice];

        //Crea un temporal del Head de la lista (Oleada)
        Dragon temp = oleada.getHead();

        //Recorre la lista para verificar que no se repita el nombre obtenido
        while(temp != null){
            //Cuando ya se tiene un Dragon con ese nombre
            if (temp.getName().equals(name)){
                //El Flag cambia a true
                doubled = true;
            }
            //Pasa al siguiente Dragon
            temp = temp.getNext();
        }

        //Si está repetido
        if (doubled){
            //Se vuelve a llamar la función para que se accese un nuevo nombre
            return generateName();
        }
        //Si no está repetido
        else {
            //Devuelve el nombre accesado
            return name;
        }

    }


    /**
     * Genera la velocidad de recarga de fuego del Dragon.
     * @return - velocidad
     */
    private int generateSpeed(){

        //Se genera la velocidad aleatoriamente de 1 a 100
        return (int) Math.floor(Math.random()*(100-1+1)+1);

    }

    /**
     * Genera la edad del Dragon.
     * @return - edad
     */
    private int generateAge(){

        //Flag para revisar si se repite
        boolean doubled = false;

        //Se genera la edad aleatoriamente de 1 a 1000
        int age = (int) Math.floor(Math.random()*(1000-1+1)+1);

        //Crea un temporal del Head de la lista (Oleada)
        Dragon temp = oleada.getHead();

        //Recorre la lista para verificar que no se repita la edad obtenida
        while(temp != null){
            //Cuando ya se tiene un Dragon con esa edad
            if (temp.getAge() == age){
                //El Flag cambia a true
                doubled = true;
            }
            //Pasa al siguiente Dragon
            temp = temp.getNext();
        }

        //Si está repetido
        if (doubled){
            //Se vuelve a llamar la función para que se accese una nueva edad
            return generateAge();
        }
        //Si no está repetido
        else {
            //Devuelve la edad accesada
            return age;
        }

    }

    /**
     * Genera la resistencia del Dragon.
     * @return - resistencia
     */
    private int generateResistence(){

        //Se genera la resistencia aleatoriamente de 1 a 3
        return (int) Math.floor(Math.random()*(3-1+1)+1);

    }


    /**
     * Genera la clase a la que pertenecerá el Dragon.
     * @return - clase
     */
    private String generateClass(){


        //*******************************//
        //FALTA: Crear un solo comandante//
        //*******************************//


        //Lista con las clases predefinidas para los Dragones
        String[] clases = {"Comandante", "Capitan", "Infante"};

        //Indice creado aleatoriamente
        int indice = (int) Math.floor(Math.random()*(2-0+1)+0);

        //Devuelve la clase accesada
        return clases[indice];

    }

    /**
     * Genera la dependencia familiar, define los padres de cada Dragon
     */
    private void generateFamily(){
        //FALTA
    }

}
