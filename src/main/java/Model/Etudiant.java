package Model;

public class Etudiant {
    private String CNE;
    private String nom;
    private String prenom;
    private String email;
    private String phone;

    public Etudiant(String nom , String prenom , String email , String phone ,String CNE) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
        this.CNE = CNE;
        }

    //GETTERS
    public String getNom() {
        return nom;
    }

    public String getCNE() {
        return CNE;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPrenom() {
        return prenom;
    }
    //SETTERS


    public void setCNE(String CNE) {
        this.CNE = CNE;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
