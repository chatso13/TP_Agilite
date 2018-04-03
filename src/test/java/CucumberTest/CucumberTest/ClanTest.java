package CucumberTest.CucumberTest;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;
import CucumberTest.CucumberTest.Animal;
import CucumberTest.CucumberTest.Clan;
import CucumberTest.CucumberTest.Pays;
import junit.framework.TestCase;

/**
 * Classe-test ClanTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */

@RunWith(Cucumber.class)
public class ClanTest extends TestCase
{
    private Animal lion;
    private Clan savane;

    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    
    

    /**
     * Constructeur de la classe-test ClanTest
     */
    public ClanTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        lion = new Animal("Hector");
        lion.Enfanter(2);
        lion.Enfanter(3);
        savane = new Clan(100);
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void TestClan()
    {
    		assertEquals(106, savane.nouveauChef(lion));
    }

    @Test
	public void testInstallation() {
		Pays montagneLand = new Pays("MontagneLand");
		assertEquals("MontagneLand", savane.installation(montagneLand).getNom());
	}
}

