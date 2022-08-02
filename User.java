public class user {

  private String nom;

  private String prenom;

  private String email;

  private int age; 


  public void Personne(String nom, String prenom, String email, int age)
  {
    this.nom = nom;
    this.prenom = prenom;
    this.email = email;
    this.age = age;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = prenom + nom + "@gmail.com";
  }


  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age<0) {
            throw new IllegalArgumentException("Age is not allowed to be smaller than zero");
        }
        this.age = age;
      }
}
