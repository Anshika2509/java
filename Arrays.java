public class Arrays {
    public static void main(String[] args) {
        int num[] = new int[4];  // dynamic values => sets all values 0 for now
        int num1[] = {1, 2, 3, 4};  // already with values
        System.out.println(num1[1]); // accessing values from array

        //assigning/changing values
        num[1] = 3;
        System.out.println(num[1]);

        for(int i =0; i<num.length; i++){
            num[i] = i+1;
            System.out.println("num[" + i + "] = " + num[i]);
        }

    }
}
