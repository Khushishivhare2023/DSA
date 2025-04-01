public class OOPS {
    public static void main(String[] args) {
        pen P1 =new pen();
        P1.setcolor("Pink");
        System.out.println(P1.getcolor());
        P1.settip(4);
        System.out.println(P1.gettip());
        
    } 
}
class pen{
    private String color;
    private int tip;

    String getcolor() {
        return this.color;
    }
    int gettip() {
        return this.tip;
    }
    void setcolor(String newcolor){
        this.color=newcolor;
    }
    void settip(int newtip){
        this.tip=newtip;
    }

}
