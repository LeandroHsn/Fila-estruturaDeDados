import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Fila<Object> fila = new Fila<Object>();
        String prioridade = "verde";
        String nome = "Inválido";
        String data = "01/01/2021";
        String sintoma = "Insira o sintoma";

        String i = "";
        int j = 0;
        int contador = 0;

        System.out.print("Digite 'começar' para inicar e 'sair' para finalizar a sessão: ");
        Scanner sc = new Scanner(System.in);
        while (!i.equalsIgnoreCase("sair")) {
            contador = 0;
            i = sc.next();
            if (!i.equalsIgnoreCase("sair") && j == 0) {
                System.out.print("Digite o nome do paciente: ");
                nome = sc.next();
                j = 1;
            } else if (!i.equalsIgnoreCase("sair") && j == 1) {
                System.out.print("Digite a prioridade do paciente (vermelho > amarelo > verde): ");
                prioridade = sc.next();
                j = 2;
            } else if (!i.equalsIgnoreCase("sair") && j == 2) {
                System.out.print("Digite a data de nascimento do paciente: ");
                data = sc.next();
                j = 3;
            } else if (!i.equalsIgnoreCase("sair") && j == 3) {
                System.out.print("Digite o sintoma do paciente: ");
                sintoma = sc.next();
                Paciente paciente = new Paciente(nome, prioridade, data, sintoma);
                nome = "Inválido";
                data = "01/01/2021";
                sintoma = "Insira o sintoma";
                prioridade = "verde";
                fila.enfileiraComPrioridade(paciente);
                j = 0;
                contador = 10;
            } else {
                if (contador != 10) {
                    Paciente pacienteInconpleto = new Paciente(nome, prioridade, data, sintoma);
                    fila.enfileiraComPrioridade(pacienteInconpleto);
                    sc.close();
                }
                sc.close();
            }
            System.out.print("Digite 'continuar' ou 'sair' para finalizar: ");
        }

        System.out.println("\n\n" + "Lista dos pacientes de acordo com a prioridade:");
        System.out.println("\n" + fila);

        fila.desenfileira();

        System.out.println("\n" + "Removendo o paciente com mais prioridade:");
        System.out.println("\n" + fila);
    }
}
