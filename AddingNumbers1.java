class AddingNumbers
{
public static void main(String a[])
{
int output=add();
System.out.println(output);
double ans=add(89.99,34.55);
System.out.println(ans);
}
static int add()
{
int a=10;
int b=34;
int c=a+b;
System.out.println((a+b));
}
static int add(double subjectone,double subjecttwo)
{
double finalData=subjectone+subjecttwo;
System.out.println((subjectone+subjecttwo));
}
}