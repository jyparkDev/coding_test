import java.math.BigInteger;
class Solution {
    public int solution(int n) {
        BigInteger[] tmp = new BigInteger[n+1];
        tmp[0] = new BigInteger("0");
        tmp[1] = new BigInteger("1");
        for(int i = 2 ; i <= n ;i++){
            tmp[i] = tmp[i-2].add(tmp[i-1]);
        }
        return tmp[n].divideAndRemainder(new BigInteger("1234567"))[1].intValue();
    }
}