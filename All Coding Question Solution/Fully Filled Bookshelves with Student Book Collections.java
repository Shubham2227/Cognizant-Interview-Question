Fully Filled Bookshelves with Student Book Collections

You need to arrange books in a library with the help of students. Each student has a collection of books. Bookshelves can hold a maximum of K books and must be fully filled. 
If a student has more books than the shelf capacity, the excess books carry over to the next student's shelf. If they have fewer books, those books also carry over to the next
student's shelf. The goal is to calculate and return the total number of fully filled bookshelves. If the last student has any extra books after filling the shelves, 
those books are discarded.

input1: An integer representing the number of students.
input2: An integer K, representing the maximum number of books a shelf can hold.
input3: An integer array representing the number of books each student has.
Output:
Return an integer value representing the total number of fully filled bookshelves.

num_students = 5 
K = 10  
books = [15, 8, 17, 12, 5] 
output= 5

  
  public class FullyDeckedShelves {
    public static int fullyDeckedShelves(int numStudents, int K, int[] books) {
        int totalShelves = 0;
        int carryOver = 0;

        for (int studentBooks : books) {
            studentBooks += carryOver;
            int fullShelves = studentBooks / K;
            totalShelves += fullShelves;
            carryOver = studentBooks % K;
        }

        return totalShelves;
    }

    public static void main(String[] args) {
        int numStudents = 5;
        int K = 10;
        int[] books = {15, 8, 17, 12, 5};

        System.out.println(fullyDeckedShelves(numStudents, K, books));  // Output: 5
    }
}
