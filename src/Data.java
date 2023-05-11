public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia,int mes, int ano){
        if(mes>0 && mes<13 && dia>0 && dia<=31){
            if(mes==4 || mes==6 || mes==9 || mes==11){ //MESES QUE SO VAI ATE O DIA 30
                if(dia<31){
                    this.dia=dia;
                    this.mes=mes;
                    this.ano=ano;
                }
                else{
                    System.out.println("Erro! Data inválida!");
                    this.dia=1;
                    this.mes=1;
                    this.ano=2000;
                }

            }
            else{
                if(mes==2){
                    if(dia<=29){
                        if(dia==29){
                            if(((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)){  //AQUI VERIFICA SE O ANO É BISSEXTO
                                this.dia=dia;
                                this.mes=mes;
                                this.ano=ano;
                            }
                            else{
                                System.out.println("Erro! Data inválida!");
                                this.dia=1;
                                this.mes=1;
                                this.ano=2000;
                            }
                            

                        }
                        else{
                            this.dia=dia;
                            this.mes=mes;
                            this.ano=ano;
                        }
                    }
                    else{
                        System.out.println("Erro! Data inválida!");
                        this.dia=1;
                        this.mes=1;
                        this.ano=2000;
                    }
                }
                else{
                    this.dia=dia;
                    this.mes=mes;
                    this.ano=ano;
                }

            }
        }
        else{
            System.out.println("Erro! Data inválida!");
            this.dia=1;
            this.mes=1;
            this.ano=2000;
        }
    }
        
    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia=dia;
    }

    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes=mes;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano=ano;
    }

    public String toString(){
        return dia+ "/"  +mes+  "/"  +ano;
    }

    public boolean verificaAnoBissexto(){
        if(((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)){
            return true;
        }
        else{
        return false;
        }
     } 

        
        

        
    }

