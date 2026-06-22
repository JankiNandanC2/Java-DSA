package _16_Queue;

public class _08_CircularQueueImplementationArray {
    public static class Cqa{
        int front = -1 ;
        int rear = -1 ;
        int size = 0 ;
        int[] arr = new int[5];

        public void add(int val){
            if( size == arr.length ){
                System.out.println(" array is full ");
                return ;
            }
            else if ( size == 0 ){
                front = rear = 0 ;
                arr[rear] = val ;
            }
            else if ( rear == arr.length -1 ){
                rear = 0 ;
                arr[rear] = val ;
            }
            else if ( rear < arr.length -1 ){
                arr[++ rear] = val ;
            }
            size++ ;
        }

        public int remove(){
            if( size == 0 ) {
                System.out.println("empty array ");
                return -1 ;
            }
            else {
                int eleVal = arr[front] ;
                if( front == arr.length -1 ) front = 0 ;
                else front++ ;
                size-- ;
                return eleVal ;
            }
        }

        public int peek(){
            if( size == 0 ){
                System.out.println("empty array ");
                return -1 ;
            }
            return arr[front] ;
        }


        public void display(){
            if( size == 0 ){
                System.out.println("empty array ");
                return  ;
            }

            // case 1 --> front >= rear
            if( front <= rear ){
                for(int i = front ; i <= rear ; i++){
                    System.out.print(arr[i] +" ");
                }
                System.out.println();
            }
            // case 2 --> rear is less than front
            if( front > rear ){
                for(int i = front ; i < arr.length  ; i++){
                    System.out.print(arr[i] +" ");
                }
                for(int i = 0 ; i <= rear ; i++){
                    System.out.print(arr[i] +" ");
                }
                System.out.println();
            }
        }

        public boolean isEmpty(){
            return size == 0 ;
        }

        public int size(){
            return size ;
        }
    }
    static void main(String[] args) {
        Cqa que = new Cqa();
        que.add(1);
        que.add(2);
        que.add(2);
        que.add(3);
        que.add(3);
        que.display();

        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());
        que.add(5);
        que.add(7);
        que.add(4);
        que.add(1);
        que.display();

        System.out.println(que.remove());
        System.out.println(que.isEmpty());
        System.out.println(que.size());
    }
}
