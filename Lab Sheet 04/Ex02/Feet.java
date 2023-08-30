//Follow me on github for more https://github.com/Scar1109

package Ex02;

class Feet {
    private int feet;
    private int inches;

    public Feet(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void add(Feet f1, Feet f2) {
        this.feet = f1.feet + f2.feet;
        this.inches = f1.inches + f2.inches;

        if (this.inches >= 12) {
            this.feet += this.inches / 12;
            this.inches %= 12;
        }

    }

    public void print() {
        System.out.println(this.feet + "'" + this.inches + "\"");
    }

    public void print(String msg) {
        System.out.println(msg + this.feet + "'" + this.inches + "\"");
    }

    public Feet(Feet feet) {
        this.feet = feet.feet;
        this.inches = feet.inches;
    }

    public void add(Feet f1) {
        if (this.inches + f1.inches >= 12) {
            this.feet += f1.feet + 1;
            this.inches += f1.inches - 1;
        } else {
            this.feet += f1.feet;
            this.inches += f1.inches;
        }
    }

    public static void print(Feet f) {
        System.out.println(f.feet + "'" + f.inches + "\"");
    }

    public static Feet add(Feet f1, Feet f2, Feet f3) {

        int totalFeets = f1.feet + f2.feet + f3.feet;
        int totalInches = f1.inches + f2.inches + f3.inches;

        if (totalInches >= 12) {
            totalFeets += totalInches / 12;
            totalInches %= 12;
        }

        return new Feet(totalFeets, totalInches);
    }

}