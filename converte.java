import java.util.Scanner;

public class converte {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Insira um valor");
    int valor=s.nextInt();

    Integer valor1 =Integer.valueOf(valor);
    Long valor2 =Long.valueOf(valor);
    Float valor3=Float.valueOf(valor);
    Double valor4=Double.valueOf(valor);
    System.out.println("De int para :"+((Object)valor1).getClass().getSimpleName()+" "+valor1);
    System.out.println("De int para :"+((Object)valor2).getClass().getSimpleName()+" "+valor2);
    System.out.println("De int para :"+((Object)valor3).getClass().getSimpleName()+" "+valor3);
    System.out.println("De int para :"+((Object)valor4).getClass().getSimpleName()+" "+valor4);
    System.out.println("Insira um valor");

    float valor5=s.nextFloat();

    Float valor6=Float.valueOf(valor5);
    Double valor7=Double.valueOf(valor5);
    System.out.println("De float para :"+((Object)valor6).getClass().getSimpleName()+" "+valor5);
    System.out.println("De float para :"+((Object)valor7).getClass().getSimpleName()+" "+valor6);

    System.out.println("Insira um valor");
    long valor8=s.nextLong();
    Long valor9=Long.valueOf(valor8);
    Double valor10=Double.valueOf(valor8);
    System.out.println("De long para :"+((Object)valor9).getClass().getSimpleName()+" "+valor9);
    System.out.println("De long para :"+((Object)valor10).getClass().getSimpleName()+" "+valor10);

    System.out.println("Insira um valor");
    double valor11=s.nextDouble();
    Double valor12=Double.valueOf(valor11);
    System.out.println("De double para :"+((Object)valor12).getClass().getSimpleName()+" "+valor12);

    }

    }


