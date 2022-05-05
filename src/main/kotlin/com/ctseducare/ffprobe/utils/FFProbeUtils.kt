package com.ctseducare.ffprobe.utils

import com.ctseducare.ffprobe.data.FFProbeResult
import com.google.gson.Gson
import java.io.*
import java.util.concurrent.TimeUnit

class FFProbeUtils {

  companion object {

    fun getDuration(video: String): Float {
      val file = File(video)
      if (!file.exists()) {
        throw FileNotFoundException("Video not found.")
      }

      var duration = 0.0f

      val cmd = "ffprobe -v quiet -print_format json -show_format -i '" + video + "'"

      try {
        val process: Process = Runtime.getRuntime().exec(arrayOf("/bin/bash", "-O", "extglob", "-c", cmd))
        process.waitFor(60, TimeUnit.MINUTES)
        var json = process.inputStream.bufferedReader().readText()
        val ffprobeResult: FFProbeResult = Gson().fromJson(json.toString(), FFProbeResult::class.java)
        duration = ffprobeResult.format.duration.toFloat()
      } catch (e: IOException) {
        throw IOException("Error: " + e.message);
      }

      return duration;
    }
  }

}
