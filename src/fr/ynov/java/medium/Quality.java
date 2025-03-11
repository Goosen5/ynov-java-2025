package fr.ynov.java.medium;

public class Quality {
    private int id;
    private String name;

    public Quality(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Quality quality = new Quality(1, "Good");
        Quality quality2 = new Quality(1, "Good");
        System.out.println(quality.equals(quality2));
        System.out.println(quality.hashCode());
        System.out.println(quality2.hashCode());

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Quality quality = (Quality) obj;
        return quality.id == this.id && quality.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }
}
