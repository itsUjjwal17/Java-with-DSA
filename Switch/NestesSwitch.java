import java.util.Scanner;

public class NestesSwitch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int empID=sc.nextInt();
        String Department=sc.next();
        
        switch(empID){
            case 1:
                System.out.println("Ujjwal");
                break;
            case 2:
                System.out.println("Krishna");
                break;
            case 3:
                switch(Department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department else");

                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }
    }
}
