public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;}
        int p = 2;
        while (p < Math.sqrt(n)) {
            if (arr[p] == true) {
                int num = p;
                int currInd = p;
                while (currInd <= arr.length) {
                    if (currInd % num == 0) {
                        arr[currInd] = false;
                        currInd++;
                    }
                }
            } 
        p++;
        }
        System.out.println("Prime numbers up to " + n + ":");
        int counter = 0 ;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == true){
                System.out.println(i);
                counter ++;
            }
        }
        System.out.println("There are " + counter + " primes between 2" + " and " + n +  " (" + ((100 * counter) /  n) + "% are primes)");
        }
    }