public class Age{
public static void main(String args[]){
try{
int age=21;
if(age>=18)
{
System.out.println("Eligible to vote.");
}
else
{
MyException me=new MyException();
throw me;
}
}catch(MyException e){
System.out.println(e);
}
}
}
class MyException extends RuntimeException{
public String toString(){
return "Age must be greater than 18.";
}
