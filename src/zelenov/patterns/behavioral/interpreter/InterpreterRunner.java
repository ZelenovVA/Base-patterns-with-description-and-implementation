package zelenov.patterns.behavioral.interpreter;

public class InterpreterRunner {

    public static void main(String[] args) {

        Expression isJavaDeveloper=getJavaExpression();
        Expression isJavaEEDeveloper=getJavaEEExpression();

        System.out.println("Does developer know java core: "+isJavaDeveloper.interpret("java"));
        System.out.println("Does developer know java EE: "+isJavaEEDeveloper.interpret("java Spring"));

    }
    public static Expression getJavaExpression(){
        Expression java=new TerminalExpression("java");
        Expression javaCore=new TerminalExpression("Java core");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression(){
        Expression java=new TerminalExpression("java");
        Expression spring=new TerminalExpression("Spring");
        return new OrExpression(java, spring);
    }
}
