package view;

import model.Semaforo;

public class MockDisplay implements Display {
    private Semaforo semaforo;

    @Override
    public void display(Semaforo semaforo) {
        this.semaforo = semaforo;
        System.out.println(semaforo.toString());
    }
}
