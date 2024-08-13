package co.com.choucair.certificacion.challengeChoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class TaskExample implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static Task theTask() {
        return Tasks.instrumented(TaskExample.class);
    }

}
