public class Inheritance {
    public static void main(String[] args) {
        // fish shark= new fish();
        // shark.eats();
        Doggy togo=new Doggy();
        togo.eats();
        System.out.println(togo.legs=4);
        System.out.println(togo.breed="husky");
    }
}
    class Animal{
        String color;

        void eats(){
            System.out.println("eats");
        }
        void breathe(){
            System.out.println("Breaths");
        }
    }
    class Mammal extends Animal{
        int legs;
    }
    class Doggy extends Mammal{
        String breed;
    }
    // class fish extends Animal{
    //     int fins;
    //     void swims(){
    //         System.out.println("Swims in water");
    //     }
    // }

