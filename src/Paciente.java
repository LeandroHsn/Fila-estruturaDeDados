public class Paciente {
    
    private String nome;
    private String dataNascimento;
    private String sintoma;
    private String prioridade;

    public Paciente(String nome, String prioridade, String sintoma, String dataNascimento) {
        this.nome = nome;
        this.prioridade = prioridade;
        this.dataNascimento = dataNascimento;
        this.sintoma = sintoma;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSintoma() {
        return this.sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", prioridade='" + getPrioridade() + "'" +
            ", dataNascimento='" + getSintoma() + "'" +
            ", sintoma='" + getDataNascimento() + "'" +
            "}";
    }
}
