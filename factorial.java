
class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();

        
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        
        System.out.println("The factorial of " + num + " is: " + factorial);

        scanner.close();
    }
}