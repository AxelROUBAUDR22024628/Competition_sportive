package main;



public class Main {
    public static void main(String[] args) {

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


        System.out.println("Détails de la compétition :");
        System.out.println(competition);

        amateur1.setScore(55);

        System.out.println("Détails de la compétition après la modification du score :" );
        System.out.println(competition);

        competition.supprimerAmateur(amateur2);

        System.out.println("Détails de la compétition après la suppression d'un amateur :");
        System.out.println(competition);
    }
}
