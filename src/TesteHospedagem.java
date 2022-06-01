public class TesteHospedagem {
    public static void main(String[] args) {


        Hospedagem hospedagem = new Hospedagem();
        HospedagemVip hospedagemVip = new HospedagemVip();



        hospedagem.setDiaria(100.0);
        hospedagemVip.setDiaria(100.0);
        hospedagemVip.setValorAdicional(50.0);


        System.out.println(hospedagem.diaria);
        System.out.println(hospedagemVip.valorHospedagemVip());

    }
}
