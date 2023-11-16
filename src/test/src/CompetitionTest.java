package test.src;

import main.Amateur;
import main.Competiteur;
import main.Competition;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class CompetitionTest {

    @Test
    void testAjouterCompetiteur() {
        Competition competition = new Competition();
        Competiteur competiteur = new Competiteur("Competiteur1", 70);
        competition.ajouterCompetiteur(competiteur);

        TreeSet<Competiteur> ensembleCompetiteurs = competition.getEnsembleCompetiteurs();
        assertTrue(ensembleCompetiteurs.contains(competiteur));
    }

    @Test
    void testAjouterAmateur() {
        Competition competition = new Competition();
        Amateur amateur = new Amateur("Amateur1", 50);
        competition.ajouterAmateur(amateur);

        ArrayList<Amateur> listeAmateurs = competition.getListeAmateurs();
        assertTrue(listeAmateurs.contains(amateur));
    }

    @Test
    void testSupprimerAmateur() {
        Competition competition = new Competition();
        Amateur amateur = new Amateur("Amateur1", 50);
        competition.ajouterAmateur(amateur);
        competition.supprimerAmateur(amateur);

        ArrayList<Amateur> listeAmateurs = competition.getListeAmateurs();
        assertFalse(listeAmateurs.contains(amateur));
    }

    @Test
    void testGetListeAmateurs() {
        Competition competition = new Competition();
        ArrayList<Amateur> listeAmateurs = competition.getListeAmateurs();
        assertNotNull(listeAmateurs);
        assertEquals(0, listeAmateurs.size());
    }

    @Test
    void testGetEnsembleCompetiteurs() {
        Competition competition = new Competition();
        TreeSet<Competiteur> ensembleCompetiteurs = competition.getEnsembleCompetiteurs();
        assertNotNull(ensembleCompetiteurs);
        assertEquals(0, ensembleCompetiteurs.size());
    }
    @Test
    void triecompetiteur() {

        Amateur amateur1 = new Amateur("Patrick", 25);
        Amateur amateur2 = new Amateur("Jean", 15);
        Amateur amateur3 = new Amateur("Stephanie", 70);
        Amateur amateur4 = new Amateur("Paul", 35);


        Competiteur competiteur1 = new Competiteur("Alice", 60);
        Competiteur competiteur2 = new Competiteur("Stephanie", 40);
        Competiteur competiteur3 = new Competiteur("Jean", 50);
        Competiteur competiteur4 = new Competiteur("Paul", 70);


        Competition competition = new Competition();
        competition.ajouterAmateur(amateur1);
        competition.ajouterAmateur(amateur2);
        competition.ajouterAmateur(amateur3);
        competition.ajouterAmateur(amateur4);

        competition.ajouterCompetiteur(competiteur1);
        competition.ajouterCompetiteur(competiteur2);
        competition.ajouterCompetiteur(competiteur3);
        competition.ajouterCompetiteur(competiteur4);


    }
}
