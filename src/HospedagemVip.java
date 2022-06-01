public class HospedagemVip extends Hospedagem{

    double valorAdicional;

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        char c = '}';
        return "HospedagemVip{" +
                "valorAdicional=" + valorAdicional +
                '}';
    }

    public HospedagemVip() {

    }

    public double valorHospedagemVip (){
        return getDiaria(100.0) + valorAdicional;

    }
}
