import hello_world.HelloWorld;
import keywords_explained.KeywordsExplained;
import variables.Variables;

public class Main {
    public static void main(String[] args) {
//        #1 - Hello World.
        new HelloWorld();

//        #2 - Keywords Explained
        new KeywordsExplained();

//        #3 - Variables
        Variables variables = new Variables();
        variables.name();
        variables.age();
    }
}