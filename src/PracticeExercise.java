class Cylinder {
    private float radius;
    private float height;

    public float getRadus() {
        return radius;
    }

    public float getHeight() {
        return height;
    }

    public void setRaduius(float r) {
        this.radius = r;
    }

    public void setHeight(float h) {
        this.height = h;
    }
}

public class PracticeExercise {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        obj.setRaduius(22.2f);
        obj.setHeight(13.3f);
        System.out.println(obj.getHeight());
        System.out.println(obj.getRadus());
    }
}
