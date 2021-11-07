package BookExamples.OverLoad;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда
//ни один из размеров не указан
    Box() {
        width = -1; // использовать значение -1 для
        height = -1; // обозначения неинициализированного
        depth = -1; //параллелепипеда
    }

    // конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class overloadCons {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 30);
        Box myBox2 = new Box();
        Box myCube = new Box(7);
        double vol;

        vol = myBox1.volume();
        System.out.println("My Box 1 = " + vol);

        vol = myBox2.volume();
        System.out.println("My Box 2 = " + vol);

        vol = myCube.volume();
        System.out.println("My Cube = " + vol);

    }
}