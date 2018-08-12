class StringCompareDemo{
public static void main(String ar[]){
String n="iact education";
if(n.equals("IACT EDUCATION"))
System.out.println("strings are equal");
else
System.out.println("strings are not equal");
if(n.equalsIgnoreCase("IACT EDUCATION"))
System.out.println("strings are equal");
else
System.out.println("strings are not equal");
if(n.compareTo("IACT EDUCATION")==0)
System.out.println("strings are equal");
else if(n.compareTo("IACT EDUCATION")>0)
System.out.println("first string is greater");
else
System.out.println("second string is greater");
}}
