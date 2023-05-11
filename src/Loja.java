public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataDeFundacao;

    public Loja(String nome,int quantidadeFuncionarios,double salarioBaseFuncionario,Endereco endereco,Data dataDeFundacao){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        this.salarioBaseFuncionario=salarioBaseFuncionario;
        this.endereco=endereco;
        this.dataDeFundacao=dataDeFundacao;
    }

    public Loja(String nome,int quantidadeFuncionarios,Endereco endereco, Data dataDeFundacao ){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        salarioBaseFuncionario= -1;
        this.endereco=endereco;
        this.dataDeFundacao=dataDeFundacao;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios=quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario ){
        this.salarioBaseFuncionario=salarioBaseFuncionario;
    }

    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco=endereco;
    }

    public Data getDataDeFundacao(){
        return dataDeFundacao;
    }
    public void setDataDeFundacao(Data dataDeFundacao){
        this.dataDeFundacao=dataDeFundacao;
    }
    @Override
     public String toString(){
        return "Nome da Loja:  " + nome +
        "\nN° de Funcionários:   " + quantidadeFuncionarios +
        "\nSalário base de cada funcionario:   " + salarioBaseFuncionario +
        "\nEndereco da Loja\n:  "  + endereco  +
        "\nData de Fundacao da Loja:  "  +  dataDeFundacao;
     }

    public double gastosComSalario(){
        if(salarioBaseFuncionario <= -1){
            return -1;
        }
        else{
            return salarioBaseFuncionario*quantidadeFuncionarios;
        }}

        public char tamanhoDaLoja(){
            if(quantidadeFuncionarios < 10){
                return 'P';
            }
            else if ((quantidadeFuncionarios >=10) && (quantidadeFuncionarios <=30)){
                return 'M';
            }
            else {
                return 'G';
            }
        }
        

}
