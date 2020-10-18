package ch.hslu.sw_05.switchable;

/**
 * Interface which enforces a method that returns an int value, representing the amount of times an object was switched.
 * Specialization of the "Switchable" interface.
 * @author Nicolas Vondru
 * @version 1.0
 * @since 18.10.2020
 * @see ch.hslu.sw_05.switchable.Switchable
 */

// wie schreibe ich JavaDoc für Interfaces? Soll der Sinn der Methode beschrieben werden?
// Was die Methode effektiv macht ist ja dann von der Implemntierung in der entsprechenden Klasse abhängig.
// Prinzipiell kann dann die Methode ja auch die Anzahl Äpfel an meinem Apfelbaum zurückgeben?!? Dann wäre die Doku wieder falsch.
// Aber dass die Methode einen int-Wert returned muss ich ja auch nicht hinschreiben, das sieht man an der Methoden-Signatur?!
public interface CountingSwitchable extends Switchable{

    long getSwitchCount();

}
