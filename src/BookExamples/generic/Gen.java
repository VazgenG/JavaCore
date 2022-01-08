package BookExamples.generic;

public class Gen<T> {
    T ob; // Հայտարարեցինք T տիպի օբյեկտ


    // T օբյեկտին տալ կանստրուկտորի հղումը
    Gen(T o) {
        ob = o;
    }

    // վերադարձնել օբյեկտ ob
    T getOb() {
        return ob;
    }

    // ցույց տալ T տիպը
    void showType() {
        System.out.println(" T-ի տիպը համարվում է " + ob.getClass().getName() );
    }
    
}
