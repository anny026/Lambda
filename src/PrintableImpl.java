import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class PrintableImpl implements Printable {
    Printable printable;


    public static void ChangePrint() {
        interface Printable {
            void print(String x,String y);
        }
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        return 0;
    }
    ;
}
