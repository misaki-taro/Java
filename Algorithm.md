# Table of Contents

- [Table of Contents](#Table-of-Contents)
- [数学类](#数学类)



# 数学类

- 素数

## 素数

判断素数的方法

- 根号**(判断素数)**: 开根号法：从2到$\sqrt{n}$均整除判断，时间复杂度$O(\sqrt{n})$（原因：素数是因子为1和本身， 如果数c不是素数，则还有其他因子，其中的因子，假如为a,b.其中必有一个大于$\sqrt{c}$ ，一个小于$\sqrt{c}$ 。所以m必有一个小于或等于其平方根的因数，那么验证素数时就只需要验证到其平方根就可以了。即一个合数一定含有小于它平方根的质因子。)
- 埃氏筛**(计算素数个数)**: 就是当i是素数的时候，i的所有的倍数必然是合数。如果i已经被判断不是质数了，那么再找到i后面的质数来把这个质数的倍数筛掉。

```java
// 根号
boolean isPrime(int n){
    for(int i = 2; i <= (int)Math.sqrt(n); i++){
        if(n % i == 0)
            return false;
    }
    return true;
}
```

```java
// 埃氏
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
```

