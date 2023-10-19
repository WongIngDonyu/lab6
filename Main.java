import java.util.Random;

class Main{
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(new Random().nextInt(-100, 100));
        }
    }
}