public class Main
{
    public static void main(String[] args)
    {

        Input input = new Input();
        Dialog dialog = new Dansk();


        MotorFabrik motorFabrik = new MotorFabrik();

        Bil bil = new Bil(1100, "mazda old", new Benzin());

        System.out.println(bil.motor.lyd());

        while (true) {

            if (input.getString("change language ?").equals("y")) {

                switch (input.getString("select langugae")) {

                    case "da":
                        dialog = new Dansk();
                    break;
                    case "eng":
                        dialog = new Engelsk();
                        break;
                    default:
                        dialog = new Dansk();
                }

            }

            motorFabrik.setDialog(dialog);

            bil.motor = motorFabrik.lavMotor();

            System.out.println(bil.motor.lyd());

           if(input.getString(dialog.quit()).equals("y")) {
               break;
           }

        }


    }
}