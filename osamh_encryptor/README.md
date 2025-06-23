<div dir="rtl" align="right">

<p align="center">
  <img src="https://raw.githubusercontent.com/HACKSOSS/osamhfadel/main/packages/osamh_player/media/%D9%A2%D9%A0%D9%A2%D9%A4%D9%A0%D9%A9%D9%A2%D9%A6_%D9%A2%D9%A1%D9%A5%D9%A1%D9%A1%D9%A3.jpg" width="350"/>
</p>

<h1 align="center" style="font-weight: 900; font-size: 3.5rem; color: #1E40AF;">🛡️ Osamh Encryptor</h1>

<p align="center" style="font-size: 1.3rem; font-weight: 700; color: #2563EB;">
  إضافة Flutter قوية لتشفير البيانات بشكل آمن وسهل.
</p>

<p align="center" style="font-style: italic; font-size: 1.1rem; color: #4B5563;">
  تعتمد على الشيفرة الأصلية لتوفير أداء وأمان عاليين على Android و iOS.
</p>

<p align="center">
  <a href="https://pub.dev/packages/osamh_encryptor"><img src="https://img.shields.io/pub/v/osamh_encryptor.svg?label=pub.dev&color=blue&logo=dart" alt="pub.dev"/></a>
  <a href="https://github.com/HACKSOSS/osamh_encryptor/blob/main/LICENSE"><img src="https://img.shields.io/github/license/HACKSOSS/osamh_encryptor.svg?color=green" alt="License"/></a>
  <a href="#"><img src="https://img.shields.io/badge/platform-flutter-02569B?logo=flutter" alt="Flutter"/></a>
</p>

---

## ✨ ما هو Osamh Encryptor؟

`osamh_encryptor` هي مكتبة Flutter توفر تشفير وفك تشفير محلي باستخدام خوارزميات قوية وآمنة. مناسبة لتخزين أو إرسال البيانات الحساسة في تطبيقاتك.

---

## 🚀 أبرز الميزات

- 🔒 تشفير وفك تشفير باستخدام Passphrase مخصص
- 🔁 توليد Salt و IV عشوائيين لكل عملية تشفير
- ⚙️ واجهة برمجية سهلة الاستخدام
- 📱 دعم كامل لـ Android و iOS باستخدام كود أصلي Native
- 🚀 أداء عالي وسرعة في التنفيذ

---

## 🛠️ الاستخدام الأساسي

```dart
import 'package:osamh_encryptor/osamh_encryptor.dart';

final encryptor = OsamhEncryptor();
final pass = 'كلمة_سر_سرية';

final encrypted = await encryptor.encrypt(
  passPhrase: pass,
  contentToEncrypt: 'نص سري',
);

final decrypted = await encryptor.decrypt(
  passPhrase: pass,
  concatenatedCipherText: encrypted,
);
```

---

## 📷 صور توضيحية

<div align="center">
  <img src="https://github.com/user-attachments/assets/6eb6429e-85b9-42b9-ae37-d762cf6858be" width="220" height="320" style="margin-left: 15px;" />
  <img src="https://github.com/user-attachments/assets/2d0c52fd-6d4e-4fb2-8340-e9e0d446abee" width="220" height="320" style="margin-left: 15px;" />
  <img src="https://github.com/user-attachments/assets/284629df-88c2-4f10-bbbd-e87c8418eab3" width="220" height="320" />
</div>

---

<div align="center" style="margin: 40px 0;">
  <img src="https://raw.githubusercontent.com/HACKSOSS/osamhfadel/main/packages/osamh_player/media/osamh.jpg" width="500" style="border-radius: 50%; box-shadow: 0 4px 15px rgba(0,0,0,0.2);" alt="Osamh Fadel"/>
  <h2 style="margin-top: 10px; font-weight: 800; color: #1E40AF;">من هو أسامة فاضل</h2>
  <p style="max-width: 500px; color: #374151; font-size: 1.1rem; line-height: 1.6;">
    مهندس برمجيات محترف بخبرة واسعة في تطوير تطبيقات Flutter لنظامي iOS و Android، بالإضافة إلى تطوير المواقع وبرمجيات Python المتقدمة ومعالجة البيانات والتشفير.
  </p>
</div>

---

## 📞 للتواصل

- 🌍 الموقع: [osamhfadel.com](https://osamhfadel.com)
- 📧 البريد الإلكتروني: [programmer.osamh.fadel@gmail.com](mailto:programmer.osamh.fadel@gmail.com)
- ☎️ الهاتف / واتساب: [967717348644+](https://wa.me/967717348644)
- 📺 يوتيوب: [@l._ (قناة أسامة فاضل)](https://www.youtube.com/@l._)
- 💬 انستقرام: [المبرمج م/أسامة فاضل](https://instagram.com/lky_112l)
- 🧠 GitHub: [HACKSOSS](https://github.com/HACKSOSS)

---

<p align="center" style="font-size: 1.1rem; color: #2563EB;">
  💙 شكرًا لاستخدامك Osamh Encryptor — كل دعم أو مشاركة تُحدث فرقًا 🙏
</p>

</div>
