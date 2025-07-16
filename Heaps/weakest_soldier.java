import java.util.PriorityQueue;

public class weakest_soldier {
    static class Row implements Comparable<Row>{
        int soldier;
        int idx;
        public Row(int soldier, int idx){
            this.soldier=soldier;
            this.idx=idx;
        }
        @Override
        public int compareTo(Row R2){
            if(this.soldier==R2.soldier){
                return this.idx-R2.idx;
            }else{
                return this.soldier-R2.soldier;
            }
        }
    }
    public static void main(String[] args) {
        int rows[][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};

        int k=2;
        PriorityQueue<Row> pq=new PriorityQueue<>();
        for(int i=0;i<rows.length;i++){
            int cnt=0;
            for(int j=0;j<rows[0].length;j++){
                cnt+=rows[i][j]==1?1:0;
            }
            pq.add(new Row(cnt,i));
        }
        for(int i=0;i<k;i++){
            System.out.println("R"+ pq.remove().idx);

        }
    }
    
}
