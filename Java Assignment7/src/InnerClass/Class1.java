package InnerClass;

public class Class1 {
    public class innerClass{
        private int variable;
        innerClass(int argument){
            this.variable = argument;
        }
        public class inheritedclass extends innerClass{

            inheritedclass(int argument) {
                super(argument);
            }
        }
    }


}
