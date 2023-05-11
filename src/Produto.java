
public class Produto {
    private String nome;
    private double preco;
    private Data dataDeValidade;

    public Produto(String nome, double preco, Data dataDeValidade){
        this.nome=nome;
        this.preco=preco;
        this.dataDeValidade=dataDeValidade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public Double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }

    public Data getDataDeValidade(){
        return dataDeValidade;
    }
    public void setDataDeValidade(Data dataDeValidade){
        this.dataDeValidade=dataDeValidade;
    }

    @Override
    public String toString(){
        return "Nome do Produto:  " +nome+
        "\nPreço do produto:  "  +preco;
        
    }
    public boolean estaVencido(Data dataDeValidade){

        if(dataDeValidade.getAno()<=2023){
            if(dataDeValidade.getAno()==2023 && dataDeValidade.getMes()>=10){
                if(dataDeValidade.getDia()>=20){
                    System.out.println("PRODUTO NÃO VENCIDO");
                    return false;
                }
                else{
                    System.out.println("PRODUTO VENCIDO");
                    return true;
                }
            }
            else{
                System.out.println("PRODUTO VENCIDO");
                return true;
            }
        }
        else{
            System.out.println("PRODUTO NÃO VENCIDO");
            return false;
        }


    }
    
}
