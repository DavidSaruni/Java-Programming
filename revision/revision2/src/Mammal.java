public class Mammal {
    protected int heartRate;
    protected int respirationRate;
    protected String bloodGroup;

    static int eyes = 2;
    String foodType;
    int chewTime;

    Mammal () {
        System.out.println("I am an Animal");
    }

    public void setHeartRate (int heartRate) {
        this.heartRate = heartRate;
    }

    public void setRespirationRate (int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public void setBloodGroup (String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    int getHeartRate() {
        return heartRate;
    }

    int getRespirationRate() {
        return respirationRate;
    }

    String getBloodGroup() {
        return bloodGroup;
    }

    public String eat_method (String foodType, String chewType, int chewTime) {
        String response ="I eat "+ foodType+ " by " + chewType + "for "+ chewTime +" minutes";
        return response;
    }

    static class Cow extends Mammal {

        int chewCycles;

        Cow () {
            System.out.println(" ... and also a Cow! ");
        }

        private String eat_method (String foodType, String chewType, int chewTime, int chewCycles) {
            String response = "I eat "+ foodType+ " by " + chewType + "for "+ chewTime + " in " + chewCycles;
            return response;
        }

    }
    // inherit from
    class Dog extends Mammal {

        Dog () {
            System.out.println(" ... and also a Dog! ");
        }

        public String eat_method (String foodType, String chewType, int chewTime) {
            String response = "I swallow "+ foodType+ " without chewing!";
            return response;
        }
    }

    class Main {
        public static void main(String[] args) {
            Cow freshian = new Cow();

            freshian.heartRate = 72;
            freshian.respirationRate = 100;
            freshian.bloodGroup = "A";

            System.out.println("Heart Rate " + freshian.heartRate);
            System.out.println("Heart Rate " + freshian.respirationRate);
            System.out.println("Heart Rate " + freshian.bloodGroup);
        }
    }
}
