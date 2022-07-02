public class Prime {
    public boolean isPrime(int n){
        if(n == 0 || n == 1)
            return false;

        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public int[] getPrimeArray(int n){
        int[] primeArray = new int[n+1];
        int primeNum = 0;
        for(int i = 2; i <= n; i++){
            if(primeArray[i] == 0)
                primeNum++;
            for(int j = 2; i*j <= n; j++)
                primeArray[i*j] = 1;	//不是素数的标记为1
        }

        primeArray[0] = primeNum; //把素数个数存到0的位置
        return primeArray;
    }
}