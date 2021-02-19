package app;

import control.ChangeColorCommand;
import control.Command;
import model.Color;
import model.Semaforo;
import view.Display;
import view.MockDisplay;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private Display display;
    private Command command;

    public static void main(String[] args) {
        new Main().execute();
    }

    public Main(){
    }

    public void execute(){
        this.display = new MockDisplay();
        Semaforo semaforo = new Semaforo(Color.VERDE);
        this.command = new ChangeColorCommand(semaforo);

        new Timer().schedule(task(display, command, semaforo), 0, 1000);
    }

    public TimerTask task(Display display, Command command, Semaforo semaforo){
        return new TimerTask(){
            @Override
            public void run(){
                command.execute();
                display.display(semaforo);
            }
        };
    }
}
