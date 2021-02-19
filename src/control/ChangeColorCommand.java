package control;

import model.Semaforo;

public class ChangeColorCommand implements Command {
    private Semaforo semaforo;

    public ChangeColorCommand(Semaforo semaforo){
        this.semaforo = semaforo;
    }

    @Override
    public void execute() {
        this.semaforo.changeColor();
    }
}
