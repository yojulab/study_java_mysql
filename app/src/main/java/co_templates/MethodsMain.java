package co_templates;

public class MethodsMain {
    public static void main(String[] args) {
        MethodsSubs subs = new MethodsSubs();
        // subs.methodsSubs();
        // subs.methodsSubsWithParams("cocolab", 5);
        int result = subs.methodsSubsWithParamsReturn(5, 6);
        return ;
    }
}
