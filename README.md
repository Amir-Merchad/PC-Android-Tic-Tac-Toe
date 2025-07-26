
# ❌⭕ Tic-Tac-Toe (PC & Android)

[![Electron](https://img.shields.io/badge/Electron-47848F?style=flat&logo=electron&logoColor=white)](https://www.electronjs.org/)  
[![Android](https://img.shields.io/badge/Android-3DDC84?style=flat&logo=android&logoColor=white)](https://developer.android.com/)  
[![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat&logo=kotlin&logoColor=white)](https://kotlinlang.org/)  
[![Node.js](https://img.shields.io/badge/Node.js-339933?style=flat&logo=nodedotjs&logoColor=white)](https://nodejs.org/)

A cross-platform Tic-Tac-Toe game available for both Windows PCs and Android devices. Enjoy the classic game with smooth gameplay and intuitive controls on your preferred platform. Built with Electron, Kotlin, and Node.js.

---

## 🎮 Features

- ✅ Cross-platform: Desktop & Android
- 🎨 Clean and simple UI
- 👥 Multiplayer mode
- 🏆 Win/draw detection
- 💾 Game state persistence
- ⚡ Fast & lightweight

---

## 🚀 Run Instructions

### 🖥 Windows (Electron version)
1. Navigate to `MyApp-win32-x64/`
2. Extract `MyApp.rar`
3. Double-click `MyApp.exe`
4. Approve Windows Defender if prompted

### 📱 Android
> NOTE: Requires Android 15 or above

#### APK Install:
1. Transfer `Tic-Tac-Toe.apk` to your device
2. Install manually (enable "unknown sources" if needed)

#### Build from Source:
1. Open `TicTacToe/` in Android Studio
2. Sync Gradle & build
3. Connect phone with USB debugging enabled
4. Press **Run**

### 🌐 Web Version
```bash
cd website
npm install
npm start
```
Then open [http://localhost:3000](http://localhost:3000)

---

## ⚙️ Technologies Used

| Technology       | Version | Purpose                               |
|------------------|---------|---------------------------------------|
| Electron         | Latest  | Desktop application framework         |
| Kotlin           | 1.8+    | Android app development               |
| Android SDK      | API 33+ | Target mobile platform                |
| Node.js          | 18.x    | JS runtime for desktop/web version    |
| Gradle           | 8.0+    | Android build system                  |

---

## 📁 Project Structure

~~~plaintext
PC-Android_Tic-Tac-Toe/
├── MyApp-win32-x64/          # Windows executable and dependencies
│   ├── MyApp.exe             
│   ├── locales/              
│   ├── resources/            
│   └── ...                   
├── TicTacToe/                # Android project
│   ├── app/                  
│   ├── gradle/               
│   ├── build.gradle.kts      
│   └── ...                   
├── website/                  # Web version
│   ├── index.js              
│   └── package.json          
├── Tic-Tac-Toe.apk           
├── README.md                 
└── ...                       
~~~

---

## 🧠 What I Learned

- First time using Electron for desktop development
- Building Android apps using Kotlin & Gradle
- Integrating web code into Electron
- Creating reusable UI and logic across platforms
- Designing AI logic for Tic-Tac-Toe
- Using Chrome DevTools and Android Studio effectively
- Handling platform-specific packaging and builds

---

## 🧪 Build Tools & IDEs

- WebStorm (Web version)
- Android Studio (Mobile build)
- VS Code / Notepad++ (Electron version)
- GitHub for version control and deployment