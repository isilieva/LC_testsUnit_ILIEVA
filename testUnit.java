import user.Personne;
import junit.framework.TestCase; 

@Test
public class userTest extends TestCase
{ 
    private static Personne user = new Personne();

/* #test Email */
@Test
public void testEmail()
    { 
         email = "username@domain.com";
         assertTrue(EmailValidator.getEmail()
            .isValid(email));
    }

/*test Nom*/
@Test
  public void testGetNom() {
    assertEquals("Le nom est incorrect", "nom", user.getNom());
  }

/*#test Prenom*/
 
@Test
public void testGetPrenom() {
    assertEquals("Le prenom est incorrect", "prenom", user.getPrenom());
  }

/* #test Age */

@Test
        public void testIfAgeIsGreaterThan(){
            assertTrue(user.getAge()>30);
        }
}