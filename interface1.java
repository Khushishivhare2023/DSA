public class interface1 {
    public static void main(String[] args) {
            Queen q=new Queen();
            q.moves();
        
    }
    
}

interface Chess{
    void moves();
}
class Queen implements Chess{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all directions)");
    }
}
class Rook implements Chess{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class king implements Chess{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(by one step)");
    }
}
