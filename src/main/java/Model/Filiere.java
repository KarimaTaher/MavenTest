package Model;

public class Filiere {
    private String  nom;
    private String responsable;

    public Filiere(String nom, String responsable) {
        this.nom = nom;
        this.responsable = responsable;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
