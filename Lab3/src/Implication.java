import java.util.ArrayList;
import java.util.LinkedList;

public final class Implication extends AbstractMultiOperation {

    public Implication(Expression leftArgument, Expression rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public String printExpresionSpecial() {
        return String.format("(->,%s,%s)", leftArgument.printExpresionSpecial(), rightArgument.printExpresionSpecial());
    }

    @Override
    public boolean isConst() {
        return false;
    }

    @Override
    public int getType() {
        return 1;
    }

    @Override
    public void getAllStrings(ArrayList<String> expr) {
        expr.add("(");
        leftArgument.getAllStrings(expr);
        expr.add("->");
        rightArgument.getAllStrings(expr);
        expr.add(")");
    }
}