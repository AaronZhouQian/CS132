package vaportree;

import vaporprintvisitor.PrinterVisitor;

/**
 * Created by Aaron on 10/28/16.
 */
public class Instr {
    public void accept(PrinterVisitor visitor)
    {
        visitor.visit(this);
    }

}



















