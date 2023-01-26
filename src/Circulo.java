public class Circulo {
    private float radio;
    private static final float PI = 3.14;

    public Circulo(Segment origenradio) {
        this.radio = origenradio;
    }

    public float calcularArea(float r) {
        float area = ((r * r) * PI);
        return area;
    }


    public Circulo(float r=1) {

    }

    public Circulo(float r) {

    }
    public float calcularLongitud(float r){

        float longitud = 2 * r * PI;
        return longitud;
    }

    public void setRadio(int nuevoradio) {
        radio = nuevoradio;
    }
    public float getRadio() {
        return radio;
    }
    float Circulo.calcularArea(float r){
        float radio = ((r * r) * PI);

    }
    float Circulo.calcularLongitud(float r){
        float longitud =  2 * r * PI;
        System.out.println("La longitud es: " + longitud);
    }
}