package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
  @author   Olha
  @project   lab2
  @class  UtilTest
  @version  1.0.0 
  @since 15.02.2024 - 19.21
*/


class UtilTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void convertRomanToArabic() {
    }


    @Test
    public void convert_1_ToArabic_I() {
        assertEquals(1, Util.convertRomanToArabic("I"));
    }

    @Test
    public void convert_5_ToArabic_V() {
        assertEquals(5, Util.convertRomanToArabic("V"));
    }

    @Test
    public void convert_10_ToArabic_X() {
        assertEquals(10, Util.convertRomanToArabic("X"));
    }

    @Test
    public void convert_50_ToArabic_L() {
        assertEquals(50, Util.convertRomanToArabic("L"));
    }

    @Test
    public void convert_100_ToArabic_C() {
        assertEquals(100, Util.convertRomanToArabic("C"));
    }

    @Test
    public void convert_500_ToArabic_D() {
        assertEquals(500, Util.convertRomanToArabic("D"));
    }

    @Test
    public void convert_1000_ToArabic_M() {
        assertEquals(1000, Util.convertRomanToArabic("M"));
    }


    @Test
    public void convert_4_ToArabic_IV() {
        assertEquals(4, Util.convertRomanToArabic("IV"));
    }

    @Test
    public void convert_9_ToArabic_IX() {
        assertEquals(9, Util.convertRomanToArabic("IX"));
    }

    @Test
    public void convert_40_ToArabic_XL() {
        assertEquals(40, Util.convertRomanToArabic("XL"));
    }

    @Test
    public void convert_90_ToArabic_XC() {
        assertEquals(90, Util.convertRomanToArabic("XC"));
    }

    @Test
    public void convert_400_ToArabic_CD() {
        assertEquals(400, Util.convertRomanToArabic("CD"));
    }

    @Test
    public void convert_900_ToArabic_CM() {
        assertEquals(900, Util.convertRomanToArabic("CM"));
    }


    @Test
    public void convert_621_ToArabic_DCXXI() {
        assertEquals(621, Util.convertRomanToArabic("DCXXI"));
    }



    @Test
    public void convert_3999_ToArabic_MMMCMXCIX() {
        assertEquals(3999, Util.convertRomanToArabic("MMMCMXCIX"));
    }

    @Test
    public void convert_399_ToArabic_CCCXCIX() {
        assertEquals(399, Util.convertRomanToArabic("CCCXCIX"));
    }

    @Test
    public void convert_86_ToArabic_LXXXVI() {
        assertEquals(86, Util.convertRomanToArabic("LXXXVI"));
    }

    @Test
    public void convert_2018_ToArabic_MMXVIII() {
        assertEquals(2018, Util.convertRomanToArabic("MMXVIII"));
    }



    @Test
    public void convert_37_ToArabic_XXXVII() {
        assertEquals(37, Util.convertRomanToArabic("XXXVII"));
    }

    @Test
    public void convert_74_ToArabic_LXXIV() {
        assertEquals(74, Util.convertRomanToArabic("LXXIV"));
    }

    @Test
    public void convert_133_ToArabic_CXXXIII() {
        assertEquals(133, Util.convertRomanToArabic("CXXXIII"));
    }

    @Test
    public void convert_268_ToArabic_CCLXVIII() {
        assertEquals(268, Util.convertRomanToArabic("CCLXVIII"));
    }

    @Test
    public void convert_499_ToArabic_CDXCIX() {
        assertEquals(499, Util.convertRomanToArabic("CDXCIX"));
    }

    @Test
    public void convert_555_ToArabic_DLIV() {
        assertEquals(554, Util.convertRomanToArabic("DLIV"));
    }

    @Test
    public void convert_777_ToArabic_DCCLXXVII() {
        assertEquals(777, Util.convertRomanToArabic("DCCLXXVII"));
    }

    @Test
    public void convert_888_ToArabic_DCCCLXXXVIII() {
        assertEquals(888, Util.convertRomanToArabic("DCCCLXXXVIII"));
    }

    @Test
    public void convert_911_ToArabic_CMXI() {
        assertEquals(911, Util.convertRomanToArabic("CMXI"));
    }



    @Test
    public void convert_1492_ToArabic_MCDXCII() {
        assertEquals(1492, Util.convertRomanToArabic("MCDXCII"));
    }



    @Test
    public void convert_2999_ToArabic_MMCMXCIX() {
        assertEquals(2999, Util.convertRomanToArabic("MMCMXCIX"));
    }

    @Test
    public void convert_3888_ToArabic_MMMDCCCLXXXVIII() {
        assertEquals(3888, Util.convertRomanToArabic("MMMDCCCLXXXVIII"));
    }

    @Test
    public void convert_207_ToArabic_CCVII() {
        assertEquals(207, Util.convertRomanToArabic("CCVII"));
    }

    @Test
    public void convert_333_ToArabic_CCCXXXIII() {
        assertEquals(333, Util.convertRomanToArabic("CCCXXXIII"));
    }



    @Test
    public void convert_2022_ToArabic_MMXXII() {
        assertEquals(2022, Util.convertRomanToArabic("MMXXII"));
    }

    @Test
    public void convert_950_ToArabic_CML() {
        assertEquals(950, Util.convertRomanToArabic("CML"));
    }

    @Test
    public void convert_1750_ToArabic_MDCCL() {
        assertEquals(1750, Util.convertRomanToArabic("MDCCL"));
    }

    @Test
    public void convert_369_ToArabic_CCCLXIX() {
        assertEquals(369, Util.convertRomanToArabic("CCCLXIX"));
    }






    //----------
    @Test
    public void сonvertToArabic_EmptyString() {
        assertThrows(IllegalArgumentException.class, () -> {
            Util.convertRomanToArabic("");
        });
    }

    @Test
    public void сonvertToArabic_NullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            Util.convertRomanToArabic(null);
        });
    }

    @Test
    public void сonvertToArabic_InvalidRomanNumeral() {
        assertThrows(IllegalArgumentException.class, () -> {
            Util.convertRomanToArabic("INVALID");
        });
    }
}