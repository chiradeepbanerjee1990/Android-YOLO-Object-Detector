package com.chiradeep.yolo.detection

import ai.onnxruntime.OrtEnvironment
import ai.onnxruntime.OrtSession
import android.content.Context

class ObjectDetector() {

    private var ortEnv: OrtEnvironment = OrtEnvironment.getEnvironment()
    private lateinit var session: OrtSession

    fun initializeModel(modelPath: String, context:Context) {
        val modelBytes = context.assets.open("yolov8n.pt").readBytes()
        val sessionOptions = OrtSession.SessionOptions()
        session = ortEnv.createSession(modelBytes, sessionOptions)
    }
}