package ExercicioAeronave;

public class CompanhiaAerea {
    
    private int idManutencao;
    private String razaoSocial;

    public CompanhiaAerea(int idManutencao, String razaoSocial) {
        this.idManutencao = idManutencao;
        this.razaoSocial = razaoSocial;
    }

    public int getIdManutencao() {
        return idManutencao;
    }

      public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    
    
}
