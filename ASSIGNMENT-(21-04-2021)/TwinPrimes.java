public class TwinPrimes
{
    static String getTwinPrimes(int num1, int num2) 
    {
        boolean b = true;
        if((num1 < 1) || (num2 > 100) || (num1 >= num2)) {
            b = false;
        }
        if(b) {
        String s = "";
        int[] a = new int[40];
        int x = 0;
        for(int i = num1;i <= num2;i++) {
            boolean c = true;
            for(int j = 2;j < i;j++) {
                if(i % j == 0) {
                    c=false;
                    break;
                }
            }
            if(c) {
                a[x] = i;
                x++;
            }
        }
        for(int i = 0; i < x;i++) {
            if(a[i+1] - a[i] == 2) {
                s = s + a[i] + "," + a[i+1] + ";";
            }
        }
        return s;
        }
        return ""+10/0;
    }
 
    public static void main(String[] args) {
    	try {
    		
            System.out.print(getTwinPrimes(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
    	}
    	catch(Exception e) {
    		System.out.println("Error");
    	}
        }
    }
 
