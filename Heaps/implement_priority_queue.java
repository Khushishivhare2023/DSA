import java.util.*;
public class implement_priority_queue {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s1){
           return this.rank-s1.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 6));
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 5));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+ "-->"+ pq.peek().rank);
            pq.remove();
        }
    }
    
}
