import user.Personne;
import junit.framework.TestCase; 

public class userTest extends TestCase
{ 
    private static Personne user = new Personne();

#test Email

    public void testEmail()
    { 
         email = "username@domain.com";
         assertTrue(EmailValidator.getEmail()
            .isValid(email));
    }

#test Nom 

  public void testGetNom() {
    assertEquals("Le nom est incorrect", "nom", personne.getNom());
  }

#test Prenom 

public void testGetPrenom() {
    assertEquals("Le prenom est incorrect", "prenom", personne.getPrenom());
  }

#test Age


        public void testIfAgeIsGreaterThan(){
            assertTrue(personne.getAge()>30);
        }
}