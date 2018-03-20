package difficulty.easy;

public class Count_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_Primes s =new Count_Primes();
		s.countPrimes(23);
	}
	
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        
        return count;
    }

}
