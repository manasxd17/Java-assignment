package Core_java;
abstract class Fruits {
    abstract void plucked();
}

class Apple extends Fruits {
    void plucked() {
        System.out.println("Apple is plucked");
    }
    public static void main(String args[]) {
        Fruits p = new Apple();
        p.plucked();
    }
}

// Interface 
interface Flower {
    void plucked();
}
class Rose implements Flower {
    public void plucked() {
        System.out.println("Rose plucked");
    }
}
class Sunflower implements Flower {
    public void plucked() {
        System.out.println("Sunflower plucked");
    }
}

class Question1 {
    public static void main(String args[]) {
        Flower rose = new Rose();
        rose.plucked();;
    }
}
