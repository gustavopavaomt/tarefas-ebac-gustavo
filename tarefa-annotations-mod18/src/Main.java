import java.lang.reflect.Method;

public class Main{


    public static void main(String[] args) {

      ExemploClass exemplo = new ExemploClass();

      try{
          //Procura o metodo que tem a annotation
          Method method = exemplo.getClass().getMethod("enumMethod");

          if(method.isAnnotationPresent(Tabela.class)){
              Tabela tabela = method.getAnnotation(Tabela.class);
              System.out.println("O Valor da annotation @Tabela é: "+ tabela);
          }else{
              System.out.println("O Valor nao foi encontrado");
          }

      }catch (NoSuchMethodException e){
          e.printStackTrace();
      }
    }
}