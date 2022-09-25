class MyCircularQueue {
        int[] arr;
        int rear,front,size;

    public MyCircularQueue(int k) {
            arr=new int[k];
            for(int i=0;i<k;i++){
                    arr[i]=-1;
            }
            rear=-1;
            front=0;
            size=k;
    }
    
    public boolean enQueue(int value) {
            int index=(rear+1)%size;
        if(arr[index] == -1){
                arr[index]=value;
                rear=index;
                return true;
        }
            return false;
    }
    
    public boolean deQueue() {
        if(arr[front] != -1){
                arr[front]=-1;
                front=(front+1)%size;
                return true;
        }
            return false;
    }
    
    public int Front() {
        return arr[front];
    }
    
    public int Rear() {
        if(rear == -1)return -1;
            return arr[rear];
    }
    
    public boolean isEmpty() {
        if(arr[front] == -1)return true;
            return false;
    }
    
    public boolean isFull() {
        int index=(rear+1)%size;
            if(arr[index] == -1)return false;
            return true;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */