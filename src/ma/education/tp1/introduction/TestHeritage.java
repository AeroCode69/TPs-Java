package ma.education.tp1.introduction;

public class TestHeritage {
    Salle s1 = new SalleCours(1L, "Salle 1", (byte) 20);
    SalleCours s2= new SalleCours(2L, "Salle 2", (byte) 20);
    //ERROR: l'objet 1 est instancié comme Salle(Class mére) est essayant initialiser une class enfant
    //SalleCours s3 = s1;
    SalleCours s3 = (SalleCours) s1;
    SalleCours s4 = s2;
    Salle s5 = new Laboratoire(2, "LABO", "CHIMIE");
    SalleCours s6= new SalleCours(2L, "Salle 2", (byte) 20);
    //L'objet s5 est de type Laboratoire et en essayant de initialiser un object s7 de type SalleCours
    //C'est pas possible d'utilier le cast car le constructeur de SalleCours accept diff parametres que ceux de Laboratoire
    //SalleCours s7= (SalleCours) s5;
    SalleCours s8=s6;
}
