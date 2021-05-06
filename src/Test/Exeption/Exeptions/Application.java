package Test.Exeption.Exeptions;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog ("Rex");
        //dog.putCollarOn();
        dog.putMuzzleOn();
        dog.putLeashOn();

        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Check dog equipment! "
                    + "\r\n Is Collar put on? - " + dog.isCollarPutOn()
                    + "\r\n Is Lash put on? " + dog.isLeashPutOn()
                    + "\r\n Is Muzzle put on? " + dog.isMuzzlePutOn());
        }
    }
}
