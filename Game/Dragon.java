package Game;

import javafx.scene.image.ImageView;

/**
 * Representa a un Dragon
 *
 * @author Rubén Salas
 * @since 16/10/18
 * @version 1.0
 */
public class Dragon {

    private String name;
    private int rechargeSpeed;
    private int age;
    private int resistance;
    private String classType;
    private ImageView image;
    int x;
    int y;

    Dragon next;
    Dragon prev;
    private Dragon padre;
    private Dragon hijoIzq;
    private Dragon hijoDer;

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

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public Dragon getPadre() {
        return padre;
    }

    public void setPadre(Dragon padre) {
        this.padre = padre;
    }

    public Dragon getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Dragon hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Dragon getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Dragon hijoDer) {
        this.hijoDer = hijoDer;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

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

    public void disparar(){

    }


    public void avanzar(){

    }


    public void verificarEsquivado(){

    }



}