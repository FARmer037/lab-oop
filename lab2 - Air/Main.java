public class Main {
    public static void main(String[] args) {
        Air air1 = new Air();
        air1.setStatus("on");
        air1.setTemp(23);
        System.out.println("Status of Air 1 is " + air1.getStatus() + " || Temp of Air 1 is " + air1.getTemp());

        Air air2 = new Air("on", 24);
        System.out.println("Status of Air 2 is " + air2.getStatus() + " || Temp of Air 2 is " + air2.getTemp());

        air2.changeTemp('+');
        System.out.println("After change!");
        System.out.println("Status of Air 2 is " + air2.getStatus() + " || Temp of Air 2 is " + air2.getTemp());
    }
}