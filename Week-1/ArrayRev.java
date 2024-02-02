import java.util.Scanner;
class rev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The resulatant array is:");
        for(int i=(n-1); i>=0; i--){
            System.out.println(arr[i]+" ");
    }
}
}