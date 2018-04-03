package CucumberTest.CucumberTest; 

import static org.junit.Assert.assertEquals;


import CucumberTest.CucumberTest.Animal;
import CucumberTest.CucumberTest.Clan;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 

public class ClanSteps { 
	
	private Animal animal;
	private Clan clan;
	private int refus;
	private int ancienNombre;
	
	@Given("^Un animal ayant (\\d+) et un clan ayant un (\\d+)$")
	public void Un_animal_ayant_et_un_clan_ayant_un(int arg1, int arg2) {
		 animal = new Animal("Hector");
		 animal.Enfanter(arg1);
		 clan = new Clan(arg2);
	}

	@When("^L'animal est élu chef du clan$")
	public void L_animal_est_élu_chef_du_clan() {
	    refus = clan.nouveauChef(animal);
	}

	@Then("^le (\\d+) doit être automatiquement calculé$")
	public void le_doit_être_automatiquement_calculé(int arg1) {
		assertEquals(arg1, clan.getNombreMembres() );
	}

	@Given("^Un animal ayant un nombre d'enfants à (\\d+) et un clan ayant un (\\d+)$")
	public void Un_animal_ayant_un_nombre_d_enfants_à_et_un_clan_ayant_un(int arg1, int arg2) {
		animal = new Animal("Hector");
	    animal.Enfanter(arg1);
	    clan = new Clan(arg2);
	    ancienNombre = arg2;
	}

	@Then("^le système refuse d'élir le chef et il y a un code à -(\\d+) et le (\\d+) ne change pas$")
	public void le_système_refuse_d_élir_le_chef_et_il_y_a_un_code_à_et_le_ne_change_pas(int arg1, int arg2) {
		assertEquals(-arg1, refus );
		assertEquals(arg2, clan.getNombreMembres() );
	}


}