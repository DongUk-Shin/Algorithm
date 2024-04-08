import java.util.*; import java.io.*; import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        String s = b.readLine();
        
        BigInteger big = new BigInteger("0");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            BigInteger x = BigInteger.valueOf(s.charAt(i) - 'a' + 1 );
            BigInteger y = BigInteger.valueOf(31).pow(i);
            big = big.add(x.multiply(y));
        }
        System.out.println(big.remainder(BigInteger.valueOf(1234567891)));
    }
}
