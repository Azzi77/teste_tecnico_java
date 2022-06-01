public class Hospedagem {
    @Override
    public String toString() {
        return "Hospedagem{" +
                "diaria=" + diaria +
                '}';
    }

    double diaria;

    public Hospedagem(double diaria) {
        this.diaria = diaria;
    }

    public Hospedagem() {

    }

    public double getDiaria(double v) {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public void  printValor() {



    }
}
