public class MotorFabrik
{
  private   Dialog dialog = new Dansk();
    private Input input = new Input();

    public void setDialog(Dialog dialog) {

        this.dialog = dialog;

    }

    public void setDialog()
    {
        switch (input.getString("select language")) {

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

    public Motor lavMotor() {

        switch (input.getString(dialog.selectMoter())) {

            case "el":
                return new ElMotor();
            case "be":
                return new Benzin();
            case "di":
                return new Diesel();
            default:
                return new Benzin();
        }








    }

}
