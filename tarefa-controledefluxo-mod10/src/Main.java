import java.util.Scanner;

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua nota1:");
        int nota1 = sc.nextInt();
        System.out.println("Digite a sua nota2:");
        int nota2 = sc.nextInt();
        System.out.println("Digite a sua nota3:");
        int nota3 = sc.nextInt();
        System.out.println("Digite a sua nota4:");
        int nota4 = sc.nextInt();
        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        String resultado = checkNota(media);
        System.out.println("Resultado final: " + resultado +" Por que sua media foi de: " + media);
    }

    private static String checkNota(int media){
        if(media >= 7){
            return "Aprovado";
        }else if(media <7 && media >= 5){
            return "Em Recuperação";
        }else{
            return "Reprovado";
        }
    }
}