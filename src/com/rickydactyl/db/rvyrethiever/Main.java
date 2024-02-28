package com.rickydactyl.db.rvyrethiever;

import com.rickydactyl.db.rvyrethiever.tasks.*;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.script.Category;

import java.util.ArrayList;

@ScriptManifest(author = "RickyDactyl", name = "rVyreThiever", version = 0.1, description = "Thieves Vyres for Blood Shards", category = Category.THIEVING)
public class Main extends AbstractScript {

    private ArrayList<Task> tasks;
    public static String status;

    public void onStart() {
        tasks = new ArrayList<>();
        tasks.add(new BankTask("Banking"));
        tasks.add(new RestockingTask("Restocking"));
        tasks.add(new MulingTask("Muling"));
        tasks.add(new ShadowveilTask("Casting Shadowveil"));
        tasks.add(new ThievingTask("Thieving"));
    }

    public void onExit() {

    }

    @Override
    public int onLoop() {

        for(Task task : tasks) {
            if(task.can()) {
                task.execute();
            }
        }

        return 1200;
    }
}