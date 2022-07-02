public class HelloWorld {
    public static  void main(String[] args){
        System.out.println("Hello Misaki~");
        System.out.println((int)Math.sqrt(5));

        // Prime
        Prime p = new Prime();
        System.out.println(p.isPrime(0));

        int[] primeArray = p.getPrimeArray(10);
        for(int i = 0; i < primeArray.length; i++)
            System.out.print(primeArray[i]);

//        System.out.println(primeArray);
    }
}
