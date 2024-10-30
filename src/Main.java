
interface Ingredient{
    public void getName(String i);
    public void getQuantity(double q);

}

class SolidIngredient implements Ingredient{
    private String _ingredient;
    private double _quantity;
    public SolidIngredient( String i, double q){
        _ingredient = i;
        _quantity = q;
    }
    public String getName(){
        return _ingredient;
    }
    public double getQuanity(){
        return  _quantity;
    }

}


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}