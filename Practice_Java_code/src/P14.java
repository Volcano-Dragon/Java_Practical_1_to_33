/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author AMD HOME
 */
class x extends Thread{
    int num;
    
    @Override
    public void run(){
        System.out.println("Im created"+Thread.currentThread().getName());
        System.out.println("Num: "+num);
    }

}
public class P14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0;i<=5;i++){
            x x1 = new x();
            x1.num = i;
            try{
            x1.start();
            Thread.sleep(1000);  
            }
            catch(Exception e){
                System.out.println("Wrong");
            }
        }
    }
    
}
