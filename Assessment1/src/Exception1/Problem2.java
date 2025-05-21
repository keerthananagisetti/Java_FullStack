package Exception1;
class InvalidEmployeeIDException extends Exception {
    public InvalidEmployeeIDException(String message) {
        super(message);
    }
}
public class Problem2{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an employee ID as a command-line argument.");
            return;
        }

        try {
            
            int employeeID = Integer.parseInt(args[0]);
            validateEmployeeID(employeeID);
            System.out.println("Valid Employee ID");
        } catch (InvalidEmployeeIDException e) { 
            System.out.println("Exception caught: " + e.getMessage());
        } catch (NumberFormatException e) {    
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
    public static void validateEmployeeID(int employeeID) throws InvalidEmployeeIDException {  
        if (employeeID < 0 || employeeID > 999) {   
            throw new InvalidEmployeeIDException("Invalid Employee ID");
        }
    }
}	    
