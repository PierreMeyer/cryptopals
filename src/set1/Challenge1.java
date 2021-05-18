package set1;

import org.junit.jupiter.api.Test;
import util.DataConverter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Set 1 Challenge 1: Convert Hex to Base64

    Tip: Always operate on raw bytes, never on encoded strings. Only use hex and base64 for pretty-printing
*/
public class Challenge1 {
    @Test
    public void testingHexToByteArrayFunctionWorksCorrectly() {
        String input = "7f0b";
        byte[] expectedOutput = {127, 11};
        assertArrayEquals(expectedOutput, DataConverter.hexToByteArray(input));
    }

    @Test
    public void testingByteArrayToBase64StringFunctionWorksCorrectly() {
        byte[] input = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        String expectedOutput = "AgQGCAoMDhASFA==";
        assertEquals(expectedOutput, DataConverter.byteArrayToBase64String(input));
    }

    @Test
    // Main test answering the challenge
    public void testingHexToBase64StringWorksCorrectly() {
        String input = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d";
        String expectedOutput = "SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t";
        assertEquals(expectedOutput, DataConverter.byteArrayToBase64String(DataConverter.hexToByteArray(input)));
    }
}
