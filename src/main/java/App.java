
public class App {    //class container
    public class AppI{    //inner. use rarely

    }

    public static class AppN{  //static makes nested class

    }
    public static void main(String[] args){
        App.AppN m = new App.AppN();


        App n = new App();
        App.AppI ni = n.new AppI();
    }
}
