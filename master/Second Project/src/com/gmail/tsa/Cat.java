package com.gmail.tsa;

public class Cat {
    private String name;
    private int years;
    private String breed;
    private boolean slepping;
    private boolean playing;
    private boolean eating;

    public Cat(String name, int years, String breed) {
        this.name = name;
        this.years = years;
        this.breed = breed;
    }

    public Cat() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setEating(boolean eating) {
        this.eating = eating;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public void setSlepping(boolean slepping) {
        this.slepping = slepping;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isEating() {
        return eating;
    }

    public boolean isPlaying() {
        return playing;
    }

    public boolean isSlepping() {
        return slepping;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", breed='" + breed + '\'' +
                ", slepping=" + slepping +
                ", playing=" + playing +
                ", eating=" + eating +
                '}';
    }
}
