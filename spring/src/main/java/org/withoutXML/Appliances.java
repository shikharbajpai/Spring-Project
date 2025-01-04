package org.withoutXML;

public class Appliances {
    private Frames frames;

    public Appliances() {
    }

    public Appliances(Frames frames) {
        this.frames = frames;
    }

    public Frames getFrames() {
        return frames;
    }

    public void setFrames(Frames frames) {
        this.frames = frames;
    }

    public void running() {
        frames.parts();
        System.out.println("Appliance is running");
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "frames=" + frames +
                '}';
    }
}
