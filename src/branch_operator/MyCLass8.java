package branch_operator;

public class MyCLass8 {
    public static void main(String[] args) {
        BLOCK1:
        while (true){
            System.out.println("Начало чикла 1: ");
            BLOCK2:
            for(int i = 0; i < 5; i++){
                System.out.println("-----Начало цикла 2: ");
                if (i==1){
                    System.out.println("-----break");
                    break BLOCK1;
                }
                System.out.println("-----Внутри цикла 2");
            }
            System.out.println("После цикла 2");
        }
        System.out.println("После цикла 1");
    }
}
