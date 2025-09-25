package Practice;

public class CmdCheck {
    public static void main(String[] args) {
        if(args.length>0){
            System.out.println(args[0]);
        }
        else{
            System.out.println("No arguments passed");
        }
    }   
}
