package ma.education.tp1.introduction;

public class Test {
    public static void main(String[] args) {
        //Salle o1 = new Salle();
        Salle o2 = new Salle("Salle Informatique");
        Salle o3 = new Salle(2, "Salle des cours");
        //System.out.println("id de la salle: " + o1.id + " nom de salle: " + o1.nom);
        System.out.println("id de la salle: " + o2.id + " nom de salle: " + o2.nom);
        System.out.println("id de la salle: " + o3.id + " nom de salle: " + o3.nom);
    }
}
