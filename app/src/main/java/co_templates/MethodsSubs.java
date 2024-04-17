package co_templates;

public class MethodsSubs {
    public void MethodsSubs(){
        System.out.println("MethodsSubs - MethodsSubs()");
    }
    // 접근자 리턴 메소드이름(파라메터){
    //      return 0;
    // }
    public void methodsSubs(){
        System.out.println("MethodsSubs - methodsSubs()");
    }

    // with params
    public void methodsSubsWithParams(String fname, int count){
        System.out.println("MethodsSubs - methodsSubsWithParams(String fname) ");
        System.out.println("parmas : fname-"+fname);
        return ;
    }

    // with params
    public int methodsSubsWithParamsReturn(int firstNumber, int secondNumber){
        System.out.println("MethodsSubs - methodsSubsWithParamsReturn(int firstNumber, int secondNumber) ");
        System.out.println("parmas : firstNumber-"+firstNumber+", secondNumber-"+secondNumber);
        int resultNumber = firstNumber + secondNumber;
        return resultNumber;
    }
}
