package DesafioQuatro;

public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome+ ", idade: " + this.idade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade: " + this.habilidade);
        System.out.println("Especialidade: " + this.especialidade);
    }
}
