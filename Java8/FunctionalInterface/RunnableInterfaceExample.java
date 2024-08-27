package Java8.FunctionalInterface;

public class RunnableInterfaceExample {
    public static void main(String[] args) {
//---------------------------------------------------------------------------
//       LEGACY WAY / Imperative Approach for working with Runnable Interface
//---------------------------------------------------------------------------
        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable1");
            }
        };
        new Thread(runnable1).start();
//---------------------------------------------------------------------------

//---------------------------------------------------------------------------
//      Declarative [java_8] Approach_1
//        curly braces {} needed when passing multiple statements
//---------------------------------------------------------------------------
        Runnable runnable2=()->{
            System.out.println("Inside runnable2");
            System.out.println("Inside runnable2");
        };
        new Thread(runnable2).start();
//--------------------------------------------------------------------------

//---------------------------------------------------------------------------
//      Declarative [java_8] Approach_2
//        NO NEED TO USE { } braces when single statement
//---------------------------------------------------------------------------
        Runnable runnable3=()-> System.out.println("Inside runnable3");
        new Thread(runnable3).start();
//---------------------------------------------------------------------------
//      Imperative way of using Runnable Interface
//---------------------------------------------------------------------------
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable runs inside Thread in Imperative way");
            }
        }).start();
//---------------------------------------------------------------------------
//     [java_8] Declarative way of using Runnable Interface
//---------------------------------------------------------------------------
        new Thread(()-> System.out.println("Inside runnable")).start();
    }
}
