package com.mycompany.app;

public class Chore {
    private String title;
    private boolean isCompleted;

    public Chore(String title, boolean isCompleted) {
        this.setTitle(title);
        this.isCompleted = false;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public boolean markInComplete() {
        this.isCompleted = false;
        return this.isCompleted;
    }

    public boolean markCompleted() {
        this.isCompleted = true;
        return this.isCompleted;
    }
}
