class AddOfThree
{
public static void main(String a[])
{
add();
double finalansoftwo=add(25.03,23.11);
double finalansofthree=add(25.03,23.11,98.95);
System.out.println(finalansoftwo);
System.out.println(finalansofthree);
}
static int add()
{
int a=20;
int b=30;
int c=a+b;
return c;
}
static double add(double subjectone,double subjecttwo)
{
double finalansoftwo=((subjectone+subjecttwo));
return finalansoftwo;
}
static double add(double subjectone,double subjecttwo, double subjectthree)
{
double finalansofthree=((subjectone+subjecttwo+subjectthree));
return finalansofthree;
}
}
