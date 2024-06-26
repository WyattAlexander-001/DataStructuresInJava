package Arrays;


public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print(){
        for(int i=0; i< count;i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int item){
        if(items.length == count){
            int[] newItems = new int[count *2]; //Resizes
            for (int i=0;i <count;i++){  //Copies items to newitems
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;//Add to end
    }

    public void removeAt(int index){
        if(index< 0 || index >= count){ // For doing stuff like -1
            throw new IllegalArgumentException();
        }
        for(int i= index;i<count;i++){
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        for(int i=0;i<count;i++){
            if(items[i] ==item){
                return i;
            }
        }
        return -1;
    }
}