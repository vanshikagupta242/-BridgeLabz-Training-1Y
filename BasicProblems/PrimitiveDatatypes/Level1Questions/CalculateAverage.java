public class CalculateAverage {
    public static void main(String[] args) {
        // Marks obtained out of 100
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
		int totalSubjects = 3;
		int sumOfMarks = mathsMark + physicsMark + chemistryMark;

        
        double averageMark = (double) sumOfMarks / totalSubjects;
		System.out.println("Sam's average mark in PCM is " + averageMark + "%");
    }
}
