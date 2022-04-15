import java.util.Scanner;
class firstClass{
    String printName(String a){
        return a;
    }
    int printAge(int b){
        return b;
    }
    String printAddress(String c){
        return c;
    }
}
class secondClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details");
        String name=sc.nextLine();
        int age=sc.nextInt();
        String address=sc.nextLine();
        sc.close();


        firstClass p1=new firstClass();
        String a1=p1.printName(name);
        int a2=p1.printAge(age);
        String a3=p1.printAddress(address);


        System.out.println("Name : "+a1);
        System.out.println("Age : "+a2);
        System.out.println("Address : "+a3);
    }
}