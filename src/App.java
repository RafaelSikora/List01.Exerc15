import java.util.Scanner;
//Exercicio 15: Faça um Programa que pergunte quanto você ganha por hora e 
//o número de horas trabalhadas no mês. Calcule e mostre o total do seu 
//salário no referido mês, sabendo-se que são descontados 11% para o 
//Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
// (1) O salário bruto.
// (2) Quanto pagou ao INSS.
// (3) Quanto pagou ao sindicato.
// (4) O salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:
// + Salário Bruto : R$
// - IR (11%) : R$
// - INSS (8%) : R$
// - Sindicato ( 5%) : R$
// = Salário Liquido : R$
// Obs.: Salário Bruto - Descontos = Salário Líquido.
class Main {
public static void main(String[] args){
//Declaração de variáveis
double valorHora;
double horasTrabalhadas;
double salarioBruto;
double imposto;
double inss;
double sindicato;
double salarioLiquido;
//Fazer a entrada de dados
Scanner teclado = new Scanner (System.in);
System.out.println("Digite quanto você recebe por hora: R$");
valorHora = teclado.nextDouble();
System.out.println("Digite quantas horas você trabalhou no mês: ");
horasTrabalhadas = teclado.nextDouble();
  
  //Fazer os calculos
salarioBruto = horasTrabalhadas * valorHora;
imposto = salarioBruto * 0.11;
inss = salarioBruto * 0.08;
sindicato = salarioBruto * 0.05;
salarioLiquido = salarioBruto - imposto - inss - sindicato;

  //Mostrar os resultados pro usuário
  System.out.println("Seu salario bruto é de: R$ " + salarioBruto);
  System.out.println("Voce pagou de imposto de renda um total de: R$ " + imposto);
  System.out.println("Voce pagou de inss um total de: R$ " + inss);
  System.out.println("Voce pagou de sidicato um total de: R$ " + sindicato);
  System.out.println("Seu salário liquido é de: R$ " + salarioLiquido);
  
  
  teclado.close();
  }
}
