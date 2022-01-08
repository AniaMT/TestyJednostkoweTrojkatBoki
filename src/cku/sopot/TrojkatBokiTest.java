package cku.sopot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrojkatBokiTest {

    @Test
    void bokAnieMozeBycUjemny() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(3, 4, 5);
        trojkatBoki.setBokA(-3);
        Assertions.assertEquals(3, trojkatBoki.getBokA());
    }

    @Test
    void bokBnieMozeBycUjemny() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(3, 4, 5);
        trojkatBoki.setBokB(-4);
        Assertions.assertEquals(4, trojkatBoki.getBokB());
    }

    @Test
    void bokCnieMozeBycUjemny() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(3, 4, 5);
        trojkatBoki.setBokC(-5);
        Assertions.assertEquals(5, trojkatBoki.getBokC());
    }

    @Test
    void wartoscWkonstruktorzeNieMozeBycUjemna() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(-3, -4, -5);
        Assertions.assertEquals(3, trojkatBoki.getBokA());
        Assertions.assertEquals(4, trojkatBoki.getBokB());
        Assertions.assertEquals(5, trojkatBoki.getBokC());
    }

    @Test
    void poprawneObliczeniObwodu() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(-3, -4, -5);
        Assertions.assertEquals(12, trojkatBoki.obliczObwod());
    }

    @Test
    void poprawneObliczeniPola() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(-3, -4, -5);
        Assertions.assertEquals(6, trojkatBoki.obliczPole());
    }
    @Test
    void trzeciBokNieMozeBycDluzszyOdDwochPozostalych(){
        TrojkatBoki trojkatBoki = new TrojkatBoki(3,4,8);
        Assertions.assertEquals(7, trojkatBoki.getBokC());

        TrojkatBoki trojkatBoki1 = new TrojkatBoki(3,8,4);
        Assertions.assertEquals(7, trojkatBoki1.getBokB());

        TrojkatBoki trojkatBoki2 = new TrojkatBoki(8,3,4);
        Assertions.assertEquals(7, trojkatBoki2.getBokA());

    }
}
