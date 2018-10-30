package Game;

import javafx.scene.image.ImageView;

/**
 * Representa a un Dragon
 *
 * @author Rubén Salas
 * @since 16/10/18
 * @version 1.1
 */
public class Dragon {

    private String name;
    private int rechargeSpeed;
    private int age;
    private int resistance;
    private String classType;
    private Dragon padre;
    private ImageView image;
    private double x;
    private double y;

    //Atributos en lista
    private Dragon next;
    private Dragon prev;

    //Atributos en árbol
    private int height;
    private Dragon left;
    private Dragon right;

    /**
     * Constructor de Dragon
     * @param name - Nombre
     * @param rS - Velocidad de recarga de fuego
     * @param age - Edad
     * @param resistance - Resistencia
     * @param classType - Clase de Dragon
     */
    public Dragon(String name, int rS, int age, int resistance, String classType){
        this.name = name;
        this.rechargeSpeed = rS;
        this.age = age;
        this.resistance = resistance;
        this.classType = classType;
    }

    //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRechargeSpeed() {
        return rechargeSpeed;
    }

    public void setRechargeSpeed(int rechargeSpeed) {
        this.rechargeSpeed = rechargeSpeed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Dragon getPadre() {
        return padre;
    }

    public void setPadre(Dragon padre) {
        this.padre = padre;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    //Getters & Setters al estar en lista

    public Dragon getNext() {
        return next;
    }

    public void setNext(Dragon next) {
        this.next = next;
    }

    public Dragon getPrev() {
        return prev;
    }

    public void setPrev(Dragon prev) {
        this.prev = prev;
    }


    //Getters & Setters al estar en árbol

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Dragon getHijoIzq() {
        return left;
    }

    public void setHijoIzq(Dragon left) {
        this.left = left;
    }

    public Dragon getHijoDer() {
        return right;
    }

    public void setHijoDer(Dragon right) {
        this.right = right;
    }




    public void generateCoords(int i){
        double x = 900;
        double y;

        if (i == 1) {
            y = 285.0;
            x = x + 80*0;
        } else if (i <= 3) { //2-3
            y = 245 + (80*(i-2));
            x = x + 80*1;
        } else if (i <= 6) { //4-5-6
            y = 205 + (80*(i-4));
            x = x + 80*2;
        } else if (i <= 10) { //7-8-9-10
            y = 165 + (80*(i-7));
            x = x + 80*3;
        } else if (i <= 15) { //11-12-13-14-15
            y = 125 + (80*(i-11));
            x = x + 80*4;
        } else if (i <= 21) { //16-17-18-19-20-21
            y = 85 + (80*(i-16));
            x = x + 80*5;
        } else if (i <= 28) { //22-23-24-25-26-27-28
            y = 45 + (80*(i-22));
            x = x + 80*6;
        } else { //29-30-31-32-33-34-35-36 - - - >
            i = ((i-29) + 8);
            y = 5 + (80 * (i%8));
            x = (x + (80*7)) + ((i-8)/8)*80;
        }

        this.setY(y);
        this.setX(x);



    }



}