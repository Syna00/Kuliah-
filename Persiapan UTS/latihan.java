public class latihan{
    public static void main (String[]args){
        System.out.println("Saya orang islam");
        int a,b,c;
        a = 10;
        System.out.println("Hapalan saya ada " + a + " jus");
        //Swap
        b = 90;
        c = 40;
        System.out.println("Sebelum diswap");
        System.out.println("A = "+b);
        System.out.println("B = "+c);

        System.out.println("Setelah diswap");
        int z;
        z=b;
        b=c;
        c=z;
        System.out.println("A = "+b);
        System.out.println("B = "+c);
        //Menghitung diskriminan

        int k,l,m,n,o;
        k = 10;
        l = 20;
        m = 30;
        n = 40;

        o = l*l-4*k*m;
        System.out.println("Diskriminannya adalah "+o);

        for(int i = 1; i<=15; i++){
            if (i % 3==0 && i%5==0) System.out.println("FizzBuzz");
            else if (i%3==0) System.out.println("Fizz");
            else if (i%5==0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

}