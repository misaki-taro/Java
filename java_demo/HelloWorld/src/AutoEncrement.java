// 自增自减理解
public class AutoEncrement {
    public void testAuto1(){
        int count = 0;
        for(int i = 0; i < 100; i++)
            count = count++;
        System.out.println(count);
    }

    public void testAuto2(){
        int count = 0;
        for(int i = 0; i < 100; i++){
            int temp = count;
            count++;
            count = temp;
        }
        System.out.println(count);
    }

    public static void main(String[] args){
        AutoEncrement ae = new AutoEncrement();
        ae.testAuto1();
        ae.testAuto2();
    }

}
