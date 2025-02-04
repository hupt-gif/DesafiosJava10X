package DesafioQuatro;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(this.nome + ", "+ this.idade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(this.habilidade);
    }
}
