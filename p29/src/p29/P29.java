
package p29;


class multiThread extends Thread{ 
    int num;
    multiThread(int num){
    this.num = num;
    }
    public void run(){
        try{
        System.out.println("Thread "+Thread.currentThread().getId()+" is created");
        System.out.println("Number: "+num);
        Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("Exception "+e);
        }
    }
}

public class P29 {
    public static void main(String[] args) {
        
        for(int i = 1; i<=5; i++){
            multiThread t = new multiThread(i);
            t.start();
        }
    }
    
}