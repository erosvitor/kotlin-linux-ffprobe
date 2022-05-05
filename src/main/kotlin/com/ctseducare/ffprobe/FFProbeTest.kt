package com.ctseducare.ffprobe

import java.io.IOException

import com.ctseducare.ffprobe.utils.FFProbeUtils

fun main() {

  val path = "/home/eros-bornatowski/ffprobevideos/00001009_6.mp4"
  try {
    val duration = FFProbeUtils.getDuration(path)
    println(duration)
  } catch (e: IOException) {
    println(e.message)
  }

}
