package com.sora.patterns.behavioral.interpreter;

public class Client {
    public static void main(String[] args) {

        Context context = new Context();

        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        context.add(a,1);
        context.add(b,2);
        context.add(c,3);
        context.add(d,4);

        AbstractExpression abstractExpression = new Minus(a,new Plus(new Minus(b,c),d));

        int interpret = abstractExpression.interpret(context);
        System.out.println(abstractExpression + " " +interpret);

    }
}
