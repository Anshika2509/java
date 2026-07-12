public class Arrays {
    public static void main(String[] args) {
        int num[] = new int[4];  // dynamic values => sets all values 0 for now
        int num1[] = {1, 2, 3, 4};  // already with values
        System.out.println(num1[1]); // accessing values from array

        System.out.println(num[1]);

        for(int i =0; i<num.length; i++){
            System.out.println("**** Original value in array **** " + num[i]);
            num[i] = i+1;
            System.out.println("**** Value after assigning ****");
            System.out.println("num[" + i + "] = " + num[i]);
        }

    }
}
