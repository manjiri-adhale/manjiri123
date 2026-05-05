import java.util.regex.*; 
public class EmailValidator { 
public static void main(String[] args) { 
String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-zA
Z]{2,}$"; 
Pattern pattern = Pattern.compile(emailRegex); 
String[] emails = {"user@example.com", "invalid-email", 
"test.user@domain.org"}; 
for (String email : emails) { 
Matcher matcher = pattern.matcher(email); 
// matches() - checks entire input against pattern 
// find()    - finds next match in input 
// group()   - returns matched text 
if (matcher.matches()) 
System.out.println(email + " -> Valid"); 
else 
} 
} 
System.out.println(email + " -> Invalid"); 
}