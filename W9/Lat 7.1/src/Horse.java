/*
 *
 *
 * @author Fariz Muhamad Ibnu Hisyam
 */

public class Horse extends Animal{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
    public static void main(String[] args){
        Animal obj = new Horse();
        obj.sound();
    }
}
