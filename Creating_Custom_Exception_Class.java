import java.util.Scanner;

class MaxSemester extends Exception{
    @Override
    public String toString(){

        return "How can a semester be more than 8th";
    }
    public String getMessage(){
        return "Error occured..Semester should be between 1 and 8";
    }
}

public class Creating_Custom_Exception_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your semester");
        int sem = sc.nextInt();
        if (sem < 1 || sem > 8) {
            try {
                throw new MaxSemester();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Your semester is " + sem);
        }
    }
}
