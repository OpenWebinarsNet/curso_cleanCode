package io.pello.patterns.behavioral.visitor;

public class VisitorClient {
    public static void main(final String[] args) {
        Army army = new Army();
		
        army.accept(new ArmyUnitBlessingVisitor());
        System.out.println(army.toString());
        
        army.accept(new ArmyUnitCurseVisitor());
        System.out.println(army.toString());
    }
}
