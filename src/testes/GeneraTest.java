package testes;

public class GeneraTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String hello="hello world";
String sub="";
boolean etat;
etat=sub.isEmpty(); // nomChaine.isEmpty => la verification si chaine est vide
System.out.println(etat);
sub=hello.substring(0,5); // de i=0=> i=5
etat=sub.isEmpty(); // nomChaine.isEmpty => la verification si chaine est vide
System.out.println(etat);
System.out.println(sub);
System.out.println("la longueur de la chaine est: "+hello.length()); //longueur de chaine
System.out.println("la longueur de la sous chaine est: "+sub.length());
int oc=sub.indexOf("l"); // recherche du premier indice d'un caractére
System.out.println("la premiére position de l dans hello est "+oc);
int oc2=sub.lastIndexOf("l"); //recherche du dernier indice
System.out.println("la dérniére position de l dans hello est "+oc2);
int tc=sub.indexOf("@");
System.out.println("l'indice de @ dans hello"+tc); //-1 si indice n'existe pas
boolean verif=hello.contains(sub); //verifier l'existance d'une chaine dans l'autre
boolean verif2=hello.contains("cordialement");
System.out.println(verif);
System.out.println(verif2);
	}

}
