import java.util.Scanner;
public static void main(String[] args) {
    List<Integer> sequence = new ArrayList<Integer>();
    Scanner firstScanner = new Scanner(System.in);
    boolean stopLoop = false;
    while(!stopLoop) {
        String sequenceNumber = firstScanner.nextLine();
        if(sequenceNumber.equals("X")) {
            stopLoop = true;
        }
        else {
            int arrayNumber = Integer.parseInt(sequenceNumber);
            sequence.add(arrayNumber);
        }
    }
    Scanner userInput = new Scanner(System.in);
    String sequenceString = userInput.nextLine();
    int number = Integer.parseInt(sequenceString);
    boolean found = false;
    boolean searchComplete = false;
    int top = sequence.size();
    int halfLength = top / 2;
    int bottom = -1;
    while(!found && !searchComplete) {
        if (top - bottom == 1) {
            searchComplete = true;
            System.out.println("The number is NOT in the sequence");
        }
        else if(sequence.get(halfLength) > number) {
            top = halfLength;
            halfLength = (halfLength + bottom) / 2;
        }
        else if (sequence.get(halfLength) < number) {
            bottom = halfLength;
            halfLength= (top + bottom) / 2;
        }
        else {
            System.out.println(halfLength + 1);
            found = true;
        }
    }
}
