package main;

import java.util.ArrayList;
import java.util.TreeSet;

public class Competition {
    private final ArrayList<Amateur> listeAmateurs;
    private final TreeSet<Competiteur> ensembleCompetiteurs;

    public Competition() {
        this.listeAmateurs = new ArrayList<>();
        this.ensembleCompetiteurs = new TreeSet<>();
    }

    public void ajouterCompetiteur(Competiteur competiteur) {
        ensembleCompetiteurs.add(competiteur);
    }

    public void ajouterAmateur(Amateur amateur) {
        listeAmateurs.add(amateur);
    }

    public void supprimerAmateur(Amateur amateur) {
        listeAmateurs.remove(amateur);
    }

    public ArrayList<Amateur> getListeAmateurs() {
        return listeAmateurs;
    }

    public TreeSet<Competiteur> getEnsembleCompetiteurs() {
        return ensembleCompetiteurs;
    }


    @Override
    public String toString() {
        return "main.Competition{" +"\n" +
                "listeAmateurs=" + listeAmateurs + "\n" +
                ", ensembleCompetiteurs=" + ensembleCompetiteurs +
                '}';
    }
}
