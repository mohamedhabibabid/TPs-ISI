import module java.base;

void main() {
    double rayon=4.5;
    double perimetre=2*Math.PI*rayon;
    double aire=Math.PI*rayon*rayon;

    IO.println(String.format("Rayon : %.2f", rayon));
    IO.println(String.format("Perimetre : %.2f", perimetre));
    IO.println(String.format("Aire : %.2f", aire));
}
