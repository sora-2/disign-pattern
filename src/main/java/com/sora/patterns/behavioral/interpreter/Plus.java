package com.sora.patterns.behavioral.interpreter;

public class Plus extends AbstractExpression{
    private AbstractExpression left;
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "Plus{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
