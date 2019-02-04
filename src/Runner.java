public class Runner {
    public static void main(String[] args){
        Car emilaCar = new Car(2007, "Volkswagon", 0, "Passat");
        System.out.println(emilaCar.toString());
        emilaCar.setMiles(50);
        Rectangle kermitangle = new Rectangle(2, 17);
        System.out.println(kermitangle.getArea());
        System.out.println(kermitangle.getDiagonal());
        System.out.println(kermitangle.getLength());
        System.out.println(kermitangle.getWidth());
    }
}
