public class PrintSomeText {

public static void main(String [] args){
// Printing some text to the terminal
/*The code below simple prints out what is written in the quotation marks, regardless of what is written */
//        System.out.println("This is my first Java Trial code" + "," + "not bad");
    PrintSomeText obj = new PrintSomeText();
    obj.add(12, 14);
    print("My name is Terissa");

    }
    public void add (int a, int b){
    int sum = a + b;
        System.out.println(sum);

    }


    private static void print (String txt1){

          System.out.println(txt1);

    }
}