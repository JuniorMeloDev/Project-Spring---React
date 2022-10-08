package Aula06;

public class Exame {
    
    private int idExame;
    private String tipoExame;
    int nivelGlicose;
    
     
    public Exame(int idExame, String tipoExame, int nivelGlicose) {
        this.idExame = idExame;
        this.tipoExame = tipoExame;
        this.nivelGlicose = nivelGlicose;
    }
        
    public int getIdExame() {
        return idExame;
    }

      public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public int getNivelGlicose() {
        return nivelGlicose;
    }

    public void setNivelGlicose(int nivelGlicose) {
        this.nivelGlicose = nivelGlicose;
    }
    
    public String obterDiagnostico(){
        if( this.nivelGlicose <= 99) {
            return "normal";
        }
        else if (this.nivelGlicose <= 125) {
            return "Pré-Diabetes";
        }
        else {
            return "Diabetes";
        }
    }
    
    
}
