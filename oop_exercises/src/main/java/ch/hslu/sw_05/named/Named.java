package ch.hslu.sw_05.named;

/**
 * Provides an interface for setting and getting a name.
 * @author Nicolas Vondru
 * @version 1.0
 * @since 18.10.2020
 */
public interface Named {
    /**
     * Sets a name.
     * @param name
     */
    void setName(String name);

    /**
     * Returns the name.
     * @return Name of the object.
     */
    String getName();
}
