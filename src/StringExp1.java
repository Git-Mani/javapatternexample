public class StringExp1 {
public static void main(String args[]){

String s="java is programming language";
String s1="";
char a[]=s.toCharArray();

for(int i=0;i<a.length;i++){

if(a[i]!=' '){

s1=s1+a[i];
    
}
}
System.out.println(s1);

}}
