package Odev_GenericList;

    public class MyList<T>{
        T [] arr;
        int count;
        public  MyList(){
            count=10;
            arr=(T[]) new Object[count];
        }
        public MyList(int size){
            count=size;
            arr=(T[]) new Object[count];
        }

        public int size(){
            int count=0;
            for(T i :arr){
                if(i !=null ){
                    count++;
                }
            }
            return count;
        }
        public int getCapacity(){
            return this.count;
        }
        public void add(T data){
            int index=this.size();
            if(index==this.getCapacity()){
                this.count=count*2;
                T[] newArr=(T[]) new Object[count];
                for(int i=0;i<arr.length;i++){
                    newArr[i]=arr[i];
                }
                newArr[arr.length]=data;
                this.arr=newArr;
            }else{
                arr[index]=data;
            }
        }
        public T getItem(int index){
            if(index>this.getCapacity()||index<0){
                return null;
            }
            return arr[index];
        }

        public T remove(int index){
            if(index>this.getCapacity()||index<0){
                return null ;
            }
            T removed=this.arr[index];
            for(int i=index;i< arr.length-1;i++){
                this.arr[i]=this.arr[i+1];
            }
            this.arr[arr.length-1]=null;
            return  removed;

        }
        public void setItem(int index ,T data){
            if(index>this.getCapacity()||index<0){
                return;
            }
            this.arr[index]=data;
        }
        public String toString(){
            String str="";
            for(int i=0;i<this.arr.length;i++){
                if(this.arr[i]!=null){
                    str+=this.arr[i]+" ";
                }
            }
            return str;
        }

        public int indexOf(T data){
            for(int i=0;i<this.arr.length;i++){
                if(this.arr[i].equals(data)){
                    return i;
                }
            }
            return -1;
        }

        public int lastIndexOf(T data) {
            for (int i = this.arr.length - 1; i >= 0; i--) {
                if (this.arr[i].equals(data)) {
                    return i;
                }
            }
            return -1;

        }
        public boolean  isEmpty(){
            if(this.size()==0){
                return true;
            }
            return false;
        }
        public T[] toArray(){
            T[] toArr=(T[]) new Object[this.getCapacity()];
            int index=0;
            for(T i:this.arr){
                toArr[index]=i;
                index++;
            }
            return toArr;
        }

        public void clear(){
            for(int i=0;i<this.arr.length;i++){
                this.arr[i]=null;
            }
        }
        public boolean contains(T data){
            for(int i=0;i<this.arr.length;i++){
                if(this.arr[i].equals(data)){
                    return true;
                }
            }
            return false;
        }
        public MyList<T> sublist(int start,int finish){
            int count=finish-start;
            MyList<T> arrx=new MyList<>();
            int index=0;
            for(int i=start;i<finish;i++){
                arrx.arr[index]=this.arr[i];
            }
            return arrx;
        }
    }

