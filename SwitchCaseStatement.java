public class SwitchCaseStatement {
    public static void main(String[] args) {
        int day = 5;
        switch(day){
            case 0:
            System.out.println("Sunday");
            break;
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Invalid day");
            break;
            }
        }
        
    }
    

/*The switch statement includes multiple code blocks 
called cases, executing one based on the variable
 being switched. It's easier to use than if-else-if statements 
 and improves program readability. */

 // Switch is a multiple choice decision making selection statement, it used when we want too select only one case out of multiole cases.
 /*
 syntact: switch (expression)
 {
    case  1: statement ;
    break ;
    case  2: statement ;
    break ;
    .
    .
    . case n : statement;
    break ;
    default : statement ; // if kunai pani condition match vayena bhane default condidtion execute hunchha 

 }
 */

 /*Important notes about switch case statements:

- Case variables can be `int`, `short`, `byte`, `char`, enumeration, or `String` (since Java 7).
- Cases cannot be duplicate.
- The `default` statement is executed if no cases match; it is optional.
- The `break` statement ends the switch block when a condition is satisfied; if omitted, the next case is executed.
- Case expressions must be the same type as the variable and must be constant values. */
