package zelenov.patterns.structurial.bridge;

import java.util.Arrays;

public class ProgramClient {

    public static void main(String[] args) {
        Program[] programs= {new BankSystem(new JavaDeveloper()), new StockExchange(new CppDeveloper())};
        Arrays.stream(programs).forEach(program -> program.developProgram());
    }


}
