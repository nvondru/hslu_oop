package ch.hslu;

public class Temperature {
    private float kelvin;

    public Temperature(){
    }

    public Temperature(float kelvin) {
        this.setKelvin(kelvin);
    }

    public void setKelvin(float kelvin) {
        if (kelvin >= 0.00f && kelvin <= 500.00f){
            this.kelvin = kelvin;
        }else{
            System.out.println("Temperature not in range! Nothing changed.");
        }
    }

    public float getCelsius() {
        return kelvin - 273.15f;
    }

    public float getKelvin(){
        return kelvin;
    }

    public float getFahrenheit(){
        return this.getCelsius() * 1.80f + 32.00f;
    }

    public void addKelvin(float kelvin){
        this.setKelvin(this.getKelvin() + kelvin);
    }




}
