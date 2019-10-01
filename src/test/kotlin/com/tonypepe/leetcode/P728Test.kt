package com.tonypepe.leetcode

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class P728Test {

    @Test
    fun selfDividingNumbers() {
        val p728 = P728()
        assertEquals(
            p728.selfDividingNumbers(1, 400),
            listOf(
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                11,
                12,
                15,
                22,
                24,
                33,
                36,
                44,
                48,
                55,
                66,
                77,
                88,
                99,
                111,
                112,
                115,
                122,
                124,
                126,
                128,
                132,
                135,
                144,
                155,
                162,
                168,
                175,
                184,
                212,
                216,
                222,
                224,
                244,
                248,
                264,
                288,
                312,
                315,
                324,
                333,
                336,
                366,
                384,
                396
            )
        )
    }
}
