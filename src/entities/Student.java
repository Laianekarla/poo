package entities;

/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). */


public class Student {

	public String name;
	public double grade1, grade2, grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public double passOrFailed() {
		if(finalGrade() < 60.0 ) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
		
		
	}
	
}
