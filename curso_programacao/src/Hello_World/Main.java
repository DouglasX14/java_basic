package Hello_World;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
    	//usando o println e o print(não quebra a linha)
    	System.out.println("**");
        System.out.println("Hello, World!(println");
        System.out.println("Olá, Mundo!(println");
        System.out.println("**");
        //
        //
        System.out.println("**");
        System.out.print("Hello, World!(print");
        System.out.println("Olá, Mundo!(println");
        System.out.println("**");
        //
        //
        System.out.println("**");
        System.out.println("Hello, World!(println");
        System.out.print("Olá, Mundo!(print");
        System.out.println("**");
        System.out.println("**");
      
        //
        //
        //Printando variaveis
        //
        //
        int y = 32;
        double x = 10.35784;
        System.out.println(y+"(println");
        System.out.println(x+"(println");
        System.out.println("Bom Dia!(println");
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        
        
        Locale.setDefault(Locale.US);
// 		  configura pra considerar o separador dos EUA (US) 
//        troca a virgula pelo ponto
        
        System.out.printf("%.4f%n", x);
        
//
        
//        Para escrever o conteúdo de uma variável
//        com ponto flutuante
//        Suponha uma variável tipo double declarada e iniciada:
//        double x = 10.35784;
//        System.out.println(x);
//        System.out.printf("%.2f%n", x);      (o printf é de formatado)
//        					(%.2f é pra delimitar a 2 casas decimais))
//        System.out.printf("%.4f%n", x);       
  //                            (%n é quebra de linha)
//        %n = quebra de linha
//        (independente de plataforma)
//        Localidade do sistema
//        ATENÇÃO:
//        Para considerar o separador de decimais como ponto,
//		  ANTES da declaração do Scanner, faça:
//        Locale.setDefault(Locale.US);
//        
        System.out.println("**");
        System.out.println("**");
//        //
        //
        //
        //como concatenar vários elementos em um mesmo comando de escrita
        //
        //
          String nome = "Maria";
          int idade = 31;
          double renda = 4000.0;
          
          System.out.println(nome + " tem " + idade + " anos e ganha R$ " + renda +" reais(println");
          System.out.print(nome + " tem " + idade + " anos e ganha R$ " + renda +" reais(print");
          System.out.println("**");
          System.out.println("**");
          
          System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
          			//		%s, %d e o %.2f chamam em ordem as variaveis nome, idade e renda
          			//			como se fosse em uma filinha mesmo de chamada
          			//          sempre que estiver uma variável ele puxa um na ordem
          			//
            		// 	  %f = ponto flutuante
          			//    %d = inteiro
          			//	  %s = texto
          			
          
          	
          
          
          
          
          
          
}
    
}
