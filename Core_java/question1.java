abstract class fruits {
    abstract void plucked();
}

class Apple extends fruits {
    void plucked() {
        System.out.println("Apple is plucked");
    }
    public static void main(String args[]) {
        fruits p = new Apple();
        p.plucked();
    }
}

// Interface 
interface flower {
    void plucked();
}
class Rose implements flower {
    public void plucked() {
        System.out.println("Rose plucked");
    }
}
class Sunflower implements flower {
    public void plucked() {
        System.out.println("Sunflower plucked");
    }
}

class question1 {
    public static void main(String args[]) {
        flower rose = new Rose();
        rose.plucked();;
    }
}