import java.util.Scanner;


public class StudentGrade {
    

    public static void main(String[] args){

    float marks, total=0, percentage;
    String grade;
    int numSubjects;
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter number of subjects: ");
    numSubjects= sc.nextInt();

    
    for(int i=1; i<=numSubjects ;i++){
        System.out.print("Enter marks of subject "+ i +" : ");
        marks=sc.nextInt();
        total+=marks;
    }

    percentage=(total/(numSubjects*100))*100;

    if (percentage >= 95){
        grade="A+";
    }
    else if(percentage < 95 && percentage >= 90){
        grade="A";
    }
    else if(percentage < 90 && percentage >= 85){
        grade="B+";
    }
    else if(percentage < 85 && percentage >= 80){
        grade="B";
    }
    else if(percentage < 80 && percentage >=60){
        grade="C";
    }
    else if(percentage < 60 && percentage >= 33){
        grade="D";
    }
    else{
        grade="F";
    }
    
    System.out.println("\n********** Student Mark Sheet **********");
    System.out.println("Total marks obtained: " + total);
    System.out.println("Percentage obtained: " + percentage);
    System.out.println("Grade obtained: " + grade);
    System.out.println("****************************************");



    sc.close();
    }
}
