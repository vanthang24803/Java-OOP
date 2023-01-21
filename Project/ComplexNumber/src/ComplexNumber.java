import java.util.Scanner;

public class ComplexNumber {
    Scanner sc = new Scanner(System.in);
    private double theRealPart;
    private double theImaginaryPart;

    public ComplexNumber(double theRealPart, double theImaginaryPart) {
        this.theRealPart = theRealPart;
        this.theImaginaryPart = theImaginaryPart;
    }

    public double getTheRealPart() {
        return theRealPart;
    }

    public void setTheRealPart(double theRealPart) {
        this.theRealPart = theRealPart;
    }

    public double getTheImaginaryPart() {
        return theImaginaryPart;
    }

    public void setTheImaginaryPart(double theImaginaryPart) {
        this.theImaginaryPart = theImaginaryPart;
    }


    public void Input() {
        System.out.println("Enter the real part :");
        double theRealPart = sc.nextDouble();
        System.out.println("Enter the imaginary part :");
        double theImaginaryPart = sc.nextDouble();
    }

    public void display() {
        System.out.println("Real part : " + theRealPart + " imaginary part : " + theImaginaryPart);
    }
}
