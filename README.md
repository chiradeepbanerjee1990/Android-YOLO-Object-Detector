# Android-YOLO-Object-Detector

An Android application for real-time object detection using YOLOv5 and ONNX Runtime. This project demonstrates how to run on-device AI models in Android apps for efficient, low-latency inference without relying on cloud services.

---

## 📸 Features

- 🚀 Real-time object detection with YOLOv5 (ONNX format)
- 📦 On-device AI inference (no internet required)
- 📷 Live camera feed integration using CameraX
- 🎯 Dynamic bounding boxes with class labels
- 🏗️ Modular codebase for future AI model integration

---

## 🏗️ Tech Stack

| Component         | Technology                             |
|-------------------|----------------------------------------|
| Programming Lang  | Kotlin                                 |
| AI Framework      | ONNX Runtime for Android                |
| Model             | YOLOv5s (ONNX format, pretrained on COCO dataset) |
| Camera API        | CameraX                                 |
| App Architecture  | MVVM (recommended, can extend later)    |

---

## 🚀 Setup Instructions

### 1️⃣ Clone the Repository

git clone https://github.com/your-username/Android-YOLO-Object-Detector.git


### 2️⃣ Open in Android Studio

Use Android Studio Flamingo or newer for full compatibility.

---

### 3️⃣ Add YOLOv5 Model

- Download YOLOv5s ONNX model:  
  https://github.com/ultralytics/yolov5/releases/download/v6.2/yolov5s.onnx
- Place the model in:
  app/src/main/assets/

---

### 4️⃣ Add ONNX Runtime AAR

- Download ONNX Runtime AAR file:  
  https://github.com/microsoft/onnxruntime-inference-examples/tree/main/mobile/examples/helloworld/android/app/libs
- Place it in:
  app/libs/
- Add the following in build.gradle:

### 2️⃣ Open in Android Studio

Use Android Studio Flamingo or newer for full compatibility.

---

### 3️⃣ Add YOLOv5 Model

- Download YOLOv5s ONNX model:  
  https://github.com/ultralytics/yolov5/releases/download/v6.2/yolov5s.onnx
- Place the model in:
  app/src/main/assets/

---

### 4️⃣ Add ONNX Runtime AAR

- Download ONNX Runtime AAR file:  
  https://github.com/microsoft/onnxruntime-inference-examples/tree/main/mobile/examples/helloworld/android/app/libs
- Place it in:
  app/libs/
- Add the following in build.gradle:

---

### 5️⃣ Build & Run

- Grant Camera permissions when prompted.
- Start detecting objects live!

---

## 🧩 Project Structure

📂 app  
 ├── 📂 assets  
 │    └── yolov5s.onnx  
 ├── 📂 libs  
 │    └── onnxruntime-mobile.aar  
 ├── 📂 java  
 │    ├── MainActivity.kt (Camera + Inference Loop)  
 │    ├── ObjectDetector.kt (ONNX Model Logic)  
 │    ├── OverlayView.kt (Bounding Boxes)  
 │    └── utils.kt (Helper functions)  
 ├── 📂 res  
 │    └── layout, values, etc.  
 ├── AndroidManifest.xml  
 └── build.gradle

---

## 🎯 How It Works

1️⃣ Capture frames via CameraX  
2️⃣ Preprocess input for YOLOv5 model  
3️⃣ Run inference using ONNX Runtime  
4️⃣ Post-process output for bounding boxes & class labels  
5️⃣ Overlay results on camera preview

---

## 🌍 COCO Classes Supported (YOLOv5s)

Person, Bicycle, Car, Motorcycle, Airplane, Bus, Train, Truck, Boat, Traffic Light, and more.  
Full list of COCO classes: https://github.com/ultralytics/yolov5/blob/master/data/coco.yaml

---

## 🚀 Future Enhancements

✅ Support YOLOv8, YOLO-NAS, and custom models  
✅ Optimize for GPU/NNAPI on Android  
✅ Add real-time performance metrics (FPS, latency)  
✅ Integrate Whisper/SAM for multi-modal AI apps  
✅ Publish sample app on Google Play

---

## 📄 License

This project is licensed under the MIT License. See LICENSE for details.

---

## 🙌 Acknowledgments

- YOLOv5 by Ultralytics: https://github.com/ultralytics/yolov5  
- ONNX Runtime by Microsoft: https://onnxruntime.ai/  
- CameraX by Android Jetpack: https://developer.android.com/training/camerax

---

## 🧑‍💻 Author

Chiradeep Banerjee  
GitHub: https://github.com/chiradeepbanerjee1990  
LinkedIn: [https://www.linkedin.com/in/chiradeep-banerjee](https://www.linkedin.com/in/chiradeep-banerjee-17173724/)

---

🚀 Let’s build AI-powered apps together! Contributions and feedback welcome. 🎯
