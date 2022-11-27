package algoFinal;

import static org.junit.jupiter.api.Assertions.*;

class examAlgoTest {

    @org.junit.jupiter.api.Test
    void testAlgo(){
        String s = "abbc";
        examAlgo test = new examAlgo();
        assertEquals(false,examAlgo.giveMeAnswer(s));
    }

    @org.junit.jupiter.api.Test
    void main() {}
}