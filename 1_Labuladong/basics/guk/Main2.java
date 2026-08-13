//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int a = 10;
        System.out.printf("Hello and welcome!\n");
        // System.out.printf() is used to print output using
        // format specifiers liek %d %f
        System.out.printf("hello bruh %d\n",a);
//        try{
//            System.out.print("hello ngs %d",a);
//        }
//        catch (Exception e)
//        {
//            System.out.println("Error!");
//        }
        //tried to catch print(string,int) error but
        // forgot its a compile time error
        //and not runtime error
        //NOTE: try-catch used only for runtime errors

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

