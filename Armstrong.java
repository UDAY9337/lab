public class Armstrong {

    public static void main(String[] args) {

        int n = 153, number, temp, t = 0;

        number = n;
        while (number != 0)
        {
            temp = n % 10;
            t = t + temp*temp*temp;
            number =n / 10;
        }

        if(t == n)
            System.out.println("The number is an Armstrong number :"+n);
        else
            System.out.println("The number is not an Armstrong number :"+n);
    }
}