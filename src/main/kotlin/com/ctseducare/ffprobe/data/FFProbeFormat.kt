package com.ctseducare.ffprobe.data;

data class FFProbeFormat(
  var filename: String,
  var nbStreams: Int,
  var nbPrograms: Int,
  var formatName: String,
  var formatLongName: String,
  var startTime: String,
  var duration: String,
  var size: String,
  var bitRate: String,
  var probeScore: Int,
  var tags: FFProbeTags
)
