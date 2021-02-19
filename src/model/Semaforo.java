package model;

public class Semaforo {
    private Color color;

    public Semaforo(){
        this.color = Color.VERDE;
    }

    public Semaforo(Color color){
        this.color = color;
    }

    public void changeColor(){
        switch(color){
            case VERDE:
                color = color.AMARILLO;
                break;
            case AMARILLO:
                color = color.ROJO;
                break;
            case ROJO:
                color = color.VERDE;
                break;
        }
    }

    @Override
    public String toString() {
        return "Semaforo{" +
                "color=" + color +
                '}';
    }
}
