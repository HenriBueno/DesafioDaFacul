public class Principal{
    public static void main(String [] args){
        int x = Teclado.leInt("(1) criar uma loja\n\n(2) criar um produto\n\n(3) sair");

            while(x<1 || x>3){        
                 x = Teclado.leInt("4Opção inválida\n\n(1) criar uma loja\n\n(2) criar um produto\n\n(3) sair");
            }

            switch(x){
                case 1:{
                    Endereco end= new Endereco(Teclado.leString("Digite o nome da rua: "),
                    Teclado.leString("\nDigite a cidade: "),
                    Teclado.leString("\nDigite o estado: "),
                    Teclado.leString("\nDigite o pais: "),
                    Teclado.leString("\nDigite o CEP: "),
                    Teclado.leString("\nDigite o numero: "),
                    Teclado.leString("\nDigite o complemento: "));

                    Data dat=new Data(Teclado.leInt("\nDigite a data de fundacao da Loja:\ndia: "),
                    Teclado.leInt("\nDigite o mes: "),
                    Teclado.leInt("\nDigite o ano: "));

                     Loja p= new Loja(Teclado.leString("Digite o nome da loja: "),
                Teclado.leInt("Digite a quantidade de funcionários: "),
                Teclado.leDouble("Digite o salario base dos funcionários: "),end, dat);

                System.out.println(p.toString());
            }
                case 3: System.exit(0);
            }

    }
}