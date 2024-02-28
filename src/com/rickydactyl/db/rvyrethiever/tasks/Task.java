package com.rickydactyl.db.rvyrethiever.tasks;

import com.rickydactyl.db.rvyrethiever.Main;

public class Task {

    public Task(String taskType) {
        if(can()) {
            Main.status = taskType;
        }
    }
    public boolean can() {
        return false;
    }

    public void execute() {

    }
}
