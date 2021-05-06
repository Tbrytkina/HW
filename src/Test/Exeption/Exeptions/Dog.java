package Test.Exeption.Exeptions;

public class Dog {
    private String name;
    private boolean isCollarPutOn;
    private boolean isLeashPutOn;
    private boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isCollarPutOn() {
        return isCollarPutOn;
    }

    public boolean isLeashPutOn() {
        return isLeashPutOn;
    }

    public boolean isMuzzlePutOn() {
        return isMuzzlePutOn;
    }

    public void putCollarOn(){
        System.out.println("Collar is put on the dog!");
        this.isCollarPutOn = true;
    }

    public void putLeashOn(){
        System.out.println("Leash is put on the dog!");
        this.isLeashPutOn = true;
    }

    public void putMuzzleOn(){
        System.out.println("Muzzle is put on");
        this.isMuzzlePutOn = true;
    }
    public void walk() throws DogIsNotReadyException {
        if(isCollarPutOn && isLeashPutOn && isMuzzlePutOn){
            System.out.println("Hey, we are ready to walk");
        }else{
            throw new DogIsNotReadyException("Hey, your dog is not ready for a walk!!!");

        }
    }
}


