import java.util.Scanner;

public class Program{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String name;
        int life, attack, armor;
        
        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        name = scan.nextLine();
        System.out.print("Vida inicial: ");
        life = scan.nextInt();
        System.out.print("Ataque: ");
        attack = scan.nextInt();
        System.out.print("Armadura: ");
        armor = scan.nextInt();
        System.out.println();

        Champion champion1 = new Champion(name, life, attack, armor);

        scan.nextLine();
        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Nome: ");
        name = scan.nextLine();
        System.out.print("Vida inicial: ");
        life = scan.nextInt();
        System.out.print("Ataque: ");
        attack = scan.nextInt();
        System.out.print("Armadura: ");
        armor = scan.nextInt();
        System.out.println();

        Champion champion2 = new Champion(name, life, attack, armor);

        System.out.print("Quantos turnos você deseja executar?");
        int turnos = scan.nextInt();
        int i = 0;
        System.out.println();

        while(i < turnos){
            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);

            System.out.println();
            System.out.println("Resultado do turno " + (i+1) + ": " );
            System.out.println(champion1.status());
            System.out.println(champion2.status());

            if(champion1.getLife() == 0 || champion2.getLife() == 0){
                break;
            }
            
            i++;
        }
        System.out.println();
        System.out.println("FIM DO COMBATE!");

        scan.close();
    }

}