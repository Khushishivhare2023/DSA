public class abstraction {
    public static void main(String[] args) {
        horse h1=new horse();
        h1.eat();
        h1.walk();
        chicken c1=new chicken();
        c1.eat();
        c1.walk();
        
    }
}
    abstract class Animal{
        void eat(){
            System.out.println("Eats");
        }
        abstract void walk();
    }
    class horse extends Animal{
        void walk(){
            System.out.println("walks in 4 legs");
        }
    }
    class chicken extends Animal{
        void walk(){
            System.out.println("Walks in 2 legs");
        }
    }
    

