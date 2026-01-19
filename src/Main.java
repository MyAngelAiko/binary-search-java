import java.util.Scanner;
public static void main(String[] args) {
    int[] sequence = {4, 9, 23, 43, 62, 91, 100, 109, 121};
    Scanner userInput = new Scanner(System.in);
    String sequenceString = userInput.nextLine();
    int number = Integer.parseInt(sequenceString);
    boolean found = false;
    boolean searchComplete = false;
    int top = sequence.length;
    int halfLength = top / 2;
    System.out.println(halfLength);
    int bottom = -1;
    while(!found && !searchComplete) {
        if (top - bottom == 1) {
            searchComplete = true;
            System.out.println("The number is NOT in the sequence");
        }
        else if(sequence[halfLength] > number) {
            top = halfLength;
            halfLength = (halfLength + bottom) / 2;
        }
        else if (sequence[halfLength] < number) {
            bottom = halfLength;
            halfLength= (top + bottom) / 2;
        }
        else {
            System.out.println(halfLength + 1);
            found = true;
        }
    }
}
