import module java.base;

void main() {
    int[] notes={12, 15, 8, 10, 17};
    int total=0;

    for(int note : notes) {
        total+=note;
    }

    double moyenne=(double)total/notes.length;
    IO.println(String.format("Moyenne : %.2f", moyenne));
}
