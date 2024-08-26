public class Aluno {
    private String nome;
    private String curso;
    private String disciplina;
    private int bimestre;
    private String nota;

    //constroe a classe
    public  Aluno(String nome, String curso){
        this.nome = nome;
        this.curso = curso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return this.curso;      
    }

    public void setDisciplina(String Disciplina){
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return this.disciplina;      
    }

    public void setBimestre(String bimestre){
        this.bimestre = bimestre;
    }
    public int getBimestre(){
        return this.bimestre;      
    }

    public void setnota(String nota){
        this.nota = nota;
    }
    public String getNota(){
        return this.nota;      
    }
}

