package NSE;

   public class TestGenerics {
    public static <E>void printArray(E[]elements){
        for(E element:elements) {
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Integer[]intArray= {10,20,30,40,50};
        Character[]charArray={'j','a','v','a','p','r','o','g','r','a','m','i','n','g'};
        System.out.println("Printing Integer Array");
        printArray(intArray);
        System.out.println("Printing Character Array");

        printArray(charArray);
    }

}

