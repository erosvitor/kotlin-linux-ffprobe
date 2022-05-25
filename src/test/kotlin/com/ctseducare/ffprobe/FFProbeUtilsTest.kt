package com.ctseducare.ffprobe

import com.ctseducare.ffprobe.utils.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FFProbeUtilsTest() {

    @Test
    fun getDuration() {
        val path = "/home/eros-bornatowski/ffprobevideos/00001009_6.mp4"
        assertEquals(14.9, FFProbeUtils.getDuration(path))
    }
}
