package main;

public class Competiteur extends Participant implements Comparable<Competiteur>{


    public Competiteur(String nom, int score) {
        super(nom, score);
    }

    @Override
    public String toString() {
        return "Competiteur{" +
                "Nom = " + getNom() + '\'' +
                ",Score" + getScore() +
                '}';
    }


    @Override
    public int compareTo(Competiteur o) {
        return o.getScore()- this.getScore();
    }
}
