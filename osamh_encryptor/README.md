
<div dir="rtl" align="right">

<p align="center">
  <img src="https://github.com/user-attachments/assets/6eb6429e-85b9-42b9-ae37-d762cf6858be" width="220" style="margin: 0 10px;"/>
  <img src="https://github.com/user-attachments/assets/2d0c52fd-6d4e-4fb2-8340-e9e0d446abee" width="220" style="margin: 0 10px;"/>
  <img src="https://github.com/user-attachments/assets/284629df-88c2-4f10-bbbd-e87c8418eab3" width="220" style="margin: 0 10px;"/>
</p>

<h1 align="center" style="font-weight: 900; font-size: 3.5rem; color: #1E40AF;">🛡️ Native Encryptor</h1>

<p align="center" style="font-size: 1.3rem; font-weight: 700; color: #2563EB;">
  إضافة Flutter قوية للتشفير وفك التشفير باستخدام كود أصلي (Native).
</p>

<p align="center" style="font-style: italic; font-size: 1.1rem; color: #4B5563;">
  أمان فائق وأداء عالي عبر استخدام تكامل أصلي على كل من Android و iOS.
</p>

<p align="center">
  <a href="https://pub.dev/packages/native_encryptor"><img src="https://img.shields.io/pub/v/native_encryptor.svg?label=pub.dev&color=blue&logo=dart" alt="pub.dev"/></a>
  <a href="#"><img src="https://img.shields.io/badge/license-MIT-green.svg" alt="License"/></a>
  <a href="#"><img src="https://img.shields.io/badge/platform-flutter-02569B?logo=flutter" alt="Flutter"/></a>
</p>

---

## 🚀 الميزات الأساسية

- 🔒 تشفير وفك تشفير باستخدام كود أصلي لأمان وأداء محسّن.
- 🧂 دعم salt و IV عشوائيين لتعزيز الأمان.
- 🔑 التشفير باستخدام passphrase قابل للتخصيص.
- 💡 API سهلة الاستخدام للتكامل السريع.
- 🤝 دعم كامل لنظامي iOS و Android.

---

## 📥 التثبيت

### 1. أضف التبعية إلى `pubspec.yaml`:

```yaml
dependencies:
  native_encryptor: <latest_version>
```

### 2. نفّذ الأمر:

```bash
flutter pub get
```

### 3. الاستيراد في ملف Dart:

```dart
import 'package:native_encryptor/native_encryptor.dart';
```

---

## 🧪 مثال استخدام بسيط

```dart
import 'package:flutter/material.dart';
import 'package:native_encryptor/native_encryptor.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  final _nativeEncryptorPlugin = NativeEncryptor();
  final TextEditingController _controller = TextEditingController(text: "Secret Message");
  String? encryptedData;
  String? decryptedData;
  final String passphrase = "YourSecretPassphrase";

  Future<void> encrypt() async {
    encryptedData = await _nativeEncryptorPlugin.encrypt(
      passPhrase: passphrase,
      contentToEncrypt: _controller.text,
    );
    setState(() {});
  }

  Future<void> decrypt() async {
    decryptedData = await _nativeEncryptorPlugin.decrypt(
      passPhrase: passphrase,
      concatenatedCipherText: encryptedData!,
    );
    setState(() {});
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: const Text('Native Encryptor')),
        body: Padding(
          padding: const EdgeInsets.all(16.0),
          child: Column(
            children: [
              TextField(
                controller: _controller,
                decoration: const InputDecoration(labelText: 'Enter text'),
              ),
              ElevatedButton(onPressed: encrypt, child: const Text('Encrypt')),
              if (encryptedData != null)
                Text('Encrypted: $encryptedData'),
              ElevatedButton(onPressed: decrypt, child: const Text('Decrypt')),
              if (decryptedData != null)
                Text('Decrypted: $decryptedData'),
            ],
          ),
        ),
      ),
    );
  }
}
```

---

## 📘 التوثيق الكامل

### 🔐 `encrypt(...)`
**الوصف:** تشفير نص باستخدام passphrase.  
**الوسيطات:**
- `passPhrase` (نص مطلوب)
- `contentToEncrypt` (النص الذي سيتم تشفيره)

**القيمة المرجعة:**  
نص مشفّر بصيغة سلسلة نصية.

---

### 🔓 `decrypt(...)`
**الوصف:** فك تشفير البيانات المشفرة سابقًا.  
**الوسيطات:**
- `passPhrase` (نفس passphrase المستخدم للتشفير)
- `concatenatedCipherText` (النص المشفر)

**القيمة المرجعة:**  
النص الأصلي بعد فك التشفير.

---

### 🛠️ `getPlatformVersion()`
**الوصف:** الحصول على إصدار النظام الحالي (اختياري لأغراض التصحيح).

---

## 🧾 الرخصة

هذا المشروع مرخص بموجب رخصة MIT — حر في الاستخدام والتعديل والتوزيع.

---

## 🤝 المساهمة

نرحب بجميع المساهمات!  
يرجى فتح "issue" أو إرسال "pull request" عبر GitHub.

---

## 👨‍💻 المطور

<div align="center" style="margin: 40px 0;">
  <h2 style="margin-top: 10px; font-weight: 800; color: #1E40AF;">👨‍💻 من هو Subhash Chandra Shukla؟</h2>
  <p style="max-width: 500px; color: #374151; font-size: 1.1rem; line-height: 1.6;">
    مطور Flutter محترف يتمتع بشغف بتقنيات الأمان وتشفير البيانات. صاحب مشروع Native Encryptor المفتوح المصدر والعديد من الأدوات المفيدة الأخرى لمجتمع Flutter.
  </p>
</div>

---

## 📞 للتواصل

- 🧠 GitHub: [subhashDev11](https://github.com/subhashDev11)
- 💼 LinkedIn: [Subhash Chandra Shukla](https://www.linkedin.com/in/subhashcs/)
- ✍️ Medium: [@subhashchandrashukla](https://medium.com/@subhashchandrashukla)

---

<p align="center" style="font-size: 1.1rem; color: #2563EB;">
  🔐 Native Encryptor — اجعل تطبيقك أكثر أمانًا، بسهولة وكفاءة!
</p>

</div>
